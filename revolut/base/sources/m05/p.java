package m05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f201071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f201072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f201073c;
    public final Double d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f201074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f201075h;

    public /* synthetic */ p(int i, Double d, Double d5, Double d6, Double d10, Integer num, Integer num2, Integer num3, Integer num4) {
        if (255 != (i & 255)) {
            j1.f(n.f201070a.getDescriptor(), i, 255);
            throw null;
        }
        this.f201071a = num;
        this.f201072b = d;
        this.f201073c = num2;
        this.d = d5;
        this.e = num3;
        this.f = num4;
        this.f201074g = d6;
        this.f201075h = d10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f201071a, pVar.f201071a) && Intrinsics.f(this.f201072b, pVar.f201072b) && Intrinsics.f(this.f201073c, pVar.f201073c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f201074g, pVar.f201074g) && Intrinsics.f(this.f201075h, pVar.f201075h);
    }

    public final int hashCode() {
        Integer num = this.f201071a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.f201072b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.f201073c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d5 = this.d;
        int iHashCode4 = (iHashCode3 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d6 = this.f201074g;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.f201075h;
        return iHashCode7 + (d10 != null ? d10.hashCode() : 0);
    }

    public p(Integer num, Double d, Integer num2, Double d5, Integer num3, Integer num4, Double d6, Double d10) {
        this.f201071a = num;
        this.f201072b = d;
        this.f201073c = num2;
        this.d = d5;
        this.e = num3;
        this.f = num4;
        this.f201074g = d6;
        this.f201075h = d10;
    }
}
