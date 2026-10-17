package com.revolut.feature.tab.lifestyle.impl.ui.documents;

import aii.q;
import akl.e0;
import ame.c;
import ame.e;
import ame.f;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.lifestyle.impl.R$string;
import com.revolut.feature.tab.lifestyle.impl.ui.documents.LifestyleDocumentsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import us6.r2;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/documents/LifestyleDocumentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lame/e;", "<init>", "()V", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LifestyleDocumentsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(LifestyleDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public LifestyleDocumentsScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ame.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifestyleDocumentsScreen f6359b;

            {
                this.f6359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 1;
                LifestyleDocumentsScreen lifestyleDocumentsScreen = this.f6359b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LifestyleDocumentsScreen.Q;
                        LifestyleDocumentsScreen lifestyleDocumentsScreen2 = this.f6359b;
                        return dli.f.a(lifestyleDocumentsScreen2, (f) lifestyleDocumentsScreen2.P.getValue(), v.k(lifestyleDocumentsScreen2.L, lifestyleDocumentsScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = LifestyleDocumentsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(lifestyleDocumentsScreen.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        vle.a aVar3 = new vle.a();
                        int i6 = 25;
                        aVar3.f290374a = e4m.b.b(new r2(bVar, aVar3, i5, i6));
                        aVar3.f290375b = e4m.b.b(new r2(bVar, aVar3, i3, i6));
                        return aVar3;
                    default:
                        KProperty[] kPropertyArr3 = LifestyleDocumentsScreen.Q;
                        return (f) ((vle.a) lifestyleDocumentsScreen.O.getValue()).f290375b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ame.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifestyleDocumentsScreen f6359b;

            {
                this.f6359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 1;
                LifestyleDocumentsScreen lifestyleDocumentsScreen = this.f6359b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LifestyleDocumentsScreen.Q;
                        LifestyleDocumentsScreen lifestyleDocumentsScreen2 = this.f6359b;
                        return dli.f.a(lifestyleDocumentsScreen2, (f) lifestyleDocumentsScreen2.P.getValue(), v.k(lifestyleDocumentsScreen2.L, lifestyleDocumentsScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = LifestyleDocumentsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(lifestyleDocumentsScreen.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        vle.a aVar3 = new vle.a();
                        int i6 = 25;
                        aVar3.f290374a = e4m.b.b(new r2(bVar, aVar3, i5, i6));
                        aVar3.f290375b = e4m.b.b(new r2(bVar, aVar3, i3, i6));
                        return aVar3;
                    default:
                        KProperty[] kPropertyArr3 = LifestyleDocumentsScreen.Q;
                        return (f) ((vle.a) lifestyleDocumentsScreen.O.getValue()).f290375b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ame.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifestyleDocumentsScreen f6359b;

            {
                this.f6359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 1;
                LifestyleDocumentsScreen lifestyleDocumentsScreen = this.f6359b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LifestyleDocumentsScreen.Q;
                        LifestyleDocumentsScreen lifestyleDocumentsScreen2 = this.f6359b;
                        return dli.f.a(lifestyleDocumentsScreen2, (f) lifestyleDocumentsScreen2.P.getValue(), v.k(lifestyleDocumentsScreen2.L, lifestyleDocumentsScreen2.M, new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = LifestyleDocumentsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(lifestyleDocumentsScreen.m2()).a().get(eei.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", eei.a.class, " is not found"));
                        }
                        vle.b bVar = ((vle.b) aVar2.b()).D;
                        vle.a aVar3 = new vle.a();
                        int i6 = 25;
                        aVar3.f290374a = e4m.b.b(new r2(bVar, aVar3, i5, i6));
                        aVar3.f290375b = e4m.b.b(new r2(bVar, aVar3, i32, i6));
                        return aVar3;
                    default:
                        KProperty[] kPropertyArr3 = LifestyleDocumentsScreen.Q;
                        return (f) ((vle.a) lifestyleDocumentsScreen.O.getValue()).f290375b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vle.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.tab_lifestyle_documents_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.tab_lifestyle_documents_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new e0(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new ame.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getL() {
        return R$layout.screen_recycler_navbar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
