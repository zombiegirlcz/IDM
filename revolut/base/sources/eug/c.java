package eug;

import android.content.Context;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.CongratulationsPluginFactory;
import e4m.e;
import ft3.j1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mz3.a0;
import mz3.b0;
import mz3.d;
import mz3.f0;
import mz3.g;
import mz3.g0;
import mz3.h;
import mz3.h0;
import mz3.j;
import mz3.l;
import mz3.m0;
import mz3.n;
import mz3.o0;
import mz3.p0;
import mz3.q;
import mz3.q0;
import mz3.t0;
import mz3.u;
import mz3.w;
import mz3.x;
import mz3.y;
import sri.m;
import sri.o;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c implements e {
    public static Pair A(ew3.b bVar, o0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.DOCUMENTS_REMEDIATION), factory);
    }

    public static Pair B(ew3.b bVar, p0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.DOCUMENTS_UPLOAD), factory);
    }

    public static Pair C(ew3.b bVar, q0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.DOWN_PAYMENT_SOURCE_V2), factory);
    }

    public static m D(Context context) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return o.c(context, null, null, 14);
    }

    public static Pair a(ew3.b bVar, y factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.ADDRESS), factory);
    }

    public static Pair b(ew3.b bVar, mz3.b addressV2PluginFactory) {
        Intrinsics.checkNotNullParameter(addressV2PluginFactory, "addressV2PluginFactory");
        return new Pair(new fv3.c(ks3.b.ADDRESS_V2), addressV2PluginFactory);
    }

    public static Pair c(ew3.b bVar, mz3.c factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.AGREEMENT), factory);
    }

    public static Pair d(ew3.b bVar, d factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.AGREEMENT_V2), factory);
    }

    public static Pair e(ew3.b bVar) {
        return new Pair(new fv3.c(ks3.b.AKAHU), new mz3.e());
    }

    public static Pair f(ew3.b bVar, g factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.BANNER), factory);
    }

    public static Pair g(ew3.b bVar, h factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.BIRTH_PLACE), factory);
    }

    public static Pair h(ew3.b bVar, t0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.E_SIGNATURE), factory);
    }

    public static Pair i(ew3.b bVar, j factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CALCULATOR), factory);
    }

    public static Pair j(ew3.b bVar, l factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CARD_ORDERING, v.k(j1.CREDIT_CARD, j1.FAMILY_CREDIT_CARD)), factory);
    }

    public static Pair k(ew3.b bVar, mz3.m factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CO_BORROWER_CONSENT_INITIATOR), factory);
    }

    public static Pair l(ew3.b bVar, n factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CO_BORROWER_CONSENT), factory);
    }

    public static Pair m(ew3.b bVar, mz3.o comboCardOrderingPluginFactory) {
        Intrinsics.checkNotNullParameter(comboCardOrderingPluginFactory, "comboCardOrderingPluginFactory");
        return new Pair(new fv3.c(ks3.b.COMBO_CARD_ORDERING, v.k(j1.CREDIT_CARD, j1.FAMILY_CREDIT_CARD)), comboCardOrderingPluginFactory);
    }

    public static Pair n(ew3.b bVar, hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        return new Pair(new fv3.c(ks3.b.CONFIRMATION), new q(creditApplicationConfigInteractor));
    }

    public static Pair o(ew3.b bVar, hw3.e creditApplicationConfigInteractor, hw3.c creditApplicationConsentsInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationConsentsInteractor, "creditApplicationConsentsInteractor");
        return new Pair(new fv3.c(ks3.b.CONSENTS, v.k(j1.FIXED_TERM_CREDIT, j1.CREDIT_CARD)), new u(creditApplicationConfigInteractor, creditApplicationConsentsInteractor));
    }

    public static Pair p(ew3.b bVar, mz3.v factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CONSENTS_V2), factory);
    }

    public static Pair q(ew3.b bVar, w factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CONVEYANCING_APPOINTMENT_SCHEDULING), factory);
    }

    public static Pair r(ew3.b bVar, CongratulationsPluginFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CONGRATULATIONS), factory);
    }

    public static Pair s(ew3.b bVar, x factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CREDIT_ADDON), factory);
    }

    public static Pair t(ew3.b bVar, a0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, zhm.u.c(j1.CREDIT_CARD)), factory);
    }

    public static Pair u(ew3.b bVar, hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        fv3.c cVar = new fv3.c(ks3.b.AUTO_PAY, j1.CREDIT_CARD);
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        return new Pair(cVar, new nz3.d(creditApplicationConfigInteractor));
    }

    public static Pair v(ew3.b bVar, b0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, j1.CREDIT_CARD_LIMIT_DECREASE), factory);
    }

    public static Pair w(ew3.b bVar, f0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CREDIT_CARD_OFFER), factory);
    }

    public static Pair x(ew3.b bVar, g0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.CREDIT_INSURANCE_OFFER), factory);
    }

    public static Pair y(ew3.b bVar, h0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, j1.CREDIT_CARD_LIMIT_INCREASE), factory);
    }

    public static Pair z(ew3.b bVar, m0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.DIRECT_DEBIT, j1.FIXED_TERM_CREDIT), factory);
    }
}
