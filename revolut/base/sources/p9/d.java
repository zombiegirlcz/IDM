package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends f {
    public final transient Field d;

    public d(i0 i0Var, Field field, q qVar) {
        super(i0Var, qVar);
        this.d = field;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!x9.f.n(obj2, d.class)) {
            return false;
        }
        Field field = ((d) obj2).d;
        Field field2 = this.d;
        return field == null ? field2 == null : field.equals(field2);
    }

    @Override // p9.p
    public final Class f() {
        return this.d.getType();
    }

    @Override // p9.p
    public final String getName() {
        return this.d.getName();
    }

    @Override // p9.p
    public final JavaType h() {
        return this.f234212b.a(this.d.getGenericType());
    }

    public final int hashCode() {
        return this.d.getName().hashCode();
    }

    @Override // p9.f
    public final Class n() {
        return this.d.getDeclaringClass();
    }

    @Override // p9.f
    public final Member p() {
        return this.d;
    }

    @Override // p9.f
    public final Object q(Object obj2) {
        try {
            return this.d.get(obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Failed to getValue() for field " + o() + ": " + e.getMessage(), e);
        }
    }

    @Override // p9.f
    public final p t(q qVar) {
        return new d(this.f234212b, this.d, qVar);
    }

    public final String toString() {
        return "[field " + o() + "]";
    }
}
