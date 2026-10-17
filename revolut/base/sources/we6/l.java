package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296650a;

    public l(String issuerInstitutionId) {
        Intrinsics.checkNotNullParameter(issuerInstitutionId, "issuerInstitutionId");
        this.f296650a = issuerInstitutionId;
    }

    public final String a() {
        return this.f296650a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f296650a, ((l) obj2).f296650a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f296650a.hashCode() * 31);
    }
}
