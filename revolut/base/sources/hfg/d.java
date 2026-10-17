package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151814c;

    public d(String providerId, String externalId, String str) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        this.f151812a = providerId;
        this.f151813b = externalId;
        this.f151814c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f151812a, dVar.f151812a) && Intrinsics.f(this.f151813b, dVar.f151813b) && Intrinsics.f(this.f151814c, dVar.f151814c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f151812a.hashCode() * 31, 31, this.f151813b);
        String str = this.f151814c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
