package mek;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f204706b;

    public h(String email, boolean z) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f204705a = email;
        this.f204706b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f204705a, hVar.f204705a) && this.f204706b == hVar.f204706b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204706b) + (this.f204705a.hashCode() * 31);
    }
}
