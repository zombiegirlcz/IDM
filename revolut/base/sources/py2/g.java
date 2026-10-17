package py2;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardsFeatureConfig;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import efm.d0;
import h93.f0;
import jy2.n;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import pjg.k;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends my2.a {
    public final jy2.h d;
    public final ifm.b e;
    public final l93.f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jy2.h presentationModel, ifm.b compositeDisposable, l93.f cardInteractor, ln.a navigationDispatcher, s70.a intentProvider) {
        super(navigationDispatcher, intentProvider);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(navigationDispatcher, "navigationDispatcher");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.d = presentationModel;
        this.e = compositeDisposable;
        this.f = cardInteractor;
    }

    @Override // my2.a, jy2.j
    public final ufm.b J1(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        od0.h hVar = i.Companion;
        CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new CardsFeatureConfig.ShowCardPinWithCta(28, null, card.f150110a, true)));
        hVar.getClass();
        ufm.b bVarM = d0.m(od0.h.a(compositeCommandC));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // my2.a, nri.a
    public final void i3() {
        efm.b bVarFlatMapCompletable = ((n) ((jy2.b) this.d).f179307a).w0().c(s.f270018a).flatMapSingle(new pva.c(16, new d(this, 0))).flatMapCompletable(new pva.c(17, new d(this, 1)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        os2.g gVar = new os2.g(new k(new BreadcrumbException(), 16), (byte) 0);
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new lhi.b(21, f.f240651a), e.f240650a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.e, hVarW);
    }
}
