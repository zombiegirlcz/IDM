package com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import bc1.b;
import bi2.n;
import br7.a;
import br7.c;
import br7.d;
import br7.e;
import br7.h;
import br7.i;
import br7.j;
import br7.m;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ql7.m1;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/upload_documents/files/UploadFilesListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lbr7/j;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/upload_documents/files/UploadFilesListScreenContract$InputData;", "Lbr7/h;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UploadFilesListScreen extends BaseRecyclerViewScreen<j, UploadFilesListScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(UploadFilesListScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenUploadFilesListBinding;", 0))};
    public final int U;
    public final ao.h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final RowDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final TwinHorizontalButtonDelegate f75685a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75686b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFilesListScreen(UploadFilesListScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_upload_files_list;
        this.V = s.t(this, a.f);
        this.W = R$id.uploadFilesList_recyclerView;
        this.X = w.y0(new bc1.a(this, inputData, 22));
        this.Y = w.y0(new b(this, 23));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Z = rowDelegate;
        this.f75685a0 = new TwinHorizontalButtonDelegate();
        this.f75686b0 = u.c(rowDelegate);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        boolean zF2 = super.F2();
        if (!zF2) {
            m mVar = (m) T2();
            mVar.f17945p.a(((e) mVar.t2()).f17937c);
        }
        return zF2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (m1) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217097c.p0()), null, new n(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217097c.f59410q), null, new br7.b(this, null, 0), 3);
        RowDelegate rowDelegate = this.Z;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.k), null, new d(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.f75685a0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new br7.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new br7.b(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f217096b.o), null, new br7.b(this, null, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f217097c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ((j60.a) ((m1) this.X.getValue()).o.get()).d(u.c(this.f75685a0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF75686b0() {
        return this.f75686b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f217097c;
        ?? r06 = uiState.f17940b;
        navBarWithToolbar.setToolbarTitle(r06);
        navBarWithToolbar.setTitle(r06, null);
        navBarWithToolbar.setDescriptionText(uiState.f17941c);
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = h3().f217096b;
        largeActionButton.setText(uiState.d);
        largeActionButton.setEnabled(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final nl7.s h3() {
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nl7.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Y.getValue();
    }
}
