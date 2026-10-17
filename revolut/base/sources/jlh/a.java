package jlh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f175763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f175764c;
    public final boolean d;

    public a(List showUpToLimits, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(showUpToLimits, "showUpToLimits");
        this.f175762a = z;
        this.f175763b = showUpToLimits;
        this.f175764c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f175762a == aVar.f175762a && Intrinsics.f(this.f175763b, aVar.f175763b) && this.f175764c == aVar.f175764c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.d(Boolean.hashCode(this.f175762a) * 31, 31, this.f175763b), 31, this.f175764c);
    }
}
