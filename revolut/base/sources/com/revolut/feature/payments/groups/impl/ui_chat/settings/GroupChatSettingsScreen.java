package com.revolut.feature.payments.groups.impl.ui_chat.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import jii.y;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ps9.e;
import ps9.f;
import ps9.g;
import ps9.i;
import ps9.j;
import ps9.k;
import ps9.l;
import ps9.m;
import ps9.n;
import te0.w;
import tx0.q1;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/GroupChatSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/payments/groups/impl/ui_chat/settings/a;", "Ldli/a;", "Lps9/s;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GroupChatSettingsScreen extends ViewController<a> implements dli.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f79374a0 = {o0.f186429a.j(new h0(GroupChatSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final int K;
    public final Object L;
    public final CellDetailsChevronDelegate M;
    public final CellDetailsActionDelegate N;
    public final LargeActionButtonDelegate O;
    public final ListSubheaderDelegate P;
    public final RectangularButtonDelegate Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public final LargeActionButtonDelegate T;
    public final RowDelegate U;
    public final RowLoadingDelegate V;
    public final Object W;
    public final h X;
    public final Object Y;
    public final Object Z;

    public GroupChatSettingsScreen(GroupChatSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbarlargecentred;
        this.L = w.y0(new pni.a(9));
        this.M = new CellDetailsChevronDelegate();
        this.N = new CellDetailsActionDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new RectangularButtonDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ps9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatSettingsScreen f239435b;

            {
                this.f239435b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GroupChatSettingsScreen groupChatSettingsScreen = this.f239435b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GroupChatSettingsScreen.f79374a0;
                        return new SwipeToActionDelegate(groupChatSettingsScreen.f3(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupChatSettingsScreen.f79374a0;
                        GroupChatSettingsScreen groupChatSettingsScreen2 = this.f239435b;
                        return dli.f.a(groupChatSettingsScreen2, groupChatSettingsScreen2.d(), zhm.v.k(groupChatSettingsScreen2.S, new RowLoadingDelegate(), groupChatSettingsScreen2.O, groupChatSettingsScreen2.f3(), new CellDetailsDelegate(), groupChatSettingsScreen2.M, groupChatSettingsScreen2.N, groupChatSettingsScreen2.P, (SwipeToActionDelegate) groupChatSettingsScreen2.R.getValue(), new GridBoxDelegate(zhm.v.k(new RectangularButtonLoadingDelegate(), groupChatSettingsScreen2.Q), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = GroupChatSettingsScreen.f79374a0;
                        return (r) ((kr9.c) groupChatSettingsScreen.Y.getValue()).K.get();
                }
            }
        });
        this.S = new FullScreenStateDelegate();
        this.T = new LargeActionButtonDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new RowLoadingDelegate();
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: ps9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatSettingsScreen f239435b;

            {
                this.f239435b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GroupChatSettingsScreen groupChatSettingsScreen = this.f239435b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GroupChatSettingsScreen.f79374a0;
                        return new SwipeToActionDelegate(groupChatSettingsScreen.f3(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupChatSettingsScreen.f79374a0;
                        GroupChatSettingsScreen groupChatSettingsScreen2 = this.f239435b;
                        return dli.f.a(groupChatSettingsScreen2, groupChatSettingsScreen2.d(), zhm.v.k(groupChatSettingsScreen2.S, new RowLoadingDelegate(), groupChatSettingsScreen2.O, groupChatSettingsScreen2.f3(), new CellDetailsDelegate(), groupChatSettingsScreen2.M, groupChatSettingsScreen2.N, groupChatSettingsScreen2.P, (SwipeToActionDelegate) groupChatSettingsScreen2.R.getValue(), new GridBoxDelegate(zhm.v.k(new RectangularButtonLoadingDelegate(), groupChatSettingsScreen2.Q), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = GroupChatSettingsScreen.f79374a0;
                        return (r) ((kr9.c) groupChatSettingsScreen.Y.getValue()).K.get();
                }
            }
        });
        this.X = s.t(this, e.f);
        this.Y = w.y0(new pe2.c(this, inputData, 29));
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: ps9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GroupChatSettingsScreen f239435b;

            {
                this.f239435b = this;
            }

            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GroupChatSettingsScreen groupChatSettingsScreen = this.f239435b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GroupChatSettingsScreen.f79374a0;
                        return new SwipeToActionDelegate(groupChatSettingsScreen.f3(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = GroupChatSettingsScreen.f79374a0;
                        GroupChatSettingsScreen groupChatSettingsScreen2 = this.f239435b;
                        return dli.f.a(groupChatSettingsScreen2, groupChatSettingsScreen2.d(), zhm.v.k(groupChatSettingsScreen2.S, new RowLoadingDelegate(), groupChatSettingsScreen2.O, groupChatSettingsScreen2.f3(), new CellDetailsDelegate(), groupChatSettingsScreen2.M, groupChatSettingsScreen2.N, groupChatSettingsScreen2.P, (SwipeToActionDelegate) groupChatSettingsScreen2.R.getValue(), new GridBoxDelegate(zhm.v.k(new RectangularButtonLoadingDelegate(), groupChatSettingsScreen2.Q), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr3 = GroupChatSettingsScreen.f79374a0;
                        return (r) ((kr9.c) groupChatSettingsScreen.Y.getValue()).K.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ps9.s uiState = (ps9.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        ps9.q qVar2 = uiState.f239444b;
        TextClause textClause = qVar2.f239440a;
        navBarLargeCentred.setToolbarTitle(textClause);
        navBarLargeCentred.setTitle(textClause);
        navBarLargeCentred.setSubtitleText(qVar2.f239441b);
        NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, qVar2.f239442c, (q1) null, 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kr9.c) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174576b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((kr9.c) this.Y.getValue()).f.get()).d(v.k(this.U, this.V, this.T));
    }

    /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarLargeCentred.f59292m), new ps9.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarLargeCentred.f59298t), new ps9.h(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(navBarLargeCentred.F()), new ps9.h(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.S.f52371h.f121375b), new l(this, null), 3);
        r rVarMerge = r.merge(f3().f53218h, f3().f53220l);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge, new pqg.v(18))), new f(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f53149c), new m(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(f3().f53218h, new pqg.v(19))), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52707c), new ps9.o(this, null), 3);
        r rVarMerge2 = r.merge(this.M.f51821c, f3().f53225r);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        ViewController.P2(this, rd0.e.b(w.a0(rVarMerge2, new pqg.v(20))), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(f3().f53218h, new pqg.v(21))), new f(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(w.a0(((SwipeToActionDelegate) this.R.getValue()).f, new pqg.v(22))), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(w.a0(this.U.f53220l, new pqg.v(17))), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new g(this, null), 3);
    }

    public final y d3() {
        ViewBinding value = this.X.getValue(this, f79374a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ps9.r d() {
        return (ps9.r) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final RowDelegate f3() {
        return (RowDelegate) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
