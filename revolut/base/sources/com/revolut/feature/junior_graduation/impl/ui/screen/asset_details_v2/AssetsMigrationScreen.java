package com.revolut.feature.junior_graduation.impl.ui.screen.asset_details_v2;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details_v2.AssetsMigrationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import eh8.c;
import eh8.e;
import eh8.f;
import eh8.g;
import eh8.i;
import eh8.k;
import java.util.List;
import jii.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.o2;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_graduation/impl/ui/screen/asset_details_v2/AssetsMigrationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Leh8/i;", "<init>", "()V", "feature_junior_graduation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AssetsMigrationScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AssetsMigrationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_big_title_nextbutton;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final CellDetailsDelegate N = new CellDetailsDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, l.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBigTitleNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return l.a(p0);
        }
    }

    public AssetsMigrationScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: eh8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetsMigrationScreen f125747b;

            {
                this.f125747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AssetsMigrationScreen assetsMigrationScreen = this.f125747b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AssetsMigrationScreen.S;
                        AssetsMigrationScreen assetsMigrationScreen2 = this.f125747b;
                        return dli.f.a(assetsMigrationScreen2, (k) assetsMigrationScreen2.R.getValue(), v.k(new RowLoadingDelegate(), assetsMigrationScreen2.M, assetsMigrationScreen2.N, assetsMigrationScreen2.O), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AssetsMigrationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(assetsMigrationScreen.m2()).a().get(sg8.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new sg8.a(((sg8.c) aVar2.b()).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = AssetsMigrationScreen.S;
                        return (k) ((sg8.a) assetsMigrationScreen.Q.getValue()).f262602c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: eh8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetsMigrationScreen f125747b;

            {
                this.f125747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AssetsMigrationScreen assetsMigrationScreen = this.f125747b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AssetsMigrationScreen.S;
                        AssetsMigrationScreen assetsMigrationScreen2 = this.f125747b;
                        return dli.f.a(assetsMigrationScreen2, (k) assetsMigrationScreen2.R.getValue(), v.k(new RowLoadingDelegate(), assetsMigrationScreen2.M, assetsMigrationScreen2.N, assetsMigrationScreen2.O), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AssetsMigrationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(assetsMigrationScreen.m2()).a().get(sg8.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new sg8.a(((sg8.c) aVar2.b()).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = AssetsMigrationScreen.S;
                        return (k) ((sg8.a) assetsMigrationScreen.Q.getValue()).f262602c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: eh8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetsMigrationScreen f125747b;

            {
                this.f125747b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AssetsMigrationScreen assetsMigrationScreen = this.f125747b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AssetsMigrationScreen.S;
                        AssetsMigrationScreen assetsMigrationScreen2 = this.f125747b;
                        return dli.f.a(assetsMigrationScreen2, (k) assetsMigrationScreen2.R.getValue(), v.k(new RowLoadingDelegate(), assetsMigrationScreen2.M, assetsMigrationScreen2.N, assetsMigrationScreen2.O), R$id.screenRecyclerNavbarBigTitleNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AssetsMigrationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(assetsMigrationScreen.m2()).a().get(sg8.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new sg8.a(((sg8.c) aVar2.b()).o);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", sg8.c.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = AssetsMigrationScreen.S;
                        return (k) ((sg8.a) assetsMigrationScreen.Q.getValue()).f262602c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        eh8.h hVar = uiState.f125756a;
        Clause clause = uiState.f125757b;
        if (hVar instanceof g) {
            navBarWithBigTile.setLoadingState(true);
        } else if (hVar instanceof f) {
            navBarWithBigTile.setLoadingState(false);
        } else {
            if (!(hVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(false);
            e eVar = (e) hVar;
            TextLocalisedClause textLocalisedClause = eVar.f125751a;
            navBarWithBigTile.setTitle(new z0(textLocalisedClause, false));
            navBarWithBigTile.setToolbarTitle(textLocalisedClause);
            navBarWithBigTile.setDescription(new au0.o0(eVar.f125752b));
            navBarWithBigTile.setAvatar(new AvatarModel.Default(eVar.f125753c, null, null, null, null, null, 126), r0.BLURRED_BACKGROUND);
        }
        LargeActionButton largeActionButton = d3().f174536b;
        largeActionButton.setVisibility(clause == null ? 8 : 0);
        largeActionButton.setText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (sg8.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (k) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174537c;
        navBarWithBigTile.setTitleStyle(b1.DEFAULT);
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setHeightMode(new o2(0));
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setIconClickable(false);
        d3().f174536b.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174537c.f59357t), new eh8.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174536b.o), new eh8.b(this, null, 1), 3);
    }

    public final l d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (l) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
