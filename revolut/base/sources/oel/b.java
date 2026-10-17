package oel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f224622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f224623b;

    public b(dj0.d amount, String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f224622a = title;
        this.f224623b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f224622a, bVar.f224622a) && Intrinsics.f(this.f224623b, bVar.f224623b);
    }

    public final int hashCode() {
        return this.f224623b.hashCode() + (this.f224622a.hashCode() * 31);
    }
}
