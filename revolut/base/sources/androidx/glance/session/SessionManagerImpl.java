package androidx.glance.session;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import gim.c;
import gim.d;
import ib.b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\bH\u0016J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/glance/session/SessionManagerImpl;", "Landroidx/glance/session/SessionManager;", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "(Ljava/lang/Class;)V", "sessions", "", "", "Landroidx/glance/session/Session;", "closeSession", "", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enqueueDelayedWorker", "context", "Landroid/content/Context;", "getSession", "isSessionRunning", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSession", b.Session, "(Landroid/content/Context;Landroidx/glance/session/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionManagerImpl implements SessionManager {

    @NotNull
    private final Map<String, Session> sessions = new LinkedHashMap();

    @NotNull
    private final Class<? extends ListenableWorker> workerClass;

    /* JADX INFO: renamed from: androidx.glance.session.SessionManagerImpl$isSessionRunning$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionManagerImpl", f = "SessionManager.kt", l = {142}, m = "isSessionRunning")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return SessionManagerImpl.this.isSessionRunning(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionManagerImpl$startSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionManagerImpl", f = "SessionManager.kt", l = {147}, m = "startSession")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19451 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C19451(Continuation<? super C19451> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return SessionManagerImpl.this.startSession(null, null, this);
        }
    }

    public SessionManagerImpl(@NotNull Class<? extends ListenableWorker> cls) {
        this.workerClass = cls;
    }

    private final void enqueueDelayedWorker(Context context) {
        WorkManager.getInstance(context).enqueueUniqueWork("sessionWorkerKeepEnabled", ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(this.workerClass).setInitialDelay(3650L, TimeUnit.DAYS).setConstraints(new Constraints.Builder().setRequiresCharging(true).build()).build());
    }

    @Override // androidx.glance.session.SessionManager
    public Object closeSession(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Session sessionRemove;
        synchronized (this.sessions) {
            sessionRemove = this.sessions.remove(str);
        }
        if (sessionRemove != null) {
            sessionRemove.close();
        }
        return Unit.f186387a;
    }

    @Override // androidx.glance.session.SessionManager
    public Session getSession(@NotNull String key) {
        Session session;
        synchronized (this.sessions) {
            session = this.sessions.get(key);
        }
        return session;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf A[EDGE_INSN: B:57:0x00cf->B:50:0x00cf BREAK  A[LOOP:0: B:37:0x00ab->B:59:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.glance.session.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isSessionRunning(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionManagerImpl.isSessionRunning(android.content.Context, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.glance.session.SessionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startSession(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.NotNull androidx.glance.session.Session r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionManagerImpl.startSession(android.content.Context, androidx.glance.session.Session, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
