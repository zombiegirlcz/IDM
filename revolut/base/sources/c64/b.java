package c64;

import ft3.h1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.c f21606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f21607b;

    public b(hw3.c interactor, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f21606a = interactor;
        this.f21607b = memoryCache;
    }

    public static String a(eu3.d dVar, h1 h1Var) {
        String str = h1Var.f137835a;
        Long l2 = dVar.f129489a;
        Long l3 = dVar.f129490b;
        fu3.a aVar = dVar.f129491c;
        String strName = aVar != null ? aVar.name() : null;
        if (strName == null) {
            strName = "";
        }
        return "calculator." + str + "." + l2 + "." + l3 + "." + strName;
    }

    @Override // c64.q
    public final efm.r b(eu3.d calculatorInput, h1 productPayload) {
        efm.r rVarJ;
        Intrinsics.checkNotNullParameter(calculatorInput, "calculatorInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        eu3.e eVar = (eu3.e) this.f21607b.get(a(calculatorInput, productPayload));
        if (eVar != null && (rVarJ = zi0.c.j(eVar)) != null) {
            return rVarJ;
        }
        hw3.c cVar = this.f21606a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        p24.p pVar = cVar.f156055a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        efm.d0<c04.a> calculatorContent = pVar.f232057c.getCalculatorContent(productPayload.f137835a, calculatorInput.f129489a, calculatorInput.f129490b);
        p24.h hVar = p24.h.f;
        o0.a aVar = new o0.a(15);
        calculatorContent.getClass();
        ufm.i iVar = new ufm.i(calculatorContent, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        efm.r rVarDoOnNext = nim.a.w(hw3.c.i(te0.w.i0(te0.w.n0(iVar, pVar.d))), new c42.j(16)).doOnNext(new a(new c1g.o(this, 6, productPayload, calculatorInput), 0));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }
}
