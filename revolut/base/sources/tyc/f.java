package tyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275544a;

    public f(String userDefinedType) {
        Intrinsics.checkNotNullParameter(userDefinedType, "userDefinedType");
        this.f275544a = userDefinedType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f275544a, ((f) obj2).f275544a);
    }

    public final int hashCode() {
        return this.f275544a.hashCode();
    }
}
