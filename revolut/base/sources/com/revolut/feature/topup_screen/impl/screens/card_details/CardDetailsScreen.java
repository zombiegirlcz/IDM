package com.revolut.feature.topup_screen.impl.screens.card_details;

import android.app.Activity;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.view.ComponentActivity;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ara.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import com.revolut.feature.trust_common.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import h30.l;
import in0.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ni0.f;
import org.jetbrains.annotations.NotNull;
import ove.i;
import te0.w;
import umd.n;
import v0f.d;
import v0f.p;
import v0f.r;
import v0f.v;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u0006:\u0001\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/screens/card_details/CardDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lste/b;", "Ldli/a;", "Lv0f/w;", "Lin0/g;", "Landroidx/core/util/Consumer;", "Landroid/content/Intent;", "Companion", "a", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardDetailsScreen extends ViewController<ste.b> implements dli.a, g, Consumer<Intent> {
    public final CardDetailsScreenDescriptor$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final n O;
    public final List P;
    public final c Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CardDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CardDetailsScreen(CardDetailsScreenDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, d.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: v0f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsScreen f284796b;

            {
                this.f284796b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardDetailsScreen cardDetailsScreen = this.f284796b;
                switch (i2) {
                    case 0:
                        CardDetailsScreen.Companion companion = CardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cardDetailsScreen.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        CardDetailsScreenDescriptor$InputData cardDetailsScreenDescriptor$InputData = cardDetailsScreen.K;
                        cardDetailsScreenDescriptor$InputData.getClass();
                        return new ove.i(tVar, cardDetailsScreen, cardDetailsScreenDescriptor$InputData);
                    case 1:
                        return new InputTextDelegate(cardDetailsScreen.O);
                    case 2:
                        CardDetailsScreen.Companion companion2 = CardDetailsScreen.INSTANCE;
                        koi.h hVar = new koi.h(null, false, false, 1);
                        CardDetailsScreen cardDetailsScreen2 = this.f284796b;
                        return dli.f.a(cardDetailsScreen2, cardDetailsScreen2.d(), zhm.v.k(cardDetailsScreen2.f3(), new TextDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, new uu9.b(hVar, 20), hVar, null, 32);
                    default:
                        CardDetailsScreen.Companion companion3 = CardDetailsScreen.INSTANCE;
                        return (v) ((ove.i) cardDetailsScreen.N.getValue()).o.get();
                }
            }
        });
        this.O = new n(this, 25);
        this.P = u.c(new IconNavBarMenuItem("MENU_PCI_PROTECTION", new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.topup_shared_header_processing_trust_subtitle_default, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        this.Q = new c(this, 2);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: v0f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsScreen f284796b;

            {
                this.f284796b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardDetailsScreen cardDetailsScreen = this.f284796b;
                switch (i22) {
                    case 0:
                        CardDetailsScreen.Companion companion = CardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cardDetailsScreen.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        CardDetailsScreenDescriptor$InputData cardDetailsScreenDescriptor$InputData = cardDetailsScreen.K;
                        cardDetailsScreenDescriptor$InputData.getClass();
                        return new ove.i(tVar, cardDetailsScreen, cardDetailsScreenDescriptor$InputData);
                    case 1:
                        return new InputTextDelegate(cardDetailsScreen.O);
                    case 2:
                        CardDetailsScreen.Companion companion2 = CardDetailsScreen.INSTANCE;
                        koi.h hVar = new koi.h(null, false, false, 1);
                        CardDetailsScreen cardDetailsScreen2 = this.f284796b;
                        return dli.f.a(cardDetailsScreen2, cardDetailsScreen2.d(), zhm.v.k(cardDetailsScreen2.f3(), new TextDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, new uu9.b(hVar, 20), hVar, null, 32);
                    default:
                        CardDetailsScreen.Companion companion3 = CardDetailsScreen.INSTANCE;
                        return (v) ((ove.i) cardDetailsScreen.N.getValue()).o.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: v0f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsScreen f284796b;

            {
                this.f284796b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardDetailsScreen cardDetailsScreen = this.f284796b;
                switch (i22) {
                    case 0:
                        CardDetailsScreen.Companion companion = CardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cardDetailsScreen.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        CardDetailsScreenDescriptor$InputData cardDetailsScreenDescriptor$InputData = cardDetailsScreen.K;
                        cardDetailsScreenDescriptor$InputData.getClass();
                        return new ove.i(tVar, cardDetailsScreen, cardDetailsScreenDescriptor$InputData);
                    case 1:
                        return new InputTextDelegate(cardDetailsScreen.O);
                    case 2:
                        CardDetailsScreen.Companion companion2 = CardDetailsScreen.INSTANCE;
                        koi.h hVar = new koi.h(null, false, false, 1);
                        CardDetailsScreen cardDetailsScreen2 = this.f284796b;
                        return dli.f.a(cardDetailsScreen2, cardDetailsScreen2.d(), zhm.v.k(cardDetailsScreen2.f3(), new TextDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, new uu9.b(hVar, 20), hVar, null, 32);
                    default:
                        CardDetailsScreen.Companion companion3 = CardDetailsScreen.INSTANCE;
                        return (v) ((ove.i) cardDetailsScreen.N.getValue()).o.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: v0f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardDetailsScreen f284796b;

            {
                this.f284796b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardDetailsScreen cardDetailsScreen = this.f284796b;
                switch (i22) {
                    case 0:
                        CardDetailsScreen.Companion companion = CardDetailsScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(cardDetailsScreen.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        CardDetailsScreenDescriptor$InputData cardDetailsScreenDescriptor$InputData = cardDetailsScreen.K;
                        cardDetailsScreenDescriptor$InputData.getClass();
                        return new ove.i(tVar, cardDetailsScreen, cardDetailsScreenDescriptor$InputData);
                    case 1:
                        return new InputTextDelegate(cardDetailsScreen.O);
                    case 2:
                        CardDetailsScreen.Companion companion2 = CardDetailsScreen.INSTANCE;
                        koi.h hVar = new koi.h(null, false, false, 1);
                        CardDetailsScreen cardDetailsScreen2 = this.f284796b;
                        return dli.f.a(cardDetailsScreen2, cardDetailsScreen2.d(), zhm.v.k(cardDetailsScreen2.f3(), new TextDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, new uu9.b(hVar, 20), hVar, null, 32);
                    default:
                        CardDetailsScreen.Companion companion3 = CardDetailsScreen.INSTANCE;
                        return (v) ((ove.i) cardDetailsScreen.N.getValue()).o.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        v0f.w uiState = (v0f.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174557b.setEnabled(uiState.f284834b);
        if (uiState.f284835c) {
            d3().f174558c.setTextClause(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_card_input_footer_text, null, null, 14));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        if (i == 11) {
            b bVar = (b) d();
            if (intent != null) {
                bVar.u.getClass();
                ni0.e eVarA = f.a(intent);
                if (eVarA != null) {
                    bVar.H2(bVar.G, new uu9.b(e1.b0(eVarA), bVar));
                    return;
                }
            } else {
                bVar.getClass();
            }
            IllegalStateException illegalStateException = new IllegalStateException("Camera scan has no result data");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        rv0.h.a(window);
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((AppCompatActivity) activityM2).getLifecycle().addObserver(this.Q);
        ((j60.a) ((i) this.N.getValue()).f.get()).d(u.c(new RowDelegate(null, null, 7)));
        NavBarWithToolbar navBarWithToolbar = d3().e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_card_details_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        l.A(R.string.add_card_details_next_button_text, null, null, 14, d3().f174557b);
        d3().e.setMenuItems(this.P);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        boolean zIsAtLeast = ((AppCompatActivity) activityM2).getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED);
        b bVar = (b) d();
        if (zIsAtLeast) {
            f63.b bVar2 = ((f63.d) bVar.f91097x).f132401a;
            NfcAdapter nfcAdapter = bVar2.f132398b;
            if (nfcAdapter != null) {
                nfcAdapter.disableForegroundDispatch(bVar2.f132397a);
            }
        } else {
            bVar.getClass();
        }
        Activity activityM22 = m2();
        Intrinsics.i(activityM22, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        ((AppCompatActivity) activityM22).getLifecycle().removeObserver(this.Q);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).removeOnNewIntentListener(this);
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Intent intent) {
        Intent intent2 = intent;
        Intrinsics.checkNotNullParameter(intent2, "intent");
        w53.b.Companion.getClass();
        Tag scannedTag = w53.a.a(intent2);
        if (scannedTag != null) {
            b bVar = (b) d();
            bVar.getClass();
            Intrinsics.checkNotNullParameter(scannedTag, "scannedTag");
            bVar.n2(new uvf.b((Object) bVar, (Object) scannedTag, false, (Continuation) null, 8), new whi.b(6));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Activity activityM2 = m2();
        Intrinsics.i(activityM2, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        ((ComponentActivity) activityM2).addOnNewIntentListener(this);
        Activity activityM22 = m2();
        Intrinsics.i(activityM22, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        boolean zIsAtLeast = ((AppCompatActivity) activityM22).getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED);
        b bVar = (b) d();
        f63.d dVar = (f63.d) bVar.f91097x;
        boolean zB = dVar.b();
        boolean zA = dVar.a();
        bVar.H2(bVar.G, new a82.n(zA, zB, 10));
        if (zB && zA && zIsAtLeast) {
            ((f63.d) bVar.f91097x).c();
        }
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new v0f.s(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new v0f.s(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o.f57403b), null, new v0f.s(this, null, 2), 3);
        ViewController.P2(this, vkm.q.q(new p(new rv6.e(new urd.n(rd0.e.b(f3().f.f121375b), 23), 28), 1)), new u36.g(2, d(), v.class, "onFocusChanged", "onFocusChanged(Lcom/revolut/feature/topup_screen/impl/screens/card_details/CardDetailsScreenContract$CurrentFocus;)V", 4, 11), 3);
        ViewController.P2(this, new rv6.e(new urd.n(rd0.e.b(f3().e.f121375b), 24), 29), new r(this, null, 0), 3);
        ViewController.P2(this, new p(new urd.n(rd0.e.b(f3().e.f121375b), 25), 0), new r(this, null, 1), 3);
        ViewController.P2(this, new urd.n(rd0.e.b(f3().f52577j.f121375b), 21), new v0f.g(this, null), 3);
        ViewController.P2(this, new urd.n(rd0.e.b(f3().i.f121375b), 22), new v0f.i(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v d() {
        return (v) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InputTextDelegate f3() {
        return (InputTextDelegate) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        rv0.h.a(window);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void u(boolean z) {
        super.u(z);
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        rv0.h.a(window);
    }
}
