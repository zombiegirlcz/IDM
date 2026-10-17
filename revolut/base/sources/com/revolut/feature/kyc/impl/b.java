package com.revolut.feature.kyc.impl;

import a08.g0;
import a08.o0;
import cie.l1;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.kyc.api.KycApi$FeatureToggle;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import ct6.o;
import cu8.a1;
import cu8.c1;
import cu8.g1;
import cu8.i;
import cu8.j1;
import cu8.n1;
import cu8.z0;
import e7l.g;
import efm.d0;
import efm.k;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import my8.l;
import my8.r;
import pfm.h;
import pfm.t;
import rfm.m;
import te0.q;
import te0.s;
import te0.w;
import yhm.j;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ori.a implements g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f77567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ot8.a f77568c;
    public final q89.e d;
    public final j1 e;
    public final ifm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mm.d f77569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f77570h;
    public final fk3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f77571j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f77572l;

    public b(ang.f userInteractor, ot8.a kycDocsInteractor, q89.e onboardingInteractor, j1 state, ifm.b compositeDisposable, mm.d actionsDispatcher, gte.a featureToggleInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(kycDocsInteractor, "kycDocsInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f77567b = userInteractor;
        this.f77568c = kycDocsInteractor;
        this.d = onboardingInteractor;
        this.e = state;
        this.f = compositeDisposable;
        this.f77569g = actionsDispatcher;
        this.f77570h = featureToggleInteractor;
        this.i = configurationInteractor;
        this.f77571j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f77572l = j.b(new co7.a(this, 11));
    }

    public final pfm.a A3(wi0.b selectedCitizenship) {
        Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
        n1 n1Var = (n1) this.e;
        pfm.a aVarE = w.z0(n1Var.I0(), selectedCitizenship).e(w.z0(n1Var.G0(), selectedCitizenship));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final h B3(KycScreenContract$Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
        n1 n1Var = (n1) this.e;
        SelectedKycDocs selectedKycDocs = (SelectedKycDocs) n1Var.H0().get();
        if (step instanceof KycScreenContract$Step.Vision) {
            d0 d0VarFirstOrError = n1Var.A0().b(step).firstOrError();
            d0VarFirstOrError.getClass();
            return new h(d0VarFirstOrError, 4);
        }
        te0.e eVarH0 = n1Var.H0();
        Intrinsics.checkNotNullParameter(selectedKycDocs, "<this>");
        l lVarB = com.revolut.feature.kyc.impl.choosedocument.model.a.b(selectedKycDocs);
        d0 d0VarFirstOrError2 = w.F0(eVarH0.b(SelectedKycDocs.a(selectedKycDocs, null, lVarB != null ? lVarB.f210383a : null, 3)), n1Var.A0().b(step)).firstOrError();
        d0VarFirstOrError2.getClass();
        return new h(d0VarFirstOrError2, 4);
    }

    public final t C3(KycScreenContract$Step lastStep) {
        Intrinsics.checkNotNullParameter(lastStep, "lastStep");
        return w.z0(((n1) this.e).A0(), lastStep);
    }

    @Override // ori.a, nri.a
    public final void i3() {
        k kVarFirstElement = s3().firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        i iVar = new i(this, 8);
        o0 o0Var = new o0(7, new c0d.j(new BreadcrumbException(), 19));
        kVarFirstElement.getClass();
        m mVar = new m(kVarFirstElement, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(mVar, "onErrorResumeNext(...)");
        rfm.b bVar = new rfm.b(new g0(7, iVar), new g0(7, cu8.k.f108850a), mfm.f.f205043c);
        mVar.i(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
        w.j0(this.f, bVar);
    }

    public final ufm.f j3(boolean z) {
        d0 d0VarFirstOrError = m70.a.g(((ik3.c) this.i).k(g.a.f123406a), null, null, 3).firstOrError();
        csl.b bVar = new csl.b(7, new cu8.j(this, z, 0));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.t(iVar, h0.f322473a);
    }

    public final d0 k3() {
        d0 d0VarFirstOrError = w.a0(w3(), new cs.a(16)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final ufm.i l3() {
        d0 d0VarFirstOrError = r3().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        ufm.i iVar = new ufm.i(w.H0(d0VarFirstOrError, k3()), new csl.b(17, new cs.a(19)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final ufm.i m3(List selectedDocs) {
        Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
        d0 d0VarFirstOrError = m70.a.g(g1.W(this), null, null, 3).firstOrError();
        csl.b bVar = new csl.b(16, new bke.t(selectedDocs, 15));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final void n3(boolean z) {
        j1 j1Var = this.e;
        if (!z) {
            n1 n1Var = (n1) j1Var;
            if (w.O(n1Var.E0()) == r.DEFAULT) {
                te0.j jVar = n1Var.f108872r;
                KProperty[] kPropertyArr = n1.f108861y;
                if (w.O(jVar.getValue(n1Var, kPropertyArr[17])) != null) {
                    n1Var.A0().set(new KycScreenContract$Step.AdditionalVerification((yt8.e) n1Var.f108872r.getValue(n1Var, kPropertyArr[17]).get()));
                    return;
                }
            }
        }
        n1 n1Var2 = (n1) j1Var;
        r rVar = (r) w.O(n1Var2.E0());
        if (rVar != null) {
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            switch (z0.f108914a[rVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    n1Var2.I0().set(n1Var2.y0().get());
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!n1Var2.I0().isInitialized()) {
            this.f77569g.D(c1.f108828a);
        } else if (!n1Var2.A0().isInitialized() || (n1Var2.A0().get() instanceof a1)) {
            n1Var2.G0().set(n1Var2.I0().get());
            z3();
        }
    }

    public final void o3() {
        n1 n1Var = (n1) this.e;
        n1Var.I0().set(n1Var.B0().get());
        if (((jte.d) this.f77570h).c(KycApi$FeatureToggle.SimplifiedKyc.f77466c)) {
            q3(true);
        } else {
            n1Var.A0().set(KycScreenContract$Step.SubmitCitizenship.f77561a);
        }
    }

    public final boolean p3() {
        return !((db9.d) this.d).c();
    }

    public final void q3(boolean z) {
        ufm.f fVarJ3 = j3(z);
        i iVar = new i(this, 5);
        ufm.i iVar2 = new ufm.i(fVarJ3, new o0(7, new c0d.j(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new g0(7, iVar), new g0(7, cu8.l.f108852a), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        this.f.a(iVar3);
    }

    public final efm.r r3() {
        return ((n1) this.e).A0().c(s.f270018a);
    }

    public final efm.r s3() {
        n1 n1Var = (n1) this.e;
        if (n1Var.y0().isInitialized()) {
            return n1Var.y0().c(s.f270018a);
        }
        efm.r map = m70.a.g(this.f77567b.k(false), null, new o(3), 1).map(new csl.b(14, new cs.a(14)));
        Intrinsics.h(map);
        return map;
    }

    public final efm.r t3() {
        efm.r rVarRetryWhen = m70.a.h(u1.d(nim.a.w(g1.W(this), new cs.a(17)), nim.a.w(g1.W(this), new cs.a(20))), new l1(11), null, null, 6).doOnError(new csl.b(4, new i(this, 9))).retryWhen(new csl.b(5, new i(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarRetryWhen, "retryWhen(...)");
        return rVarRetryWhen;
    }

    public final efm.r u3(boolean z) {
        efm.r rVarR3 = r3();
        j1 j1Var = this.e;
        te0.e eVarI0 = ((n1) j1Var).I0();
        s sVar = s.f270018a;
        efm.r rVarFlatMap = w.n(rVarR3, eVarI0.c(sVar), v3(), ((n1) j1Var).J0().c(sVar)).flatMap(new csl.b(22, new cu8.j(this, z, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final efm.r v3() {
        return ((n1) this.e).E0().c(s.f270018a);
    }

    public final efm.r w3() {
        return ((n1) this.e).H0().c(q.f270015a);
    }

    public final h x3(l doc2) {
        Intrinsics.checkNotNullParameter(doc2, "doc");
        n1 n1Var = (n1) this.e;
        d0 d0VarFirstOrError = n1Var.H0().b(com.revolut.feature.kyc.impl.choosedocument.model.a.c((SelectedKycDocs) n1Var.H0().get(), doc2)).firstOrError();
        d0VarFirstOrError.getClass();
        h hVar = new h(d0VarFirstOrError, 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    public final t y3(my8.k kycConsent) {
        Intrinsics.checkNotNullParameter(kycConsent, "kycConsent");
        n1 n1Var = (n1) this.e;
        return w.z0(n1Var.w0(), zhm.a1.m((Set) n1Var.w0().get(), kycConsent));
    }

    public final void z3() {
        if (((jte.d) this.f77570h).c(KycApi$FeatureToggle.SimplifiedKyc.f77466c)) {
            q3(false);
        } else {
            ((n1) this.e).A0().set(KycScreenContract$Step.RemoteDocs.f77560a);
        }
    }
}
