package com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_removed;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_removed.AdditionalCardholderRemovedScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import jii.n;
import jm4.a3;
import jm4.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lp4.c;
import lp4.d;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_removed/AdditionalCardholderRemovedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Llp4/d;", "Lno/m;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalCardholderRemovedScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AdditionalCardholderRemovedScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final Object O;
    public final Object Q;
    public final Object R;
    public final /* synthetic */ b K = b.f128075a;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final TwinHorizontalButtonDelegate N = new TwinHorizontalButtonDelegate();
    public final int P = R$layout.screen_recycler_navbar_bottomsheet;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public AdditionalCardholderRemovedScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: lp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardholderRemovedScreen f198924b;

            {
                this.f198924b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen = this.f198924b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardholderRemovedScreen.S;
                        AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen2 = this.f198924b;
                        return dli.f.a(additionalCardholderRemovedScreen2, (c) additionalCardholderRemovedScreen2.R.getValue(), v.k(additionalCardholderRemovedScreen2.M, additionalCardholderRemovedScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardholderRemovedScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(additionalCardholderRemovedScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        t tVar = new t();
                        tVar.f176358a = e4m.b.b(new ix5.b(tVar, 1, 21));
                        tVar.f176359b = e4m.b.b(new ix5.b(tVar, 0, 21));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardholderRemovedScreen.S;
                        return (c) ((t) additionalCardholderRemovedScreen.Q.getValue()).f176359b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: lp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardholderRemovedScreen f198924b;

            {
                this.f198924b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen = this.f198924b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardholderRemovedScreen.S;
                        AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen2 = this.f198924b;
                        return dli.f.a(additionalCardholderRemovedScreen2, (c) additionalCardholderRemovedScreen2.R.getValue(), v.k(additionalCardholderRemovedScreen2.M, additionalCardholderRemovedScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardholderRemovedScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(additionalCardholderRemovedScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        t tVar = new t();
                        tVar.f176358a = e4m.b.b(new ix5.b(tVar, 1, 21));
                        tVar.f176359b = e4m.b.b(new ix5.b(tVar, 0, 21));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardholderRemovedScreen.S;
                        return (c) ((t) additionalCardholderRemovedScreen.Q.getValue()).f176359b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: lp4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardholderRemovedScreen f198924b;

            {
                this.f198924b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen = this.f198924b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardholderRemovedScreen.S;
                        AdditionalCardholderRemovedScreen additionalCardholderRemovedScreen2 = this.f198924b;
                        return dli.f.a(additionalCardholderRemovedScreen2, (c) additionalCardholderRemovedScreen2.R.getValue(), v.k(additionalCardholderRemovedScreen2.M, additionalCardholderRemovedScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardholderRemovedScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(additionalCardholderRemovedScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        t tVar = new t();
                        tVar.f176358a = e4m.b.b(new ix5.b(tVar, 1, 21));
                        tVar.f176359b = e4m.b.b(new ix5.b(tVar, 0, 21));
                        return tVar;
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardholderRemovedScreen.S;
                        return (c) ((t) additionalCardholderRemovedScreen.Q.getValue()).f176359b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f198925a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.N;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new lp4.b(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new lp4.b(this, continuation, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
