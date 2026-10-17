package loa;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f197430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f197431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197432c;

    public d() {
        this(0);
    }

    public static d a(d dVar, LinkedHashMap linkedHashMap, List list, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = dVar.f197430a;
        }
        if ((i & 2) != 0) {
            list = dVar.f197431b;
        }
        boolean z = (i & 4) != 0 ? dVar.f197432c : true;
        dVar.getClass();
        return new d(map, list, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f197430a, dVar.f197430a) && Intrinsics.f(this.f197431b, dVar.f197431b) && this.f197432c == dVar.f197432c;
    }

    public final int hashCode() {
        Map map = this.f197430a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List list = this.f197431b;
        return Boolean.hashCode(this.f197432c) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public /* synthetic */ d(int i) {
        this(null, null, false);
    }

    public d(Map map, List list, boolean z) {
        this.f197430a = map;
        this.f197431b = list;
        this.f197432c = z;
    }
}
