package com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.x;
import kg1.c;
import kg1.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qg1.k;
import qg1.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/card_security/screen/CardSecurityPromptController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkg1/c;", "Ldli/a;", "Lqg1/m;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardSecurityPromptController extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CardSecurityPromptController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final CardSecurityPromptScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;

    public CardSecurityPromptController(CardSecurityPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityPromptController f245619b;

            {
                this.f245619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardSecurityPromptController cardSecurityPromptController = this.f245619b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardSecurityPromptController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cardSecurityPromptController.m2()).a().get(og1.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", og1.i.class, " is not found"));
                        }
                        og1.i iVar = ((og1.i) aVar2.b()).f;
                        CardSecurityPromptScreenContract$InputData cardSecurityPromptScreenContract$InputData = cardSecurityPromptController.K;
                        cardSecurityPromptScreenContract$InputData.getClass();
                        return new og1.c(iVar, cardSecurityPromptController, cardSecurityPromptScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSecurityPromptController.Q;
                        return (k) ((og1.c) cardSecurityPromptController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CardSecurityPromptController.Q;
                        CardSecurityPromptController cardSecurityPromptController2 = this.f245619b;
                        return dli.f.a(cardSecurityPromptController2, (k) cardSecurityPromptController2.O.getValue(), v.k(new NewRevolutCardDelegate((int) (((c90.c) ((og1.c) cardSecurityPromptController2.L.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_two_buttons;
        this.N = s.t(this, qg1.c.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityPromptController f245619b;

            {
                this.f245619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardSecurityPromptController cardSecurityPromptController = this.f245619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSecurityPromptController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cardSecurityPromptController.m2()).a().get(og1.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", og1.i.class, " is not found"));
                        }
                        og1.i iVar = ((og1.i) aVar2.b()).f;
                        CardSecurityPromptScreenContract$InputData cardSecurityPromptScreenContract$InputData = cardSecurityPromptController.K;
                        cardSecurityPromptScreenContract$InputData.getClass();
                        return new og1.c(iVar, cardSecurityPromptController, cardSecurityPromptScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSecurityPromptController.Q;
                        return (k) ((og1.c) cardSecurityPromptController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CardSecurityPromptController.Q;
                        CardSecurityPromptController cardSecurityPromptController2 = this.f245619b;
                        return dli.f.a(cardSecurityPromptController2, (k) cardSecurityPromptController2.O.getValue(), v.k(new NewRevolutCardDelegate((int) (((c90.c) ((og1.c) cardSecurityPromptController2.L.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qg1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardSecurityPromptController f245619b;

            {
                this.f245619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardSecurityPromptController cardSecurityPromptController = this.f245619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardSecurityPromptController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cardSecurityPromptController.m2()).a().get(og1.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", og1.i.class, " is not found"));
                        }
                        og1.i iVar = ((og1.i) aVar2.b()).f;
                        CardSecurityPromptScreenContract$InputData cardSecurityPromptScreenContract$InputData = cardSecurityPromptController.K;
                        cardSecurityPromptScreenContract$InputData.getClass();
                        return new og1.c(iVar, cardSecurityPromptController, cardSecurityPromptScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CardSecurityPromptController.Q;
                        return (k) ((og1.c) cardSecurityPromptController.L.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CardSecurityPromptController.Q;
                        CardSecurityPromptController cardSecurityPromptController2 = this.f245619b;
                        return dli.f.a(cardSecurityPromptController2, (k) cardSecurityPromptController2.O.getValue(), v.k(new NewRevolutCardDelegate((int) (((c90.c) ((og1.c) cardSecurityPromptController2.L.getValue()).d.get()).c() * 0.8f)), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (og1.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        CardSecurityPromptScreenContract$InputData cardSecurityPromptScreenContract$InputData = this.K;
        d dVar = cardSecurityPromptScreenContract$InputData.f60874c;
        int[] iArr = qg1.b.f245620a;
        int i = iArr[dVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.xpay_card_security_description, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.xpay_card_security_replace_card_description, null, null, 14);
        }
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.xpay_card_security_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174573b.setText(new TextLocalisedClause(R$string.xpay_card_security_primary_button, null, null, 14));
        LargeActionButton largeActionButton = d3().e;
        int i2 = iArr[cardSecurityPromptScreenContract$InputData.f60874c.ordinal()];
        if (i2 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.xpay_card_security_secondary_button, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.xpay_card_security_replace_card_button, null, null, 14);
        }
        largeActionButton.setText(textLocalisedClause2);
        largeActionButton.o(LargeActionButton.ButtonStyle.f);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new qg1.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new qg1.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new qg1.d(this, continuation, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
