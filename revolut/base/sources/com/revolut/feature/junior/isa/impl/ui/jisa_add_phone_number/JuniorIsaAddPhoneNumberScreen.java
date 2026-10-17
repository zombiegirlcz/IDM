package com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_add_phone_number.JuniorIsaAddPhoneNumberScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import la8.b;
import la8.c;
import la8.f;
import la8.g;
import te0.w;
import tx0.j0;
import vc.s;
import x98.d;
import x98.o;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_add_phone_number/JuniorIsaAddPhoneNumberScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lla8/g;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIsaAddPhoneNumberScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(JuniorIsaAddPhoneNumberScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final JuniorIsaAddPhoneNumberScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final PhoneEditorDelegate O;
    public final Object P;
    public final Object Q;

    public JuniorIsaAddPhoneNumberScreen(JuniorIsaAddPhoneNumberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: la8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaAddPhoneNumberScreen f193345b;

            {
                this.f193345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen = this.f193345b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaAddPhoneNumberScreen.R;
                        return (f) ((x98.d) juniorIsaAddPhoneNumberScreen.Q.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaAddPhoneNumberScreen.R;
                        JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen2 = this.f193345b;
                        return dli.f.a(juniorIsaAddPhoneNumberScreen2, juniorIsaAddPhoneNumberScreen2.R2(), u.c(juniorIsaAddPhoneNumberScreen2.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaAddPhoneNumberScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaAddPhoneNumberScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        JuniorIsaAddPhoneNumberScreenContract$InputData juniorIsaAddPhoneNumberScreenContract$InputData = juniorIsaAddPhoneNumberScreen.K;
                        juniorIsaAddPhoneNumberScreenContract$InputData.getClass();
                        return new x98.d(oVar, juniorIsaAddPhoneNumberScreenContract$InputData);
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = new PhoneEditorDelegate();
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: la8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaAddPhoneNumberScreen f193345b;

            {
                this.f193345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen = this.f193345b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaAddPhoneNumberScreen.R;
                        return (f) ((x98.d) juniorIsaAddPhoneNumberScreen.Q.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaAddPhoneNumberScreen.R;
                        JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen2 = this.f193345b;
                        return dli.f.a(juniorIsaAddPhoneNumberScreen2, juniorIsaAddPhoneNumberScreen2.R2(), u.c(juniorIsaAddPhoneNumberScreen2.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaAddPhoneNumberScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaAddPhoneNumberScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        JuniorIsaAddPhoneNumberScreenContract$InputData juniorIsaAddPhoneNumberScreenContract$InputData = juniorIsaAddPhoneNumberScreen.K;
                        juniorIsaAddPhoneNumberScreenContract$InputData.getClass();
                        return new x98.d(oVar, juniorIsaAddPhoneNumberScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: la8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaAddPhoneNumberScreen f193345b;

            {
                this.f193345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen = this.f193345b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaAddPhoneNumberScreen.R;
                        return (f) ((x98.d) juniorIsaAddPhoneNumberScreen.Q.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaAddPhoneNumberScreen.R;
                        JuniorIsaAddPhoneNumberScreen juniorIsaAddPhoneNumberScreen2 = this.f193345b;
                        return dli.f.a(juniorIsaAddPhoneNumberScreen2, juniorIsaAddPhoneNumberScreen2.R2(), u.c(juniorIsaAddPhoneNumberScreen2.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaAddPhoneNumberScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaAddPhoneNumberScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        JuniorIsaAddPhoneNumberScreenContract$InputData juniorIsaAddPhoneNumberScreenContract$InputData = juniorIsaAddPhoneNumberScreen.K;
                        juniorIsaAddPhoneNumberScreenContract$InputData.getClass();
                        return new x98.d(oVar, juniorIsaAddPhoneNumberScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f193350b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_trading_add_phone_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.junior_trading_add_phone_subtitle, u.c(this.K.f76769c), null, 12));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.junior_trading_add_phone_action_title, null, null, 14));
        largeActionButton.setLoadingButtonTag("SAVE_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.O;
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), new la8.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), new c(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
