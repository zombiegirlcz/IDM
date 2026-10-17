package kh4;

import c64.q;
import com.revolut.data.model.Data;
import ff4.t;
import ft3.h1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mh4.r;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import te0.w;
import vkm.q0;
import zh9.u0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements r, t, q {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by3.a f184054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha3.f f184055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f184056c;

    public g(by3.a refinancingOfferDetailsInteractor, ha3.f cardsConfigInteractor, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(refinancingOfferDetailsInteractor, "refinancingOfferDetailsInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f184054a = refinancingOfferDetailsInteractor;
        this.f184055b = cardsConfigInteractor;
        this.f184056c = memoryCache;
    }

    public static String e(mv3.i iVar) {
        return "refinancing_offer." + d0.O0(iVar.f209128a) + "." + iVar.f209129b + "." + iVar.f209130c + "." + iVar.d;
    }

    @Override // ff4.t
    public final efm.d0 a(bv3.a request, h1 productPayload) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        return w.o0(kotlin.coroutines.g.f186406a, new kb7.c(this, productPayload, null, 8));
    }

    @Override // c64.q
    public final efm.r b(eu3.d calculatorInput, h1 productPayload) {
        Intrinsics.checkNotNullParameter(calculatorInput, "calculatorInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        mv3.i refinancingOfferInput = new mv3.i(f(), calculatorInput.f129489a, calculatorInput.f129490b, calculatorInput.f129491c, 8);
        mv3.h hVar = (mv3.h) this.f184056c.get(e(refinancingOfferInput));
        eu3.c cVar = hVar != null ? hVar.e : null;
        fu3.c cVar2 = hVar != null ? hVar.f : null;
        if (cVar != null) {
            g(hVar);
            return zi0.c.j(new eu3.e(cVar, cVar2));
        }
        by3.a aVar = this.f184054a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(refinancingOfferInput, "refinancingOfferInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        f44.c cVar3 = aVar.f19740a;
        cVar3.getClass();
        Intrinsics.checkNotNullParameter(refinancingOfferInput, "refinancingOfferInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        return nim.a.w(rd0.e.c(new q0(cVar3.d.b(new f44.a(refinancingOfferInput, false, productPayload), w4l.i.f294643c), new d(this, refinancingOfferInput, null, 0), 1), kotlin.coroutines.g.f186406a), new b(1));
    }

    @Override // mh4.r
    public final Object c(h1 h1Var, l40.j jVar) {
        f44.c cVar = this.f184054a.f19740a;
        cVar.getClass();
        f44.b bVar = new f44.b(cVar, h1Var, null, 1);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, bVar, jVar);
    }

    @Override // ff4.t
    public final efm.r d(eu3.d calculatorInput, h1 productPayload) {
        Intrinsics.checkNotNullParameter(calculatorInput, "calculatorInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        by3.a aVar = this.f184054a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        f44.c cVar = aVar.f19740a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        return nim.a.w(mif.a.d(rd0.e.c(new q0(cVar.d.b(new f44.a(null, true, productPayload), w4l.i.f294643c), new kae.d(this, null, 11), 1), kotlin.coroutines.g.f186406a), this.f184055b.b(false)), new b(0));
    }

    public final ArrayList f() {
        List list = (List) this.f184056c.get("SELECTED_CREDITS_CACHE_KEY");
        if (list == null) {
            list = f0.f322471a;
        }
        return u0.v(list);
    }

    public final void g(mv3.h hVar) {
        List list = hVar.f209124a.f209134a;
        ne0.j jVar = this.f184056c;
        jVar.f("SELECTED_CREDITS_CACHE_KEY", list);
        mv3.k kVar = hVar.f209124a;
        jVar.f("refinancing_offer." + d0.O0(u0.v(kVar.f209134a)) + "." + kVar.f209135b + "." + kVar.f209136c + "." + kVar.d, hVar);
    }

    @Override // mh4.r
    public final Flow h(mv3.i refinancingOfferInput, h1 productPayload) {
        Intrinsics.checkNotNullParameter(refinancingOfferInput, "refinancingOfferInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        String strE = e(refinancingOfferInput);
        ne0.j jVar = this.f184056c;
        mv3.h hVar = (mv3.h) jVar.get(strE);
        if (hVar != null) {
            mv3.k kVar = hVar.f209124a;
            g(hVar);
            jVar.f("OFFER_PARAMETERS_CACHE_KEY", kVar);
            return new go.g(new Data(new mh4.h(hVar.f209126c, hVar.d, hVar.f209125b, kVar), null, false, 6, null), 2);
        }
        by3.a aVar = this.f184054a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(refinancingOfferInput, "refinancingOfferInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        f44.c cVar = aVar.f19740a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(refinancingOfferInput, "refinancingOfferInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        return new f(new q0(cVar.d.b(new f44.a(refinancingOfferInput, false, productPayload), w4l.i.f294643c), new d(this, refinancingOfferInput, null, 1), 1), this, 0);
    }
}
