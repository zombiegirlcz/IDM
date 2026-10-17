package kr2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188638b;

    public b(int i, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f188637a = i;
        this.f188638b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f188637a == bVar.f188637a && Intrinsics.f(this.f188638b, bVar.f188638b);
    }

    public final int hashCode() {
        return this.f188638b.hashCode() + (Integer.hashCode(this.f188637a) * 31);
    }
}
