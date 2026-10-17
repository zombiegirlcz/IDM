package qz0;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import i8.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements i8.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk0.a f250325c;
    public final Pair d;
    public final UrlImage.CustomHeaders e;
    public volatile Map f;

    public g(String url2, bk0.a aVar, Pair pair, UrlImage.CustomHeaders customHeaders) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f250324b = url2;
        this.f250325c = aVar;
        this.d = pair;
        this.e = customHeaders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!g.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.glide.RevolutGlideHeaders");
        g gVar = (g) obj2;
        return Intrinsics.f(this.f250324b, gVar.f250324b) && Intrinsics.f(this.f250325c, gVar.f250325c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    @Override // i8.l
    public final Map getHeaders() {
        boolean z;
        Map f60033a;
        Map mapG = this.f;
        if (mapG == null) {
            UrlImage.CustomHeaders customHeaders = this.e;
            Pair pair = this.d;
            LinkedHashMap linkedHashMapZ = (customHeaders == null || (f60033a = customHeaders.getF60033a()) == null) ? null : r0.z(f60033a);
            if (pair == null && (linkedHashMapZ == null || linkedHashMapZ.isEmpty())) {
                linkedHashMapZ = null;
            } else {
                if (linkedHashMapZ == null) {
                    linkedHashMapZ = new LinkedHashMap();
                }
                if (pair != null) {
                    linkedHashMapZ.put(pair.f186385a, pair.f186386b);
                }
            }
            if (linkedHashMapZ == null) {
                linkedHashMapZ = new LinkedHashMap();
            }
            try {
                bk0.a aVar = this.f250325c;
                Map mapA = aVar != null ? aVar.a(this.f250324b) : null;
                if (mapA != null) {
                    linkedHashMapZ.putAll(mapA);
                }
                z = false;
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                z = true;
            }
            if (linkedHashMapZ.isEmpty()) {
                mapG = r0.g();
            } else {
                i8.m mVar = new i8.m();
                for (Map.Entry entry : linkedHashMapZ.entrySet()) {
                    String str = (String) entry.getKey();
                    i8.n nVar = new i8.n((String) entry.getValue());
                    if (mVar.f159387c && "User-Agent".equalsIgnoreCase(str)) {
                        mVar.a();
                        List arrayList = (List) mVar.f159386b.get(str);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            mVar.f159386b.put(str, arrayList);
                        }
                        arrayList.clear();
                        arrayList.add(nVar);
                        if (mVar.f159387c && "User-Agent".equalsIgnoreCase(str)) {
                            mVar.f159387c = false;
                        }
                    } else {
                        mVar.a();
                        List arrayList2 = (List) mVar.f159386b.get(str);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            mVar.f159386b.put(str, arrayList2);
                        }
                        arrayList2.add(nVar);
                    }
                }
                mVar.f159385a = true;
                mapG = new o(mVar.f159386b).getHeaders();
                Intrinsics.i(mapG, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
            if (!z) {
                this.f = mapG;
            }
        }
        return mapG;
    }

    public final int hashCode() {
        int iHashCode = this.f250324b.hashCode() * 31;
        bk0.a aVar = this.f250325c;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Pair pair = this.d;
        int iHashCode3 = (iHashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        UrlImage.CustomHeaders customHeaders = this.e;
        return iHashCode3 + (customHeaders != null ? customHeaders.hashCode() : 0);
    }
}
