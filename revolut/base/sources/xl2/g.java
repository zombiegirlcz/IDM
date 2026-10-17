package xl2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306915a;

    public g(String remoteFileId) {
        Intrinsics.checkNotNullParameter(remoteFileId, "remoteFileId");
        this.f306915a = remoteFileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f306915a, ((g) obj2).f306915a);
    }

    public final int hashCode() {
        return this.f306915a.hashCode();
    }
}
