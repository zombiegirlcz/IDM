package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12560a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsSelectionScreenContract$InputData f12561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f12562c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f12563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f12564h;

    public a0(o oVar, x xVar, ViewController viewController, CobrandedCardsSelectionScreenContract$InputData cobrandedCardsSelectionScreenContract$InputData) {
        this.f12562c = oVar;
        this.f12564h = xVar;
        this.f12561b = cobrandedCardsSelectionScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.e = e4m.b.b(new m(xVar, this, 2, i));
        this.f = e4m.b.b(new m(xVar, this, 1, i));
        this.f12563g = e4m.b.b(new m(xVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f12560a) {
            case 0:
                return ImmutableSet.of((yji.n) ((w) this.f12564h).f12688l.get());
            default:
                return ImmutableSet.of((yji.n) ((x) this.f12564h).f12698m.get());
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f12560a) {
        }
        return ImmutableSet.of();
    }

    public a0(o oVar, w wVar, ViewController viewController, CobrandedCardsSelectionScreenContract$InputData cobrandedCardsSelectionScreenContract$InputData) {
        this.f12562c = oVar;
        this.f12564h = wVar;
        this.f12561b = cobrandedCardsSelectionScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.e = e4m.b.b(new m(wVar, this, 2, i));
        this.f = e4m.b.b(new m(wVar, this, 1, i));
        this.f12563g = e4m.b.b(new m(wVar, this, 0, i));
    }
}
