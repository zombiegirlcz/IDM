package d9;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class v implements Serializable {
    public static final v f = new v(Collections.EMPTY_SET, false, false, false, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f112319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112321c;
    public final boolean d;
    public final boolean e;

    public v(Set set, boolean z, boolean z3, boolean z4, boolean z6) {
        if (set == null) {
            this.f112319a = Collections.EMPTY_SET;
        } else {
            this.f112319a = set;
        }
        this.f112320b = z;
        this.f112321c = z3;
        this.d = z4;
        this.e = z6;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 != null && obj2.getClass() == v.class) {
            v vVar = (v) obj2;
            if (this.f112320b == vVar.f112320b && this.e == vVar.e && this.f112321c == vVar.f112321c && this.d == vVar.d && this.f112319a.equals(vVar.f112319a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f112319a.size() + (this.f112320b ? 1 : -3) + (this.f112321c ? 3 : -7) + (this.d ? 7 : -11) + (this.e ? 11 : -13);
    }

    public final String toString() {
        return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f112319a, Boolean.valueOf(this.f112320b), Boolean.valueOf(this.f112321c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }
}
