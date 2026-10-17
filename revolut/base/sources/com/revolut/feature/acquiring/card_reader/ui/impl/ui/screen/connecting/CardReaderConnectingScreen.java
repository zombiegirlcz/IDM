package com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting;

import android.content.Intent;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.ui.api.R$string;
import com.revolut.feature.acquiring.card_reader.ui.impl.R$layout;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxScreen;
import iv0.p;
import java.util.List;
import jc1.a;
import jc1.c;
import jc1.d;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import sji.b;
import te0.w;
import xb1.g;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/connecting/CardReaderConnectingScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxScreen;", "Ljki/k;", "Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/screen/connecting/CardReaderConnectingScreenContract$InputData;", "Ljc1/a;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderConnectingScreen extends BaseRxScreen<k, CardReaderConnectingScreenContract$InputData, a> {
    public final int O;
    public final Object P;
    public final Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardReaderConnectingScreen(CardReaderConnectingScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.O = R$layout.screen_card_reader_transparent;
        this.P = w.y0(new j68.a(this, inputData, 11));
        this.Q = w.y0(new p(this, 24));
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
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        if (i == 56) {
            ?? r2 = this.Q;
            if (i2 == -1) {
                ((jc1.h) ((c) r2.getValue())).C2();
                return;
            }
            jc1.h hVar = (jc1.h) ((c) r2.getValue());
            hVar.getClass();
            l.j2(hVar, new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.merchant_card_reader_flow_bluetooth_powered_off_title, null, null, 14), new TextLocalisedClause(R$string.merchant_card_reader_scanning_bluetooth_powered_off_prompt_description, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D159", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368)), null, new d(hVar, 0), 1);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
