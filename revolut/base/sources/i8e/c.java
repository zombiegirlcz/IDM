package i8e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159517b;

    public c(String subaccountName, boolean z) {
        Intrinsics.checkNotNullParameter(subaccountName, "subaccountName");
        this.f159516a = subaccountName;
        this.f159517b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f159516a, cVar.f159516a) && this.f159517b == cVar.f159517b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159517b) + (this.f159516a.hashCode() * 31);
    }
}
