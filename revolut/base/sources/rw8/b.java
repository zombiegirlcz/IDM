package rw8;

import kotlin.jvm.internal.Intrinsics;
import my8.k;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f257844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257845b;

    public b(k consent, String str) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        this.f257844a = consent;
        this.f257845b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f257844a == bVar.f257844a && Intrinsics.f(this.f257845b, bVar.f257845b);
    }

    public final int hashCode() {
        int iHashCode = this.f257844a.hashCode() * 31;
        String str = this.f257845b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
