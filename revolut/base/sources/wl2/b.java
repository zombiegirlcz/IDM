package wl2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298366a;

    public b(String remoteFileId) {
        Intrinsics.checkNotNullParameter(remoteFileId, "remoteFileId");
        this.f298366a = remoteFileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f298366a, ((b) obj2).f298366a);
    }

    public final int hashCode() {
        return this.f298366a.hashCode();
    }
}
