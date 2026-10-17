package iyl;

import android.webkit.WebView;
import hyl.p;
import hyl.q;
import hyl.r;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import r10.w;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f169782b;

    public /* synthetic */ a(WebView webView, c cVar) {
        this.f169781a = 1;
        this.f169782b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        int i = this.f169781a;
        c cVar = this.f169782b;
        switch (i) {
            case 0:
                cVar.f169786h.onNext(new e((String) obj2));
                return Unit.f186387a;
            case 1:
                String json = (String) obj2;
                int i2 = c.f169785s;
                Intrinsics.checkNotNullParameter(json, "labelData");
                try {
                    m.Companion companion = m.INSTANCE;
                    w wVar = cVar.i;
                    wVar.getClass();
                    Intrinsics.checkNotNullParameter(json, "json");
                    objA = (gyl.h) ((Json) wVar.f250866b).b(gyl.h.Companion.serializer(), json);
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                if (m.a(objA) != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "GlobeJavaScriptInterface", "onMarkerLabel deserialisation failed", null, null, 16);
                }
                if (objA instanceof n) {
                    objA = null;
                }
                gyl.h hVar = (gyl.h) objA;
                if (hVar != null) {
                    cVar.f169786h.onNext(new g(hVar.f147923a));
                }
                return Unit.f186387a;
            default:
                r callback = (r) obj2;
                int i3 = c.f169785s;
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (callback instanceof q) {
                    cVar.o = true;
                    cVar.d();
                } else {
                    if (!Intrinsics.f(callback, p.f156928a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.f169786h.onNext(new f("AssetLoadFailed", "GlobeWebViewClient"));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(c cVar, int i) {
        this.f169781a = i;
        this.f169782b = cVar;
    }
}
