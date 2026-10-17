package hw3;

import com.revolut.data.model.Data;
import ft3.g1;
import ft3.h1;
import ft3.j1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p24.p f156055a;

    public c(p24.p repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f156055a = repository;
    }

    public static efm.r i(ufm.n nVar) {
        efm.r map = nVar.x().map(new hp5.b(new hu1.h0(23), 29));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarStartWith = ue0.e.H(map, zhm.h0.f322473a, new hu1.h0(24)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return rVarStartWith;
    }

    public final ufm.n a() {
        Intrinsics.checkNotNullParameter("RISK_ATTEMPTS_NUMBER_CHECK_EXCEED_SUBSCRIPTION", "flag");
        p24.p pVar = this.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter("RISK_ATTEMPTS_NUMBER_CHECK_EXCEED_SUBSCRIPTION", "flag");
        efm.d0<tz3.e> d0VarAcceptPromoAndGetDeeplink = pVar.f232057c.acceptPromoAndGetDeeplink("RISK_ATTEMPTS_NUMBER_CHECK_EXCEED_SUBSCRIPTION");
        p24.b bVar = new p24.b(10, new p24.e(pVar, 6));
        d0VarAcceptPromoAndGetDeeplink.getClass();
        ufm.i iVar = new ufm.i(d0VarAcceptPromoAndGetDeeplink, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final ufm.n b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        p24.p pVar = this.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(path, "path");
        efm.d0<tt3.a> d0VarActionPath = pVar.f232057c.actionPath(path);
        p24.b bVar = new p24.b(7, new p24.e(pVar, 4));
        d0VarActionPath.getClass();
        ufm.i iVar = new ufm.i(d0VarActionPath, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final Object c(String str, gim.c cVar) throws Throwable {
        p24.p pVar = this.f156055a;
        pVar.getClass();
        p24.f fVar = new p24.f(pVar, str, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, fVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final ufm.n d(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        p24.p pVar = this.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        efm.d0<tt3.a> d0VarConvertSpousalConsentApplication = pVar.f232057c.convertSpousalConsentApplication(applicationId);
        p24.b bVar = new p24.b(6, new p24.e(pVar, 3));
        d0VarConvertSpousalConsentApplication.getClass();
        ufm.i iVar = new ufm.i(d0VarConvertSpousalConsentApplication, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final ufm.n e(h1 productPayload) {
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        p24.p pVar = this.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        efm.d0<tz3.d> termsDocument = pVar.f232057c.getTermsDocument(productPayload.f137835a);
        p24.k kVar = p24.k.f;
        o0.a aVar = new o0.a(11);
        termsDocument.getClass();
        ufm.i iVar = new ufm.i(termsDocument, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final efm.r f(j1 productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        p24.p pVar = this.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productType, "productType");
        efm.d0<tz3.m> spousalConsentInfo = pVar.f232057c.getSpousalConsentInfo(g1.i(productType));
        p24.j jVar = p24.j.f;
        o0.a aVar = new o0.a(14);
        spousalConsentInfo.getClass();
        ufm.i iVar = new ufm.i(spousalConsentInfo, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return i(te0.w.i0(te0.w.n0(iVar, pVar.d)));
    }

    public final ufm.n g(h1 productPayload) {
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        p24.p pVar = this.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        efm.d0<v04.a> d0VarRetrieveDirectDebitDetails = pVar.f232057c.retrieveDirectDebitDetails(productPayload.f137835a);
        p24.m mVar = p24.m.f;
        o0.a aVar = new o0.a(12);
        d0VarRetrieveDirectDebitDetails.getClass();
        ufm.i iVar = new ufm.i(d0VarRetrieveDirectDebitDetails, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final ufm.n h(h1 productPayload) {
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        p24.p pVar = this.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        efm.d0<tt3.a> d0VarSkipAutoPay = pVar.f232057c.skipAutoPay(productPayload.f137835a);
        p24.b bVar = new p24.b(18, new p24.e(pVar, 13));
        d0VarSkipAutoPay.getClass();
        ufm.i iVarF = new ufm.i(d0VarSkipAutoPay, bVar, 1).f(it3.e.class);
        Intrinsics.checkNotNullExpressionValue(iVarF, "cast(...)");
        return te0.w.i0(iVarF);
    }
}
