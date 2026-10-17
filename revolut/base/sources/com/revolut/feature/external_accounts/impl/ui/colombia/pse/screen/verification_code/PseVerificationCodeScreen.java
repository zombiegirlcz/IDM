package com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.screen.verification_code.PseVerificationCodeScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.d0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vk6.d;
import xki.e;
import yff.b;
import yh6.y;
import yk6.c;
import yk6.f;
import yk6.g;
import yk6.i;
import yk6.j;
import yk6.k;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/screen/verification_code/PseVerificationCodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyk6/k;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PseVerificationCodeScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PseVerificationCodeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;

    public PseVerificationCodeScreen(PseVerificationCodeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbarwithbigtile;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yk6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseVerificationCodeScreen f314579b;

            {
                this.f314579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PseVerificationCodeScreen.Q;
                        PseVerificationCodeScreen pseVerificationCodeScreen = this.f314579b;
                        return dli.f.a(pseVerificationCodeScreen, (j) pseVerificationCodeScreen.N.getValue(), v.k((CounterTextDelegate) pseVerificationCodeScreen.O.getValue(), new FullScreenStateDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PseVerificationCodeScreen.Q;
                        return (j) ((vk6.d) this.f314579b.M.getValue()).f289872c.get();
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 4));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yk6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PseVerificationCodeScreen f314579b;

            {
                this.f314579b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PseVerificationCodeScreen.Q;
                        PseVerificationCodeScreen pseVerificationCodeScreen = this.f314579b;
                        return dli.f.a(pseVerificationCodeScreen, (j) pseVerificationCodeScreen.N.getValue(), v.k((CounterTextDelegate) pseVerificationCodeScreen.O.getValue(), new FullScreenStateDelegate(), new RowDelegate(null, null, 7)), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PseVerificationCodeScreen.Q;
                        return (j) ((vk6.d) this.f314579b.M.getValue()).f289872c.get();
                }
            }
        });
        this.O = w.y0(new y(16));
        this.P = s.t(this, c.f);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        i iVar = uiState.f314586a;
        if (iVar instanceof yk6.h) {
            d3().f174510b.setLoadingState(true);
            return;
        }
        if (iVar instanceof g) {
            d3().f174510b.setLoadingState(false);
            return;
        }
        if (!(iVar instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setLoadingState(false);
        f fVar = (f) iVar;
        navBarWithBigTile.setAvatar(new AvatarModel.Default(fVar.f314581a, null, null, null, null, null, 126), r0.BLURRED_BACKGROUND);
        navBarWithBigTile.setActionStatusLabel(new aw0.k(6, fVar.f314582b, null, false));
        navBarWithBigTile.setTitle(new z0(fVar.f314583c, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174510b.f59357t), null, new y5g.d(this, null, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CounterTextDelegate) this.O.getValue()).f52158h.f121375b), null, new yk6.d(this, null), 3);
    }

    public final d0 d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
