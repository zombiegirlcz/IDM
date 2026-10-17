package com.revolut.feature.subaccount.impl.ui.create.screen.info;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f5;
import aw0.t1;
import aw0.v1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarVaults;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$id;
import com.revolut.feature.subaccount.impl.R$layout;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r6e.q;
import rd0.e;
import te0.w;
import v0c.b;
import v7e.a;
import v7e.c;
import v7e.d;
import v7e.j;
import v7e.k;
import v7e.m;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/screen/info/SubaccountInfoPickerScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lv7e/m;", "Lcom/revolut/feature/subaccount/impl/ui/create/screen/info/SubaccountInfoPickerScreenContract$InputData;", "Lv7e/j;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubaccountInfoPickerScreen extends BaseRecyclerViewScreen<m, SubaccountInfoPickerScreenContract$InputData, j> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f89044d0 = {o0.f186429a.j(new h0(SubaccountInfoPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/subaccount/impl/databinding/ScreenSubaccountInfoPickerBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final InputTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final SuggestionsBarDelegate f89045a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f89046b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubaccountInfoPickerScreen(SubaccountInfoPickerScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_subaccount_info_picker;
        this.V = s.t(this, a.f);
        this.W = R$id.subaccountInfoPickerRecyclerView;
        this.X = w.y0(new b(this, inputData, 20));
        this.Y = w.y0(new ur2.a(this, 22));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.Z = inputTextDelegate;
        SuggestionsBarDelegate suggestionsBarDelegate = new SuggestionsBarDelegate();
        this.f89045a0 = suggestionsBarDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f89046b0 = rowDelegate;
        this.c0 = v.k(inputTextDelegate, suggestionsBarDelegate, rowDelegate, new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (q) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233254c.f59328m), null, new v7e.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233254c.u.k), null, new v7e.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f89045a0.p().d), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f89046b0.f53220l), null, new v7e.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233253b.o), null, new v7e.b(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarVaults navBarVaults = h3().f233254c;
        navBarVaults.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_palette;
        int i2 = R$attr.uikit_colorPopoverBackground;
        navBarVaults.setEndBottomIconImage(companion.d(i, R$attr.uikit_colorAccentNeutral, i2, Integer.valueOf(i2), 4.0f, 2.0f, Float.valueOf(16.0f)));
        h3().f233253b.setText(new TextLocalisedClause(R$string.vaults_creation_customise_pockets_rev10_action_create, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, o oVar) {
        Image imageA;
        v1 v1VarA;
        f5 f5Var;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f233253b;
        boolean z = uiState.f286603c;
        TextLocalisedClause textLocalisedClause = uiState.d;
        largeActionButton.setEnabled(z);
        NavBarWithContainerBackground navBarWithContainerBackground = uiState.f286602b;
        if (navBarWithContainerBackground != null) {
            if (navBarWithContainerBackground instanceof NavBarWithContainerBackground.ImageBackground) {
                NavBarWithContainerBackground.ImageBackground imageBackground = (NavBarWithContainerBackground.ImageBackground) navBarWithContainerBackground;
                imageA = imageBackground.f57881c;
                if (imageA == null) {
                    imageA = imageBackground.f57879a;
                }
                v1VarA = v1.DARK;
                f5Var = f5.FULL;
            } else if (navBarWithContainerBackground instanceof NavBarWithContainerBackground.VideoBackground) {
                imageA = ((NavBarWithContainerBackground.VideoBackground) navBarWithContainerBackground).f57884b;
                v1VarA = v1.DARK;
                f5Var = f5.FULL;
            } else {
                if (!(navBarWithContainerBackground instanceof NavBarWithContainerBackground.TransparentBackground)) {
                    throw new NoWhenBranchMatchedException();
                }
                ColorImage.INSTANCE.getClass();
                imageA = ColorImage.Companion.a();
                t1 t1Var = v1.Companion;
                Context context = h3().f233254c.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                t1Var.getClass();
                v1VarA = t1.a(context);
                f5Var = f5.LITE;
            }
            NavBarVaults navBarVaults = h3().f233254c;
            if (imageA != null) {
                navBarVaults.setBackgroundImage(imageA);
            }
            navBarVaults.setBackgroundGradientOverlayStyle(f5Var);
            navBarVaults.setColorScheme(v1VarA);
        }
        NavBarVaults navBarVaults2 = h3().f233254c;
        navBarVaults2.setToolbarTitle(textLocalisedClause);
        navBarVaults2.setDescription(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final p6e.b h3() {
        ViewBinding value = this.V.getValue(this, f89044d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p6e.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final k T2() {
        return (k) this.Y.getValue();
    }
}
