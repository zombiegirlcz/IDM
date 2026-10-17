package bu8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18753b;

    public a(String token, String checkId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        this.f18752a = token;
        this.f18753b = checkId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f18752a, aVar.f18752a) && Intrinsics.f(this.f18753b, aVar.f18753b);
    }

    public final int hashCode() {
        return this.f18753b.hashCode() + (this.f18752a.hashCode() * 31);
    }
}
