package ro7;

import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import kl7.m2;
import kl7.o0;
import kl7.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f255914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f255915c;
    public final String d;
    public final s0 e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m2 f255916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CarVariation f255917h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f255918j;

    public f() {
        this(null, 1023);
    }

    public static f a(f fVar, wi0.b bVar, String str, String str2, s0 s0Var, Integer num, m2 m2Var, CarVariation carVariation, o0 o0Var, Integer num2, int i) {
        wi0.b bVar2 = bVar;
        String str3 = fVar.f255913a;
        if ((i & 2) != 0) {
            bVar2 = fVar.f255914b;
        }
        if ((i & 4) != 0) {
            str = fVar.f255915c;
        }
        if ((i & 8) != 0) {
            str2 = fVar.d;
        }
        if ((i & 16) != 0) {
            s0Var = fVar.e;
        }
        if ((i & 32) != 0) {
            num = fVar.f;
        }
        if ((i & 64) != 0) {
            m2Var = fVar.f255916g;
        }
        if ((i & 128) != 0) {
            carVariation = fVar.f255917h;
        }
        if ((i & 256) != 0) {
            o0Var = fVar.i;
        }
        if ((i & 512) != 0) {
            num2 = fVar.f255918j;
        }
        Integer num3 = num2;
        fVar.getClass();
        o0 o0Var2 = o0Var;
        CarVariation carVariation2 = carVariation;
        m2 m2Var2 = m2Var;
        Integer num4 = num;
        s0 s0Var2 = s0Var;
        String str4 = str2;
        return new f(str3, bVar2, str, str4, s0Var2, num4, m2Var2, carVariation2, o0Var2, num3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f255913a, fVar.f255913a) && Intrinsics.f(this.f255914b, fVar.f255914b) && Intrinsics.f(this.f255915c, fVar.f255915c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && Intrinsics.f(this.f, fVar.f) && this.f255916g == fVar.f255916g && Intrinsics.f(this.f255917h, fVar.f255917h) && this.i == fVar.i && Intrinsics.f(this.f255918j, fVar.f255918j);
    }

    public final int hashCode() {
        String str = this.f255913a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        wi0.b bVar = this.f255914b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31;
        String str2 = this.f255915c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        s0 s0Var = this.e;
        int iHashCode5 = (iHashCode4 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        m2 m2Var = this.f255916g;
        int iHashCode7 = (iHashCode6 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        CarVariation carVariation = this.f255917h;
        int iHashCode8 = (iHashCode7 + (carVariation == null ? 0 : carVariation.hashCode())) * 31;
        o0 o0Var = this.i;
        int iHashCode9 = (iHashCode8 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        Integer num2 = this.f255918j;
        return iHashCode9 + (num2 != null ? num2.hashCode() : 0);
    }

    public /* synthetic */ f(String str, int i) {
        this((i & 1) != 0 ? null : str, null, null, null, null, null, null, null, null, null);
    }

    public f(String str, wi0.b bVar, String str2, String str3, s0 s0Var, Integer num, m2 m2Var, CarVariation carVariation, o0 o0Var, Integer num2) {
        this.f255913a = str;
        this.f255914b = bVar;
        this.f255915c = str2;
        this.d = str3;
        this.e = s0Var;
        this.f = num;
        this.f255916g = m2Var;
        this.f255917h = carVariation;
        this.i = o0Var;
        this.f255918j = num2;
    }
}
