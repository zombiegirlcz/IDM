package kf6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183291b;

    public c(String consentId, String pocketId) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f183290a = consentId;
        this.f183291b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f183290a, cVar.f183290a) && Intrinsics.f(this.f183291b, cVar.f183291b);
    }

    public final int hashCode() {
        return this.f183291b.hashCode() + (this.f183290a.hashCode() * 31);
    }
}
