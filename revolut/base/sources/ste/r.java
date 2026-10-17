package ste;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f265571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f265572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f265573c;

    public r(aw0.e eVar, List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f265571a = header;
        this.f265572b = eVar;
        this.f265573c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f265571a.equals(rVar.f265571a) && this.f265572b.equals(rVar.f265572b) && Intrinsics.f(this.f265573c, rVar.f265573c);
    }

    public final int hashCode() {
        return this.f265573c.hashCode() + ehe.n.c(this.f265572b, this.f265571a.hashCode() * 31, 31);
    }
}
