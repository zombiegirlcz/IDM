package h29;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148744a;

    public e(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.f148744a = raw;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f148744a, ((e) obj2).f148744a);
    }

    public final int hashCode() {
        return this.f148744a.hashCode();
    }
}
