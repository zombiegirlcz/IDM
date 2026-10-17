package bs2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18027b;

    public c(String merchantName, boolean z) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f18026a = merchantName;
        this.f18027b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f18026a, cVar.f18026a) && this.f18027b == cVar.f18027b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18027b) + (this.f18026a.hashCode() * 31);
    }
}
