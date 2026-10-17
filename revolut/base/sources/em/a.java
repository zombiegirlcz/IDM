package em;

import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import sgm.j1;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f127555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f127556b;

    public a(String productName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f127555a = productName;
        this.f127556b = str;
    }

    public String a() {
        String[] elements = {(String) this.f127555a, b()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), ".", null, null, 0, null, 62);
    }

    public String b() {
        return (String) this.f127556b;
    }

    public void c(Object obj2) {
        ug.a aVar = (ug.a) ((HashMap) this.f127556b).get(obj2);
        if (aVar != null) {
            ug.c cVar = aVar.f279912b;
            if (aVar.f279911a.remove(obj2)) {
                ((HashMap) cVar.f127556b).remove(obj2);
                ((Marker) obj2).remove();
            }
        }
    }

    public a(Paint paint, cm.a aVar) {
        this.f127555a = paint;
        this.f127556b = aVar;
    }

    public a(GoogleMap googleMap) {
        new HashMap();
        this.f127556b = new HashMap();
        this.f127555a = googleMap;
        new Handler(Looper.getMainLooper()).post(new j1(this, 6));
    }
}
