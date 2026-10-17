package zr5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f324592c;
    public final double d;

    public /* synthetic */ i(int i, String str, String str2, f fVar, double d) {
        if (15 != (i & 15)) {
            j1.f(g.f324589a.getDescriptor(), i, 15);
            throw null;
        }
        this.f324590a = str;
        this.f324591b = str2;
        this.f324592c = fVar;
        this.d = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f324590a, iVar.f324590a) && Intrinsics.f(this.f324591b, iVar.f324591b) && Intrinsics.f(this.f324592c, iVar.f324592c) && Double.compare(this.d, iVar.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + ((this.f324592c.hashCode() + p.a.c(this.f324590a.hashCode() * 31, 31, this.f324591b)) * 31);
    }
}
