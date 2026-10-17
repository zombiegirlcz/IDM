package p5e;

import cli.j;
import com.revolut.data.model.Data;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f233102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f233103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f233104c;
    public final BigDecimal d;
    public final Data e;
    public final int f;

    public e(BigDecimal performanceStart, BigDecimal performanceEnd, Data data, BigDecimal selectedPerformance, Data data2, int i) {
        Intrinsics.checkNotNullParameter(performanceStart, "performanceStart");
        Intrinsics.checkNotNullParameter(performanceEnd, "performanceEnd");
        Intrinsics.checkNotNullParameter(selectedPerformance, "selectedPerformance");
        this.f233102a = performanceStart;
        this.f233103b = performanceEnd;
        this.f233104c = data;
        this.d = selectedPerformance;
        this.e = data2;
        this.f = i;
    }

    public static e a(e eVar, Data data, BigDecimal bigDecimal, Data data2, int i, int i2) {
        BigDecimal performanceStart = eVar.f233102a;
        BigDecimal performanceEnd = eVar.f233103b;
        if ((i2 & 4) != 0) {
            data = eVar.f233104c;
        }
        Data data3 = data;
        if ((i2 & 8) != 0) {
            bigDecimal = eVar.d;
        }
        BigDecimal selectedPerformance = bigDecimal;
        if ((i2 & 16) != 0) {
            data2 = eVar.e;
        }
        Data data4 = data2;
        if ((i2 & 32) != 0) {
            i = eVar.f;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(performanceStart, "performanceStart");
        Intrinsics.checkNotNullParameter(performanceEnd, "performanceEnd");
        Intrinsics.checkNotNullParameter(selectedPerformance, "selectedPerformance");
        return new e(performanceStart, performanceEnd, data3, selectedPerformance, data4, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f233102a, eVar.f233102a) && Intrinsics.f(this.f233103b, eVar.f233103b) && Intrinsics.f(this.f233104c, eVar.f233104c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f233103b, this.f233102a.hashCode() * 31, 31);
        Data data = this.f233104c;
        int iD2 = t61.a.d(this.d, (iD + (data == null ? 0 : data.hashCode())) * 31, 31);
        Data data2 = this.e;
        return Integer.hashCode(this.f) + ((iD2 + (data2 != null ? data2.hashCode() : 0)) * 31);
    }
}
