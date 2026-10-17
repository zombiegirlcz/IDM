package ys5;

import kotlin.jvm.internal.Intrinsics;
import pt5.t;
import te0.w;
import yna.j1;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f316408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.b f316409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yk0.c f316410c;
    public final pu5.e d;
    public final ss5.a e;
    public final ps5.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f316411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f316412h;

    public h(thf.g transactionItemMapper, whf.b transactionsContentProvider, yk0.c defaultTransactionsFilterProvider, pu5.e cryptoTransactionDetailsNavigator, ss5.a cryptoFeedWidgetsEventDispatcher, ps5.d transactionsWidgetCatalogueProvider) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(defaultTransactionsFilterProvider, "defaultTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(cryptoTransactionDetailsNavigator, "cryptoTransactionDetailsNavigator");
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(transactionsWidgetCatalogueProvider, "transactionsWidgetCatalogueProvider");
        this.f316408a = transactionItemMapper;
        this.f316409b = transactionsContentProvider;
        this.f316410c = defaultTransactionsFilterProvider;
        this.d = cryptoTransactionDetailsNavigator;
        this.e = cryptoFeedWidgetsEventDispatcher;
        this.f = transactionsWidgetCatalogueProvider;
        this.f316411g = w.y0(new j1(15));
        this.f316412h = w.y0(new yq0.e(this, 7));
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    public final f a(t tVar, lt5.a source, q46.a aVar, o46.b bVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        sr5.a aVar2 = bVar;
        if (bVar == null) {
            aVar2 = (g) this.f316412h.getValue();
        }
        sr5.a aVar3 = aVar2;
        if (tVar == null) {
            tVar = (t) this.f316410c.get();
        }
        t tVar2 = tVar;
        if (aVar == null) {
            aVar = (q46.a) this.f316411g.getValue();
        }
        return new f(aVar3, this.d, tVar2, source, aVar);
    }
}
