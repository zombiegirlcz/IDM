package g1m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1m.b f139746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f139747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f139748c;
    public final String d;

    public k(h1m.b payload, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j2));
        this.f139747b = arrayList;
        this.f139746a = payload;
        this.f139748c = z;
        HashMap map = payload.f148612b;
        String str = null;
        map = map == null ? null : map;
        if (map != null) {
            Object obj2 = map.get("ua");
            if (obj2 instanceof String) {
                str = (String) obj2;
            }
        }
        this.d = str;
    }

    public k(ArrayList payloads, ArrayList emitterEventIds) {
        String str;
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Intrinsics.checkNotNullParameter(emitterEventIds, "emitterEventIds");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        loop0: while (true) {
            str = null;
            while (it8.hasNext()) {
                h1m.b bVar = (h1m.b) it8.next();
                arrayList.add(bVar.f148612b);
                HashMap map = bVar.f148612b;
                if (map == null) {
                    map = null;
                }
                if (map != null) {
                    Object obj2 = map.get("ua");
                    str = obj2 instanceof String ? (String) obj2 : str;
                }
            }
            break loop0;
        }
        h1m.b bVar2 = new h1m.b();
        this.f139746a = bVar2;
        HashMap map2 = new h1m.a("iglu:com.snowplowanalytics.snowplow/payload_data/jsonschema/1-0-4", arrayList).f148610a;
        HashMap map3 = map2 != null ? map2 : null;
        if (map3 != null) {
            bVar2.c(map3);
        }
        this.f139747b = emitterEventIds;
        this.d = str;
        this.f139748c = false;
    }
}
