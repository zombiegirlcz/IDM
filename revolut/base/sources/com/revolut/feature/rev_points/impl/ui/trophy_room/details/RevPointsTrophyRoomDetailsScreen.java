package com.revolut.feature.rev_points.impl.ui.trophy_room.details;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.RevPointsTrophyRoomDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.b;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.t3;
import v0c.d;
import v0c.f;
import v0c.i;
import v0c.j;
import vc.s;
import wxb.m;
import xki.e;
import zhm.v;
import zxb.x;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/details/RevPointsTrophyRoomDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/impl/ui/trophy_room/details/a;", "Ldli/a;", "Lv0c/j;", "Companion", "a", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsTrophyRoomDetailsScreen extends ViewController<com.revolut.feature.rev_points.impl.ui.trophy_room.details.a> implements dli.a {
    public final int K;
    public final FullScreenStateDelegate L;
    public final RowDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RevPointsTrophyRoomDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsTrophyRoomDetailsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public RevPointsTrophyRoomDetailsScreen(RevPointsTrophyRoomDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_rev_points_trophy_room_details;
        this.L = new FullScreenStateDelegate();
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: v0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomDetailsScreen f284779b;

            {
                this.f284779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomDetailsScreen.R;
                        RevPointsTrophyRoomDetailsScreen revPointsTrophyRoomDetailsScreen = this.f284779b;
                        return dli.f.a(revPointsTrophyRoomDetailsScreen, (h) revPointsTrophyRoomDetailsScreen.Q.getValue(), v.k(revPointsTrophyRoomDetailsScreen.L, new RowLoadingDelegate(), revPointsTrophyRoomDetailsScreen.M, new ListSubheaderDelegate()), R$id.revPointsTrophyRoomDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomDetailsScreen.R;
                        return (h) ((x) this.f284779b.P.getValue()).f326310c.get();
                }
            }
        });
        this.O = s.t(this, v0c.c.f);
        this.P = w.y0(new v0c.b(this, inputData, i));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: v0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomDetailsScreen f284779b;

            {
                this.f284779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomDetailsScreen.R;
                        RevPointsTrophyRoomDetailsScreen revPointsTrophyRoomDetailsScreen = this.f284779b;
                        return dli.f.a(revPointsTrophyRoomDetailsScreen, (h) revPointsTrophyRoomDetailsScreen.Q.getValue(), v.k(revPointsTrophyRoomDetailsScreen.L, new RowLoadingDelegate(), revPointsTrophyRoomDetailsScreen.M, new ListSubheaderDelegate()), R$id.revPointsTrophyRoomDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomDetailsScreen.R;
                        return (h) ((x) this.f284779b.P.getValue()).f326310c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        b bVar = uiState.f284789b;
        if (bVar instanceof i) {
            NavBarWithToolbar navBarWithToolbar = d3().f300840c;
            i iVar = (i) bVar;
            Clause clause = iVar.f284786b;
            Clause clause2 = iVar.f284785a;
            navBarWithToolbar.setTitle(clause2, null);
            if (clause2 != null) {
                navBarWithToolbar.setToolbarTitle(clause2);
            }
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(clause != null);
            navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGrey50);
            Image image = iVar.f284787c;
            navBarWithToolbar.setEndImage(image != null ? new yy0.j(image) : null);
            navBarWithToolbar.l0();
        } else {
            if (!bVar.equals(b.a.f83905a)) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar2 = d3().f300840c;
            t3 t3Var = t3.PROFILE;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar2.I0(t3Var, false);
        }
        aw0.i iVar2 = uiState.f284790c;
        if (iVar2 == null) {
            ActionFooterView revPointsTrophyRoomDetailsScreenButton = d3().f300839b;
            Intrinsics.checkNotNullExpressionValue(revPointsTrophyRoomDetailsScreenButton, "revPointsTrophyRoomDetailsScreenButton");
            revPointsTrophyRoomDetailsScreenButton.setVisibility(8);
            AsyncDiffRecyclerView revPointsTrophyRoomDetailsScreenRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(revPointsTrophyRoomDetailsScreenRecyclerView, "revPointsTrophyRoomDetailsScreenRecyclerView");
            Context context = D2().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            revPointsTrophyRoomDetailsScreenRecyclerView.setPadding(revPointsTrophyRoomDetailsScreenRecyclerView.getPaddingLeft(), revPointsTrophyRoomDetailsScreenRecyclerView.getPaddingTop(), revPointsTrophyRoomDetailsScreenRecyclerView.getPaddingRight(), kli.a.k(context, BitmapDescriptorFactory.HUE_RED));
            return;
        }
        ActionFooterView revPointsTrophyRoomDetailsScreenButton2 = d3().f300839b;
        Intrinsics.checkNotNullExpressionValue(revPointsTrophyRoomDetailsScreenButton2, "revPointsTrophyRoomDetailsScreenButton");
        revPointsTrophyRoomDetailsScreenButton2.setVisibility(0);
        d3().f300839b.setModel(iVar2);
        AsyncDiffRecyclerView revPointsTrophyRoomDetailsScreenRecyclerView2 = d3().d;
        Intrinsics.checkNotNullExpressionValue(revPointsTrophyRoomDetailsScreenRecyclerView2, "revPointsTrophyRoomDetailsScreenRecyclerView");
        Context context2 = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        revPointsTrophyRoomDetailsScreenRecyclerView2.setPadding(revPointsTrophyRoomDetailsScreenRecyclerView2.getPaddingLeft(), revPointsTrophyRoomDetailsScreenRecyclerView2.getPaddingTop(), revPointsTrophyRoomDetailsScreenRecyclerView2.getPaddingRight(), kli.a.k(context2, 76.0f));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (v0c.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f300840c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300840c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new v0c.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300839b.f), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
