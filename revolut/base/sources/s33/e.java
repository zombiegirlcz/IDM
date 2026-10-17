package s33;

import com.revolut.feature.card_order_new.impl.pricing.api.network.PricingService;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;
import w4l.f;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingService f259412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f259413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f259414c;

    public e(PricingService pricingService, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(pricingService, "pricingService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f259412a = pricingService;
        this.f259413b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.f259414c = new f(new Function2(this) { // from class: s33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f259407b;

            {
                this.f259407b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i;
                e eVar = this.f259407b;
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<r33.c> pricingPlanCancellationFee = eVar.f259412a.getPricingPlanCancellationFee(params.f259408a, params.f259409b, params.f259410c, params.d, params.e, params.f);
                        d dVar = d.f;
                        s1c.d dVar2 = new s1c.d(2);
                        pricingPlanCancellationFee.getClass();
                        i iVar = new i(pricingPlanCancellationFee, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        b params2 = (b) obj2;
                        d13.a value = (d13.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.f259413b.f(params2.toString(), value);
                        return Unit.f186387a;
                }
            }
        }, new ryd.i(this, 19), new Function2(this) { // from class: s33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f259407b;

            {
                this.f259407b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3 = i2;
                e eVar = this.f259407b;
                switch (i3) {
                    case 0:
                        f DataObservableDelegate = (f) obj2;
                        b params = (b) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        d0<r33.c> pricingPlanCancellationFee = eVar.f259412a.getPricingPlanCancellationFee(params.f259408a, params.f259409b, params.f259410c, params.d, params.e, params.f);
                        d dVar = d.f;
                        s1c.d dVar2 = new s1c.d(2);
                        pricingPlanCancellationFee.getClass();
                        i iVar = new i(pricingPlanCancellationFee, dVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    default:
                        b params2 = (b) obj2;
                        d13.a value = (d13.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(value, "value");
                        eVar.f259413b.f(params2.toString(), value);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        new f(new s20.c(this, 5), new s1c.a(this, 22), new s20.c(this, 6), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, gim.c r19) {
        /*
            r12 = this;
            r0 = r19
            boolean r1 = r0 instanceof s33.c
            if (r1 == 0) goto L15
            r1 = r0
            s33.c r1 = (s33.c) r1
            int r2 = r1.f259411w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f259411w = r2
            goto L1a
        L15:
            s33.c r1 = new s33.c
            r1.<init>(r12, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f259411w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r0)
            goto L6c
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            yhm.o.b(r0)
            com.revolut.feature.card_order_new.impl.pricing.api.network.PricingService r5 = r12.f259412a
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            efm.d0 r13 = r5.getDowngradeFeeDisclosure(r6, r7, r8, r9, r10, r11)
            s1c.a r14 = new s1c.a
            r15 = 21
            r14.<init>(r15)
            s08.g r15 = new s08.g
            r0 = 26
            r15.<init>(r0, r14)
            r13.getClass()
            ufm.i r14 = new ufm.i
            r0 = 1
            r14.<init>(r13, r15, r0)
            java.lang.String r13 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r13)
            ufm.n r13 = te0.w.i0(r14)
            r1.f259411w = r4
            java.lang.Object r0 = nim.a.b(r13, r1)
            if (r0 != r2) goto L6c
            return r2
        L6c:
            java.lang.String r13 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s33.e.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
