package szb;

import cli.y;
import com.revolut.data.network.models.security.SecuritySettings;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nyb.b0;
import nyb.m;
import vkm.q;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements dli.b {
    public final eub.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y21.c f266795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f266796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f266797r;

    public j(k stateMapper, eub.k revPointsPersonalisationAvailabilityInteractor, y21.c optOutRepository, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationAvailabilityInteractor, "revPointsPersonalisationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = revPointsPersonalisationAvailabilityInteractor;
        this.f266795p = optOutRepository;
        this.f266796q = termsNavigationFactory;
        this.f266797r = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        b0 b0Var = (b0) this.o;
        d78.c cVarD = b0Var.d();
        ae8.c cVar = new ae8.c(bla.b.b(b0Var.f220775b, "LOYALTY_PERSONALISATION.transactions_usage"), 19);
        y21.c cVar2 = b0Var.f220776c;
        SecuritySettings securitySettings = SecuritySettings.TRANSACTIONS_USAGE;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        l.a1(this, nim.a.v(u0.i(cVarD, cVar, rd0.e.b(nim.a.w(cVar2.b(securitySettings, hVar), new m(6)))), new m(7)), null, null, new h(this, continuation, 0), 3);
        l.a1(this, nim.a.v(u0.i(b0Var.d(), new ae8.c(bla.b.b(b0Var.f220775b, "LOYALTY_PERSONALISATION.revolut_products_usage"), 17), rd0.e.b(nim.a.w(b0Var.f220776c.b(SecuritySettings.REVOLUT_PRODUCTS_USAGE, hVar), new m(4)))), new m(5)), null, null, new h(this, continuation, 1), 3);
        l.a1(this, nim.a.v(u0.i(b0Var.d(), new ae8.c(bla.b.b(b0Var.f220775b, "LOYALTY_PERSONALISATION.revpoints_profile_usage"), 18), rd0.e.b(nim.a.w(b0Var.f220776c.b(SecuritySettings.REVPOINTS_PROFILE_USAGE, hVar), new m(8)))), new m(9)), null, null, new h(this, continuation, 2), 3);
        final int i = 0;
        I2(new sx2.g(29), new Function0(this) { // from class: szb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f266791b;

            {
                this.f266791b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        y21.c cVar3 = this.f266791b.f266795p;
                        cVar3.getClass();
                        return cVar3.b(SecuritySettings.TRANSACTIONS_USAGE, w4l.h.f294642c);
                    case 1:
                        y21.c cVar4 = this.f266791b.f266795p;
                        cVar4.getClass();
                        return cVar4.b(SecuritySettings.REVOLUT_PRODUCTS_USAGE, w4l.h.f294642c);
                    default:
                        y21.c cVar5 = this.f266791b.f266795p;
                        cVar5.getClass();
                        return cVar5.b(SecuritySettings.REVPOINTS_PROFILE_USAGE, w4l.h.f294642c);
                }
            }
        }, new f(0));
        final int i2 = 1;
        I2(new g(0), new Function0(this) { // from class: szb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f266791b;

            {
                this.f266791b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        y21.c cVar3 = this.f266791b.f266795p;
                        cVar3.getClass();
                        return cVar3.b(SecuritySettings.TRANSACTIONS_USAGE, w4l.h.f294642c);
                    case 1:
                        y21.c cVar4 = this.f266791b.f266795p;
                        cVar4.getClass();
                        return cVar4.b(SecuritySettings.REVOLUT_PRODUCTS_USAGE, w4l.h.f294642c);
                    default:
                        y21.c cVar5 = this.f266791b.f266795p;
                        cVar5.getClass();
                        return cVar5.b(SecuritySettings.REVPOINTS_PROFILE_USAGE, w4l.h.f294642c);
                }
            }
        }, new f(1));
        final int i3 = 2;
        I2(new g(1), new Function0(this) { // from class: szb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f266791b;

            {
                this.f266791b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        y21.c cVar3 = this.f266791b.f266795p;
                        cVar3.getClass();
                        return cVar3.b(SecuritySettings.TRANSACTIONS_USAGE, w4l.h.f294642c);
                    case 1:
                        y21.c cVar4 = this.f266791b.f266795p;
                        cVar4.getClass();
                        return cVar4.b(SecuritySettings.REVOLUT_PRODUCTS_USAGE, w4l.h.f294642c);
                    default:
                        y21.c cVar5 = this.f266791b.f266795p;
                        cVar5.getClass();
                        return cVar5.b(SecuritySettings.REVPOINTS_PROFILE_USAGE, w4l.h.f294642c);
                }
            }
        }, new f(2));
    }

    public final void I2(Function1 function1, Function0 function0, Function2 function2) {
        l.a1(this, mo3.a.g(boh.f.e(a.a.k(q.q(this.f266797r.B(function1)), new g(2)), new ac1.b(17, function0)), null, null, 3), null, null, new qqj.g(this, function2, (Continuation) null, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f266797r;
    }
}
