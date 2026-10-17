package qd8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v6d.a f244885c;

    public c(String juniorId, String consentId, v6d.a consentName) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(consentName, "consentName");
        this.f244883a = juniorId;
        this.f244884b = consentId;
        this.f244885c = consentName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f244883a, cVar.f244883a) && Intrinsics.f(this.f244884b, cVar.f244884b) && this.f244885c == cVar.f244885c;
    }

    public final int hashCode() {
        return this.f244885c.hashCode() + p.a.c(this.f244883a.hashCode() * 31, 31, this.f244884b);
    }
}
