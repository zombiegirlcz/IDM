package com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import s86.a;
import sef.b;
import sef.c;
import sef.d;
import sef.g;
import sef.h;
import sef.k;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/add_note/AddNoteScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lsef/h;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/add_note/AddNoteScreenContract$InputData;", "Lsef/g;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddNoteScreen extends BaseRecyclerViewScreen<h, AddNoteScreenContract$InputData, g> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91820d0 = {o0.f186429a.j(new h0(AddNoteScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ao.h U;
    public final InputTextDelegate V;
    public final FullScreenStateDelegate W;
    public final boolean X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91821a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91822b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddNoteScreen(AddNoteScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = new InputTextDelegate(null);
        this.W = new FullScreenStateDelegate();
        this.X = true;
        this.Y = R$layout.screen_recycler_navbar_nextbutton;
        this.Z = R$id.recyclerView;
        final int i = 0;
        this.f91821a0 = w.y0(new Function0(this) { // from class: sef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNoteScreen f262186b;

            {
                this.f262186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddNoteScreen addNoteScreen = this.f262186b;
                switch (i2) {
                    case 0:
                        return v.k(addNoteScreen.V, addNoteScreen.W);
                    default:
                        KProperty[] kPropertyArr = AddNoteScreen.f91820d0;
                        return (k) ((jef.a) addNoteScreen.f91822b0.getValue()).f173362c.get();
                }
            }
        });
        this.f91822b0 = w.y0(new a(this, inputData, 12));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: sef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNoteScreen f262186b;

            {
                this.f262186b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddNoteScreen addNoteScreen = this.f262186b;
                switch (i22) {
                    case 0:
                        return v.k(addNoteScreen.V, addNoteScreen.W);
                    default:
                        KProperty[] kPropertyArr = AddNoteScreen.f91820d0;
                        return (k) ((jef.a) addNoteScreen.f91822b0.getValue()).f173362c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        h uiState = (h) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.U.getValue(this, f91820d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LargeActionButton goToButton = ((u) value).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setEnabled(uiState.f262191a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (jef.a) this.f91822b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        KProperty[] kPropertyArr = f91820d0;
        KProperty kProperty = kPropertyArr[0];
        ao.h hVar = this.U;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        com.revolut.kompot.navigable.a.g2(this, e.b(goToButton.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.f52371h.f121375b), null, new sef.e(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        KProperty[] kPropertyArr = f91820d0;
        KProperty kProperty = kPropertyArr[0];
        ao.h hVar = this.U;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transaction_recogniser_recognised_screen_actions_add_note, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transaction_recogniser_recognised_screen_actions_add_note, null, null, 14));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        h uiState = (h) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.U.getValue(this, f91820d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LargeActionButton goToButton = ((u) value).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setEnabled(uiState.f262191a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75520a0() {
        return (List) this.f91821a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
