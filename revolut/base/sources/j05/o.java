package j05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f169964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f169965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f169966c;
    public final Double d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f169967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f169968h;

    public /* synthetic */ o(int i, Double d, Double d5, Double d6, Double d10, Integer num, Integer num2, Integer num3, Integer num4) {
        if (255 != (i & 255)) {
            j1.f(m.f169963a.getDescriptor(), i, 255);
            throw null;
        }
        this.f169964a = num;
        this.f169965b = d;
        this.f169966c = num2;
        this.d = d5;
        this.e = num3;
        this.f = num4;
        this.f169967g = d6;
        this.f169968h = d10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f169964a, oVar.f169964a) && Intrinsics.f(this.f169965b, oVar.f169965b) && Intrinsics.f(this.f169966c, oVar.f169966c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f169967g, oVar.f169967g) && Intrinsics.f(this.f169968h, oVar.f169968h);
    }

    public final int hashCode() {
        Integer num = this.f169964a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.f169965b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.f169966c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d5 = this.d;
        int iHashCode4 = (iHashCode3 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d6 = this.f169967g;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f169968h;
        return iHashCode7 + (d10 != null ? d10.hashCode() : 0);
    }
}
