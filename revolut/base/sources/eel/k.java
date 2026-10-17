package eel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f125233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f125234c;
    public final h d;
    public final i e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f125235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f125236h;

    public /* synthetic */ k(List list, long j2, long j3, h hVar, i iVar, Map map, HashMap map2, int i) {
        this(list, j2, j3, hVar, iVar, map, (i & 64) != 0 ? null : map2, (Integer) null);
    }

    public static k a(k kVar, List points, long j2, long j3, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Integer num, int i) {
        h hVar = kVar.d;
        i valueType = kVar.e;
        Map map = (i & 32) != 0 ? kVar.f : linkedHashMap;
        Map map2 = (i & 64) != 0 ? kVar.f125235g : linkedHashMap2;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        return new k(points, j2, j3, hVar, valueType, map, map2, num);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f125232a, kVar.f125232a) && this.f125233b == kVar.f125233b && this.f125234c == kVar.f125234c && Intrinsics.f(this.d, kVar.d) && this.e == kVar.e && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f125235g, kVar.f125235g) && Intrinsics.f(this.f125236h, kVar.f125236h);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(this.f125232a.hashCode() * 31, 31, this.f125233b), 31, this.f125234c);
        h hVar = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31;
        Map map = this.f;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f125235g;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num = this.f125236h;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public k(List points, long j2, long j3, h hVar, i valueType, Map map, Map map2, Integer num) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.f125232a = points;
        this.f125233b = j2;
        this.f125234c = j3;
        this.d = hVar;
        this.e = valueType;
        this.f = map;
        this.f125235g = map2;
        this.f125236h = num;
    }
}
