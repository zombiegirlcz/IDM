package j07;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169983a;

    public e(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f169983a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f169983a, ((e) obj2).f169983a);
    }

    public final int hashCode() {
        return this.f169983a.hashCode();
    }
}
