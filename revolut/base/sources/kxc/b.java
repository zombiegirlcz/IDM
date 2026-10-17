package kxc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f190553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190554b;

    public b(e icon, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f190553a = icon;
        this.f190554b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f190553a == bVar.f190553a && Intrinsics.f(this.f190554b, bVar.f190554b);
    }

    public final int hashCode() {
        return this.f190554b.hashCode() + (this.f190553a.hashCode() * 31);
    }
}
