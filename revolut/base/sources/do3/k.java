package do3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116405a;

    public k(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f116405a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f116405a, ((k) obj2).f116405a);
    }

    public final int hashCode() {
        return this.f116405a.hashCode();
    }
}
