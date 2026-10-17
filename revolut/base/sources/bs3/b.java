package bs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18031a;

    public b(String uploadToken) {
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        this.f18031a = uploadToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f18031a, ((b) obj2).f18031a);
    }

    public final int hashCode() {
        return this.f18031a.hashCode();
    }
}
