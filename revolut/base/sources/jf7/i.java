package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class i implements l1 {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f173679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173680c;
    public final String d;

    public /* synthetic */ i(String str, int i, String str2, String str3, double d) {
        if (15 != (i & 15)) {
            qlm.j1.f(g.f173674a.getDescriptor(), i, 15);
            throw null;
        }
        this.f173678a = str;
        this.f173679b = d;
        this.f173680c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f173678a, iVar.f173678a) && Double.compare(this.f173679b, iVar.f173679b) == 0 && Intrinsics.f(this.f173680c, iVar.f173680c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = m72.b.c(this.f173678a.hashCode() * 31, this.f173679b, 31);
        String str = this.f173680c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
