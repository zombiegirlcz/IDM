package nel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String rawValue) {
        super(rawValue);
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f214576b = rawValue;
    }

    @Override // nel.i0
    public final String a() {
        return this.f214576b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f214576b, ((h0) obj2).f214576b);
    }

    public final int hashCode() {
        return this.f214576b.hashCode();
    }
}
