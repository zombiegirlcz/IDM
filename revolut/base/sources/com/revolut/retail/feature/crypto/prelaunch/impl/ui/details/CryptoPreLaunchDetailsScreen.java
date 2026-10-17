package com.revolut.retail.feature.crypto.prelaunch.impl.ui.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import com.revolut.core.ui_kit.delegates.CountDownTimerCompactDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsContract$InputData;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsScreen;
import dli.a;
import java.util.List;
import jii.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.p2;
import vc.s;
import z8k.i;
import zaj.b;
import zaj.c;
import zaj.d;
import zaj.e;
import zaj.f;
import zaj.j;
import zaj.k;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/prelaunch/impl/ui/details/CryptoPreLaunchDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzaj/e;", "feature_crypto_prelaunch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoPreLaunchDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CryptoPreLaunchDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0))};
    public final CryptoPreLaunchDetailsContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CryptoPreLaunchDetailsScreen(CryptoPreLaunchDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, zaj.h.f);
        this.M = w.y0(new i(29));
        final int i = 0;
        this.N = w.y0(new f(0));
        this.O = w.y0(new Function0(this) { // from class: zaj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPreLaunchDetailsScreen f320731b;

            {
                this.f320731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen = this.f320731b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPreLaunchDetailsScreen.T;
                        return new ScrollerBoxDelegate(u.c((SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen.N.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPreLaunchDetailsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPreLaunchDetailsScreen.m2()).a().get(yaj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yaj.i.class, " is not found"));
                        }
                        yaj.i iVar = ((yaj.i) aVar2.b()).d;
                        CryptoPreLaunchDetailsContract$InputData cryptoPreLaunchDetailsContract$InputData = cryptoPreLaunchDetailsScreen.K;
                        cryptoPreLaunchDetailsContract$InputData.getClass();
                        return new yaj.h(iVar, cryptoPreLaunchDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPreLaunchDetailsScreen.T;
                        return (b) ((yaj.h) cryptoPreLaunchDetailsScreen.Q.getValue()).f312062c.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoPreLaunchDetailsScreen.T;
                        CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen2 = this.f320731b;
                        return dli.f.a(cryptoPreLaunchDetailsScreen2, cryptoPreLaunchDetailsScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new CountDownTimerCompactDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (ScrollerBoxDelegate) cryptoPreLaunchDetailsScreen2.O.getValue(), (SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen2.N.getValue(), (FullScreenStateDelegate) cryptoPreLaunchDetailsScreen2.M.getValue()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_big_title_nextbutton;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zaj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPreLaunchDetailsScreen f320731b;

            {
                this.f320731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen = this.f320731b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPreLaunchDetailsScreen.T;
                        return new ScrollerBoxDelegate(u.c((SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen.N.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPreLaunchDetailsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPreLaunchDetailsScreen.m2()).a().get(yaj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yaj.i.class, " is not found"));
                        }
                        yaj.i iVar = ((yaj.i) aVar2.b()).d;
                        CryptoPreLaunchDetailsContract$InputData cryptoPreLaunchDetailsContract$InputData = cryptoPreLaunchDetailsScreen.K;
                        cryptoPreLaunchDetailsContract$InputData.getClass();
                        return new yaj.h(iVar, cryptoPreLaunchDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPreLaunchDetailsScreen.T;
                        return (b) ((yaj.h) cryptoPreLaunchDetailsScreen.Q.getValue()).f312062c.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoPreLaunchDetailsScreen.T;
                        CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen2 = this.f320731b;
                        return dli.f.a(cryptoPreLaunchDetailsScreen2, cryptoPreLaunchDetailsScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new CountDownTimerCompactDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (ScrollerBoxDelegate) cryptoPreLaunchDetailsScreen2.O.getValue(), (SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen2.N.getValue(), (FullScreenStateDelegate) cryptoPreLaunchDetailsScreen2.M.getValue()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zaj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPreLaunchDetailsScreen f320731b;

            {
                this.f320731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen = this.f320731b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPreLaunchDetailsScreen.T;
                        return new ScrollerBoxDelegate(u.c((SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen.N.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPreLaunchDetailsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPreLaunchDetailsScreen.m2()).a().get(yaj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yaj.i.class, " is not found"));
                        }
                        yaj.i iVar = ((yaj.i) aVar2.b()).d;
                        CryptoPreLaunchDetailsContract$InputData cryptoPreLaunchDetailsContract$InputData = cryptoPreLaunchDetailsScreen.K;
                        cryptoPreLaunchDetailsContract$InputData.getClass();
                        return new yaj.h(iVar, cryptoPreLaunchDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPreLaunchDetailsScreen.T;
                        return (b) ((yaj.h) cryptoPreLaunchDetailsScreen.Q.getValue()).f312062c.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoPreLaunchDetailsScreen.T;
                        CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen2 = this.f320731b;
                        return dli.f.a(cryptoPreLaunchDetailsScreen2, cryptoPreLaunchDetailsScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new CountDownTimerCompactDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (ScrollerBoxDelegate) cryptoPreLaunchDetailsScreen2.O.getValue(), (SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen2.N.getValue(), (FullScreenStateDelegate) cryptoPreLaunchDetailsScreen2.M.getValue()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: zaj.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoPreLaunchDetailsScreen f320731b;

            {
                this.f320731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen = this.f320731b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoPreLaunchDetailsScreen.T;
                        return new ScrollerBoxDelegate(u.c((SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen.N.getValue()));
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoPreLaunchDetailsScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoPreLaunchDetailsScreen.m2()).a().get(yaj.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", yaj.i.class, " is not found"));
                        }
                        yaj.i iVar = ((yaj.i) aVar2.b()).d;
                        CryptoPreLaunchDetailsContract$InputData cryptoPreLaunchDetailsContract$InputData = cryptoPreLaunchDetailsScreen.K;
                        cryptoPreLaunchDetailsContract$InputData.getClass();
                        return new yaj.h(iVar, cryptoPreLaunchDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = CryptoPreLaunchDetailsScreen.T;
                        return (b) ((yaj.h) cryptoPreLaunchDetailsScreen.Q.getValue()).f312062c.get();
                    default:
                        KProperty[] kPropertyArr4 = CryptoPreLaunchDetailsScreen.T;
                        CryptoPreLaunchDetailsScreen cryptoPreLaunchDetailsScreen2 = this.f320731b;
                        return dli.f.a(cryptoPreLaunchDetailsScreen2, cryptoPreLaunchDetailsScreen2.R2(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new CountDownTimerCompactDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (ScrollerBoxDelegate) cryptoPreLaunchDetailsScreen2.O.getValue(), (SmallActionButtonDelegate) cryptoPreLaunchDetailsScreen2.N.getValue(), (FullScreenStateDelegate) cryptoPreLaunchDetailsScreen2.M.getValue()), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d dVar = uiState.f320726a;
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        navBarWithBigTile.setAvatar(new AvatarModel.Default(dVar.f320724a, null, null, null, null, null, 126), r0.BLURRED_BACKGROUND);
        TextClause textClause = dVar.f320725b;
        navBarWithBigTile.setTitle(new z0(textClause, false));
        navBarWithBigTile.setToolbarTitle(textClause);
        c cVar = uiState.f320727b;
        LargeActionButton largeActionButton = d3().f174536b;
        largeActionButton.o(cVar.f320722b);
        Clause clause = cVar.f320721a;
        if (clause != null) {
            largeActionButton.setText(clause);
        }
        largeActionButton.setVisibility(cVar.f320723c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (yaj.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174537c.f59357t), new zaj.i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((SmallActionButtonDelegate) this.N.getValue()).f53336c.f121375b), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174536b.o), new zaj.i(this, null, 1), 3);
    }

    public final l d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b R2() {
        return (b) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
