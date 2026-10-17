package com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.PixCopyPasteCodeInputScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import daa.c;
import daa.d;
import daa.j;
import daa.k;
import daa.m;
import dli.a;
import jii.u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import p8a.a0;
import p8a.d0;
import p8a.z;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/copy_paste/screen/code_input/PixCopyPasteCodeInputScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldaa/j;", "Ldli/a;", "Ldaa/k;", "Lno/d1;", "<init>", "()V", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixCopyPasteCodeInputScreen extends ViewController<j> implements a, d1 {
    public final Object O;
    public final Object P;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PixCopyPasteCodeInputScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Lazy K = yhm.j.b(new d8j.b(5));
    public final Lazy L = yhm.j.b(new d8j.b(6));
    public final Lazy M = yhm.j.b(new d8j.b(7));
    public final int N = R$layout.screen_recycler_navbar_nextbutton;
    public final h Q = s.t(this, b.f);

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.PixCopyPasteCodeInputScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public PixCopyPasteCodeInputScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: daa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixCopyPasteCodeInputScreen f112496b;

            {
                this.f112496b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen = this.f112496b;
                switch (i2) {
                    case 0:
                        PixCopyPasteCodeInputScreen.Companion companion = PixCopyPasteCodeInputScreen.INSTANCE;
                        return (m) ((z) pixCopyPasteCodeInputScreen.R.getValue()).f234129b.get();
                    case 1:
                        PixCopyPasteCodeInputScreen.Companion companion2 = PixCopyPasteCodeInputScreen.INSTANCE;
                        PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen2 = this.f112496b;
                        return dli.f.a(pixCopyPasteCodeInputScreen2, pixCopyPasteCodeInputScreen2.R2(), v.k((InputTextDelegate) pixCopyPasteCodeInputScreen2.K.getValue(), (TextDelegate) pixCopyPasteCodeInputScreen2.L.getValue(), (LargeActionButtonDelegate) pixCopyPasteCodeInputScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        PixCopyPasteCodeInputScreen.Companion companion3 = PixCopyPasteCodeInputScreen.INSTANCE;
                        qji.b bVarU2 = pixCopyPasteCodeInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.di.PixCopyPasteCodeInputScreenInjector");
                        d0 d0Var = ((a0) bVarU2).f233888a;
                        z zVar = new z();
                        int i6 = 6;
                        zVar.f234128a = e4m.b.b(new p8a.m(d0Var, zVar, i5, i6));
                        zVar.f234129b = e4m.b.b(new p8a.m(d0Var, zVar, i3, i6));
                        return zVar;
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: daa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixCopyPasteCodeInputScreen f112496b;

            {
                this.f112496b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen = this.f112496b;
                switch (i22) {
                    case 0:
                        PixCopyPasteCodeInputScreen.Companion companion = PixCopyPasteCodeInputScreen.INSTANCE;
                        return (m) ((z) pixCopyPasteCodeInputScreen.R.getValue()).f234129b.get();
                    case 1:
                        PixCopyPasteCodeInputScreen.Companion companion2 = PixCopyPasteCodeInputScreen.INSTANCE;
                        PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen2 = this.f112496b;
                        return dli.f.a(pixCopyPasteCodeInputScreen2, pixCopyPasteCodeInputScreen2.R2(), v.k((InputTextDelegate) pixCopyPasteCodeInputScreen2.K.getValue(), (TextDelegate) pixCopyPasteCodeInputScreen2.L.getValue(), (LargeActionButtonDelegate) pixCopyPasteCodeInputScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        PixCopyPasteCodeInputScreen.Companion companion3 = PixCopyPasteCodeInputScreen.INSTANCE;
                        qji.b bVarU2 = pixCopyPasteCodeInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.di.PixCopyPasteCodeInputScreenInjector");
                        d0 d0Var = ((a0) bVarU2).f233888a;
                        z zVar = new z();
                        int i6 = 6;
                        zVar.f234128a = e4m.b.b(new p8a.m(d0Var, zVar, i5, i6));
                        zVar.f234129b = e4m.b.b(new p8a.m(d0Var, zVar, i3, i6));
                        return zVar;
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: daa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixCopyPasteCodeInputScreen f112496b;

            {
                this.f112496b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen = this.f112496b;
                switch (i22) {
                    case 0:
                        PixCopyPasteCodeInputScreen.Companion companion = PixCopyPasteCodeInputScreen.INSTANCE;
                        return (m) ((z) pixCopyPasteCodeInputScreen.R.getValue()).f234129b.get();
                    case 1:
                        PixCopyPasteCodeInputScreen.Companion companion2 = PixCopyPasteCodeInputScreen.INSTANCE;
                        PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen2 = this.f112496b;
                        return dli.f.a(pixCopyPasteCodeInputScreen2, pixCopyPasteCodeInputScreen2.R2(), v.k((InputTextDelegate) pixCopyPasteCodeInputScreen2.K.getValue(), (TextDelegate) pixCopyPasteCodeInputScreen2.L.getValue(), (LargeActionButtonDelegate) pixCopyPasteCodeInputScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        PixCopyPasteCodeInputScreen.Companion companion3 = PixCopyPasteCodeInputScreen.INSTANCE;
                        qji.b bVarU2 = pixCopyPasteCodeInputScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.di.PixCopyPasteCodeInputScreenInjector");
                        d0 d0Var = ((a0) bVarU2).f233888a;
                        z zVar = new z();
                        int i6 = 6;
                        zVar.f234128a = e4m.b.b(new p8a.m(d0Var, zVar, i5, i6));
                        zVar.f234129b = e4m.b.b(new p8a.m(d0Var, zVar, i32, i6));
                        return zVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f112503b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Continuation continuation = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_copy_and_paste_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.pix_copy_and_paste_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new daa.b(this, continuation, 0), 3);
        d3().f174564b.setTag("LOADING_BUTTON_TAG");
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new daa.b(this, continuation, 1), 3);
        Lazy lazy = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).i.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.L.getValue()).f53530c), null, new daa.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m R2() {
        return (m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
