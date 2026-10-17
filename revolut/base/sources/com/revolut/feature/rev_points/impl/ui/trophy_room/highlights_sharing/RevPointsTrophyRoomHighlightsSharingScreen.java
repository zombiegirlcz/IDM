package com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing;

import aii.q;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.trophy_room.highlights_sharing.RevPointsTrophyRoomHighlightsSharingScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.l;
import mx0.t;
import te0.w;
import vc.s;
import wxb.n;
import xki.e;
import z0c.b;
import z0c.c;
import z0c.f;
import zhm.u;
import zxb.z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/trophy_room/highlights_sharing/RevPointsTrophyRoomHighlightsSharingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lz0c/f;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsTrophyRoomHighlightsSharingScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RevPointsTrophyRoomHighlightsSharingScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsTrophyRoomHighlightsSharingBinding;", 0))};
    public final ScrollerDelegate K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RevPointsTrophyRoomHighlightsSharingScreen(RevPointsTrophyRoomHighlightsSharingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new ScrollerDelegate(u.c(new BigTileDelegate()), false);
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_rev_points_trophy_room_highlights_sharing;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: z0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomHighlightsSharingScreen f318201b;

            {
                this.f318201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsTrophyRoomHighlightsSharingScreen revPointsTrophyRoomHighlightsSharingScreen = this.f318201b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        RevPointsTrophyRoomHighlightsSharingScreen revPointsTrophyRoomHighlightsSharingScreen2 = this.f318201b;
                        return dli.f.a(revPointsTrophyRoomHighlightsSharingScreen2, (e) revPointsTrophyRoomHighlightsSharingScreen2.P.getValue(), u.c(revPointsTrophyRoomHighlightsSharingScreen2.K), R$id.revPointsTrophyRoomHighlightsSharingScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        return (e) ((z) revPointsTrophyRoomHighlightsSharingScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        zxb.e eVar = ((z) revPointsTrophyRoomHighlightsSharingScreen.O.getValue()).f326315b;
                        return new o80.a();
                }
            }
        });
        this.O = w.y0(new ywi.b(this, inputData, 6));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: z0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomHighlightsSharingScreen f318201b;

            {
                this.f318201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsTrophyRoomHighlightsSharingScreen revPointsTrophyRoomHighlightsSharingScreen = this.f318201b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        RevPointsTrophyRoomHighlightsSharingScreen revPointsTrophyRoomHighlightsSharingScreen2 = this.f318201b;
                        return dli.f.a(revPointsTrophyRoomHighlightsSharingScreen2, (e) revPointsTrophyRoomHighlightsSharingScreen2.P.getValue(), u.c(revPointsTrophyRoomHighlightsSharingScreen2.K), R$id.revPointsTrophyRoomHighlightsSharingScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        return (e) ((z) revPointsTrophyRoomHighlightsSharingScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        zxb.e eVar = ((z) revPointsTrophyRoomHighlightsSharingScreen.O.getValue()).f326315b;
                        return new o80.a();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: z0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTrophyRoomHighlightsSharingScreen f318201b;

            {
                this.f318201b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsTrophyRoomHighlightsSharingScreen revPointsTrophyRoomHighlightsSharingScreen = this.f318201b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        RevPointsTrophyRoomHighlightsSharingScreen revPointsTrophyRoomHighlightsSharingScreen2 = this.f318201b;
                        return dli.f.a(revPointsTrophyRoomHighlightsSharingScreen2, (e) revPointsTrophyRoomHighlightsSharingScreen2.P.getValue(), u.c(revPointsTrophyRoomHighlightsSharingScreen2.K), R$id.revPointsTrophyRoomHighlightsSharingScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        return (e) ((z) revPointsTrophyRoomHighlightsSharingScreen.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = RevPointsTrophyRoomHighlightsSharingScreen.R;
                        zxb.e eVar = ((z) revPointsTrophyRoomHighlightsSharingScreen.O.getValue()).f326315b;
                        return new o80.a();
                }
            }
        });
    }

    public static RecyclerView d3(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            RecyclerView recyclerViewD3 = d3(childAt);
            if (recyclerViewD3 != null) {
                return recyclerViewD3;
            }
        }
        return null;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionsView revPointsTrophyRoomHighlightsSharingScreenActions = e3().f300842b;
        Intrinsics.checkNotNullExpressionValue(revPointsTrophyRoomHighlightsSharingScreenActions, "revPointsTrophyRoomHighlightsSharingScreenActions");
        ArrayList arrayList = uiState.f318206b;
        ActionsView.Companion companion = ActionsView.INSTANCE;
        revPointsTrophyRoomHighlightsSharingScreenActions.k(arrayList, t.f210002a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (z0c.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = e3().f300843c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.rev_points_trophy_room_share_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        e3().f300842b.setLayoutType(l.HEADER_CIRCLE_ACTIONS);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f300843c.f59211b), null, new yl6.b(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(rd0.e.b(this.K.q())), null, new yy6.f(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f300842b.f58296a.f121375b), null, new c(this, null), 3);
    }

    public final n e3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
