package com.revolut.feature.shared.help_centre.impl.faq.screens.faq_entries;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.api.faq.FaqEntriesScreenDestination;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faq_entries.FaqEntriesScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f8d.b;
import f8d.c;
import f8d.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r7d.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/faq_entries/FaqEntriesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lf8d/f;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FaqEntriesScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FaqEntriesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final FaqEntriesScreenDestination.InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final InputDisclosureDelegate P;
    public final Object Q;

    public FaqEntriesScreen(FaqEntriesScreenDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: f8d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FaqEntriesScreen f132763b;

            {
                this.f132763b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FaqEntriesScreen faqEntriesScreen = this.f132763b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FaqEntriesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(faqEntriesScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f252135l;
                        FaqEntriesScreenDestination.InputData inputData2 = faqEntriesScreen.K;
                        inputData2.getClass();
                        return new r7d.g(inputData2);
                    case 1:
                        KProperty[] kPropertyArr2 = FaqEntriesScreen.R;
                        return new g(((r7d.g) ((g8d.a) faqEntriesScreen.N.getValue())).f252116a, new h());
                    default:
                        KProperty[] kPropertyArr3 = FaqEntriesScreen.R;
                        FaqEntriesScreen faqEntriesScreen2 = this.f132763b;
                        return dli.f.a(faqEntriesScreen2, (e) faqEntriesScreen2.O.getValue(), u.c(faqEntriesScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: f8d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FaqEntriesScreen f132763b;

            {
                this.f132763b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FaqEntriesScreen faqEntriesScreen = this.f132763b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FaqEntriesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(faqEntriesScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f252135l;
                        FaqEntriesScreenDestination.InputData inputData2 = faqEntriesScreen.K;
                        inputData2.getClass();
                        return new r7d.g(inputData2);
                    case 1:
                        KProperty[] kPropertyArr2 = FaqEntriesScreen.R;
                        return new g(((r7d.g) ((g8d.a) faqEntriesScreen.N.getValue())).f252116a, new h());
                    default:
                        KProperty[] kPropertyArr3 = FaqEntriesScreen.R;
                        FaqEntriesScreen faqEntriesScreen2 = this.f132763b;
                        return dli.f.a(faqEntriesScreen2, (e) faqEntriesScreen2.O.getValue(), u.c(faqEntriesScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.P = new InputDisclosureDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: f8d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FaqEntriesScreen f132763b;

            {
                this.f132763b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FaqEntriesScreen faqEntriesScreen = this.f132763b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FaqEntriesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(faqEntriesScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f252135l;
                        FaqEntriesScreenDestination.InputData inputData2 = faqEntriesScreen.K;
                        inputData2.getClass();
                        return new r7d.g(inputData2);
                    case 1:
                        KProperty[] kPropertyArr2 = FaqEntriesScreen.R;
                        return new g(((r7d.g) ((g8d.a) faqEntriesScreen.N.getValue())).f252116a, new h());
                    default:
                        KProperty[] kPropertyArr3 = FaqEntriesScreen.R;
                        FaqEntriesScreen faqEntriesScreen2 = this.f132763b;
                        return dli.f.a(faqEntriesScreen2, (e) faqEntriesScreen2.O.getValue(), u.c(faqEntriesScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g8d.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f8d.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((g8d.a) this.N.getValue()).getClass();
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(this.K.f86104a, null);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new ev7.b(this, null, 18), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52538c), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
