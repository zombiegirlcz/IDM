package sye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266665b;

    public b(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f266664a = title;
        this.f266665b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f266664a, bVar.f266664a) && Intrinsics.f(this.f266665b, bVar.f266665b);
    }

    public final int hashCode() {
        return this.f266665b.hashCode() + (this.f266664a.hashCode() * 31);
    }
}
