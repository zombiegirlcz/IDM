package anc;

import com.revolut.data.model.Data;
import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f6742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f6743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final YearMonth f6744c;
    public final Data d;
    public final Data e;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data data, dj0.d dVar, YearMonth yearMonth, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = eVar.f6742a;
        }
        Data data4 = data;
        if ((i & 2) != 0) {
            dVar = eVar.f6743b;
        }
        dj0.d dVar2 = dVar;
        if ((i & 4) != 0) {
            yearMonth = eVar.f6744c;
        }
        YearMonth yearMonth2 = yearMonth;
        if ((i & 8) != 0) {
            data2 = eVar.d;
        }
        Data data5 = data2;
        if ((i & 16) != 0) {
            data3 = eVar.e;
        }
        eVar.getClass();
        return new e(data4, dVar2, yearMonth2, data5, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f6742a, eVar.f6742a) && Intrinsics.f(this.f6743b, eVar.f6743b) && Intrinsics.f(this.f6744c, eVar.f6744c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        Data data = this.f6742a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        dj0.d dVar = this.f6743b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        YearMonth yearMonth = this.f6744c;
        int iHashCode3 = (iHashCode2 + (yearMonth == null ? 0 : yearMonth.hashCode())) * 31;
        Data data2 = this.d;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.e;
        return iHashCode4 + (data3 != null ? data3.hashCode() : 0);
    }

    public /* synthetic */ e(int i) {
        this(null, null, null, null, null);
    }

    public e(Data data, dj0.d dVar, YearMonth yearMonth, Data data2, Data data3) {
        this.f6742a = data;
        this.f6743b = dVar;
        this.f6744c = yearMonth;
        this.d = data2;
        this.e = data3;
    }
}
