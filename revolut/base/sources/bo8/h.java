package bo8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17318c;

    public h(String firstName, String username, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(username, "username");
        this.f17316a = firstName;
        this.f17317b = username;
        this.f17318c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f17316a, hVar.f17316a) && Intrinsics.f(this.f17317b, hVar.f17317b) && this.f17318c == hVar.f17318c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17318c) + p.a.c(this.f17316a.hashCode() * 31, 31, this.f17317b);
    }
}
