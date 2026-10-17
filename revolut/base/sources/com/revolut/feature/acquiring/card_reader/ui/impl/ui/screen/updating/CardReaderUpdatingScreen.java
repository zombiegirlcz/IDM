package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating;

import android.view.View;
import com.revolut.feature.acquiring.card_reader.ui.impl.R$layout;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxScreen;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import u1.g;
import uc1.a;
import xb1.q;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/updating/CardReaderUpdatingScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxScreen;", "Ljki/k;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/updating/CardReaderUpdatingScreenContract$InputData;", "Luc1/a;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderUpdatingScreen extends BaseRxScreen<k, CardReaderUpdatingScreenContract$InputData, a> {
    public final int O;
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReaderUpdatingScreen(CardReaderUpdatingScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.O = R$layout.screen_card_reader_transparent;
        this.P = w.y0(new g(this, inputData, 24));
        this.Q = w.y0(new tyl.a(this, 15));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (q) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (uc1.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        m2().getWindow().addFlags(128);
    }

    @Override // com.revolut.kompot.common.rx_navigable.screen.BaseRxScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        super.Y2();
        m2().getWindow().clearFlags(128);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.O;
    }
}
