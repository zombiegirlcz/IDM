package zil;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322581a;

    public a(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f322581a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f322581a, ((a) obj2).f322581a);
    }

    public final int hashCode() {
        return this.f322581a.hashCode();
    }
}
