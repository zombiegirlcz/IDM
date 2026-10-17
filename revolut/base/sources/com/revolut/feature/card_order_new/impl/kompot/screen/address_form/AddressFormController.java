package com.revolut.feature.card_order_new.impl.kompot.screen.address_form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.card_order_new.impl.R$id;
import com.revolut.feature.card_order_new.impl.R$layout;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormController;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import o23.a0;
import o23.c;
import o23.d;
import o23.f;
import o23.i;
import o23.j;
import o23.u;
import o23.x;
import o23.z;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/address_form/AddressFormController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo23/x;", "Ldli/a;", "Lo23/a0;", "Lno/m;", "Lno/k;", "Lin0/g;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddressFormController extends ViewController<x> implements dli.a, m, k, g {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(AddressFormController.class, "binding", "getBinding()Lcom/revolut/feature/card_order_new/impl/databinding/ScreenFormAddressBinding;", 0))};
    public final AddressFormScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct M;
    public AnalyticsContext N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;

    public AddressFormController(AddressFormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_form_address;
        this.M = inputData.k;
        this.N = inputData.f65123l;
        this.O = s.t(this, d.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: o23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFormController f221437b;

            {
                this.f221437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddressFormController addressFormController = this.f221437b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddressFormController.Y;
                        qji.b bVarU2 = addressFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_form.di.AddressFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        AddressFormScreenContract$InputData addressFormScreenContract$InputData = addressFormController.K;
                        addressFormScreenContract$InputData.getClass();
                        return new x13.k(pVar, qVar2, addressFormController, addressFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressFormController.Y;
                        return (u) ((x13.k) addressFormController.P.getValue()).f302139l.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddressFormController.Y;
                        return (j60.a) ((x13.k) addressFormController.P.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AddressFormController.Y;
                        return new SelectableDelegate((RowDelegate) addressFormController.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AddressFormController.Y;
                        AddressFormController addressFormController2 = this.f221437b;
                        return dli.f.a(addressFormController2, addressFormController2.e3(), zhm.v.k((InputTextDelegate) addressFormController2.V.getValue(), (TextDelegate) addressFormController2.W.getValue()), R$id.addressForm_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: o23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFormController f221437b;

            {
                this.f221437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddressFormController addressFormController = this.f221437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressFormController.Y;
                        qji.b bVarU2 = addressFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_form.di.AddressFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        AddressFormScreenContract$InputData addressFormScreenContract$InputData = addressFormController.K;
                        addressFormScreenContract$InputData.getClass();
                        return new x13.k(pVar, qVar2, addressFormController, addressFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressFormController.Y;
                        return (u) ((x13.k) addressFormController.P.getValue()).f302139l.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddressFormController.Y;
                        return (j60.a) ((x13.k) addressFormController.P.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AddressFormController.Y;
                        return new SelectableDelegate((RowDelegate) addressFormController.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AddressFormController.Y;
                        AddressFormController addressFormController2 = this.f221437b;
                        return dli.f.a(addressFormController2, addressFormController2.e3(), zhm.v.k((InputTextDelegate) addressFormController2.V.getValue(), (TextDelegate) addressFormController2.W.getValue()), R$id.addressForm_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: o23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFormController f221437b;

            {
                this.f221437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddressFormController addressFormController = this.f221437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressFormController.Y;
                        qji.b bVarU2 = addressFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_form.di.AddressFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        AddressFormScreenContract$InputData addressFormScreenContract$InputData = addressFormController.K;
                        addressFormScreenContract$InputData.getClass();
                        return new x13.k(pVar, qVar2, addressFormController, addressFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressFormController.Y;
                        return (u) ((x13.k) addressFormController.P.getValue()).f302139l.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddressFormController.Y;
                        return (j60.a) ((x13.k) addressFormController.P.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AddressFormController.Y;
                        return new SelectableDelegate((RowDelegate) addressFormController.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AddressFormController.Y;
                        AddressFormController addressFormController2 = this.f221437b;
                        return dli.f.a(addressFormController2, addressFormController2.e3(), zhm.v.k((InputTextDelegate) addressFormController2.V.getValue(), (TextDelegate) addressFormController2.W.getValue()), R$id.addressForm_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new nwf.b(27));
        this.T = w.y0(new nwf.b(28));
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: o23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFormController f221437b;

            {
                this.f221437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AddressFormController addressFormController = this.f221437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressFormController.Y;
                        qji.b bVarU2 = addressFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_form.di.AddressFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        AddressFormScreenContract$InputData addressFormScreenContract$InputData = addressFormController.K;
                        addressFormScreenContract$InputData.getClass();
                        return new x13.k(pVar, qVar2, addressFormController, addressFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressFormController.Y;
                        return (u) ((x13.k) addressFormController.P.getValue()).f302139l.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddressFormController.Y;
                        return (j60.a) ((x13.k) addressFormController.P.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AddressFormController.Y;
                        return new SelectableDelegate((RowDelegate) addressFormController.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AddressFormController.Y;
                        AddressFormController addressFormController2 = this.f221437b;
                        return dli.f.a(addressFormController2, addressFormController2.e3(), zhm.v.k((InputTextDelegate) addressFormController2.V.getValue(), (TextDelegate) addressFormController2.W.getValue()), R$id.addressForm_recyclerView, null, null, null, 56);
                }
            }
        });
        this.V = w.y0(new nwf.b(29));
        this.W = w.y0(new o23.b(0));
        final int i6 = 4;
        this.X = w.y0(new Function0(this) { // from class: o23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddressFormController f221437b;

            {
                this.f221437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AddressFormController addressFormController = this.f221437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddressFormController.Y;
                        qji.b bVarU2 = addressFormController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_order_new.impl.kompot.screen.address_form.di.AddressFormScreenInjector");
                        x13.q qVar = (x13.q) bVarU2;
                        x13.p pVar = qVar.f302174c;
                        x13.q qVar2 = qVar.d;
                        AddressFormScreenContract$InputData addressFormScreenContract$InputData = addressFormController.K;
                        addressFormScreenContract$InputData.getClass();
                        return new x13.k(pVar, qVar2, addressFormController, addressFormScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AddressFormController.Y;
                        return (u) ((x13.k) addressFormController.P.getValue()).f302139l.get();
                    case 2:
                        KProperty[] kPropertyArr3 = AddressFormController.Y;
                        return (j60.a) ((x13.k) addressFormController.P.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AddressFormController.Y;
                        return new SelectableDelegate((RowDelegate) addressFormController.T.getValue());
                    default:
                        KProperty[] kPropertyArr5 = AddressFormController.Y;
                        AddressFormController addressFormController2 = this.f221437b;
                        return dli.f.a(addressFormController2, addressFormController2.e3(), zhm.v.k((InputTextDelegate) addressFormController2.V.getValue(), (TextDelegate) addressFormController2.W.getValue()), R$id.addressForm_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        a0 uiState = (a0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        z zVar = qVar instanceof z ? (z) qVar : null;
        dli.a.z0(uiState);
        if (pd.b.k(zVar != null ? Boolean.valueOf(zVar.f221476a) : null)) {
            d3().f211232b.setEnabled(uiState.f221439b);
        }
        if (pd.b.k(zVar != null ? Boolean.valueOf(zVar.f221477b) : null)) {
            CollapsingActionButton addressFormButton = d3().f211232b;
            Intrinsics.checkNotNullExpressionValue(addressFormButton, "addressFormButton");
            addressFormButton.setCollapsed(uiState.f221440c, true);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x13.k) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f211233c;
        AddressFormScreenContract$InputData addressFormScreenContract$InputData = this.K;
        qh1.b bVar = addressFormScreenContract$InputData.i;
        Clause clause = addressFormScreenContract$InputData.e;
        Clause clause2 = addressFormScreenContract$InputData.d;
        Clause clause3 = addressFormScreenContract$InputData.f65119c;
        int i = c.f221443a[bVar.ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        } else if (i == 2) {
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cross);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        NavBarWithToolbar navBarWithToolbar2 = d3().f211233c;
        navBarWithToolbar2.setTitleAutoSize(false);
        navBarWithToolbar2.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar2.setToolbarTitle(clause3);
        navBarWithToolbar2.setTitle(clause3, null);
        navBarWithToolbar2.setDescriptionText(clause2);
        navBarWithToolbar2.setDescriptionVisible(clause2 != null);
        navBarWithToolbar2.setSecondDescriptionText(clause);
        navBarWithToolbar2.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar2.setEndIconImage(addressFormScreenContract$InputData.f);
        CollapsingActionButton collapsingActionButton = d3().f211232b;
        Clause textLocalisedClause = addressFormScreenContract$InputData.f65120g;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.shared_address_flow_form_continue, null, null, 14);
        }
        collapsingActionButton.setLargeButtonText(textLocalisedClause);
        d3().f211232b.setLoadingButtonTag("ADD_ADDRESS_SUBMIT_BUTTON_TAG");
        d3().f211232b.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        ((j60.a) this.R.getValue()).d(v.k((LargeActionButtonDelegate) this.S.getValue(), (RowDelegate) this.T.getValue(), (SelectableDelegate) this.U.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(d3().f211232b.c()), rd0.e.b(d3().f211232b.d())), null, new o23.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211233c.f59410q), null, new o23.e(this, continuation, 1), 3);
        ?? r56 = this.V;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52575g.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new o23.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).i.f121375b), null, new o23.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.W.getValue()).f53530c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.U.getValue()).r()), null, new o23.k(this, null), 3);
    }

    public final n13.d d3() {
        ViewBinding value = this.O.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n13.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final u R2() {
        return (u) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.f65124m;
    }
}
