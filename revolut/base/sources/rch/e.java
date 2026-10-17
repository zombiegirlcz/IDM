package rch;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzg.d f253271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f253272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f253273c;
    public final Data d;
    public final Data e;
    public final Data f;

    public e(mzg.d section, List assetTypesParameters, Data data, Data data2, Data data3, Data data4) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(assetTypesParameters, "assetTypesParameters");
        this.f253271a = section;
        this.f253272b = assetTypesParameters;
        this.f253273c = data;
        this.d = data2;
        this.e = data3;
        this.f = data4;
    }

    public static e a(e eVar, Data data, Data data2, Data data3, Data data4, int i) {
        mzg.d section = eVar.f253271a;
        List assetTypesParameters = eVar.f253272b;
        if ((i & 4) != 0) {
            data = eVar.f253273c;
        }
        Data data5 = data;
        if ((i & 8) != 0) {
            data2 = eVar.d;
        }
        Data data6 = data2;
        if ((i & 16) != 0) {
            data3 = eVar.e;
        }
        Data data7 = data3;
        if ((i & 32) != 0) {
            data4 = eVar.f;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(assetTypesParameters, "assetTypesParameters");
        return new e(section, assetTypesParameters, data5, data6, data7, data4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f253271a == eVar.f253271a && Intrinsics.f(this.f253272b, eVar.f253272b) && Intrinsics.f(this.f253273c, eVar.f253273c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f253271a.hashCode() * 31, 31, this.f253272b);
        Data data = this.f253273c;
        int iHashCode = (iD + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.d;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.e;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f;
        return iHashCode3 + (data4 != null ? data4.hashCode() : 0);
    }
}
