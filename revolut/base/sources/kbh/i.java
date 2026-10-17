package kbh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182595b;

    public i(String contactCode, String displayName) {
        Intrinsics.checkNotNullParameter(contactCode, "contactCode");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f182594a = contactCode;
        this.f182595b = displayName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f182594a, iVar.f182594a) && Intrinsics.f(this.f182595b, iVar.f182595b);
    }

    public final int hashCode() {
        return this.f182595b.hashCode() + (this.f182594a.hashCode() * 31);
    }
}
