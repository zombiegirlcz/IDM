package iy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169616b;

    public a(String name, String link) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f169615a = name;
        this.f169616b = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f169615a, aVar.f169615a) && Intrinsics.f(this.f169616b, aVar.f169616b);
    }

    public final int hashCode() {
        return this.f169616b.hashCode() + (this.f169615a.hashCode() * 31);
    }
}
