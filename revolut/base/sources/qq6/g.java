package qq6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f248498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f248499c;

    public g(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f248497a = items;
        this.f248498b = z;
        this.f248499c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f248497a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f248497a, gVar.f248497a) && this.f248498b == gVar.f248498b && this.f248499c == gVar.f248499c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248499c) + j6.a.c(this.f248497a.hashCode() * 31, 31, this.f248498b);
    }
}
