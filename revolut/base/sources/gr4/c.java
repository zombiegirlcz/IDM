package gr4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f145937b;

    public c(String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f145936a = title;
        this.f145937b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145936a, cVar.f145936a) && this.f145937b == cVar.f145937b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f145937b) + (this.f145936a.hashCode() * 31);
    }
}
