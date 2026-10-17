package lhb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195229b;

    public a(String carbonCopy, String referenceId) {
        Intrinsics.checkNotNullParameter(carbonCopy, "carbonCopy");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.f195228a = carbonCopy;
        this.f195229b = referenceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f195228a, aVar.f195228a) && Intrinsics.f(this.f195229b, aVar.f195229b);
    }

    public final int hashCode() {
        return this.f195229b.hashCode() + (this.f195228a.hashCode() * 31);
    }
}
