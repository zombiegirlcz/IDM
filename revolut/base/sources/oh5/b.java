package oh5;

import boh.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nfj.l1;
import w4l.h;
import yuc.p;
import yud.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f225304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f225305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iy.b f225306c;

    public b(wsg.b walletsInteractor, g stakingInteractor, iy.b cryptoLockedGiftBalanceResolver) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(cryptoLockedGiftBalanceResolver, "cryptoLockedGiftBalanceResolver");
        this.f225304a = walletsInteractor;
        this.f225305b = stakingInteractor;
        this.f225306c = cryptoLockedGiftBalanceResolver;
    }

    public static t38.e b(b bVar) {
        bVar.getClass();
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Flow flowE = bVar.f225304a.e(loadingStrategy);
        g gVar = bVar.f225305b;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yvd.c cVar = gVar.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new t38.e(flowE, 24, f.e(cVar.f317167h.b(Unit.f186387a, loadingStrategy), new p(gVar, 1)), new l1(bVar, (Continuation) null, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof oh5.a
            if (r0 == 0) goto L13
            r0 = r6
            oh5.a r0 = (oh5.a) r0
            int r1 = r0.f225303w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225303w = r1
            goto L18
        L13:
            oh5.a r0 = new oh5.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f225303w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            t38.e r6 = b(r5)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f225303w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oh5.b.a(gim.c):java.lang.Object");
    }
}
