package com.revolut.feature.credit.direct.debit.guarantee;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az4.b;
import az4.c;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.direct.debit.guarantee.DirectDebitGuaranteeScreen;
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
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;
import ztg.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/guarantee/DirectDebitGuaranteeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Laz4/b;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitGuaranteeScreen extends BaseRecyclerViewScreen<b, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f69909a0 = {o0.f186429a.j(new h0(DirectDebitGuaranteeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final Object W;
    public final Object X;
    public final List Y;
    public final h Z;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public DirectDebitGuaranteeScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 1;
        this.V = true;
        final int i2 = 0;
        this.W = w.y0(new Function0(this) { // from class: az4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitGuaranteeScreen f11389b;

            {
                this.f11389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                DirectDebitGuaranteeScreen directDebitGuaranteeScreen = this.f11389b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitGuaranteeScreen.f69909a0;
                        Object objQ2 = directDebitGuaranteeScreen.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.guarantee.di.GuaranteeScreenInjector");
                        zy4.b bVar = new zy4.b();
                        bVar.f326365a = e4m.b.b(new e(bVar, 1, 4));
                        bVar.f326366b = e4m.b.b(new e(bVar, 0, 4));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitGuaranteeScreen.f69909a0;
                        return (c) ((zy4.b) directDebitGuaranteeScreen.W.getValue()).f326366b.get();
                }
            }
        });
        this.X = w.y0(new Function0(this) { // from class: az4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitGuaranteeScreen f11389b;

            {
                this.f11389b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                DirectDebitGuaranteeScreen directDebitGuaranteeScreen = this.f11389b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitGuaranteeScreen.f69909a0;
                        Object objQ2 = directDebitGuaranteeScreen.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.guarantee.di.GuaranteeScreenInjector");
                        zy4.b bVar = new zy4.b();
                        bVar.f326365a = e4m.b.b(new e(bVar, 1, 4));
                        bVar.f326366b = e4m.b.b(new e(bVar, 0, 4));
                        return bVar;
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitGuaranteeScreen.f69909a0;
                        return (c) ((zy4.b) directDebitGuaranteeScreen.W.getValue()).f326366b.get();
                }
            }
        });
        this.Y = v.k(new TextDelegate(), new ListCellDelegate());
        this.Z = s.t(this, a.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (zy4.b) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (c) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Z.getValue(this, f69909a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((u) value).f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_direct_debit_guarantee_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
