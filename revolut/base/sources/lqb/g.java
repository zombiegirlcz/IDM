package lqb;

import bih.l;
import cle.h;
import com.revolut.kompot.navigable.vc.ViewController;
import fsl.o;
import ish.a0;
import kka.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mk0.p;
import mri.w;
import q30.i;
import skm.e0;
import skm.p0;
import vc.s;
import whh.k;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f199295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f199296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f199297c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f199298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f199299h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f199300j;
    public Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f199301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f199302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f199303n;
    public Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f199304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f199305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f199306r;

    public g(zfe.b accountsPresentationPrefetcher, CoroutineScope appCoroutineScope, cm2.f backgroundLoader, i chatIntroPrefetcher, zd0.b currencyInfoInitializer, fk3.a configurationInteractor, jte.c experimentsFetchingInteractor, xoj.a featuresInteractor, phi.a kompotBridgeStorageApiDependency, yii.c persistentModelStateStorage, p personalisationStorageLoader, j productArticlePrefetchInteractor, fn2.c productCatalogueLoader, ang.c userCompanyLoader, a61.a retailAppShortcutsInitializer, ekg.g uiPersonalisationInteractor, a0 widgetsUiInteractor, w revolutJobInteractor) {
        Intrinsics.checkNotNullParameter(accountsPresentationPrefetcher, "accountsPresentationPrefetcher");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(backgroundLoader, "backgroundLoader");
        Intrinsics.checkNotNullParameter(chatIntroPrefetcher, "chatIntroPrefetcher");
        Intrinsics.checkNotNullParameter(currencyInfoInitializer, "currencyInfoInitializer");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(experimentsFetchingInteractor, "experimentsFetchingInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(kompotBridgeStorageApiDependency, "kompotBridgeStorageApiDependency");
        Intrinsics.checkNotNullParameter(persistentModelStateStorage, "persistentModelStateStorage");
        Intrinsics.checkNotNullParameter(personalisationStorageLoader, "personalisationStorageLoader");
        Intrinsics.checkNotNullParameter(productArticlePrefetchInteractor, "productArticlePrefetchInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(userCompanyLoader, "userCompanyLoader");
        Intrinsics.checkNotNullParameter(retailAppShortcutsInitializer, "retailAppShortcutsInitializer");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        this.f199295a = accountsPresentationPrefetcher;
        this.f199296b = appCoroutineScope;
        this.f199297c = backgroundLoader;
        this.d = chatIntroPrefetcher;
        this.e = currencyInfoInitializer;
        this.f = configurationInteractor;
        this.f199298g = experimentsFetchingInteractor;
        this.f199299h = featuresInteractor;
        this.i = persistentModelStateStorage;
        this.f199300j = personalisationStorageLoader;
        this.k = productArticlePrefetchInteractor;
        this.f199301l = productCatalogueLoader;
        this.f199302m = userCompanyLoader;
        this.f199303n = retailAppShortcutsInitializer;
        this.o = uiPersonalisationInteractor;
        this.f199304p = widgetsUiInteractor;
        this.f199305q = revolutJobInteractor;
        p0 p0Var = p0.f264001a;
        this.f199306r = e0.D(appCoroutineScope, elm.f.f127540b);
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    public Object b(o9b.a aVar) {
        zkm.d dVar = (zkm.d) this.f199306r;
        Continuation continuation = null;
        e0.C(dVar, null, null, new b(this, continuation, 0), 3);
        e0.C(dVar, null, null, new b(this, continuation, 1), 3);
        e0.C(dVar, null, null, new b(this, continuation, 2), 3);
        e0.C(dVar, null, null, new b(this, continuation, 3), 3);
        e0.C(dVar, null, null, new b(this, continuation, 4), 3);
        e0.C(dVar, null, null, new b(this, continuation, 5), 3);
        e0.C(dVar, null, null, new b(this, continuation, 6), 3);
        e0.C(dVar, null, null, new a(this, continuation, 1), 3);
        Object objO = e0.o(new c(this, continuation, 0), aVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objO != aVar2) {
            objO = Unit.f186387a;
        }
        return objO == aVar2 ? objO : Unit.f186387a;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        s.h((ViewController) this.f199296b, ViewController.class);
        s.h((sdf.c) this.f199297c, sdf.c.class);
        s.h((ncf.a) this.d, ncf.a.class);
        s.h((l) this.e, l.class);
        s.h((mkd.g) this.f, mkd.g.class);
        s.h((ash.j) this.f199298g, ash.j.class);
        s.h((b2b.e) this.f199299h, b2b.e.class);
        s.h((o5d.b) this.i, o5d.b.class);
        s.h((d1h.j) this.f199300j, d1h.j.class);
        s.h((rle.e) this.k, rle.e.class);
        s.h((o) this.f199301l, o.class);
        s.h((gih.b) this.f199302m, gih.b.class);
        s.h((k) this.f199303n, k.class);
        s.h((sxk.c) this.o, sxk.c.class);
        s.h((h) this.f199304p, h.class);
        s.h((fih.b) this.f199305q, fih.b.class);
        s.h((dtl.d) this.f199306r, dtl.d.class);
        return new ske.d((ske.c) this.f199295a, new d28.g(), (ViewController) this.f199296b, (sdf.c) this.f199297c, (ncf.a) this.d, (l) this.e, (mkd.g) this.f, (ash.j) this.f199298g, (b2b.e) this.f199299h, (o5d.b) this.i, (d1h.j) this.f199300j, (rle.e) this.k, (o) this.f199301l, (gih.b) this.f199302m, (k) this.f199303n, (sxk.c) this.o, (h) this.f199304p, (fih.b) this.f199305q, (dtl.d) this.f199306r);
    }

    public g(ske.c cVar) {
        this.f199295a = cVar;
    }
}
