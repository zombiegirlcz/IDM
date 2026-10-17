package tyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275543a;

    public e(String userDefinedType) {
        Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
        this.f275543a = userDefinedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f275543a, ((e) obj2).f275543a);
    }

    public final int hashCode() {
        return this.f275543a.hashCode();
    }
}
