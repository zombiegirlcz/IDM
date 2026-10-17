package aqh;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.g f8436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zel.f f8437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8438c;
    public final zel.g d;
    public final zel.i e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f8439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8440h;

    public i(zel.g metricToCalibrate, zel.f instrumentGroup, List filters, zel.g gVar, zel.i iVar, Data data, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(metricToCalibrate, "metricToCalibrate");
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f8436a = metricToCalibrate;
        this.f8437b = instrumentGroup;
        this.f8438c = filters;
        this.d = gVar;
        this.e = iVar;
        this.f = data;
        this.f8439g = num;
        this.f8440h = z;
    }

    public static i a(i iVar, ArrayList arrayList, Data data, Integer num, boolean z, int i) {
        zel.g metricToCalibrate = iVar.f8436a;
        zel.f instrumentGroup = iVar.f8437b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = iVar.f8438c;
        }
        List filters = list;
        zel.g gVar = iVar.d;
        zel.i iVar2 = iVar.e;
        if ((i & 32) != 0) {
            data = iVar.f;
        }
        Data data2 = data;
        if ((i & 64) != 0) {
            num = iVar.f8439g;
        }
        Integer num2 = num;
        if ((i & 128) != 0) {
            z = iVar.f8440h;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(metricToCalibrate, "metricToCalibrate");
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new i(metricToCalibrate, instrumentGroup, filters, gVar, iVar2, data2, num2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f8436a == iVar.f8436a && this.f8437b == iVar.f8437b && Intrinsics.f(this.f8438c, iVar.f8438c) && this.d == iVar.d && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f8439g, iVar.f8439g) && this.f8440h == iVar.f8440h;
    }

    public final int hashCode() {
        int iD = p.a.d((this.f8437b.hashCode() + (this.f8436a.hashCode() * 31)) * 31, 31, this.f8438c);
        zel.g gVar = this.d;
        int iHashCode = (iD + (gVar == null ? 0 : gVar.hashCode())) * 31;
        zel.i iVar = this.e;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Data data = this.f;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        Integer num = this.f8439g;
        return Boolean.hashCode(this.f8440h) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }
}
