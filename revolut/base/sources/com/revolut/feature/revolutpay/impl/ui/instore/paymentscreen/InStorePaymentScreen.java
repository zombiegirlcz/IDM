package com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen;

import aii.q;
import android.content.Intent;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b7d.c;
import b9c.f;
import b9c.g;
import b9c.k;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.InStorePaymentScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.f0;
import p7c.r;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/instore/paymentscreen/InStorePaymentScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lb9c/g;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InStorePaymentScreen extends BaseRecyclerViewScreen<g, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f84499a0 = {o0.f186429a.j(new h0(InStorePaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final h V;
    public final Object W;
    public final AmountEditDelegate X;
    public final List Y;
    public final Object Z;

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

    public InStorePaymentScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = s.t(this, a.f);
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: b9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InStorePaymentScreen f13699b;

            {
                this.f13699b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InStorePaymentScreen inStorePaymentScreen = this.f13699b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InStorePaymentScreen.f84499a0;
                        qji.b bVarQ2 = inStorePaymentScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.di.InStorePaymentScreenInjector");
                        r rVar = ((p7c.g) bVarQ2).f233610a;
                        p7c.h hVar = new p7c.h();
                        int i3 = 19;
                        hVar.f233614a = e4m.b.b(new f0(rVar, hVar, 2, i3));
                        hVar.f233615b = e4m.b.b(new f0(rVar, hVar, 1, i3));
                        hVar.f233616c = e4m.b.b(new f0(rVar, hVar, 0, i3));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr2 = InStorePaymentScreen.f84499a0;
                        return (f) ((p7c.h) inStorePaymentScreen.W.getValue()).f233616c.get();
                }
            }
        });
        AmountEditDelegate amountEditDelegate = new AmountEditDelegate(new c(this, 6));
        this.X = amountEditDelegate;
        final int i2 = 1;
        this.Y = v.k(new HeaderDelegate(), amountEditDelegate, new CellDetailsDelegate(), new RowLoadingDelegate());
        this.Z = w.y0(new Function0(this) { // from class: b9c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InStorePaymentScreen f13699b;

            {
                this.f13699b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InStorePaymentScreen inStorePaymentScreen = this.f13699b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InStorePaymentScreen.f84499a0;
                        qji.b bVarQ2 = inStorePaymentScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.di.InStorePaymentScreenInjector");
                        r rVar = ((p7c.g) bVarQ2).f233610a;
                        p7c.h hVar = new p7c.h();
                        int i3 = 19;
                        hVar.f233614a = e4m.b.b(new f0(rVar, hVar, 2, i3));
                        hVar.f233615b = e4m.b.b(new f0(rVar, hVar, 1, i3));
                        hVar.f233616c = e4m.b.b(new f0(rVar, hVar, 0, i3));
                        return hVar;
                    default:
                        KProperty[] kPropertyArr2 = InStorePaymentScreen.f84499a0;
                        return (f) ((p7c.h) inStorePaymentScreen.W.getValue()).f233616c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (p7c.h) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        String currencyCode;
        String pocketId;
        if (i != 4 || intent == null || (currencyCode = intent.getStringExtra("argCurrency")) == null || (pocketId = intent.getStringExtra("argPocketId")) == null) {
            return;
        }
        k kVar = (k) ((f) this.Z.getValue());
        kVar.getClass();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        kVar.x2(new ak7.g(pocketId, 26));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new b9c.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f.f121375b), null, new b9c.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new b9c.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(g uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextClause textClause = uiState.f13705a;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setDescriptionText(uiState.f13706b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEndIconBadgeImage(new ResourceImage(R$drawable.uikit_icn_16_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        h3().f174564b.setEnabled(uiState.d);
        h3().f174564b.setText(uiState.e);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final u h3() {
        ViewBinding value = this.V.getValue(this, f84499a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }
}
