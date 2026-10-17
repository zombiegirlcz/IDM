package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import gim.i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import ukm.q;
import ukm.u;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sent", "ensureStarted", "", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalSnapshotManager {

    @NotNull
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    @NotNull
    private static final AtomicBoolean started = new AtomicBoolean(false);

    @NotNull
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    @gim.d(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {64}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ u $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(u uVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$channel = uVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.$channel, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0036, B:19:0x003e, B:14:0x0029, B:20:0x0052, B:13:0x0024), top: B:27:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x0011, B:17:0x0036, B:19:0x003e, B:14:0x0029, B:20:0x0052, B:13:0x0024), top: B:27:0x0005 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0033 -> B:17:0x0036). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.L$1
                ukm.g r1 = (ukm.g) r1
                java.lang.Object r3 = r5.L$0
                ukm.i0 r3 = (ukm.i0) r3
                yhm.o.b(r6)     // Catch: java.lang.Throwable -> L15
                goto L36
            L15:
                r6 = move-exception
                goto L5b
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                yhm.o.b(r6)
                ukm.u r3 = r5.$channel
                ukm.g r6 = r3.iterator()     // Catch: java.lang.Throwable -> L15
                r1 = r6
            L29:
                r5.L$0 = r3     // Catch: java.lang.Throwable -> L15
                r5.L$1 = r1     // Catch: java.lang.Throwable -> L15
                r5.label = r2     // Catch: java.lang.Throwable -> L15
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L15
                if (r6 != r0) goto L36
                return r0
            L36:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L15
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L15
                if (r6 == 0) goto L52
                java.lang.Object r6 = r1.c()     // Catch: java.lang.Throwable -> L15
                kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Throwable -> L15
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L15
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L15
                androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L15
                r6.sendApplyNotifications()     // Catch: java.lang.Throwable -> L15
                goto L29
            L52:
                kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L15
                r6 = 0
                r3.f(r6)
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            L5b:
                throw r6     // Catch: java.lang.Throwable -> L5c
            L5c:
                r0 = move-exception
                com.bumptech.glide.c.h(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements Function1<Object, Unit> {
        final /* synthetic */ u $channel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(u uVar) {
            super(1);
            this.$channel = uVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            m2796invoke(obj2);
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2796invoke(Object obj2) {
            if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                this.$channel.mo3647trySendJP2dKIU(Unit.f186387a);
            }
        }
    }

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            q qVarA = s.a(1, null, null, 6);
            e0.C(e0.c(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new AnonymousClass1(qVarA, null), 3);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new AnonymousClass2(qVarA));
        }
    }
}
