package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueEmbeddedScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ge1.c;
import ge1.d;
import ge1.h;
import ge1.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld1.z;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/CatalogueEmbeddedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/catalogue/a;", "Ldli/a;", "Lge1/i;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CatalogueEmbeddedScreen extends ViewController<a> implements dli.a {
    public final CatalogueScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final ListSubheaderDelegate N;
    public final ExtraSmallCardDelegate O;
    public final GridBoxDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CatalogueEmbeddedScreen(CatalogueScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_catalogue;
        this.M = new FullScreenStateDelegate();
        this.N = new ListSubheaderDelegate();
        ExtraSmallCardDelegate.INSTANCE.getClass();
        final int i = 2;
        ExtraSmallCardDelegate extraSmallCardDelegate = new ExtraSmallCardDelegate(2);
        this.O = extraSmallCardDelegate;
        final int i2 = 0;
        final int i3 = 1;
        this.P = new GridBoxDelegate(v.k(extraSmallCardDelegate, new SmallCardLoadingDelegate(ExtraSmallCardDelegate.f52286h)), 8.0f, 8.0f, 3);
        this.Q = w.y0(new Function0(this) { // from class: ge1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueEmbeddedScreen f143207b;

            {
                this.f143207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                CatalogueEmbeddedScreen catalogueEmbeddedScreen = this.f143207b;
                switch (i5) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(catalogueEmbeddedScreen.m2()).a().get(ld1.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ld1.l.class, " is not found"));
                        }
                        ld1.l lVar = ((ld1.l) aVar2.b()).f;
                        CatalogueScreenContract$InputData catalogueScreenContract$InputData = catalogueEmbeddedScreen.K;
                        catalogueScreenContract$InputData.getClass();
                        return new z(lVar, catalogueScreenContract$InputData);
                    case 1:
                        return (h) ((z) catalogueEmbeddedScreen.Q.getValue()).f194016c.get();
                    default:
                        CatalogueEmbeddedScreen catalogueEmbeddedScreen2 = this.f143207b;
                        return dli.f.a(catalogueEmbeddedScreen2, catalogueEmbeddedScreen2.R2(), v.k(new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), catalogueEmbeddedScreen2.M, catalogueEmbeddedScreen2.P, catalogueEmbeddedScreen2.N, catalogueEmbeddedScreen2.O), R$id.catalogueScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new Function0(this) { // from class: ge1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueEmbeddedScreen f143207b;

            {
                this.f143207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                CatalogueEmbeddedScreen catalogueEmbeddedScreen = this.f143207b;
                switch (i5) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(catalogueEmbeddedScreen.m2()).a().get(ld1.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ld1.l.class, " is not found"));
                        }
                        ld1.l lVar = ((ld1.l) aVar2.b()).f;
                        CatalogueScreenContract$InputData catalogueScreenContract$InputData = catalogueEmbeddedScreen.K;
                        catalogueScreenContract$InputData.getClass();
                        return new z(lVar, catalogueScreenContract$InputData);
                    case 1:
                        return (h) ((z) catalogueEmbeddedScreen.Q.getValue()).f194016c.get();
                    default:
                        CatalogueEmbeddedScreen catalogueEmbeddedScreen2 = this.f143207b;
                        return dli.f.a(catalogueEmbeddedScreen2, catalogueEmbeddedScreen2.R2(), v.k(new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), catalogueEmbeddedScreen2.M, catalogueEmbeddedScreen2.P, catalogueEmbeddedScreen2.N, catalogueEmbeddedScreen2.O), R$id.catalogueScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new Function0(this) { // from class: ge1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CatalogueEmbeddedScreen f143207b;

            {
                this.f143207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                CatalogueEmbeddedScreen catalogueEmbeddedScreen = this.f143207b;
                switch (i5) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(catalogueEmbeddedScreen.m2()).a().get(ld1.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ld1.l.class, " is not found"));
                        }
                        ld1.l lVar = ((ld1.l) aVar2.b()).f;
                        CatalogueScreenContract$InputData catalogueScreenContract$InputData = catalogueEmbeddedScreen.K;
                        catalogueScreenContract$InputData.getClass();
                        return new z(lVar, catalogueScreenContract$InputData);
                    case 1:
                        return (h) ((z) catalogueEmbeddedScreen.Q.getValue()).f194016c.get();
                    default:
                        CatalogueEmbeddedScreen catalogueEmbeddedScreen2 = this.f143207b;
                        return dli.f.a(catalogueEmbeddedScreen2, catalogueEmbeddedScreen2.R2(), v.k(new ListSubheaderLoadingDelegate(), new RowDelegate(null, null, 7), catalogueEmbeddedScreen2.M, catalogueEmbeddedScreen2.P, catalogueEmbeddedScreen2.N, catalogueEmbeddedScreen2.O), R$id.catalogueScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new ge1.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52707c), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final h R2() {
        return (h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        m2().getWindow().setSoftInputMode(48);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    public CatalogueEmbeddedScreen() {
        this(new CatalogueScreenContract$InputData(false));
    }
}
