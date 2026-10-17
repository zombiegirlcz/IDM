package com.revolut.feature.credit.loan.impl.ui.rev10.loanslist;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c0d.e;
import c65.i;
import c75.c;
import c75.f;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.loanslist.LoansListScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import u45.q0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/loanslist/LoansListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lc75/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoansListScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(LoansListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f70445a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f70446b0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public LoansListScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: c75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansListScreen f21877b;

            {
                this.f21877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 1;
                int i5 = 0;
                LoansListScreen loansListScreen = this.f21877b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoansListScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(loansListScreen.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        u45.h hVar = ((u45.h) aVar2.b()).B;
                        q0 q0Var = new q0();
                        int i6 = 24;
                        q0Var.f277202a = e4m.b.b(new u45.e(hVar, q0Var, i3, i6));
                        q0Var.f277203b = e4m.b.b(new u45.e(hVar, q0Var, i5, i6));
                        return q0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = LoansListScreen.c0;
                        return (e) ((q0) loansListScreen.W.getValue()).f277203b.get();
                    default:
                        KProperty[] kPropertyArr3 = LoansListScreen.c0;
                        return v.k((RowDelegate) loansListScreen.f70445a0.getValue(), (FullScreenStateDelegate) loansListScreen.f70446b0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: c75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansListScreen f21877b;

            {
                this.f21877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 1;
                int i5 = 0;
                LoansListScreen loansListScreen = this.f21877b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoansListScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(loansListScreen.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        u45.h hVar = ((u45.h) aVar2.b()).B;
                        q0 q0Var = new q0();
                        int i6 = 24;
                        q0Var.f277202a = e4m.b.b(new u45.e(hVar, q0Var, i3, i6));
                        q0Var.f277203b = e4m.b.b(new u45.e(hVar, q0Var, i5, i6));
                        return q0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = LoansListScreen.c0;
                        return (e) ((q0) loansListScreen.W.getValue()).f277203b.get();
                    default:
                        KProperty[] kPropertyArr3 = LoansListScreen.c0;
                        return v.k((RowDelegate) loansListScreen.f70445a0.getValue(), (FullScreenStateDelegate) loansListScreen.f70446b0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: c75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoansListScreen f21877b;

            {
                this.f21877b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 1;
                int i5 = 0;
                LoansListScreen loansListScreen = this.f21877b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoansListScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(loansListScreen.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        u45.h hVar = ((u45.h) aVar2.b()).B;
                        q0 q0Var = new q0();
                        int i6 = 24;
                        q0Var.f277202a = e4m.b.b(new u45.e(hVar, q0Var, i32, i6));
                        q0Var.f277203b = e4m.b.b(new u45.e(hVar, q0Var, i5, i6));
                        return q0Var;
                    case 1:
                        KProperty[] kPropertyArr2 = LoansListScreen.c0;
                        return (e) ((q0) loansListScreen.W.getValue()).f277203b.get();
                    default:
                        KProperty[] kPropertyArr3 = LoansListScreen.c0;
                        return v.k((RowDelegate) loansListScreen.f70445a0.getValue(), (FullScreenStateDelegate) loansListScreen.f70446b0.getValue(), new RowLoadingDelegate());
                }
            }
        });
        this.Z = s.t(this, a.f);
        this.f70445a0 = w.y0(new e(17));
        this.f70446b0 = w.y0(new e(18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (q0) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (c75.e) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.f70446b0.getValue()).f52371h.f121375b), null, new c75.b(this, null), 3);
        ViewBinding value = this.Z.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new i(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.f70445a0.getValue()).f53218h), null, new c(2, 4, c75.e.class, (c75.e) this.X.getValue(), "onRowItemClicked", "onRowItemClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Z.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.loan_management_all_products_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.loan_management_all_products_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75644a0() {
        return (List) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
