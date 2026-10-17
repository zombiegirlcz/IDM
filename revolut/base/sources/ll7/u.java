package ll7;

import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import ip0.v7;
import kl7.d2;
import kl7.k1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ljl.n1;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsuranceCarService f196659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f196660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f196661c;
    public final x4l.c d;
    public final w4l.f e;

    public u(InsuranceCarService service, ne0.j memoryCache, String baseUrl) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f196659a = service;
        this.f196660b = memoryCache;
        this.f196661c = baseUrl;
        Continuation continuation = null;
        final int i = 0;
        this.d = new x4l.c(new k7c.x(this, continuation, 17), new Function1(this) { // from class: ll7.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f196653b;

            {
                this.f196653b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String applicationFormId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (k1) v7.r("PLANS_", applicationFormId, this.f196653b.f196660b);
                    default:
                        Intrinsics.checkNotNullParameter(applicationFormId, "reservationId");
                        return (d2) v7.r("RESERVATION_", applicationFormId, this.f196653b.f196660b);
                }
            }
        }, new Function2(this) { // from class: ll7.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f196655b;

            {
                this.f196655b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                u uVar = this.f196655b;
                switch (i2) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        k1 plansContainer = (k1) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(plansContainer, "plansContainer");
                        uVar.f196660b.f("PLANS_" + applicationFormId, plansContainer);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String reservationId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
                        p0 p0Var = p0.f264001a;
                        return te0.w.o0(elm.f.f127540b, new ll6.i(uVar, reservationId, null, 2));
                    default:
                        String reservationId2 = (String) obj2;
                        d2 reservation = (d2) obj3;
                        Intrinsics.checkNotNullParameter(reservationId2, "reservationId");
                        Intrinsics.checkNotNullParameter(reservation, "reservation");
                        uVar.f196660b.f("RESERVATION_" + reservationId2, reservation);
                        return Unit.f186387a;
                }
            }
        }, new iz1.g(2, 22, continuation), new k3c.l(3, 15, continuation), new le8.d(this, continuation, 18));
        final int i2 = 1;
        Function2 function2 = new Function2(this) { // from class: ll7.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f196655b;

            {
                this.f196655b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                u uVar = this.f196655b;
                switch (i22) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        k1 plansContainer = (k1) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(plansContainer, "plansContainer");
                        uVar.f196660b.f("PLANS_" + applicationFormId, plansContainer);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String reservationId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
                        p0 p0Var = p0.f264001a;
                        return te0.w.o0(elm.f.f127540b, new ll6.i(uVar, reservationId, null, 2));
                    default:
                        String reservationId2 = (String) obj2;
                        d2 reservation = (d2) obj3;
                        Intrinsics.checkNotNullParameter(reservationId2, "reservationId");
                        Intrinsics.checkNotNullParameter(reservation, "reservation");
                        uVar.f196660b.f("RESERVATION_" + reservationId2, reservation);
                        return Unit.f186387a;
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: ll7.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f196653b;

            {
                this.f196653b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String applicationFormId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        return (k1) v7.r("PLANS_", applicationFormId, this.f196653b.f196660b);
                    default:
                        Intrinsics.checkNotNullParameter(applicationFormId, "reservationId");
                        return (d2) v7.r("RESERVATION_", applicationFormId, this.f196653b.f196660b);
                }
            }
        };
        final int i3 = 2;
        this.e = new w4l.f(function2, function1, new Function2(this) { // from class: ll7.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f196655b;

            {
                this.f196655b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                u uVar = this.f196655b;
                switch (i22) {
                    case 0:
                        String applicationFormId = (String) obj2;
                        k1 plansContainer = (k1) obj3;
                        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
                        Intrinsics.checkNotNullParameter(plansContainer, "plansContainer");
                        uVar.f196660b.f("PLANS_" + applicationFormId, plansContainer);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String reservationId = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
                        p0 p0Var = p0.f264001a;
                        return te0.w.o0(elm.f.f127540b, new ll6.i(uVar, reservationId, null, 2));
                    default:
                        String reservationId2 = (String) obj2;
                        d2 reservation = (d2) obj3;
                        Intrinsics.checkNotNullParameter(reservationId2, "reservationId");
                        Intrinsics.checkNotNullParameter(reservation, "reservation");
                        uVar.f196660b.f("RESERVATION_" + reservationId2, reservation);
                        return Unit.f186387a;
                }
            }
        }, new n1(26), new lk7.m(8), null, null, null, BERTags.FLAGS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r3.d(r8, r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ll7.t
            if (r0 == 0) goto L13
            r0 = r7
            ll7.t r0 = (ll7.t) r0
            int r1 = r0.f196658y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196658y = r1
            goto L18
        L13:
            ll7.t r0 = new ll7.t
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f196656w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196658y
            x4l.c r3 = r6.d
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L5a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            boolean r9 = r0.v
            java.lang.String r8 = r0.u
            yhm.o.b(r7)
            goto L4c
        L3c:
            yhm.o.b(r7)
            r0.u = r8
            r0.v = r9
            r0.f196658y = r5
            java.lang.Object r7 = r3.e(r8, r0)
            if (r7 != r1) goto L4c
            goto L59
        L4c:
            r7 = 0
            r0.u = r7
            r0.v = r9
            r0.f196658y = r4
            java.lang.Object r7 = r3.d(r8, r9, r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ll7.u.a(gim.c, java.lang.String, boolean):java.lang.Object");
    }
}
