package ij6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yy0.j f161716c;
    public final String d;

    public h(List items, boolean z, yy0.j jVar, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f161714a = items;
        this.f161715b = z;
        this.f161716c = jVar;
        this.d = str;
    }

    @Override // cli.p
    public final List c() {
        return this.f161714a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f161714a, hVar.f161714a) && this.f161715b == hVar.f161715b && this.f161716c.equals(hVar.f161716c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f161716c.f317755a, j6.a.c(this.f161714a.hashCode() * 31, 31, this.f161715b), 31);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
