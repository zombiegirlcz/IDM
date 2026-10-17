package com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.defi.exchange.impl.R$string;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import u36.c;
import u36.d;
import u36.e;
import u36.g;
import u36.i;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/ui/cefi_to_defi/asset_picker/CeFiToDeFiAssetPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lu36/c;", "Ltki/c;", "Lu36/e;", "<init>", "()V", "Companion", "a", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CeFiToDeFiAssetPickerScreen extends ViewController<c> implements tki.c {
    public final h K = s.t(this, b.f);
    public final Object L = w.y0(new ty.a(16));
    public final Object M = w.y0(new ty.a(17));
    public final int N = R$layout.screen_recycler_navbar;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CeFiToDeFiAssetPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public CeFiToDeFiAssetPickerScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: u36.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CeFiToDeFiAssetPickerScreen f276786b;

            {
                this.f276786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CeFiToDeFiAssetPickerScreen ceFiToDeFiAssetPickerScreen = this.f276786b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CeFiToDeFiAssetPickerScreen.R;
                        qji.b bVarU2 = ceFiToDeFiAssetPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.di.CeFiToDeFiAssetPickerScreenInjector");
                        r36.b bVar = (r36.b) bVarU2;
                        return new r36.a(bVar.f251155b, bVar.f251156c);
                    case 1:
                        KProperty[] kPropertyArr2 = CeFiToDeFiAssetPickerScreen.R;
                        return (d) ((r36.a) ceFiToDeFiAssetPickerScreen.O.getValue()).f251153b.get();
                    default:
                        KProperty[] kPropertyArr3 = CeFiToDeFiAssetPickerScreen.R;
                        CeFiToDeFiAssetPickerScreen ceFiToDeFiAssetPickerScreen2 = this.f276786b;
                        return tki.g.a(ceFiToDeFiAssetPickerScreen2, ceFiToDeFiAssetPickerScreen2.R2(), v.k((RowDelegate) ceFiToDeFiAssetPickerScreen2.L.getValue(), (FullScreenStateDelegate) ceFiToDeFiAssetPickerScreen2.M.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: u36.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CeFiToDeFiAssetPickerScreen f276786b;

            {
                this.f276786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CeFiToDeFiAssetPickerScreen ceFiToDeFiAssetPickerScreen = this.f276786b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CeFiToDeFiAssetPickerScreen.R;
                        qji.b bVarU2 = ceFiToDeFiAssetPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.di.CeFiToDeFiAssetPickerScreenInjector");
                        r36.b bVar = (r36.b) bVarU2;
                        return new r36.a(bVar.f251155b, bVar.f251156c);
                    case 1:
                        KProperty[] kPropertyArr2 = CeFiToDeFiAssetPickerScreen.R;
                        return (d) ((r36.a) ceFiToDeFiAssetPickerScreen.O.getValue()).f251153b.get();
                    default:
                        KProperty[] kPropertyArr3 = CeFiToDeFiAssetPickerScreen.R;
                        CeFiToDeFiAssetPickerScreen ceFiToDeFiAssetPickerScreen2 = this.f276786b;
                        return tki.g.a(ceFiToDeFiAssetPickerScreen2, ceFiToDeFiAssetPickerScreen2.R2(), v.k((RowDelegate) ceFiToDeFiAssetPickerScreen2.L.getValue(), (FullScreenStateDelegate) ceFiToDeFiAssetPickerScreen2.M.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: u36.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CeFiToDeFiAssetPickerScreen f276786b;

            {
                this.f276786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CeFiToDeFiAssetPickerScreen ceFiToDeFiAssetPickerScreen = this.f276786b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CeFiToDeFiAssetPickerScreen.R;
                        qji.b bVarU2 = ceFiToDeFiAssetPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.di.CeFiToDeFiAssetPickerScreenInjector");
                        r36.b bVar = (r36.b) bVarU2;
                        return new r36.a(bVar.f251155b, bVar.f251156c);
                    case 1:
                        KProperty[] kPropertyArr2 = CeFiToDeFiAssetPickerScreen.R;
                        return (d) ((r36.a) ceFiToDeFiAssetPickerScreen.O.getValue()).f251153b.get();
                    default:
                        KProperty[] kPropertyArr3 = CeFiToDeFiAssetPickerScreen.R;
                        CeFiToDeFiAssetPickerScreen ceFiToDeFiAssetPickerScreen2 = this.f276786b;
                        return tki.g.a(ceFiToDeFiAssetPickerScreen2, ceFiToDeFiAssetPickerScreen2.R2(), v.k((RowDelegate) ceFiToDeFiAssetPickerScreen2.L.getValue(), (FullScreenStateDelegate) ceFiToDeFiAssetPickerScreen2.M.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setSearchInputSilently(new TextClause(uiState.f276784b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r36.a) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_defi_add_crypto_asset_picker_title, null, null, 14));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_defi_add_crypto_asset_picker_search_placeholder, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setMenuItems(u.c(new IconNavBarMenuItem("CeFiToDeFiAssetPicker_Info", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.crypto_defi_add_crypto_asset_picker_info_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new u07.b(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new g(2, R2(), d.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", 4, 0), 3);
        r rVarDebounce = d3().f174539b.f59409p.f57337m.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        ViewController.P2(this, rd0.e.b(rVarDebounce), new tz6.e(this, (Continuation) null, 14), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.L.getValue()).f53218h), new u36.h(2, 4, d.class, R2(), "onRowClicked", "onRowClicked(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), new i(2, 4, d.class, R2(), "onFullScreenStateMainActionClicked", "onFullScreenStateMainActionClicked(Lcom/revolut/core/ui_kit/delegates/FullScreenStateDelegate$Model;)V"), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d R2() {
        return (d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
