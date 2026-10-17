package z9m;

import android.webkit.JavascriptInterface;
import cam.t;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f320519a;

    public d(e eVar) {
        this.f320519a = eVar;
    }

    @JavascriptInterface
    public final void complete() {
        e eVar = this.f320519a;
        if (eVar.f320523g) {
            return;
        }
        eVar.f320523g = true;
        t tVar = eVar.f320522c;
        cam.i type = cam.i.visible;
        b bVar = eVar.i;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        tVar.v(type.name(), bVar);
        cam.i type2 = cam.i.locationchange;
        a aVar = eVar.f320524h;
        Intrinsics.checkNotNullParameter(type2, "type");
        tVar.v(type2.name(), aVar);
        cam.i type3 = cam.i.domchange;
        Intrinsics.checkNotNullParameter(type3, "type");
        tVar.v(type3.name(), aVar);
        e0.C(eVar.f320520a.f112593j, null, null, new b(eVar, null, 2), 3);
    }
}
