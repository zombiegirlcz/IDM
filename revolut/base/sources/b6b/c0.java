package b6b;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements f7b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12571a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsTypeSelectionScreenContract$InputData f12572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12573c;
    public final e4m.e d;
    public final Object e;

    public c0(o oVar, x xVar, CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData) {
        this.e = xVar;
        this.f12572b = cobrandedCardsTypeSelectionScreenContract$InputData;
        int i = 13;
        this.f12573c = e4m.b.b(new m(xVar, this, 1, i));
        this.d = e4m.b.b(new m(xVar, this, 0, i));
    }

    @Override // f7b.a
    public final e7b.e a() {
        switch (this.f12571a) {
        }
        return (e7b.e) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f12571a) {
            case 0:
                return ImmutableSet.of((yji.n) ((w) this.e).f12688l.get());
            default:
                return ImmutableSet.of((yji.n) ((x) this.e).f12698m.get());
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f12571a) {
        }
        return ImmutableSet.of();
    }

    public c0(o oVar, w wVar, CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData) {
        this.e = wVar;
        this.f12572b = cobrandedCardsTypeSelectionScreenContract$InputData;
        int i = 11;
        this.f12573c = e4m.b.b(new m(wVar, this, 1, i));
        this.d = e4m.b.b(new m(wVar, this, 0, i));
    }
}
