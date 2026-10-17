package com.revolut.feature.contacts_chooser.impl.ui;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import cn3.b;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.impl.R$id;
import com.revolut.feature.contacts_chooser.impl.R$layout;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nme.c;
import nme.c0;
import nn3.g;
import nn3.n;
import nn3.p;
import nn3.t;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/contacts_chooser/impl/ui/ContactsChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcn3/b;", "Ldli/a;", "Lnn3/g;", "Lno/m;", "Companion", "a", "feature_contacts_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactsChooserScreen extends ViewController<b> implements dli.a, m {
    public final ContactsChooserInputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final AnalyticsProduct O;
    public final Object P;
    public final boolean Q;
    public final ActionsDelegate R;
    public final RowDelegate S;
    public final SelectableDelegate T;
    public final RewardsGridDelegate U;
    public final BannerDelegate V;
    public final PlainTextDelegate W;
    public final Object X;
    public final ReferralContactDelegate Y;
    public final ScrollerBoxDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f66087a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f66086b0 = {o0.f186429a.j(new h0(ContactsChooserScreen.class, "binding", "getBinding()Lcom/revolut/feature/contacts_chooser/impl/databinding/ScreenChooseContactsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ContactsChooserScreen(ContactsChooserInputData inputData, bn3.a contextHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contextHandler, "contextHandler");
        this.K = inputData;
        this.L = R$layout.screen_choose_contacts;
        this.M = s.t(this, n.f);
        this.N = w.y0(new ni1.a(this, contextHandler, 7));
        this.O = inputData.f66069m;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: nn3.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsChooserScreen f217458b;

            {
                this.f217458b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ContactsChooserScreen.Companion companion = ContactsChooserScreen.INSTANCE;
                        return (e) ((in3.g) this.f217458b.N.getValue()).f162633j.get();
                    default:
                        ContactsChooserScreen.Companion companion2 = ContactsChooserScreen.INSTANCE;
                        ContactsChooserScreen contactsChooserScreen = this.f217458b;
                        return dli.f.a(contactsChooserScreen, contactsChooserScreen.R2(), zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), contactsChooserScreen.R, contactsChooserScreen.S, contactsChooserScreen.T, contactsChooserScreen.U, contactsChooserScreen.Z, contactsChooserScreen.V, contactsChooserScreen.W, new FullScreenStateDelegate()), R$id.contactsChooser_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.Q = true;
        this.R = new ActionsDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        this.T = new SelectableDelegate(rowDelegate);
        this.U = new RewardsGridDelegate();
        this.V = new BannerDelegate();
        this.W = new PlainTextDelegate();
        this.X = w.y0(new c(14));
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.Y = referralContactDelegate;
        this.Z = new ScrollerBoxDelegate(u.c(referralContactDelegate));
        final int i2 = 1;
        this.f66087a0 = w.y0(new Function0(this) { // from class: nn3.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContactsChooserScreen f217458b;

            {
                this.f217458b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ContactsChooserScreen.Companion companion = ContactsChooserScreen.INSTANCE;
                        return (e) ((in3.g) this.f217458b.N.getValue()).f162633j.get();
                    default:
                        ContactsChooserScreen.Companion companion2 = ContactsChooserScreen.INSTANCE;
                        ContactsChooserScreen contactsChooserScreen = this.f217458b;
                        return dli.f.a(contactsChooserScreen, contactsChooserScreen.R2(), zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), contactsChooserScreen.R, contactsChooserScreen.S, contactsChooserScreen.T, contactsChooserScreen.U, contactsChooserScreen.Z, contactsChooserScreen.V, contactsChooserScreen.W, new FullScreenStateDelegate()), R$id.contactsChooser_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        int iK;
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        hn3.a aVarD3 = d3();
        NavBarWithToolbar contactsChooserNavBar = aVarD3.e;
        TwinVerticalButton contactsChooserContinueTwinButton = aVarD3.f154038c;
        Intrinsics.checkNotNullExpressionValue(contactsChooserNavBar, "contactsChooserNavBar");
        contactsChooserNavBar.setMenuItems(v.l(this.K.f ? PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "ID_MENU_ITEM_NEW", new TextLocalisedClause(R.string.badge_new_sign_title, null, null, 14), null, 60) : null));
        Intrinsics.checkNotNullExpressionValue(contactsChooserContinueTwinButton, "contactsChooserContinueTwinButton");
        Clause clause = uiState.f217451b;
        Clause clause2 = uiState.f217452c;
        knm.b.z(contactsChooserContinueTwinButton, clause != null, null, 14);
        contactsChooserContinueTwinButton.setMainButtonLoadingTag("CONTACTS_CHOOSER_PROCEED_BUTTON_TAG");
        contactsChooserContinueTwinButton.setMainButtonText(clause);
        if (clause2 != null) {
            contactsChooserContinueTwinButton.setSecondaryButtonText(clause2);
        }
        contactsChooserContinueTwinButton.setSecondaryButtonVisible(clause2 != null);
        ScreenContentRecyclerView contactsChooserRecyclerView = aVarD3.f;
        Intrinsics.checkNotNullExpressionValue(contactsChooserRecyclerView, "contactsChooserRecyclerView");
        boolean z = clause != null;
        boolean z3 = clause2 != null;
        if (z && z3) {
            Context context = d3().f.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 160.0f);
        } else if (z || z3) {
            Context context2 = d3().f.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 80.0f);
        } else {
            iK = 0;
        }
        knm.b.v(iK, contactsChooserRecyclerView);
        d3().d.setLabels(uiState.e);
        if (uiState.d) {
            contactsChooserNavBar.K0(j4.FADE);
            contactsChooserNavBar.E0();
            uiState.d = false;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) R2()).C2(b.a.f25343a);
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (in3.g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((in3.g) this.N.getValue()).f.get()).d(u.c((RowDelegate) this.X.getValue()));
        hn3.a aVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = aVarD3.e;
        ContactsChooserInputData contactsChooserInputData = this.K;
        navBarWithToolbar.setTitle(contactsChooserInputData.f66062a, null);
        navBarWithToolbar.setToolbarTitle(contactsChooserInputData.f66062a);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(contactsChooserInputData.f66074s));
        navBarWithToolbar.setHint(contactsChooserInputData.f66063b);
        Clause clause = contactsChooserInputData.f66070n;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSearchButtonActive(true);
        aVarD3.f154037b.o(LargeActionButton.ButtonStyle.f58725a);
        ScreenContentRecyclerView contactsChooserRecyclerView = aVarD3.f;
        Intrinsics.checkNotNullExpressionValue(contactsChooserRecyclerView, "contactsChooserRecyclerView");
        contactsChooserRecyclerView.addOnScrollListener(new nn3.o(m2()));
    }

    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        hn3.a aVarD3 = d3();
        LabeledVerticalScrollView labeledVerticalScrollView = aVarD3.d;
        ScreenContentRecyclerView recyclerView = aVarD3.f;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "contactsChooserRecyclerView");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        labeledVerticalScrollView.d = recyclerView;
        NavBarWithToolbar navBarWithToolbar = aVarD3.e;
        Continuation continuation = null;
        int i = 0;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new p(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new nn3.q(this, continuation, i), 3);
        int i2 = 1;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.x0()), new nn3.q(this, continuation, i2), 3);
        int i3 = 2;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59409p.f57337m), new nn3.q(this, continuation, i3), 3);
        TwinVerticalButton twinVerticalButton = aVarD3.f154038c;
        ViewController.P2(this, rd0.e.b(twinVerticalButton.o0()), new p(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.p0()), new p(this, continuation, i3), 3);
        r rVarMergeArray = r.mergeArray(this.T.r().map(new njf.c(new c0(17), 11)), this.U.f53209c.d.map(new njf.c(new c0(18), 12)), this.Y.q().map(new njf.c(new c0(19), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        ViewController.P2(this, rd0.e.b(rVarMergeArray), new nn3.q(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.R.f51611c.f121375b), new nn3.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.X.getValue()).f53218h), new nn3.u(this, null), 3);
        BannerDelegate bannerDelegate = this.V;
        ViewController.P2(this, rd0.e.b(bannerDelegate.e), new nn3.v(this, null), 3);
        ViewController.P2(this, rd0.e.b(bannerDelegate.f51699c), new nn3.r(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.W.d.f121375b), new nn3.q(this, continuation, 3), 3);
    }

    public final hn3.a d3() {
        ViewBinding value = this.M.getValue(this, f66086b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hn3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nn3.e R2() {
        return (nn3.e) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f66087a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }

    public ContactsChooserScreen(ContactsChooserInputData contactsChooserInputData) {
        this(contactsChooserInputData, new bn3.b());
    }
}
