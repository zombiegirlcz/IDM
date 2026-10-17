package com.revolut.feature.freelancer.impl.ui.create_sale.invoice.tax_rates;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.tax_rates.AddTaxRateScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ew6.c;
import ew6.e;
import ew6.f;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import sji.b;
import te0.w;
import ufg.k0;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/create_sale/invoice/tax_rates/AddTaxRateScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lew6/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddTaxRateScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, Object> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f73767b0 = {o0.f186429a.j(new h0(AddTaxRateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object U;
    public final h V;
    public final int W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f73768a0;

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

    public AddTaxRateScreen() {
        super(IOData$EmptyInput.f98299a);
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: ew6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTaxRateScreen f130095b;

            {
                this.f130095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddTaxRateScreen addTaxRateScreen = this.f130095b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddTaxRateScreen.f73767b0;
                        phm.a aVar = (phm.a) ue0.e.j(addTaxRateScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.b bVar = new us6.b();
                        int i3 = 17;
                        bVar.f282453a = e4m.b.b(new k0(qVar, bVar, 1, i3));
                        bVar.f282454b = e4m.b.b(new k0(qVar, bVar, 0, i3));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddTaxRateScreen.f73767b0;
                        return zhm.u.c((InputTextDelegate) addTaxRateScreen.Y.getValue());
                    default:
                        KProperty[] kPropertyArr3 = AddTaxRateScreen.f73767b0;
                        return (e) ((us6.b) addTaxRateScreen.U.getValue()).f282454b.get();
                }
            }
        });
        this.V = s.t(this, a.f);
        this.W = R$layout.screen_recycler_navbar_nextbutton;
        this.X = true;
        this.Y = w.y0(new euf.a(14));
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: ew6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTaxRateScreen f130095b;

            {
                this.f130095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddTaxRateScreen addTaxRateScreen = this.f130095b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddTaxRateScreen.f73767b0;
                        phm.a aVar = (phm.a) ue0.e.j(addTaxRateScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.b bVar = new us6.b();
                        int i3 = 17;
                        bVar.f282453a = e4m.b.b(new k0(qVar, bVar, 1, i3));
                        bVar.f282454b = e4m.b.b(new k0(qVar, bVar, 0, i3));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddTaxRateScreen.f73767b0;
                        return zhm.u.c((InputTextDelegate) addTaxRateScreen.Y.getValue());
                    default:
                        KProperty[] kPropertyArr3 = AddTaxRateScreen.f73767b0;
                        return (e) ((us6.b) addTaxRateScreen.U.getValue()).f282454b.get();
                }
            }
        });
        final int i3 = 2;
        this.f73768a0 = w.y0(new Function0(this) { // from class: ew6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddTaxRateScreen f130095b;

            {
                this.f130095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddTaxRateScreen addTaxRateScreen = this.f130095b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddTaxRateScreen.f73767b0;
                        phm.a aVar = (phm.a) ue0.e.j(addTaxRateScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        us6.b bVar = new us6.b();
                        int i32 = 17;
                        bVar.f282453a = e4m.b.b(new k0(qVar, bVar, 1, i32));
                        bVar.f282454b = e4m.b.b(new k0(qVar, bVar, 0, i32));
                        return bVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AddTaxRateScreen.f73767b0;
                        return zhm.u.c((InputTextDelegate) addTaxRateScreen.Y.getValue());
                    default:
                        KProperty[] kPropertyArr3 = AddTaxRateScreen.f73767b0;
                        return (e) ((us6.b) addTaxRateScreen.U.getValue()).f282454b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (us6.b) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.f73768a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new ew6.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.Y.getValue()).e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174564b.o), null, new ew6.b(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF97409h0() {
        return (List) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f130099a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        LargeActionButton largeActionButton = h3().f174564b;
        largeActionButton.setText(uiState.f130101c);
        largeActionButton.setEnabled(uiState.f130100b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    public final u h3() {
        ViewBinding value = this.V.getValue(this, f73767b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
