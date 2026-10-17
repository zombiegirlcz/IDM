package nr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218559b;

    public g(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f218558a = name;
        this.f218559b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f218558a, gVar.f218558a) && Intrinsics.f(this.f218559b, gVar.f218559b);
    }

    public final int hashCode() {
        return this.f218559b.hashCode() + (this.f218558a.hashCode() * 31);
    }
}
