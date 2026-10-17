package com.revolut.feature.tax_residency.impl.screens.tin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.chooser.ChooserScreenContract$Model;
import com.revolut.feature.tax_residency.impl.R$id;
import com.revolut.feature.tax_residency.impl.R$layout;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ine.x;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import rm0.k;
import roe.f;
import roe.g;
import roe.j;
import roe.l;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lroe/l;", "Lcom/revolut/feature/tax_residency/impl/screens/tin/TaxNumberInputScreenContract$InputData;", "Lroe/j;", "Lno/m;", "Companion", "a", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxNumberInputScreen extends BaseRecyclerViewScreen<l, TaxNumberInputScreenContract$InputData, j> implements m {
    public final AnalyticsProduct U;
    public final int V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final InputTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f90106a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f90107b0;
    public final h c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f90108d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f90109e0;
    public final Object f0;
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(TaxNumberInputScreen.class, "binding", "getBinding()Lcom/revolut/feature/tax_residency/impl/databinding/ScreenTaxNumberInputBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxNumberInputScreen(TaxNumberInputScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData.f;
        this.V = R$id.taxResidencyDocument_recyclerView;
        this.W = R$layout.screen_tax_number_input;
        int i = 11;
        this.X = w.y0(new rgf.b(this, inputData, i));
        final int i2 = 0;
        this.Y = w.y0(new Function0(this) { // from class: roe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxNumberInputScreen f255982b;

            {
                this.f255982b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TaxNumberInputScreen taxNumberInputScreen = this.f255982b;
                switch (i3) {
                    case 0:
                        TaxNumberInputScreen.Companion companion = TaxNumberInputScreen.INSTANCE;
                        x xVar = (x) taxNumberInputScreen.X.getValue();
                        switch (xVar.f162916a) {
                            case 0:
                                return (k) xVar.k.get();
                            case 1:
                                return (k) xVar.k.get();
                            default:
                                return (k) xVar.k.get();
                        }
                    default:
                        TaxNumberInputScreen.Companion companion2 = TaxNumberInputScreen.INSTANCE;
                        x xVar2 = (x) taxNumberInputScreen.X.getValue();
                        switch (xVar2.f162916a) {
                            case 0:
                                return (j60.a) xVar2.f162919g.get();
                            case 1:
                                return (j60.a) xVar2.f162919g.get();
                            default:
                                return (j60.a) xVar2.f162919g.get();
                        }
                }
            }
        });
        InputTextDelegate inputTextDelegate = new InputTextDelegate(new qce.b(inputData, this, i));
        this.Z = inputTextDelegate;
        Lazy lazyY0 = w.y0(new k(17));
        this.f90106a0 = lazyY0;
        final int i3 = 1;
        this.f90107b0 = v.k(inputTextDelegate, (ProductSelectionDelegate) lazyY0.getValue());
        this.c0 = s.t(this, roe.b.f);
        this.f90108d0 = w.y0(new Function0(this) { // from class: roe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxNumberInputScreen f255982b;

            {
                this.f255982b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                TaxNumberInputScreen taxNumberInputScreen = this.f255982b;
                switch (i32) {
                    case 0:
                        TaxNumberInputScreen.Companion companion = TaxNumberInputScreen.INSTANCE;
                        x xVar = (x) taxNumberInputScreen.X.getValue();
                        switch (xVar.f162916a) {
                            case 0:
                                return (k) xVar.k.get();
                            case 1:
                                return (k) xVar.k.get();
                            default:
                                return (k) xVar.k.get();
                        }
                    default:
                        TaxNumberInputScreen.Companion companion2 = TaxNumberInputScreen.INSTANCE;
                        x xVar2 = (x) taxNumberInputScreen.X.getValue();
                        switch (xVar2.f162916a) {
                            case 0:
                                return (j60.a) xVar2.f162919g.get();
                            case 1:
                                return (j60.a) xVar2.f162919g.get();
                            default:
                                return (j60.a) xVar2.f162919g.get();
                        }
                }
            }
        });
        this.f90109e0 = w.y0(new k(18));
        this.f0 = w.y0(new k(19));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (x) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        Bundle extras;
        ChooserScreenContract$Model chooserScreenContract$Model;
        if (i == 1000) {
            String str = (intent == null || (extras = intent.getExtras()) == null || (chooserScreenContract$Model = (ChooserScreenContract$Model) extras.getParcelable("DATA")) == null) ? null : chooserScreenContract$Model.f65904b;
            if (str == null) {
                str = "";
            }
            ((c) T2()).z2(new InputTextDelegate.TextData("REGIMES_LIST_ID", str));
        }
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f144970b.f59410q), null, new roe.c(this, null, 0), 3);
        TwinVerticalButton twinVerticalButton = h3().f144971c;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.o0()), null, new roe.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinVerticalButton.p0()), null, new roe.c(this, null, 2), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, e.b(((j60.a) this.f90108d0.getValue()).C()), null, new q9c.v(i2, T2(), roe.k.class, "onSubtitleClauseClick", "onSubtitleClauseClick(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$SubtitleClickData;)V", i, 14), 3);
        ?? r122 = this.f90109e0;
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r122.getValue()).f53572c.f121375b), null, new q9c.v(i2, T2(), roe.k.class, "onDialogPrimaryButtonClick", "onDialogPrimaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r122.getValue()).d.f121375b), null, new q9c.v(i2, T2(), roe.k.class, "onDialogSecondaryButtonClick", "onDialogSecondaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ProductSelectionDelegate) this.f90106a0.getValue()).p()), null, new roe.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f0.getValue()).d.f121375b), null, new roe.e(this, null), 3);
        InputTextDelegate inputTextDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.e.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputTextDelegate.f52575g.f121375b), null, new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.f90108d0.getValue()).d(v.k(new PlainTextDelegate(), (TwinHorizontalButtonDelegate) this.f90109e0.getValue(), (LargeActionButtonDelegate) this.f0.getValue()));
        NavBarWithToolbar navBarWithToolbar = h3().f144970b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.tax_residency_enter_value_data_encryption_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
        f0.t(navBarWithToolbar, new ResourceImage(R$drawable.uikit_icn_16_lock_closed, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, 6);
        h3().f144971c.setMainButtonLoadingTag("TAX_NUMBER_INPUT_SCREEN_LOADING_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF90107b0() {
        return this.f90107b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        TwinVerticalButton twinVerticalButton = h3().f144971c;
        twinVerticalButton.setMainButtonIcon(null);
        twinVerticalButton.setMainButtonText(uiState.e);
        twinVerticalButton.setMainButtonEnabled(uiState.f);
        twinVerticalButton.setSecondaryButtonText(uiState.f255988g);
        twinVerticalButton.setSecondaryButtonVisible(uiState.f255989h);
        NavBarWithToolbar navBarWithToolbar = h3().f144970b;
        TextLocalisedClause textLocalisedClause = uiState.f255985a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.f255986b);
        navBarWithToolbar.setNavigationButtonImage(uiState.f255987c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.W;
    }

    public final gne.b h3() {
        ViewBinding value = this.c0.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gne.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final roe.k T2() {
        return (roe.k) this.Y.getValue();
    }
}
