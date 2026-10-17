package a2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f808b;

    public e(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f807a = firstName;
        this.f808b = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f807a, eVar.f807a) && Intrinsics.f(this.f808b, eVar.f808b);
    }

    public final int hashCode() {
        return this.f808b.hashCode() + (this.f807a.hashCode() * 31);
    }
}
