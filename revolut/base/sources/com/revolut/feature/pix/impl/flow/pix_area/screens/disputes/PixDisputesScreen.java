package com.revolut.feature.pix.impl.flow.pix_area.screens.disputes;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.pix_area.screens.disputes.PixDisputesScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import p8a.b0;
import pki.b;
import raa.f;
import raa.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/disputes/PixDisputesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lraa/f;", "Ldli/a;", "Lraa/g;", "<init>", "()V", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixDisputesScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PixDisputesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final boolean L = true;
    public final Object M = w.y0(new r4k.a(20));
    public final Object N = w.y0(new r4k.a(21));
    public final h O = s.t(this, a.f);
    public final Object P;
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public PixDisputesScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: raa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixDisputesScreen f252794b;

            {
                this.f252794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixDisputesScreen pixDisputesScreen = this.f252794b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixDisputesScreen.S;
                        PixDisputesScreen pixDisputesScreen2 = this.f252794b;
                        return dli.f.a(pixDisputesScreen2, (h) pixDisputesScreen2.R.getValue(), v.k((RowDelegate) pixDisputesScreen2.M.getValue(), (FullScreenStateDelegate) pixDisputesScreen2.N.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PixDisputesScreen.S;
                        qji.b bVarU2 = pixDisputesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.disputes.di.PixDisputesScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        return new b0(nVar.f234031b, nVar.f234032c);
                    default:
                        KProperty[] kPropertyArr3 = PixDisputesScreen.S;
                        return (h) ((b0) pixDisputesScreen.Q.getValue()).f233897c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: raa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixDisputesScreen f252794b;

            {
                this.f252794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixDisputesScreen pixDisputesScreen = this.f252794b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixDisputesScreen.S;
                        PixDisputesScreen pixDisputesScreen2 = this.f252794b;
                        return dli.f.a(pixDisputesScreen2, (h) pixDisputesScreen2.R.getValue(), v.k((RowDelegate) pixDisputesScreen2.M.getValue(), (FullScreenStateDelegate) pixDisputesScreen2.N.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PixDisputesScreen.S;
                        qji.b bVarU2 = pixDisputesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.disputes.di.PixDisputesScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        return new b0(nVar.f234031b, nVar.f234032c);
                    default:
                        KProperty[] kPropertyArr3 = PixDisputesScreen.S;
                        return (h) ((b0) pixDisputesScreen.Q.getValue()).f233897c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: raa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixDisputesScreen f252794b;

            {
                this.f252794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixDisputesScreen pixDisputesScreen = this.f252794b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixDisputesScreen.S;
                        PixDisputesScreen pixDisputesScreen2 = this.f252794b;
                        return dli.f.a(pixDisputesScreen2, (h) pixDisputesScreen2.R.getValue(), v.k((RowDelegate) pixDisputesScreen2.M.getValue(), (FullScreenStateDelegate) pixDisputesScreen2.N.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PixDisputesScreen.S;
                        qji.b bVarU2 = pixDisputesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.disputes.di.PixDisputesScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        return new b0(nVar.f234031b, nVar.f234032c);
                    default:
                        KProperty[] kPropertyArr3 = PixDisputesScreen.S;
                        return (h) ((b0) pixDisputesScreen.Q.getValue()).f233897c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (raa.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pix_disputes_sheet_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), null, new raa.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
