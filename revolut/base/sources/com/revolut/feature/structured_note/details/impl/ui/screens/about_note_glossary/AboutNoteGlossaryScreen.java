package com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import hwi.l0;
import i5e.b;
import i5e.d;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o4e.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/about_note_glossary/AboutNoteGlossaryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li5e/d;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AboutNoteGlossaryScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AboutNoteGlossaryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AboutNoteGlossaryScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AboutNoteGlossaryScreen(AboutNoteGlossaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: i5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutNoteGlossaryScreen f158812b;

            {
                this.f158812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AboutNoteGlossaryScreen aboutNoteGlossaryScreen = this.f158812b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AboutNoteGlossaryScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(aboutNoteGlossaryScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        AboutNoteGlossaryScreenContract$InputData aboutNoteGlossaryScreenContract$InputData = aboutNoteGlossaryScreen.K;
                        aboutNoteGlossaryScreenContract$InputData.getClass();
                        return new o4e.b(lVar, aboutNoteGlossaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AboutNoteGlossaryScreen.Q;
                        return (h) ((o4e.b) aboutNoteGlossaryScreen.N.getValue()).f222210b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutNoteGlossaryScreen.Q;
                        AboutNoteGlossaryScreen aboutNoteGlossaryScreen2 = this.f158812b;
                        return dli.f.a(aboutNoteGlossaryScreen2, (h) aboutNoteGlossaryScreen2.O.getValue(), v.k(new PlainTextDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: i5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutNoteGlossaryScreen f158812b;

            {
                this.f158812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AboutNoteGlossaryScreen aboutNoteGlossaryScreen = this.f158812b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AboutNoteGlossaryScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(aboutNoteGlossaryScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        AboutNoteGlossaryScreenContract$InputData aboutNoteGlossaryScreenContract$InputData = aboutNoteGlossaryScreen.K;
                        aboutNoteGlossaryScreenContract$InputData.getClass();
                        return new o4e.b(lVar, aboutNoteGlossaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AboutNoteGlossaryScreen.Q;
                        return (h) ((o4e.b) aboutNoteGlossaryScreen.N.getValue()).f222210b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutNoteGlossaryScreen.Q;
                        AboutNoteGlossaryScreen aboutNoteGlossaryScreen2 = this.f158812b;
                        return dli.f.a(aboutNoteGlossaryScreen2, (h) aboutNoteGlossaryScreen2.O.getValue(), v.k(new PlainTextDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: i5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutNoteGlossaryScreen f158812b;

            {
                this.f158812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AboutNoteGlossaryScreen aboutNoteGlossaryScreen = this.f158812b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AboutNoteGlossaryScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(aboutNoteGlossaryScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        AboutNoteGlossaryScreenContract$InputData aboutNoteGlossaryScreenContract$InputData = aboutNoteGlossaryScreen.K;
                        aboutNoteGlossaryScreenContract$InputData.getClass();
                        return new o4e.b(lVar, aboutNoteGlossaryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AboutNoteGlossaryScreen.Q;
                        return (h) ((o4e.b) aboutNoteGlossaryScreen.N.getValue()).f222210b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutNoteGlossaryScreen.Q;
                        AboutNoteGlossaryScreen aboutNoteGlossaryScreen2 = this.f158812b;
                        return dli.f.a(aboutNoteGlossaryScreen2, (h) aboutNoteGlossaryScreen2.O.getValue(), v.k(new PlainTextDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f158816a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f174539b.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o4e.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i5e.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new l0(this, null, 15), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
