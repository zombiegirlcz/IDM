package vjl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f289818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f289819c;

    public m(String value, String unmaskedValue, Boolean bool) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(unmaskedValue, "unmaskedValue");
        this.f289817a = value;
        this.f289818b = bool;
        this.f289819c = unmaskedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f289817a, mVar.f289817a) && Intrinsics.f(this.f289818b, mVar.f289818b) && Intrinsics.f(this.f289819c, mVar.f289819c);
    }

    public final int hashCode() {
        int iHashCode = this.f289817a.hashCode() * 31;
        Boolean bool = this.f289818b;
        return this.f289819c.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }
}
