package gaf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142161a;

    public e(String transferDocumentLink) {
        Intrinsics.checkNotNullParameter(transferDocumentLink, "transferDocumentLink");
        this.f142161a = transferDocumentLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f142161a, ((e) obj2).f142161a);
    }

    public final int hashCode() {
        return this.f142161a.hashCode();
    }
}
