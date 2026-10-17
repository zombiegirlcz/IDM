package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment;

import android.view.View;
import com.revolut.feature.acquiring.card_reader.ui.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ot1.p;
import pc1.c;
import pc1.e;
import sji.b;
import te0.w;
import tji.f;
import xc1.a;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/payment/CardReaderPaymentScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/payment/CardReaderPaymentScreenContract$InputData;", "Lpc1/c;", "Lxc1/a;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderPaymentScreen extends BaseScreen<k, CardReaderPaymentScreenContract$InputData, c> implements a {
    public final int M;
    public final Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReaderPaymentScreen(CardReaderPaymentScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_card_reader_payment;
        this.N = w.y0(new p(this, inputData, 24));
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
        return (xb1.k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (e) ((xb1.k) this.N.getValue()).i.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        m2().getWindow().addFlags(128);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xc1.a
    public final f X() {
        Object obj2 = (e) ((xb1.k) this.N.getValue()).i.get();
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        return ((l) obj2).X();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        m2().getWindow().clearFlags(128);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }
}
