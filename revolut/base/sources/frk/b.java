package frk;

import com.revolut.feature.robo.impl.data.network.TemplateService;
import com.revolut.retail.feature.stockdetails.impl.data.network.StockInsightsService;
import dp4.f1;
import fjd.w;
import fna.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import o29.l;
import pfk.o0;
import pfk.q;
import pij.d1;
import plb.g;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137488a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f137489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f137490c;
    public final Object d;
    public final j e;

    public b(TemplateService service, ne0.d cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.d = service;
        this.e = cache;
        this.f137489b = storage;
        this.f137490c = new x4l.c(new l(this, null, 26), new d1(this, 12), new g(this, 2), new o0(this, (Continuation) null, 14), new q(this, null, 8));
    }

    public static String a(String str) {
        return j6.a.q("RISK_METRICS_", str);
    }

    public static String b(String str) {
        return j6.a.q("ANALYST_RATINGS_INSIGHT_", str);
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f137488a) {
        }
        return this.f137490c;
    }

    public b(StockInsightsService service, j cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.d = service;
        this.e = cache;
        this.f137489b = storage;
        Continuation continuation = null;
        this.f137490c = new x4l.c(new a(this, continuation, 0), new w(this, 28), new fgj.g(this, 25), new f(this, null, 7), new f1(this, continuation, 19));
    }
}
