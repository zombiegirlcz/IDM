package d9;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f112303b = new b0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f112304a;

    public b0(Set set) {
        this.f112304a = set;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 != null && obj2.getClass() == b0.class) {
            Set set = ((b0) obj2).f112304a;
            Set set2 = this.f112304a;
            if (set2 == null ? set == null : set2.equals(set)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = this.f112304a;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public final String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s)", this.f112304a);
    }
}
