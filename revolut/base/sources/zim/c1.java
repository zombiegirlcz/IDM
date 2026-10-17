package zim;

import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class c1 implements Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type[] f322613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f322614b;

    public c1(Type[] types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f322613a = types;
        this.f322614b = Arrays.hashCode(types);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof c1) {
            return Arrays.equals(this.f322613a, ((c1) obj2).f322613a);
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return kotlin.collections.d.d0(this.f322613a, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f322614b;
    }

    public final String toString() {
        return getTypeName();
    }
}
