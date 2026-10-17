package rub;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i implements j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f257517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f257518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257519c;
    public final double d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f257520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f257521h;
    public final Boolean i;

    public /* synthetic */ i(int i, double d, dj0.d dVar, String str, double d5, String str2, Long l2, String str3, dj0.d dVar2, Boolean bool) {
        if (511 != (i & 511)) {
            j1.f(g.f257516a.getDescriptor(), i, 511);
            throw null;
        }
        this.f257517a = d;
        this.f257518b = dVar;
        this.f257519c = str;
        this.d = d5;
        this.e = str2;
        this.f = l2;
        this.f257520g = str3;
        this.f257521h = dVar2;
        this.i = bool;
    }

    @Override // rub.j
    public final double a() {
        return this.f257517a;
    }

    @Override // rub.j
    public final String b() {
        return this.f257519c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Double.compare(this.f257517a, iVar.f257517a) == 0 && Intrinsics.f(this.f257518b, iVar.f257518b) && Intrinsics.f(this.f257519c, iVar.f257519c) && Double.compare(this.d, iVar.d) == 0 && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f257520g, iVar.f257520g) && Intrinsics.f(this.f257521h, iVar.f257521h) && Intrinsics.f(this.i, iVar.i);
    }

    @Override // rub.j
    public final dj0.d getPrice() {
        return this.f257518b;
    }

    public final int hashCode() {
        int iC = v7.c(Double.hashCode(this.f257517a) * 31, 31, this.f257518b);
        String str = this.f257519c;
        int iC2 = m72.b.c((iC + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
        String str2 = this.e;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f;
        int iC3 = v7.c(p.a.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f257520g), 31, this.f257521h);
        Boolean bool = this.i;
        return iC3 + (bool != null ? bool.hashCode() : 0);
    }
}
