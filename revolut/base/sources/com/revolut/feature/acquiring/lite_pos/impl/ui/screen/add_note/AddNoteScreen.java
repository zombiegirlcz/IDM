package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import e58.d;
import ee1.a;
import ee1.c;
import ee1.e;
import ee1.f;
import ee1.i;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofm.q;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/add_note/AddNoteScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lee1/f;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/add_note/AddNoteScreenContract$InputData;", "Lee1/e;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddNoteScreen extends BaseRecyclerViewScreen<f, AddNoteScreenContract$InputData, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60767b0 = {o0.f186429a.j(new h0(AddNoteScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenLitePosAddNoteBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final InputTextDelegate X;
    public final List Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f60768a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddNoteScreen(AddNoteScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_lite_pos_add_note;
        this.V = s.t(this, a.f);
        this.W = R$id.addNoteScreen_recyclerView;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.X = inputTextDelegate;
        this.Y = u.c(inputTextDelegate);
        this.Z = w.y0(new d(this, inputData, 14));
        this.f60768a0 = w.y0(new e58.e(this, 8));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f172927b.setEnabled(uiState.f125064b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (ld1.b) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i) this.f60768a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f172928c.f59410q), null, new ee1.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f172927b.o), null, new ee1.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f172928c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        AddNoteScreenContract$InputData addNoteScreenContract$InputData = (AddNoteScreenContract$InputData) this.G;
        navBarWithToolbar.setTitle(addNoteScreenContract$InputData.f60769a, null);
        g3().f172927b.setText(addNoteScreenContract$InputData.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        f uiState = (f) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f172927b.setEnabled(uiState.f125064b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final jd1.h g3() {
        ViewBinding value = this.V.getValue(this, f60767b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jd1.h) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }
}
