package androidx.glance.session;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.glance.EmittableWithChildren;
import fim.a;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ukm.u;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0001H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0001H\u0084@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/glance/session/Session;", "", "", "key", "<init>", "(Ljava/lang/String;)V", "Landroidx/glance/EmittableWithChildren;", "createRootEmittable", "()Landroidx/glance/EmittableWithChildren;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "provideGlance", "(Landroid/content/Context;)Lkotlin/jvm/functions/Function2;", "root", "", "processEmittableTree", "(Landroid/content/Context;Landroidx/glance/EmittableWithChildren;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "event", "processEvent", "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "receiveEvents", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lukm/u;", "eventChannel", "Lukm/u;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Session {

    @NotNull
    private final u eventChannel = s.a(Integer.MAX_VALUE, null, null, 6);

    @NotNull
    private final String key;

    /* JADX INFO: renamed from: androidx.glance.session.Session$receiveEvents$1, reason: invalid class name */
    @d(c = "androidx.glance.session.Session", f = "Session.kt", l = {80, 82}, m = "receiveEvents")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return Session.this.receiveEvents(null, null, this);
        }
    }

    public Session(@NotNull String str) {
        this.key = str;
    }

    public final void close() {
        this.eventChannel.close(null);
    }

    @NotNull
    public abstract EmittableWithChildren createRootEmittable();

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public abstract Object processEmittableTree(@NotNull Context context, @NotNull EmittableWithChildren emittableWithChildren, @NotNull Continuation<? super Boolean> continuation);

    public abstract Object processEvent(@NotNull Context context, @NotNull Object obj2, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    public abstract Function2<Composer, Integer, Unit> provideGlance(@NotNull Context context);

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (r5.processEvent(r2, r10, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[Catch: ClosedReceiveChannelException -> 0x0099, TRY_LEAVE, TryCatch #0 {ClosedReceiveChannelException -> 0x0099, blocks: (B:13:0x0036, B:22:0x0063, B:26:0x0079, B:28:0x0081, B:18:0x0055, B:21:0x005c), top: B:34:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0096 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object receiveEvents(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.glance.session.Session.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.glance.session.Session$receiveEvents$1 r0 = (androidx.glance.session.Session.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.session.Session$receiveEvents$1 r0 = new androidx.glance.session.Session$receiveEvents$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r8 = r0.L$3
            ukm.g r8 = (ukm.g) r8
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r2 = r0.L$1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.L$0
            androidx.glance.session.Session r5 = (androidx.glance.session.Session) r5
            yhm.o.b(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
        L39:
            r10 = r8
            r8 = r2
            r2 = r5
            goto L63
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            java.lang.Object r8 = r0.L$3
            ukm.g r8 = (ukm.g) r8
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            java.lang.Object r2 = r0.L$1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r5 = r0.L$0
            androidx.glance.session.Session r5 = (androidx.glance.session.Session) r5
            yhm.o.b(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            goto L79
        L59:
            yhm.o.b(r10)
            ukm.u r10 = r7.eventChannel     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            ukm.g r10 = r10.iterator()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r2 = r7
        L63:
            r0.L$0 = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.L$1 = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.L$2 = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.L$3 = r10     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.label = r4     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            java.lang.Object r5 = r10.a(r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            if (r5 != r1) goto L74
            goto L98
        L74:
            r6 = r2
            r2 = r8
            r8 = r10
            r10 = r5
            r5 = r6
        L79:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            boolean r10 = r10.booleanValue()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            if (r10 == 0) goto L99
            java.lang.Object r10 = r8.c()     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r9.invoke(r10)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.L$0 = r5     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.L$1 = r2     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.L$2 = r9     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.L$3 = r8     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            r0.label = r3     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            java.lang.Object r10 = r5.processEvent(r2, r10, r0)     // Catch: kotlinx.coroutines.channels.ClosedReceiveChannelException -> L99
            if (r10 != r1) goto L39
        L98:
            return r1
        L99:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.Session.receiveEvents(android.content.Context, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object sendEvent(@NotNull Object obj2, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.eventChannel.send(obj2, continuation);
        return objSend == a.COROUTINE_SUSPENDED ? objSend : Unit.f186387a;
    }
}
