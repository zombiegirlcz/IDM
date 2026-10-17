package k7d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f182034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f182036c;

    public d(c type, String title, List ids) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f182034a = type;
        this.f182035b = title;
        this.f182036c = ids;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f182034a == dVar.f182034a && Intrinsics.f(this.f182035b, dVar.f182035b) && Intrinsics.f(this.f182036c, dVar.f182036c);
    }

    public final int hashCode() {
        return this.f182036c.hashCode() + p.a.c(this.f182034a.hashCode() * 31, 31, this.f182035b);
    }
}
