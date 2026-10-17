package com.revolut.feature.backgroundpicker.impl.flow.catalogue;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionButtonDelegate;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.backgroundpicker.impl.R$layout;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import r40.k0;
import rlh.d0;
import rm2.c;
import rm2.d;
import rm2.f;
import rm2.g;
import rm2.i;
import rm2.n;
import rm2.r;
import te0.w;
import tki.h;
import vc.s;
import xki.e;
import yp0.j0;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/catalogue/BackgroundCatalogController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrm2/n;", "Ltki/h;", "Lrm2/r;", "Lno/m;", "Companion", "a", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackgroundCatalogController extends ViewController<n> implements h, m {
    public final i K;
    public final ao.h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final AnalyticsProduct.Shared.RevolutUIKit P;
    public final BackgroundSelectionDelegate Q;
    public final BackgroundSelectionButtonDelegate R;
    public final Lazy S;
    public j T;
    public final int U;
    public final g V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(BackgroundCatalogController.class, "binding", "getBinding()Lcom/revolut/feature/backgroundpicker/impl/databinding/ScreenBackgroundCatalogueBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BackgroundCatalogController(i inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, rm2.b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackgroundCatalogController f255182b;

            {
                this.f255182b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BackgroundCatalogController backgroundCatalogController = this.f255182b;
                switch (i2) {
                    case 0:
                        BackgroundCatalogController.Companion companion = BackgroundCatalogController.INSTANCE;
                        qji.b bVarU2 = backgroundCatalogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.backgroundpicker.impl.flow.catalogue.di.BackgroundCatalogControllerInjector");
                        pm2.b bVar = (pm2.b) bVarU2;
                        pm2.c cVar = bVar.f237457c;
                        pm2.b bVar2 = bVar.d;
                        i iVar = backgroundCatalogController.K;
                        iVar.getClass();
                        return new pm2.a(cVar, bVar2, backgroundCatalogController, iVar);
                    case 1:
                        BackgroundCatalogController.Companion companion2 = BackgroundCatalogController.INSTANCE;
                        pm2.a aVar = (pm2.a) backgroundCatalogController.M.getValue();
                        pm2.c cVar2 = aVar.f237447b;
                        gm2.a backgroundPickerConfiguration = new gm2.a();
                        Intrinsics.checkNotNullParameter(backgroundPickerConfiguration, "backgroundPickerConfiguration");
                        x xVar = new x();
                        i iVar2 = aVar.f237446a;
                        bn2.f fVarE = cVar2.d.e();
                        bn2.c cVar3 = (bn2.c) aVar.f237448c.f.get();
                        lg3.a aVarA = ((og3.e) cVar2.e).a();
                        vc.s.j(aVarA);
                        return new com.revolut.feature.backgroundpicker.impl.flow.catalogue.b(xVar, iVar2, fVarE, cVar3, aVarA, (e60.a) aVar.f237453m.get(), new hm2.e(), new v());
                    case 2:
                        BackgroundCatalogController.Companion companion3 = BackgroundCatalogController.INSTANCE;
                        return tki.g.b(backgroundCatalogController, backgroundCatalogController.d());
                    default:
                        return new ContainerDelegate(zhm.v.k(backgroundCatalogController.Q, backgroundCatalogController.R), new d0(backgroundCatalogController, 2), 4);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: rm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackgroundCatalogController f255182b;

            {
                this.f255182b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BackgroundCatalogController backgroundCatalogController = this.f255182b;
                switch (i22) {
                    case 0:
                        BackgroundCatalogController.Companion companion = BackgroundCatalogController.INSTANCE;
                        qji.b bVarU2 = backgroundCatalogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.backgroundpicker.impl.flow.catalogue.di.BackgroundCatalogControllerInjector");
                        pm2.b bVar = (pm2.b) bVarU2;
                        pm2.c cVar = bVar.f237457c;
                        pm2.b bVar2 = bVar.d;
                        i iVar = backgroundCatalogController.K;
                        iVar.getClass();
                        return new pm2.a(cVar, bVar2, backgroundCatalogController, iVar);
                    case 1:
                        BackgroundCatalogController.Companion companion2 = BackgroundCatalogController.INSTANCE;
                        pm2.a aVar = (pm2.a) backgroundCatalogController.M.getValue();
                        pm2.c cVar2 = aVar.f237447b;
                        gm2.a backgroundPickerConfiguration = new gm2.a();
                        Intrinsics.checkNotNullParameter(backgroundPickerConfiguration, "backgroundPickerConfiguration");
                        x xVar = new x();
                        i iVar2 = aVar.f237446a;
                        bn2.f fVarE = cVar2.d.e();
                        bn2.c cVar3 = (bn2.c) aVar.f237448c.f.get();
                        lg3.a aVarA = ((og3.e) cVar2.e).a();
                        vc.s.j(aVarA);
                        return new com.revolut.feature.backgroundpicker.impl.flow.catalogue.b(xVar, iVar2, fVarE, cVar3, aVarA, (e60.a) aVar.f237453m.get(), new hm2.e(), new v());
                    case 2:
                        BackgroundCatalogController.Companion companion3 = BackgroundCatalogController.INSTANCE;
                        return tki.g.b(backgroundCatalogController, backgroundCatalogController.d());
                    default:
                        return new ContainerDelegate(zhm.v.k(backgroundCatalogController.Q, backgroundCatalogController.R), new d0(backgroundCatalogController, 2), 4);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: rm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackgroundCatalogController f255182b;

            {
                this.f255182b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BackgroundCatalogController backgroundCatalogController = this.f255182b;
                switch (i22) {
                    case 0:
                        BackgroundCatalogController.Companion companion = BackgroundCatalogController.INSTANCE;
                        qji.b bVarU2 = backgroundCatalogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.backgroundpicker.impl.flow.catalogue.di.BackgroundCatalogControllerInjector");
                        pm2.b bVar = (pm2.b) bVarU2;
                        pm2.c cVar = bVar.f237457c;
                        pm2.b bVar2 = bVar.d;
                        i iVar = backgroundCatalogController.K;
                        iVar.getClass();
                        return new pm2.a(cVar, bVar2, backgroundCatalogController, iVar);
                    case 1:
                        BackgroundCatalogController.Companion companion2 = BackgroundCatalogController.INSTANCE;
                        pm2.a aVar = (pm2.a) backgroundCatalogController.M.getValue();
                        pm2.c cVar2 = aVar.f237447b;
                        gm2.a backgroundPickerConfiguration = new gm2.a();
                        Intrinsics.checkNotNullParameter(backgroundPickerConfiguration, "backgroundPickerConfiguration");
                        x xVar = new x();
                        i iVar2 = aVar.f237446a;
                        bn2.f fVarE = cVar2.d.e();
                        bn2.c cVar3 = (bn2.c) aVar.f237448c.f.get();
                        lg3.a aVarA = ((og3.e) cVar2.e).a();
                        vc.s.j(aVarA);
                        return new com.revolut.feature.backgroundpicker.impl.flow.catalogue.b(xVar, iVar2, fVarE, cVar3, aVarA, (e60.a) aVar.f237453m.get(), new hm2.e(), new v());
                    case 2:
                        BackgroundCatalogController.Companion companion3 = BackgroundCatalogController.INSTANCE;
                        return tki.g.b(backgroundCatalogController, backgroundCatalogController.d());
                    default:
                        return new ContainerDelegate(zhm.v.k(backgroundCatalogController.Q, backgroundCatalogController.R), new d0(backgroundCatalogController, 2), 4);
                }
            }
        });
        this.P = AnalyticsProduct.Shared.RevolutUIKit.f;
        this.Q = new BackgroundSelectionDelegate();
        this.R = new BackgroundSelectionButtonDelegate();
        final int i5 = 3;
        this.S = yhm.j.b(new Function0(this) { // from class: rm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BackgroundCatalogController f255182b;

            {
                this.f255182b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BackgroundCatalogController backgroundCatalogController = this.f255182b;
                switch (i22) {
                    case 0:
                        BackgroundCatalogController.Companion companion = BackgroundCatalogController.INSTANCE;
                        qji.b bVarU2 = backgroundCatalogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.backgroundpicker.impl.flow.catalogue.di.BackgroundCatalogControllerInjector");
                        pm2.b bVar = (pm2.b) bVarU2;
                        pm2.c cVar = bVar.f237457c;
                        pm2.b bVar2 = bVar.d;
                        i iVar = backgroundCatalogController.K;
                        iVar.getClass();
                        return new pm2.a(cVar, bVar2, backgroundCatalogController, iVar);
                    case 1:
                        BackgroundCatalogController.Companion companion2 = BackgroundCatalogController.INSTANCE;
                        pm2.a aVar = (pm2.a) backgroundCatalogController.M.getValue();
                        pm2.c cVar2 = aVar.f237447b;
                        gm2.a backgroundPickerConfiguration = new gm2.a();
                        Intrinsics.checkNotNullParameter(backgroundPickerConfiguration, "backgroundPickerConfiguration");
                        x xVar = new x();
                        i iVar2 = aVar.f237446a;
                        bn2.f fVarE = cVar2.d.e();
                        bn2.c cVar3 = (bn2.c) aVar.f237448c.f.get();
                        lg3.a aVarA = ((og3.e) cVar2.e).a();
                        vc.s.j(aVarA);
                        return new com.revolut.feature.backgroundpicker.impl.flow.catalogue.b(xVar, iVar2, fVarE, cVar3, aVarA, (e60.a) aVar.f237453m.get(), new hm2.e(), new v());
                    case 2:
                        BackgroundCatalogController.Companion companion3 = BackgroundCatalogController.INSTANCE;
                        return tki.g.b(backgroundCatalogController, backgroundCatalogController.d());
                    default:
                        return new ContainerDelegate(zhm.v.k(backgroundCatalogController.Q, backgroundCatalogController.R), new d0(backgroundCatalogController, 2), 4);
                }
            }
        });
        this.U = R$layout.screen_background_catalogue;
        this.V = new g(this);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j jVar = this.T;
        if (jVar == null) {
            Intrinsics.r("pagerAdapter");
            throw null;
        }
        boolean zIsEmpty = jVar.f319395l.isEmpty();
        Tabs tabs = d3().d;
        List list = uiState.f255198b;
        String str = uiState.f255199c;
        tabs.setVisibility(list.size() > 1 ? 0 : 8);
        d3().f207130b.setMenuItems(uiState.d);
        j jVar2 = this.T;
        if (jVar2 == null) {
            Intrinsics.r("pagerAdapter");
            throw null;
        }
        jVar2.c(uiState.f255197a);
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((com.revolut.core.ui_kit.views.q) it8.next()).f59614a, str)) {
                break;
            } else {
                i++;
            }
        }
        boolean z = !zIsEmpty;
        g gVar = this.V;
        gVar.f255184a = -1;
        ViewPager2 backgroundCataloguePager = d3().f207131c;
        Intrinsics.checkNotNullExpressionValue(backgroundCataloguePager, "backgroundCataloguePager");
        if (zIsEmpty) {
            backgroundCataloguePager.setCurrentItem(i, false);
        } else {
            int currentItem = backgroundCataloguePager.getCurrentItem();
            if (Math.abs(currentItem - i) > 3) {
                RecyclerView recyclerViewA = j0.a(backgroundCataloguePager);
                int i2 = i > currentItem ? i - 1 : i + 1;
                gVar.f255184a = i;
                recyclerViewA.scrollToPosition(i2);
                recyclerViewA.post(new k0(recyclerViewA, i, 1));
            } else {
                d3().f207131c.setCurrentItem(i, true);
            }
        }
        Tabs backgroundCatalogueTabs = d3().d;
        Intrinsics.checkNotNullExpressionValue(backgroundCatalogueTabs, "backgroundCatalogueTabs");
        Tabs.setItems$default(backgroundCatalogueTabs, list, null, 2, null);
        if (str != null) {
            Tabs backgroundCatalogueTabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(backgroundCatalogueTabs2, "backgroundCatalogueTabs");
            Tabs.u(backgroundCatalogueTabs2, uiState.f255199c, z, false, false, 12);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (pm2.a) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.T = new j(6, u.c((ContainerDelegate) this.S.getValue()), false);
        ViewPager2 viewPager2 = d3().f207131c;
        j jVar = this.T;
        if (jVar == null) {
            Intrinsics.r("pagerAdapter");
            throw null;
        }
        viewPager2.setAdapter(jVar);
        BasicNavBar basicNavBar = d3().f207130b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.background_picker_catalogue_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().f207131c.unregisterOnPageChangeCallback(this.V);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ContainerDelegate) this.S.getValue()).f), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f51691c), null, new d(this, continuation, 0), 3);
        BackgroundSelectionDelegate backgroundSelectionDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(backgroundSelectionDelegate.f51692c), null, new rm2.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(backgroundSelectionDelegate.d), null, new f(this, null), 3);
        int i = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f207130b.f59211b), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f58882b), null, new d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f207130b.f59210a.f57403b), null, new d(this, continuation, 2), 3);
        d3().f207131c.registerOnPageChangeCallback(this.V);
    }

    public final mm2.a d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mm2.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final rm2.j d() {
        return (rm2.j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.e) this.O.getValue();
    }
}
