package cf4;

import c1g.o;
import c64.q;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import efm.d0;
import efm.r;
import ff4.t;
import ft3.h1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ne0.j;
import p24.p;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements t, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.c f23536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha3.f f23537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f23538c;

    public b(hw3.c creditOfferDetailsInteractor, ha3.f cardsConfigInteractor, j memoryCache) {
        Intrinsics.checkNotNullParameter(creditOfferDetailsInteractor, "creditOfferDetailsInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f23536a = creditOfferDetailsInteractor;
        this.f23537b = cardsConfigInteractor;
        this.f23538c = memoryCache;
    }

    public static String c(eu3.d dVar, h1 h1Var) {
        String str = h1Var.f137835a;
        Long l2 = dVar.f129489a;
        Long l3 = dVar.f129490b;
        fu3.a aVar = dVar.f129491c;
        String strName = aVar != null ? aVar.name() : null;
        if (strName == null) {
            strName = "";
        }
        return "offer." + str + "." + l2 + "." + l3 + "." + strName;
    }

    @Override // ff4.t
    public final d0 a(bv3.a request, h1 productPayload) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        hw3.c cVar = this.f23536a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        Intrinsics.checkNotNullParameter(request, "request");
        p pVar = cVar.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        Intrinsics.checkNotNullParameter(request, "request");
        CreditPluginsService creditPluginsService = pVar.f232057c;
        String str = productPayload.f137835a;
        Intrinsics.checkNotNullParameter(request, "<this>");
        Long l2 = request.f18940a;
        Long l3 = request.f18941b;
        fu3.a aVar = request.f18942c;
        d0<tt3.a> d0VarAcceptCreditOffer = creditPluginsService.acceptCreditOffer(str, new s14.a(aVar != null ? aVar.name() : null, l2, l3));
        p24.b bVar = new p24.b(8, new p24.e(pVar, 5));
        d0VarAcceptCreditOffer.getClass();
        i iVar = new i(d0VarAcceptCreditOffer, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return w.i0(iVar);
    }

    @Override // c64.q
    public final r b(eu3.d calculatorInput, h1 productPayload) {
        Intrinsics.checkNotNullParameter(calculatorInput, "calculatorInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        return nim.a.w(e(calculatorInput, productPayload), new ccg.c(22));
    }

    @Override // ff4.t
    public final r d(eu3.d calculatorInput, h1 productPayload) {
        Intrinsics.checkNotNullParameter(calculatorInput, "calculatorInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        return nim.a.w(u1.d(e(calculatorInput, productPayload), this.f23537b.b(false)), new ccg.c(21));
    }

    public final r e(eu3.d dVar, h1 productPayload) {
        r rVarJ;
        bv3.b bVar = (bv3.b) this.f23538c.get(c(dVar, productPayload));
        if (bVar != null && (rVarJ = zi0.c.j(bVar)) != null) {
            return rVarJ;
        }
        hw3.c cVar = this.f23536a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        p pVar = cVar.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        CreditPluginsService creditPluginsService = pVar.f232057c;
        String str = productPayload.f137835a;
        Long l2 = dVar.f129489a;
        Long l3 = dVar.f129490b;
        fu3.a aVar = dVar.f129491c;
        d0<s14.b> offerDetails = creditPluginsService.getOfferDetails(str, l2, l3, aVar != null ? aVar.name() : null);
        p24.i iVar = p24.i.f;
        o0.a aVar2 = new o0.a(16);
        offerDetails.getClass();
        i iVar2 = new i(offerDetails, aVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        r rVarDoOnNext = hw3.c.i(w.i0(w.n0(iVar2, pVar.d))).doOnNext(new cd0.c(new o(this, 12, productPayload, dVar), 25));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }
}
