package com.revolut.feature.raffle.impl.screen.raffle;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.s0;
import aw0.d0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.raffle.impl.R$id;
import com.revolut.feature.raffle.impl.R$layout;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import fta.d;
import java.util.List;
import jta.b;
import jta.c;
import jta.i;
import jta.j;
import jta.k;
import jta.l;
import jta.m;
import jta.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.o2;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/raffle/impl/screen/raffle/RaffleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljta/i;", "Ldli/a;", "Ljta/o;", "Companion", "a", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RaffleScreen extends ViewController<i> implements dli.a {
    public final int K;
    public final TextDelegate L;
    public final RowDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RaffleScreen.class, "binding", "getBinding()Lcom/revolut/feature/raffle/impl/databinding/ScreenRaffleBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public RaffleScreen(RaffleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_raffle;
        this.L = new TextDelegate();
        this.M = new RowDelegate(null, null, 7);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jta.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RaffleScreen f178438b;

            {
                this.f178438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RaffleScreen raffleScreen = this.f178438b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RaffleScreen.S;
                        RaffleScreen raffleScreen2 = this.f178438b;
                        return dli.f.a(raffleScreen2, raffleScreen2.d(), zhm.v.k(new RowLoadingDelegate(), raffleScreen2.M, raffleScreen2.L), R$id.raffleScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RaffleScreen.S;
                        Rect rect = new Rect();
                        Context context = raffleScreen.d3().d.getContext();
                        raffleScreen.d3().d.getHitRect(rect);
                        int i3 = rect.top;
                        Intrinsics.h(context);
                        rect.top = kli.a.k(context, 100.0f) + i3;
                        rect.bottom -= kli.a.k(context, 44.0f);
                        return rect;
                    default:
                        KProperty[] kPropertyArr3 = RaffleScreen.S;
                        return (j) ((fta.d) raffleScreen.Q.getValue()).f137994g.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jta.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RaffleScreen f178438b;

            {
                this.f178438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RaffleScreen raffleScreen = this.f178438b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RaffleScreen.S;
                        RaffleScreen raffleScreen2 = this.f178438b;
                        return dli.f.a(raffleScreen2, raffleScreen2.d(), zhm.v.k(new RowLoadingDelegate(), raffleScreen2.M, raffleScreen2.L), R$id.raffleScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RaffleScreen.S;
                        Rect rect = new Rect();
                        Context context = raffleScreen.d3().d.getContext();
                        raffleScreen.d3().d.getHitRect(rect);
                        int i3 = rect.top;
                        Intrinsics.h(context);
                        rect.top = kli.a.k(context, 100.0f) + i3;
                        rect.bottom -= kli.a.k(context, 44.0f);
                        return rect;
                    default:
                        KProperty[] kPropertyArr3 = RaffleScreen.S;
                        return (j) ((fta.d) raffleScreen.Q.getValue()).f137994g.get();
                }
            }
        });
        this.Q = w.y0(new jnf.a(this, inputData, 7));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: jta.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RaffleScreen f178438b;

            {
                this.f178438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RaffleScreen raffleScreen = this.f178438b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RaffleScreen.S;
                        RaffleScreen raffleScreen2 = this.f178438b;
                        return dli.f.a(raffleScreen2, raffleScreen2.d(), zhm.v.k(new RowLoadingDelegate(), raffleScreen2.M, raffleScreen2.L), R$id.raffleScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RaffleScreen.S;
                        Rect rect = new Rect();
                        Context context = raffleScreen.d3().d.getContext();
                        raffleScreen.d3().d.getHitRect(rect);
                        int i32 = rect.top;
                        Intrinsics.h(context);
                        rect.top = kli.a.k(context, 100.0f) + i32;
                        rect.bottom -= kli.a.k(context, 44.0f);
                        return rect;
                    default:
                        KProperty[] kPropertyArr3 = RaffleScreen.S;
                        return (j) ((fta.d) raffleScreen.Q.getValue()).f137994g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        jta.o uiState = (jta.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        n nVar = uiState.f178452a;
        NavBarWithBigTile navBarWithBigTile = d3().d;
        if (nVar instanceof m) {
            navBarWithBigTile.setLoadingState(true);
        } else {
            if (!(nVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(false);
            l lVar = (l) nVar;
            c1.S(navBarWithBigTile, lVar.f178448a, null, null, 6);
            navBarWithBigTile.setToolbarTitle(lVar.f178450c);
            navBarWithBigTile.setMenuItems(lVar.f178449b);
        }
        LargeActionButton largeActionButton = d3().f129397c;
        if (nVar.equals(m.f178451a)) {
            largeActionButton.setVisibility(0);
            largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
            Unit unit = Unit.f186387a;
        } else {
            if (!(nVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
            k kVar = ((l) nVar).d;
            largeActionButton.setVisibility(kVar == null ? 8 : 0);
            if (kVar != null) {
                largeActionButton.setText(kVar.f178445a);
                largeActionButton.setEnabled(kVar.f178446b);
                largeActionButton.setIcon(kVar.f178447c);
                Unit unit2 = Unit.f186387a;
            }
        }
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
        NavBarWithBigTile navBarWithBigTile = d3().d;
        navBarWithBigTile.setHeightMode(new o2(new d0(375, 485)));
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        d3().f129396b.setOnTouchListener(new gzl.b(this, 5));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().d.f59357t), new c(this, null, 0), 3);
        r rVarMerge = r.merge(this.L.d, this.M.f53226s, d3().d.f59360y.f57278q);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new jta.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.b()), new jta.d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f129397c.o), new c(this, null, 1), 3);
    }

    public final eta.a d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (eta.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
