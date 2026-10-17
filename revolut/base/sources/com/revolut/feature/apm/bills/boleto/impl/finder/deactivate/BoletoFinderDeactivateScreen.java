package com.revolut.feature.apm.bills.boleto.impl.finder.deactivate;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.boleto.api.R$string;
import com.revolut.feature.apm.bills.boleto.impl.finder.deactivate.BoletoFinderDeactivateScreen;
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
import pki.b;
import te0.w;
import tm1.d;
import tm1.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/deactivate/BoletoFinderDeactivateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltm1/d;", "Ldli/a;", "Ltm1/f;", "<init>", "()V", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BoletoFinderDeactivateScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BoletoFinderDeactivateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final Object O = w.y0(new tl7.a(4));
    public final Object P = w.y0(new tl7.a(5));
    public final h Q = s.t(this, a.f);

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

    public BoletoFinderDeactivateScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFinderDeactivateScreen f272150b;

            {
                this.f272150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                BoletoFinderDeactivateScreen boletoFinderDeactivateScreen = this.f272150b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoFinderDeactivateScreen.R;
                        return (e) ((sm1.f) boletoFinderDeactivateScreen.N.getValue()).f264323b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoFinderDeactivateScreen.R;
                        BoletoFinderDeactivateScreen boletoFinderDeactivateScreen2 = this.f272150b;
                        return dli.f.a(boletoFinderDeactivateScreen2, (e) boletoFinderDeactivateScreen2.L.getValue(), v.k((RowDelegate) boletoFinderDeactivateScreen2.O.getValue(), (LargeActionButtonDelegate) boletoFinderDeactivateScreen2.P.getValue(), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletoFinderDeactivateScreen.R;
                        qji.b bVarU2 = boletoFinderDeactivateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.deactivate.di.BoletoFinderDeactivateScreenInjector");
                        sm1.d dVar = ((sm1.g) bVarU2).f264325b;
                        sm1.f fVar = new sm1.f();
                        int i6 = 24;
                        fVar.f264322a = e4m.b.b(new ryc.d(dVar, fVar, i5, i6));
                        fVar.f264323b = e4m.b.b(new ryc.d(dVar, fVar, i3, i6));
                        return fVar;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFinderDeactivateScreen f272150b;

            {
                this.f272150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                BoletoFinderDeactivateScreen boletoFinderDeactivateScreen = this.f272150b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoFinderDeactivateScreen.R;
                        return (e) ((sm1.f) boletoFinderDeactivateScreen.N.getValue()).f264323b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoFinderDeactivateScreen.R;
                        BoletoFinderDeactivateScreen boletoFinderDeactivateScreen2 = this.f272150b;
                        return dli.f.a(boletoFinderDeactivateScreen2, (e) boletoFinderDeactivateScreen2.L.getValue(), v.k((RowDelegate) boletoFinderDeactivateScreen2.O.getValue(), (LargeActionButtonDelegate) boletoFinderDeactivateScreen2.P.getValue(), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletoFinderDeactivateScreen.R;
                        qji.b bVarU2 = boletoFinderDeactivateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.deactivate.di.BoletoFinderDeactivateScreenInjector");
                        sm1.d dVar = ((sm1.g) bVarU2).f264325b;
                        sm1.f fVar = new sm1.f();
                        int i6 = 24;
                        fVar.f264322a = e4m.b.b(new ryc.d(dVar, fVar, i5, i6));
                        fVar.f264323b = e4m.b.b(new ryc.d(dVar, fVar, i3, i6));
                        return fVar;
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: tm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoFinderDeactivateScreen f272150b;

            {
                this.f272150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                BoletoFinderDeactivateScreen boletoFinderDeactivateScreen = this.f272150b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoFinderDeactivateScreen.R;
                        return (e) ((sm1.f) boletoFinderDeactivateScreen.N.getValue()).f264323b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoFinderDeactivateScreen.R;
                        BoletoFinderDeactivateScreen boletoFinderDeactivateScreen2 = this.f272150b;
                        return dli.f.a(boletoFinderDeactivateScreen2, (e) boletoFinderDeactivateScreen2.L.getValue(), v.k((RowDelegate) boletoFinderDeactivateScreen2.O.getValue(), (LargeActionButtonDelegate) boletoFinderDeactivateScreen2.P.getValue(), new CellDetailsNoteDelegate(), new CellDetailsStandaloneNoteDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BoletoFinderDeactivateScreen.R;
                        qji.b bVarU2 = boletoFinderDeactivateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.deactivate.di.BoletoFinderDeactivateScreenInjector");
                        sm1.d dVar = ((sm1.g) bVarU2).f264325b;
                        sm1.f fVar = new sm1.f();
                        int i6 = 24;
                        fVar.f264322a = e4m.b.b(new ryc.d(dVar, fVar, i5, i6));
                        fVar.f264323b = e4m.b.b(new ryc.d(dVar, fVar, i32, i6));
                        return fVar;
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (sm1.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (tm1.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.boleto_finder_offboarding_title, null, null, 14), null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b), null, new tm1.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
