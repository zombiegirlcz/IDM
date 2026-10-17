package wv2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import ha3.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wr1.s;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements f {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f300283r = new d(7, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, o5l.g.HDPI);
    public final ShowCardPinScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rv2.a f300284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f300285q;

    public n(cli.n stateMapper, ShowCardPinScreenContract$InputData inputData, rv2.a viewCardPinInteractor, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(viewCardPinInteractor, "viewCardPinInteractor");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.o = inputData;
        this.f300284p = viewCardPinInteractor;
        this.f300285q = mra.d.b(this, f300283r, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData = this.o;
        String cardId = showCardPinScreenContract$InputData.f64414a;
        gwh.c cVar = (gwh.c) this.f300284p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(pd.b.r(((x) cVar.f147329a).v(cardId), new gwe.d(cVar, 1))), null, null, new i(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(cVar.c(showCardPinScreenContract$InputData.f64414a, false)), null, null, new i(this, continuation, 1), 3);
        l2(new s(this, continuation, 9), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300285q;
    }
}
