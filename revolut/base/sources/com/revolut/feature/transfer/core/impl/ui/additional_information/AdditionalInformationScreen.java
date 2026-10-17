package com.revolut.feature.transfer.core.impl.ui.additional_information;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.core.api.ui.additional_information.AdditionalInformationInputData;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import com.revolut.feature.transfer.models.config.AdditionalInformationInputMaskConfig;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import cqf.a;
import cqf.b;
import cqf.d;
import cqf.f;
import fpf.c;
import h30.l;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpf.n;
import rd0.e;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/additional_information/AdditionalInformationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lcqf/f;", "Lcom/revolut/feature/transfer/core/api/ui/additional_information/AdditionalInformationInputData;", "Lfpf/c;", "", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalInformationScreen extends BaseRecyclerViewScreen<f, AdditionalInformationInputData, c> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92183b0 = {o0.f186429a.j(new h0(AdditionalInformationScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferAdditionalInfoBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92184a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalInformationScreen(AdditionalInformationInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.transferScreenAdditionalInfo_recyclerView;
        this.V = R$layout.screen_transfer_additional_info;
        this.W = s.t(this, b.f);
        this.X = true;
        this.Y = w.y0(new a(inputData, this));
        this.Z = w.y0(new a(this, inputData));
        this.f92184a0 = w.y0(new co7.a(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((cqf.h) this.f92184a0.getValue()).v2(fpf.a.f137094a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f188231c.setEnabled(uiState.f108094b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (n) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (cqf.h) this.f92184a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        AdditionalInformationInputMaskConfig additionalInformationInputMaskConfig;
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, l.y(g3().f188230b.f59410q, g3().f188230b.f59409p.f57336l, "merge(...)"), null, new cqf.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f188231c.o), null, new cqf.c(this, continuation, 1), 3);
        AdditionalInformationInput additionalInformationInput = ((AdditionalInformationInputData) this.G).e;
        if (((additionalInformationInput == null || (additionalInformationInputMaskConfig = additionalInformationInput.e) == null) ? null : additionalInformationInputMaskConfig.f92270b) == null) {
            com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) this.Y.getValue()).e.f121375b), null, new d(this, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((n) this.Z.getValue()).getClass();
        NavBarWithToolbar navBarWithToolbar = g3().f188230b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_additional_information_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transfer_additional_information_title, null, null, 14));
        if (((AdditionalInformationInputData) this.G).e == null) {
            navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transfer_additional_information_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10));
            navBarWithToolbar.setDescriptionVisible(true);
        }
        l.A(R.string.common_action_continue, null, null, 14, g3().f188231c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        f uiState = (f) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f188231c.setEnabled(uiState.f108094b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF106400d0() {
        return u.c((InputTextDelegate) this.Y.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF106398a0() {
        return this.U;
    }

    public final kpf.b g3() {
        ViewBinding value = this.W.getValue(this, f92183b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kpf.b) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
