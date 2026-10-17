package d9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class m0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0 f112307c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f112308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f112309b;

    static {
        z0 z0Var = z0.DEFAULT;
        f112307c = new m0(z0Var, z0Var);
    }

    public m0(z0 z0Var, z0 z0Var2) {
        this.f112308a = z0Var;
        this.f112309b = z0Var2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 != null && obj2.getClass() == m0.class) {
            m0 m0Var = (m0) obj2;
            if (m0Var.f112308a == this.f112308a && m0Var.f112309b == this.f112309b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f112308a.ordinal() + (this.f112309b.ordinal() << 2);
    }

    public final String toString() {
        return "JsonSetter.Value(valueNulls=" + this.f112308a + ",contentNulls=" + this.f112309b + ")";
    }
}
