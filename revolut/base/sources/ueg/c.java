package ueg;

import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p8g.a f279370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ffk.t f279371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f279372n;
    public final weg.a o;

    public c(p8g.a travelHotelsCashbackInteractor, ffk.t pricingPlanInteractor, j60.a expandableControllerExtension, weg.a travelHotelsCashbackDialogMapper) {
        Intrinsics.checkNotNullParameter(travelHotelsCashbackInteractor, "travelHotelsCashbackInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(expandableControllerExtension, "expandableControllerExtension");
        Intrinsics.checkNotNullParameter(travelHotelsCashbackDialogMapper, "travelHotelsCashbackDialogMapper");
        this.f279370l = travelHotelsCashbackInteractor;
        this.f279371m = pricingPlanInteractor;
        this.f279372n = expandableControllerExtension;
        this.o = travelHotelsCashbackDialogMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(ueg.c r7, gim.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof ueg.b
            if (r0 == 0) goto L16
            r0 = r8
            ueg.b r0 = (ueg.b) r0
            int r1 = r0.f279364w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f279364w = r1
            goto L1b
        L16:
            ueg.b r0 = new ueg.b
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279364w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            p8g.a r8 = r7.f279370l
            i9g.p r8 = (i9g.p) r8
            fag.t0 r8 = r8.f159829a
            w4l.f r8 = r8.M
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r4 = 0
            efm.r r8 = r8.f(r2, r4)
            ffk.t r2 = r7.f279371m
            efm.r r4 = r2.q()
            ud3.n r5 = new ud3.n
            r6 = 8
            r5.<init>(r7, r6)
            efm.r r7 = nim.a.w(r4, r5)
            efm.r r2 = r2.o()
            efm.r r7 = kli.a.i(r8, r7, r2)
            ud3.m r8 = new ud3.m
            r2 = 23
            r8.<init>(r2)
            efm.r r7 = nim.a.w(r7, r8)
            ud3.f0 r8 = new ud3.f0
            r2 = 11
            r8.<init>(r2)
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r8, r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f279364w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L86
            return r1
        L86:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ueg.c.b3(ueg.c, gim.c):java.lang.Object");
    }

    @Override // ueg.a
    public final void Z2(HotelsPropertyCashback hotelsPropertyCashback) {
        Intrinsics.checkNotNullParameter(hotelsPropertyCashback, "hotelsPropertyCashback");
        V2(new u2i.g(this, hotelsPropertyCashback, null, 13), new yi5.b(29));
    }
}
