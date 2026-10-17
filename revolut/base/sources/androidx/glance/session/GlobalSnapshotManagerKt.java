package androidx.glance.session;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"globalSnapshotMonitor", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class GlobalSnapshotManagerKt {

    /* JADX INFO: renamed from: androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1, reason: invalid class name */
    @d(c = "androidx.glance.session.GlobalSnapshotManagerKt", f = "GlobalSnapshotManager.kt", l = {80}, m = "globalSnapshotMonitor")
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
            return GlobalSnapshotManagerKt.globalSnapshotMonitor(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:23:0x0067, B:25:0x006f, B:20:0x0058, B:19:0x0052), top: B:38:0x0020, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x0084, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:27:0x007b, B:34:0x0088, B:35:0x008b, B:12:0x0030, B:23:0x0067, B:25:0x006f, B:20:0x0058, B:19:0x0052, B:32:0x0086), top: B:38:0x0020, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object globalSnapshotMonitor(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof androidx.glance.session.GlobalSnapshotManagerKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1 r0 = (androidx.glance.session.GlobalSnapshotManagerKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1 r0 = new androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r2 = r0.L$2
            ukm.g r2 = (ukm.g) r2
            java.lang.Object r5 = r0.L$1
            ukm.i0 r5 = (ukm.i0) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.snapshots.ObserverHandle r6 = (androidx.compose.runtime.snapshots.ObserverHandle) r6
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L34
            goto L67
        L34:
            r7 = move-exception
            goto L86
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3e:
            yhm.o.b(r7)
            r7 = -1
            r2 = 6
            ukm.q r5 = vc.s.a(r7, r4, r4, r2)
            androidx.compose.runtime.snapshots.Snapshot$Companion r7 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE
            androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$observerHandle$1 r2 = new androidx.glance.session.GlobalSnapshotManagerKt$globalSnapshotMonitor$observerHandle$1
            r2.<init>(r5)
            androidx.compose.runtime.snapshots.ObserverHandle r6 = r7.registerGlobalWriteObserver(r2)
            ukm.g r7 = new ukm.g     // Catch: java.lang.Throwable -> L34
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L34
            r2 = r7
        L58:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L34
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L34
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L34
            r0.label = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r7 = r2.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r7 != r1) goto L67
            return r1
        L67:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L34
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L7b
            java.lang.Object r7 = r2.c()     // Catch: java.lang.Throwable -> L34
            kotlin.Unit r7 = (kotlin.Unit) r7     // Catch: java.lang.Throwable -> L34
            androidx.compose.runtime.snapshots.Snapshot$Companion r7 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L34
            r7.sendApplyNotifications()     // Catch: java.lang.Throwable -> L34
            goto L58
        L7b:
            r5.f(r4)     // Catch: java.lang.Throwable -> L84
            r6.dispose()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L84:
            r7 = move-exception
            goto L8c
        L86:
            throw r7     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            com.bumptech.glide.c.h(r5, r7)     // Catch: java.lang.Throwable -> L84
            throw r0     // Catch: java.lang.Throwable -> L84
        L8c:
            r6.dispose()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.GlobalSnapshotManagerKt.globalSnapshotMonitor(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
