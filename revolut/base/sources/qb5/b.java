package qb5;

import ang.f;
import com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.feature.credit_card.autopay.impl.network.ApiService;
import dj0.d;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mb5.u;
import pfm.m;
import te0.w;
import ub5.c;
import w4l.i;
import xb5.g;
import yua.q;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements lb5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob5.a f244118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f244119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f244120c;
    public final f d;

    public b(ob5.a repository, xua.a recurringPaymentInteractor, gte.a featureToggleInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f244118a = repository;
        this.f244119b = recurringPaymentInteractor;
        this.f244120c = featureToggleInteractor;
        this.d = userInteractor;
    }

    public final r a(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = (g) this.f244118a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(u1.d(gVar.e.e(facilityId, loadingStrategy), nim.a.w(this.d.k(false), new a(0))), new qa9.r(this, 4));
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final pfm.a b(String facilityId, AutoPayRequest.Setup request, boolean z) {
        efm.b bVarIgnoreElements;
        d dVar;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(request, "request");
        g gVar = (g) this.f244118a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(request, "request");
        ApiService apiService = gVar.f303997a;
        Object obj2 = tb5.b.f269460a;
        Intrinsics.checkNotNullParameter(request, "<this>");
        CreditScheduledAmountType creditScheduledAmountType = request.f70678b;
        u uVar = request.f70679c;
        Long lValueOf = null;
        CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType : null;
        if (fixed != null && (dVar = fixed.f70684a) != null) {
            lValueOf = Long.valueOf(dVar.f115082a);
        }
        pfm.r rVarG0 = w.g0(apiService.postAutoPay(facilityId, new c(request.f70677a, u1.g(vb5.a.b(request.f70678b), tb5.f.f269468a), lValueOf, null, u1.g(uVar, tb5.b.f269461b), null)));
        efm.b bVarT = m.f235744a;
        if (z) {
            bVarIgnoreElements = mo3.a.n(a(facilityId)).ignoreElements();
            Intrinsics.h(bVarIgnoreElements);
        } else {
            bVarIgnoreElements = bVarT;
        }
        if (uVar == u.SCHEDULED || uVar == u.DIRECT_DEBIT || uVar == u.ACH) {
            bVarT = ((q) this.f244119b).t(false);
        }
        pfm.a aVarE = rVarG0.e(efm.b.p(bVarIgnoreElements, bVarT));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
