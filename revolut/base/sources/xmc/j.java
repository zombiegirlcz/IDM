package xmc;

import com.revolut.data.model.Data;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f307138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f307139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f307140c;

    public j() {
        this(null, null, null);
    }

    public static j a(j jVar, Data data, Data data2, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            data = jVar.f307138a;
        }
        if ((i & 2) != 0) {
            data2 = jVar.f307139b;
        }
        Map map = linkedHashMap;
        if ((i & 4) != 0) {
            map = jVar.f307140c;
        }
        jVar.getClass();
        return new j(data, data2, map);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f307138a, jVar.f307138a) && Intrinsics.f(this.f307139b, jVar.f307139b) && Intrinsics.f(this.f307140c, jVar.f307140c);
    }

    public final int hashCode() {
        Data data = this.f307138a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f307139b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Map map = this.f307140c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public j(Data data, Data data2, Map map) {
        this.f307138a = data;
        this.f307139b = data2;
        this.f307140c = map;
    }
}
