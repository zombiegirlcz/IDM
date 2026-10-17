package z0f;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f318289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f318290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f318291c;

    public z(ArrayList items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f318289a = items;
        this.f318290b = z;
        this.f318291c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f318289a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f318289a.equals(zVar.f318289a) && this.f318290b == zVar.f318290b && this.f318291c == zVar.f318291c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f318291c) + j6.a.c(this.f318289a.hashCode() * 31, 31, this.f318290b);
    }
}
