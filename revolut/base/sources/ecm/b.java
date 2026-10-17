package ecm;

import com.google.common.base.Objects;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f124779b = new b(new IdentityHashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f124780a;

    public b(IdentityHashMap identityHashMap) {
        this.f124780a = identityHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || b.class != obj2.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((b) obj2).f124780a;
        IdentityHashMap identityHashMap2 = this.f124780a;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !Objects.equal(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f124780a.entrySet()) {
            iHashCode += Objects.hashCode(entry.getKey(), entry.getValue());
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f124780a.toString();
    }
}
