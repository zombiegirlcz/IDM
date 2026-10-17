package cjl;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24716b;

    public m(LinkedHashMap linkedHashMap, String operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f24715a = operation;
        this.f24716b = linkedHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f24715a, mVar.f24715a) && Intrinsics.f(this.f24716b, mVar.f24716b);
    }

    public final int hashCode() {
        int iHashCode = this.f24715a.hashCode() * 31;
        Map map = this.f24716b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
