package d9;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class z implements Serializable {
    public static final z e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f112322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f112323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f112324c;
    public final Class d;

    static {
        y yVar = y.USE_DEFAULTS;
        e = new z(yVar, yVar, null, null);
    }

    public z(y yVar, y yVar2, Class cls, Class cls2) {
        this.f112322a = yVar == null ? y.USE_DEFAULTS : yVar;
        this.f112323b = yVar2 == null ? y.USE_DEFAULTS : yVar2;
        this.f112324c = cls == Void.class ? null : cls;
        this.d = cls2 == Void.class ? null : cls2;
    }

    public final z a(z zVar) {
        if (zVar != null && zVar != e) {
            y yVar = zVar.f112322a;
            y yVar2 = zVar.f112323b;
            Class cls = zVar.f112324c;
            Class cls2 = zVar.d;
            y yVar3 = this.f112322a;
            boolean z = (yVar == yVar3 || yVar == y.USE_DEFAULTS) ? false : true;
            y yVar4 = this.f112323b;
            boolean z3 = (yVar2 == yVar4 || yVar2 == y.USE_DEFAULTS) ? false : true;
            Class cls3 = this.f112324c;
            boolean z4 = (cls == cls3 && cls2 == cls3) ? false : true;
            if (z) {
                return z3 ? new z(yVar, yVar2, cls, cls2) : new z(yVar, yVar4, cls, cls2);
            }
            if (z3) {
                return new z(yVar3, yVar2, cls, cls2);
            }
            if (z4) {
                return new z(yVar3, yVar4, cls, cls2);
            }
        }
        return this;
    }

    public final z b(y yVar) {
        if (yVar == this.f112322a) {
            return this;
        }
        return new z(yVar, this.f112323b, this.f112324c, this.d);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != z.class) {
            return false;
        }
        z zVar = (z) obj2;
        return zVar.f112322a == this.f112322a && zVar.f112323b == this.f112323b && zVar.f112324c == this.f112324c && zVar.d == this.d;
    }

    public final int hashCode() {
        return this.f112323b.hashCode() + (this.f112322a.hashCode() << 2);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(80);
        sb6.append("JsonInclude.Value(value=");
        sb6.append(this.f112322a);
        sb6.append(",content=");
        sb6.append(this.f112323b);
        Class cls = this.f112324c;
        if (cls != null) {
            sb6.append(",valueFilter=");
            sb6.append(cls.getName());
            sb6.append(".class");
        }
        Class cls2 = this.d;
        if (cls2 != null) {
            sb6.append(",contentFilter=");
            sb6.append(cls2.getName());
            sb6.append(".class");
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }
}
