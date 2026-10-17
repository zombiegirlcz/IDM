package qlm;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class v0 implements Map.Entry, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f247716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f247717b;

    public v0(Object obj2, Object obj3) {
        this.f247716a = obj2;
        this.f247717b = obj3;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f247716a, v0Var.f247716a) && Intrinsics.f(this.f247717b, v0Var.f247717b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f247716a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f247717b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj2 = this.f247716a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f247717b;
        return iHashCode + (obj3 != null ? obj3.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f247716a + ", value=" + this.f247717b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
