package nel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String rawValue) {
        super(rawValue);
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f214616b = rawValue;
    }

    @Override // nel.t
    public final String a() {
        return this.f214616b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f214616b, ((s) obj2).f214616b);
    }

    public final int hashCode() {
        return this.f214616b.hashCode();
    }
}
