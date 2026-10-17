package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.g2;
import c5a.g;
import c5a.j;
import c5a.k;
import c5a.p;
import c5a.r;
import c5a.t;
import c5a.u;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit.views.navbar.NavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.i;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.feature.payments.who_to_transfer.impl.R$layout;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import rp0.l0;
import s3a.n;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lc5a/v;", "Ldte/c;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatTransferScreen extends ViewController<q> implements dli.a, dte.c {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f80146e0;
    public final ChatTransferScreenContract$InputData K;
    public final int L;
    public final h M;
    public final h N;
    public l0 O;
    public final boolean P;
    public final Object Q;
    public final ihm.f R;
    public final RateEmojiDelegate S;
    public final RowDelegate T;
    public final SwipeToActionDelegate U;
    public final SearchButtonDelegate V;
    public final FullScreenStateDelegate W;
    public final ActionWidgetDelegate X;
    public final BannerDelegate Y;
    public final ScrollerDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f80147a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final no0.a f80148b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f80149d0;

    static {
        h0 h0Var = new h0(ChatTransferScreen.class, "bindingEmbedded", "getBindingEmbedded()Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsTransfersOldBinding;", 0);
        p0 p0Var = o0.f186429a;
        f80146e0 = new KProperty[]{p0Var.j(h0Var), p.a.y(ChatTransferScreen.class, "bindingFullscreen", "getBindingFullscreen()Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsTransfersFullscreenBinding;", 0, p0Var)};
    }

    public ChatTransferScreen(ChatTransferScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.a() ? R$layout.screen_payments_transfers_old : R$layout.screen_payments_transfers_fullscreen;
        this.M = s.t(this, c5a.b.f);
        this.N = s.t(this, c5a.c.f);
        final int i = 1;
        this.P = !inputData.a();
        final int i2 = 0;
        this.Q = w.y0(new Function0(this) { // from class: c5a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatTransferScreen f21483b;

            {
                this.f21483b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ChatTransferScreen chatTransferScreen = this.f21483b;
                switch (i3) {
                    case 0:
                        d5a.a aVar = new d5a.a(chatTransferScreen.R, chatTransferScreen.Z.i, chatTransferScreen.f80148b0.f, 0);
                        phm.a aVar2 = (phm.a) ue0.e.j(chatTransferScreen.m2()).a().get(s3a.r.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s3a.r.class, " is not found"));
                        }
                        s3a.o oVar = (s3a.o) ((s3a.k) ((s3a.r) aVar3.b())).I();
                        oVar.f259580b = chatTransferScreen;
                        oVar.f259581c = chatTransferScreen;
                        oVar.g0(chatTransferScreen.K);
                        oVar.e = aVar;
                        return (s3a.n) oVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr = ChatTransferScreen.f80146e0;
                        return chatTransferScreen.R1().j();
                    default:
                        KProperty[] kPropertyArr2 = ChatTransferScreen.f80146e0;
                        ChatTransferScreen chatTransferScreen2 = this.f21483b;
                        return dli.f.a(chatTransferScreen2, chatTransferScreen2.d(), zhm.d0.E0(chatTransferScreen2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), chatTransferScreen2.S, chatTransferScreen2.T, chatTransferScreen2.U, chatTransferScreen2.V, chatTransferScreen2.W, chatTransferScreen2.Z, chatTransferScreen2.X, new ActionWidgetLoadingDelegate(), chatTransferScreen2.Y)), R$id.transferScreen_recyclerView, null, chatTransferScreen2.f80148b0, null, 40);
                }
            }
        });
        this.R = v0.a.d("create(...)");
        this.S = new RateEmojiDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.T = rowDelegate;
        this.U = new SwipeToActionDelegate(rowDelegate, false);
        this.V = new SearchButtonDelegate();
        this.W = new FullScreenStateDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.X = actionWidgetDelegate;
        BannerDelegate bannerDelegate = new BannerDelegate();
        this.Y = bannerDelegate;
        final int i3 = 2;
        this.Z = new ScrollerDelegate(v.k(actionWidgetDelegate, bannerDelegate, new HeroBannerDelegate(0), new ActionWidgetLoadingDelegate(), new HeroBannerLoadingDelegate()), false);
        this.f80147a0 = w.y0(new c0d.e(12));
        this.f80148b0 = new no0.a(new koi.c(0), 10);
        this.c0 = w.y0(new Function0(this) { // from class: c5a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatTransferScreen f21483b;

            {
                this.f21483b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i;
                ChatTransferScreen chatTransferScreen = this.f21483b;
                switch (i32) {
                    case 0:
                        d5a.a aVar = new d5a.a(chatTransferScreen.R, chatTransferScreen.Z.i, chatTransferScreen.f80148b0.f, 0);
                        phm.a aVar2 = (phm.a) ue0.e.j(chatTransferScreen.m2()).a().get(s3a.r.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s3a.r.class, " is not found"));
                        }
                        s3a.o oVar = (s3a.o) ((s3a.k) ((s3a.r) aVar3.b())).I();
                        oVar.f259580b = chatTransferScreen;
                        oVar.f259581c = chatTransferScreen;
                        oVar.g0(chatTransferScreen.K);
                        oVar.e = aVar;
                        return (s3a.n) oVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr = ChatTransferScreen.f80146e0;
                        return chatTransferScreen.R1().j();
                    default:
                        KProperty[] kPropertyArr2 = ChatTransferScreen.f80146e0;
                        ChatTransferScreen chatTransferScreen2 = this.f21483b;
                        return dli.f.a(chatTransferScreen2, chatTransferScreen2.d(), zhm.d0.E0(chatTransferScreen2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), chatTransferScreen2.S, chatTransferScreen2.T, chatTransferScreen2.U, chatTransferScreen2.V, chatTransferScreen2.W, chatTransferScreen2.Z, chatTransferScreen2.X, new ActionWidgetLoadingDelegate(), chatTransferScreen2.Y)), R$id.transferScreen_recyclerView, null, chatTransferScreen2.f80148b0, null, 40);
                }
            }
        });
        this.f80149d0 = w.y0(new Function0(this) { // from class: c5a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChatTransferScreen f21483b;

            {
                this.f21483b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ChatTransferScreen chatTransferScreen = this.f21483b;
                switch (i32) {
                    case 0:
                        d5a.a aVar = new d5a.a(chatTransferScreen.R, chatTransferScreen.Z.i, chatTransferScreen.f80148b0.f, 0);
                        phm.a aVar2 = (phm.a) ue0.e.j(chatTransferScreen.m2()).a().get(s3a.r.class);
                        b60.a aVar3 = aVar2 != null ? (b60.a) aVar2.get() : null;
                        if (aVar3 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s3a.r.class, " is not found"));
                        }
                        s3a.o oVar = (s3a.o) ((s3a.k) ((s3a.r) aVar3.b())).I();
                        oVar.f259580b = chatTransferScreen;
                        oVar.f259581c = chatTransferScreen;
                        oVar.g0(chatTransferScreen.K);
                        oVar.e = aVar;
                        return (s3a.n) oVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr = ChatTransferScreen.f80146e0;
                        return chatTransferScreen.R1().j();
                    default:
                        KProperty[] kPropertyArr2 = ChatTransferScreen.f80146e0;
                        ChatTransferScreen chatTransferScreen2 = this.f21483b;
                        return dli.f.a(chatTransferScreen2, chatTransferScreen2.d(), zhm.d0.E0(chatTransferScreen2.R1().h().e, zhm.v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), chatTransferScreen2.S, chatTransferScreen2.T, chatTransferScreen2.U, chatTransferScreen2.V, chatTransferScreen2.W, chatTransferScreen2.Z, chatTransferScreen2.X, new ActionWidgetLoadingDelegate(), chatTransferScreen2.Y)), R$id.transferScreen_recyclerView, null, chatTransferScreen2.f80148b0, null, 40);
                }
            }
        });
    }

    @Override // dte.c
    public final ihm.f A0() {
        return R1().s().f256232c;
    }

    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c5a.v uiState = (c5a.v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        u uVar = qVar instanceof u ? (u) qVar : null;
        DefaultItemAnimator defaultItemAnimator = pd.b.j(uVar != null ? Boolean.valueOf(uVar.f21529a) : null) ? (DefaultItemAnimator) this.f80147a0.getValue() : null;
        ChatTransferScreenContract$InputData chatTransferScreenContract$InputData = this.K;
        if (chatTransferScreenContract$InputData.a()) {
            d3().f241932c.setItemAnimator(defaultItemAnimator);
        } else {
            e3().f241926c.setItemAnimator(defaultItemAnimator);
        }
        dli.a.z0(uiState);
        c5a.s sVar = uiState.f21532a;
        g2 g2Var = chatTransferScreenContract$InputData.a() ? d3().f241931b : e3().f241925b;
        List list = sVar.f21525b;
        r rVar = sVar.f21524a;
        g2Var.setMenuItems(list);
        if (!chatTransferScreenContract$InputData.a()) {
            if (!(rVar instanceof p)) {
                throw new IllegalArgumentException("Nav bar with avatar is not supported in full screen mode");
            }
            NavBarWithToolbar navBarWithToolbar = e3().f241925b;
            TextLocalisedClause textLocalisedClause = ((p) rVar).f21519a;
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setTitleClickable(false);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            return;
        }
        if (rVar instanceof p) {
            NavBar navBar = d3().f241931b;
            navBar.setTitle(new i(((p) rVar).f21519a));
            navBar.setTitleClickable(false);
        } else {
            if (!(rVar instanceof c5a.q)) {
                throw new NoWhenBranchMatchedException();
            }
            i5a.a aVar = ((c5a.q) rVar).f21521a;
            if (aVar != null) {
                AvatarModel.Default r87 = aVar.f158791b;
                d3().f241931b.setTitle(new com.revolut.core.ui_kit.views.navbar.h(new ImageWithAnimatedBackgroundView.Model(r87.f58021b, r87.f58025j), aVar.f158790a, aVar.f158792c, r87.f));
            }
            d3().f241931b.setTitleLeadingIconClickable(true);
            d3().f241931b.setDescriptionVisible(false);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void J() {
        super.J();
        m2();
    }

    @Override // dte.c
    public final ihm.f S0() {
        return R1().s().e;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void W() {
        super.W();
        m2();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.O = new l0(m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ChatTransferScreenContract$InputData chatTransferScreenContract$InputData = this.K;
        Continuation continuation = null;
        if (chatTransferScreenContract$InputData.a()) {
            ViewController.P2(this, rd0.e.b(d3().f241931b.K()), new c5a.i(this, continuation, 0), 3);
        } else {
            e3().f241925b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
            ViewController.P2(this, rd0.e.b(e3().f241925b.f59410q), new c5a.i(this, continuation, 1), 3);
        }
        ViewController.P2(this, rd0.e.b(((f) d()).g0), new c5a.e(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b((chatTransferScreenContract$InputData.a() ? d3().f241931b : e3().f241925b).b()), new c5a.e(this, continuation, 3), 3);
        RowDelegate rowDelegate = this.T;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53227t), new k(this, null), 3);
        l0 l0Var = this.O;
        if (l0Var == null) {
            Intrinsics.r("popupMenuDialogDisplayer");
            throw null;
        }
        ViewController.P2(this, rd0.e.b(l0Var.f256113c), new c5a.e(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.U.f, new c42.j(9))), new c5a.e(this, continuation, 5), 3);
        SearchButtonDelegate searchButtonDelegate = this.V;
        ViewController.P2(this, rd0.e.b(searchButtonDelegate.f53283c.f121375b), new c5a.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(searchButtonDelegate.d.f121375b), new c5a.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.X.f51589c.f121375b), new c5a.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.W.f52371h.f121375b), new c5a.f(this, null), 3);
        BannerDelegate bannerDelegate = this.Y;
        ViewController.P2(this, rd0.e.b(bannerDelegate.f51699c), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(bannerDelegate.e), new c5a.h(this, null), 3);
        RateEmojiDelegate rateEmojiDelegate = this.S;
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.f53143c), new c5a.e(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.e), new c5a.e(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(rateEmojiDelegate.d), new c5a.e(this, continuation, 8), 3);
    }

    public final q3a.f d3() {
        ViewBinding value = this.M.getValue(this, f80146e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q3a.f) value;
    }

    public final q3a.d e3() {
        ViewBinding value = this.N.getValue(this, f80146e0[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q3a.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final n R1() {
        return (n) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.c0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f80149d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }

    @Override // dte.c
    public final ihm.f v1() {
        return R1().s().f256231b;
    }
}
