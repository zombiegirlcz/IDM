package ui0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import ueg.p0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {

    @NotNull
    public static final c Companion = new c();
    public static final Regex f = new Regex("(\\d+)\\.(\\d+)\\.?(\\d+)?.*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f280281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f280282c;
    public final int d;
    public final k e;

    public d(int i, int i2, int i3, int i5, k kVar) {
        this.f280280a = i;
        this.f280281b = i2;
        this.f280282c = i3;
        this.d = i5;
        this.e = kVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return cim.b.c(this, other, new p0(16), new p0(17), new p0(18));
    }

    public final String b() {
        int i = this.f280281b;
        int i2 = this.f280280a;
        int i3 = this.f280282c;
        if (i3 == 0) {
            return a0.d.i(i2, ".", i);
        }
        return i2 + "." + i + "." + i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f280280a == dVar.f280280a && this.f280281b == dVar.f280281b && this.f280282c == dVar.f280282c && this.d == dVar.d && this.e == dVar.e;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, j6.a.b(this.f280282c, j6.a.b(this.f280281b, Integer.hashCode(this.f280280a) * 31, 31), 31), 31);
        k kVar = this.e;
        return iB + (kVar == null ? 0 : kVar.hashCode());
    }
}
