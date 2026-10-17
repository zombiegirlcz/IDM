package mle;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f206677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f206678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f206679c;
    public final Data d;
    public final List e;
    public final Data f;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data data, boolean z, Data data2, Data data3, List list, Data data4, int i) {
        if ((i & 1) != 0) {
            data = hVar.f206677a;
        }
        Data data5 = data;
        if ((i & 2) != 0) {
            z = hVar.f206678b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            data2 = hVar.f206679c;
        }
        Data data6 = data2;
        if ((i & 8) != 0) {
            data3 = hVar.d;
        }
        Data data7 = data3;
        if ((i & 16) != 0) {
            list = hVar.e;
        }
        List settings = list;
        if ((i & 32) != 0) {
            data4 = hVar.f;
        }
        Data tradingLegalEntityInformation = data4;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        return new h(data5, z3, data6, data7, settings, tradingLegalEntityInformation);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f206677a, hVar.f206677a) && this.f206678b == hVar.f206678b && Intrinsics.f(this.f206679c, hVar.f206679c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        Data data = this.f206677a;
        int iC = j6.a.c((data == null ? 0 : data.hashCode()) * 31, 31, this.f206678b);
        Data data2 = this.f206679c;
        int iHashCode = (iC + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        return this.f.hashCode() + p.a.d((iHashCode + (data3 != null ? data3.hashCode() : 0)) * 31, 31, this.e);
    }

    public h(Data data, boolean z, Data data2, Data data3, List settings, Data tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        this.f206677a = data;
        this.f206678b = z;
        this.f206679c = data2;
        this.d = data3;
        this.e = settings;
        this.f = tradingLegalEntityInformation;
    }

    public h(int i) {
        this(null, false, null, null, f0.f322471a, new Data(null, null, true, 3, null));
    }
}
