package qph;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f248408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f248409c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f248410g;

    public m(String str, Data availableMetricFilters, List selectedFilters, Data data, Data data2, Data data3, Data data4) {
        Intrinsics.checkNotNullParameter(availableMetricFilters, "availableMetricFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f248407a = str;
        this.f248408b = availableMetricFilters;
        this.f248409c = selectedFilters;
        this.d = data;
        this.e = data2;
        this.f = data3;
        this.f248410g = data4;
    }

    public static m a(m mVar, String str, Data data, List list, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            str = mVar.f248407a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            data = mVar.f248408b;
        }
        Data availableMetricFilters = data;
        if ((i & 4) != 0) {
            list = mVar.f248409c;
        }
        List selectedFilters = list;
        if ((i & 8) != 0) {
            data2 = mVar.d;
        }
        Data data6 = data2;
        if ((i & 16) != 0) {
            data3 = mVar.e;
        }
        Data data7 = data3;
        if ((i & 32) != 0) {
            data4 = mVar.f;
        }
        Data data8 = data4;
        if ((i & 64) != 0) {
            data5 = mVar.f248410g;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(availableMetricFilters, "availableMetricFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        return new m(str2, availableMetricFilters, selectedFilters, data6, data7, data8, data5);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f248407a, mVar.f248407a) && Intrinsics.f(this.f248408b, mVar.f248408b) && Intrinsics.f(this.f248409c, mVar.f248409c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f248410g, mVar.f248410g);
    }

    public final int hashCode() {
        String str = this.f248407a;
        int iD = p.a.d(kii.e.c(this.f248408b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f248409c);
        Data data = this.d;
        int iHashCode = (iD + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.e;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f248410g;
        return iHashCode3 + (data4 != null ? data4.hashCode() : 0);
    }
}
