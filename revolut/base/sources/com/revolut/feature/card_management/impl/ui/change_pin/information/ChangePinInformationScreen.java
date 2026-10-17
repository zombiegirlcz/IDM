package com.revolut.feature.card_management.impl.ui.change_pin.information;

import a03.c;
import a03.d;
import a03.e;
import a03.f;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.ui.change_pin.information.ChangePinInformationScreen;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import tx0.j0;
import tz2.l;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_management/impl/ui/change_pin/information/ChangePinInformationScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "La03/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "La03/d;", "<init>", "()V", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangePinInformationScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, d> {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(ChangePinInformationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object U;
    public final Object V;
    public final TextDelegate W;
    public final List X;
    public final h Y;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public ChangePinInformationScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: a03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePinInformationScreen f115b;

            {
                this.f115b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChangePinInformationScreen changePinInformationScreen = this.f115b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChangePinInformationScreen.Z;
                        qji.b bVarQ2 = changePinInformationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.change_pin.information.di.ChangePinInformationScreenInjector");
                        l lVar = new l();
                        lVar.f275789a = e4m.b.b(new tn3.a(lVar, 1, 7));
                        lVar.f275790b = e4m.b.b(new tn3.a(lVar, 0, 7));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr2 = ChangePinInformationScreen.Z;
                        return (e) ((l) changePinInformationScreen.U.getValue()).f275790b.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: a03.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePinInformationScreen f115b;

            {
                this.f115b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChangePinInformationScreen changePinInformationScreen = this.f115b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChangePinInformationScreen.Z;
                        qji.b bVarQ2 = changePinInformationScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.card_management.impl.ui.change_pin.information.di.ChangePinInformationScreenInjector");
                        l lVar = new l();
                        lVar.f275789a = e4m.b.b(new tn3.a(lVar, 1, 7));
                        lVar.f275790b = e4m.b.b(new tn3.a(lVar, 0, 7));
                        return lVar;
                    default:
                        KProperty[] kPropertyArr2 = ChangePinInformationScreen.Z;
                        return (e) ((l) changePinInformationScreen.U.getValue()).f275790b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        TextDelegate textDelegate = new TextDelegate();
        this.W = textDelegate;
        this.X = v.k(rowDelegate, textDelegate);
        this.Y = s.t(this, a.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (l) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.f59410q), null, new a03.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174564b.o), null, new a03.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f174565c.o.f57403b), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.d), null, new c(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.change_pin_info_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.change_pin_info_title, null, null, 14), null);
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.change_pin_info_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setMenuItems(zhm.u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_FAQ", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f174564b.setText(new TextLocalisedClause(R$string.change_pin_info_get_started, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.X;
    }

    public final u g3() {
        ViewBinding value = this.Y.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getF78873d0() {
        return R$layout.screen_recycler_navbar_nextbutton;
    }
}
