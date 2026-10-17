package com.revolut.feature.structured_note.details.impl.ui.screens.about_note;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ft.d;
import g5e.b;
import g5e.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o4e.l;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/about_note/AboutNoteScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lg5e/f;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AboutNoteScreen extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AboutNoteScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AboutNoteScreenContract$InputData K;
    public final int L;
    public final h M;
    public final ListSubheaderDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AboutNoteScreen(AboutNoteScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new ListSubheaderDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: g5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutNoteScreen f140770b;

            {
                this.f140770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AboutNoteScreen aboutNoteScreen = this.f140770b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AboutNoteScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(aboutNoteScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        AboutNoteScreenContract$InputData aboutNoteScreenContract$InputData = aboutNoteScreen.K;
                        aboutNoteScreenContract$InputData.getClass();
                        return new o4e.c(lVar, aboutNoteScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AboutNoteScreen.R;
                        return (e) ((o4e.c) aboutNoteScreen.O.getValue()).f222212b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutNoteScreen.R;
                        AboutNoteScreen aboutNoteScreen2 = this.f140770b;
                        return tki.g.a(aboutNoteScreen2, (e) aboutNoteScreen2.P.getValue(), v.k(new CellDetailsDelegate(), aboutNoteScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: g5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutNoteScreen f140770b;

            {
                this.f140770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AboutNoteScreen aboutNoteScreen = this.f140770b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AboutNoteScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(aboutNoteScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        AboutNoteScreenContract$InputData aboutNoteScreenContract$InputData = aboutNoteScreen.K;
                        aboutNoteScreenContract$InputData.getClass();
                        return new o4e.c(lVar, aboutNoteScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AboutNoteScreen.R;
                        return (e) ((o4e.c) aboutNoteScreen.O.getValue()).f222212b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutNoteScreen.R;
                        AboutNoteScreen aboutNoteScreen2 = this.f140770b;
                        return tki.g.a(aboutNoteScreen2, (e) aboutNoteScreen2.P.getValue(), v.k(new CellDetailsDelegate(), aboutNoteScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: g5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutNoteScreen f140770b;

            {
                this.f140770b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AboutNoteScreen aboutNoteScreen = this.f140770b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AboutNoteScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(aboutNoteScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        AboutNoteScreenContract$InputData aboutNoteScreenContract$InputData = aboutNoteScreen.K;
                        aboutNoteScreenContract$InputData.getClass();
                        return new o4e.c(lVar, aboutNoteScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AboutNoteScreen.R;
                        return (e) ((o4e.c) aboutNoteScreen.O.getValue()).f222212b.get();
                    default:
                        KProperty[] kPropertyArr3 = AboutNoteScreen.R;
                        AboutNoteScreen aboutNoteScreen2 = this.f140770b;
                        return tki.g.a(aboutNoteScreen2, (e) aboutNoteScreen2.P.getValue(), v.k(new CellDetailsDelegate(), aboutNoteScreen2.N, new RowLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
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
        return (o4e.c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g5e.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_structured_notes_attributes_screen_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new d(this, null, 25), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new g5e.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
