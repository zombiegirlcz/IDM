package e40;

import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.v f122355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n30.n f122356b;

    public k(r10.v activeAndNotRatedTicketsActionsDelegate, n30.n chatInteractor) {
        Intrinsics.checkNotNullParameter(activeAndNotRatedTicketsActionsDelegate, "activeAndNotRatedTicketsActionsDelegate");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        this.f122355a = activeAndNotRatedTicketsActionsDelegate;
        this.f122356b = chatInteractor;
    }

    public static j49.b b(r40.l lVar) {
        return new j49.b(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(lVar.f251345a, null, null, 6), null, null, 6), true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r40.l r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof e40.i
            if (r0 == 0) goto L13
            r0 = r8
            e40.i r0 = (e40.i) r0
            int r1 = r0.f122352w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122352w = r1
            goto L18
        L13:
            e40.i r0 = new e40.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122352w
            n30.n r3 = r6.f122356b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L46
        L38:
            yhm.o.b(r8)
            java.util.UUID r7 = r7.f251345a
            r0.f122352w = r5
            java.lang.Object r7 = r3.a(r7, r0)
            if (r7 != r1) goto L46
            goto L59
        L46:
            r0.f122352w = r4
            v20.o r7 = r3.f211647a
            efm.r r7 = v20.o.L(r7)
            java.lang.Object r7 = nim.a.e(r7, r0)
            if (r7 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L57:
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            j49.a r7 = j49.a.f171320a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.k.a(r40.l, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(r40.l r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e40.j
            if (r0 == 0) goto L13
            r0 = r7
            e40.j r0 = (e40.j) r0
            int r1 = r0.f122354x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122354x = r1
            goto L18
        L13:
            e40.j r0 = new e40.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122354x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            r40.l r6 = r0.u
            yhm.o.b(r7)
            goto L4e
        L38:
            yhm.o.b(r7)
            n30.n r7 = r5.f122356b
            java.util.UUID r2 = r6.f251345a
            pfm.h r7 = r7.j(r2)
            r0.u = r6
            r0.f122354x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L4e
            goto L59
        L4e:
            r7 = 0
            r0.u = r7
            r0.f122354x = r3
            j49.b r6 = b(r6)
            if (r6 != r1) goto L5a
        L59:
            return r1
        L5a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.k.c(r40.l, gim.c):java.lang.Object");
    }
}
