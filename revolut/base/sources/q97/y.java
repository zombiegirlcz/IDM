package q97;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q5b.c f243824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5b.a f243825b;

    public y(q5b.c cobrandsProductAvailabilityInteractor, s5b.a cobrandedCardsEntryPointDestinationProvider) {
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cobrandedCardsEntryPointDestinationProvider, "cobrandedCardsEntryPointDestinationProvider");
        this.f243824a = cobrandsProductAvailabilityInteractor;
        this.f243825b = cobrandedCardsEntryPointDestinationProvider;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.IHG_COBRAND;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarX = ue0.e.F(te0.w.o0(skm.p0.f264003c, new q03.m(this, (Continuation) null, 23)), zhm.f0.f322471a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        if (productCell.f234280a != t97.d.IHG_COBRAND) {
            throw new IllegalStateException(prk.o.q("Unsupported: ", productCell.f234280a));
        }
        d6b.b bVar = (d6b.b) this.f243825b;
        Intrinsics.checkNotNullParameter("ihg", "brand");
        ufm.i iVar = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new cq6.k(bVar, null, 9)), new q3d.c(29, new h(6)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
