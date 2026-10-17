package dda;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f113164c;
    public final List d;

    public b(String title, String description, c cVar, List highlights) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f113162a = title;
        this.f113163b = description;
        this.f113164c = cVar;
        this.d = highlights;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f113162a, bVar.f113162a) && Intrinsics.f(this.f113163b, bVar.f113163b) && Intrinsics.f(this.f113164c, bVar.f113164c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f113162a.hashCode() * 31, 31, this.f113163b);
        c cVar = this.f113164c;
        return this.d.hashCode() + ((iC + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
