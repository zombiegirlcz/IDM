package qgg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245832b;

    public g(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f245831a = firstName;
        this.f245832b = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f245831a, gVar.f245831a) && Intrinsics.f(this.f245832b, gVar.f245832b);
    }

    public final int hashCode() {
        return this.f245832b.hashCode() + (this.f245831a.hashCode() * 31);
    }
}
