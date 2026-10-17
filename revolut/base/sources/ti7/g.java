package ti7;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271437b;

    public g(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f271436a = name;
        this.f271437b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f271436a, gVar.f271436a) && Intrinsics.f(this.f271437b, gVar.f271437b);
    }

    public final int hashCode() {
        return this.f271437b.hashCode() + (this.f271436a.hashCode() * 31);
    }
}
