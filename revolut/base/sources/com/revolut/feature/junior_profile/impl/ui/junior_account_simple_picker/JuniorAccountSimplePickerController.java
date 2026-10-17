package com.revolut.feature.junior_profile.impl.ui.junior_account_simple_picker;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_profile.impl.ui.junior_account_simple_picker.JuniorAccountSimplePickerController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h35.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import uj8.e;
import uj8.f;
import uj8.g;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/junior_account_simple_picker/JuniorAccountSimplePickerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Luj8/c;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAccountSimplePickerController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(JuniorAccountSimplePickerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final c K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JuniorAccountSimplePickerController(c onJuniorSelectedDestinationProvider) {
        Intrinsics.checkNotNullParameter(onJuniorSelectedDestinationProvider, "onJuniorSelectedDestinationProvider");
        this.K = onJuniorSelectedDestinationProvider;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, e.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: uj8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountSimplePickerController f280535b;

            {
                this.f280535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorAccountSimplePickerController juniorAccountSimplePickerController = this.f280535b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountSimplePickerController.S;
                        JuniorAccountSimplePickerController juniorAccountSimplePickerController2 = this.f280535b;
                        return dli.f.a(juniorAccountSimplePickerController2, (b) juniorAccountSimplePickerController2.R.getValue(), v.k(juniorAccountSimplePickerController2.N, new RowLoadingDelegate(), juniorAccountSimplePickerController2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountSimplePickerController.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountSimplePickerController.m2()).a().get(mj8.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mj8.h.class, " is not found"));
                        }
                        mj8.h hVar = ((mj8.h) aVar2.b()).f;
                        h35.c cVar = juniorAccountSimplePickerController.K;
                        cVar.getClass();
                        return new mj8.c(hVar, cVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountSimplePickerController.S;
                        return (b) ((mj8.c) juniorAccountSimplePickerController.Q.getValue()).f205954b.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: uj8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountSimplePickerController f280535b;

            {
                this.f280535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorAccountSimplePickerController juniorAccountSimplePickerController = this.f280535b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountSimplePickerController.S;
                        JuniorAccountSimplePickerController juniorAccountSimplePickerController2 = this.f280535b;
                        return dli.f.a(juniorAccountSimplePickerController2, (b) juniorAccountSimplePickerController2.R.getValue(), v.k(juniorAccountSimplePickerController2.N, new RowLoadingDelegate(), juniorAccountSimplePickerController2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountSimplePickerController.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountSimplePickerController.m2()).a().get(mj8.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mj8.h.class, " is not found"));
                        }
                        mj8.h hVar = ((mj8.h) aVar2.b()).f;
                        h35.c cVar = juniorAccountSimplePickerController.K;
                        cVar.getClass();
                        return new mj8.c(hVar, cVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountSimplePickerController.S;
                        return (b) ((mj8.c) juniorAccountSimplePickerController.Q.getValue()).f205954b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: uj8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountSimplePickerController f280535b;

            {
                this.f280535b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorAccountSimplePickerController juniorAccountSimplePickerController = this.f280535b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountSimplePickerController.S;
                        JuniorAccountSimplePickerController juniorAccountSimplePickerController2 = this.f280535b;
                        return dli.f.a(juniorAccountSimplePickerController2, (b) juniorAccountSimplePickerController2.R.getValue(), v.k(juniorAccountSimplePickerController2.N, new RowLoadingDelegate(), juniorAccountSimplePickerController2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountSimplePickerController.S;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAccountSimplePickerController.m2()).a().get(mj8.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", mj8.h.class, " is not found"));
                        }
                        mj8.h hVar = ((mj8.h) aVar2.b()).f;
                        h35.c cVar = juniorAccountSimplePickerController.K;
                        cVar.getClass();
                        return new mj8.c(hVar, cVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountSimplePickerController.S;
                        return (b) ((mj8.c) juniorAccountSimplePickerController.Q.getValue()).f205954b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((uj8.c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (mj8.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (uj8.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextClause textClause = new TextClause("Select youth account", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new uea.e(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
