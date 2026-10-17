package wje;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.crypto.impl.ui.settings.models.CryptoSpareChangeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f298067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoSpareChangeInfo f298068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298069c;
    public final Data d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f298070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f298071h;

    public g() {
        this(0);
    }

    public static g a(g gVar, xi0.b bVar, CryptoSpareChangeInfo cryptoSpareChangeInfo, boolean z, Data data, Data data2, boolean z3, boolean z4, boolean z6, int i) {
        if ((i & 1) != 0) {
            bVar = gVar.f298067a;
        }
        xi0.b bVar2 = bVar;
        if ((i & 2) != 0) {
            cryptoSpareChangeInfo = gVar.f298068b;
        }
        CryptoSpareChangeInfo cryptoSpareChangeInfo2 = cryptoSpareChangeInfo;
        if ((i & 4) != 0) {
            z = gVar.f298069c;
        }
        boolean z11 = z;
        if ((i & 8) != 0) {
            data = gVar.d;
        }
        Data data3 = data;
        if ((i & 16) != 0) {
            data2 = gVar.e;
        }
        Data data4 = data2;
        if ((i & 32) != 0) {
            z3 = gVar.f;
        }
        boolean z12 = z3;
        boolean z29 = (i & 64) != 0 ? gVar.f298070g : z4;
        boolean z31 = (i & 128) != 0 ? gVar.f298071h : z6;
        gVar.getClass();
        return new g(bVar2, cryptoSpareChangeInfo2, z11, data3, data4, z12, z29, z31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298067a, gVar.f298067a) && Intrinsics.f(this.f298068b, gVar.f298068b) && this.f298069c == gVar.f298069c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f298070g == gVar.f298070g && this.f298071h == gVar.f298071h;
    }

    public final int hashCode() {
        xi0.b bVar = this.f298067a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        CryptoSpareChangeInfo cryptoSpareChangeInfo = this.f298068b;
        int iC = j6.a.c((iHashCode + (cryptoSpareChangeInfo == null ? 0 : cryptoSpareChangeInfo.hashCode())) * 31, 31, this.f298069c);
        Data data = this.d;
        int iHashCode2 = (iC + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.e;
        return Boolean.hashCode(this.f298071h) + j6.a.c(j6.a.c((iHashCode2 + (data2 != null ? data2.hashCode() : 0)) * 31, 31, this.f), 31, this.f298070g);
    }

    public /* synthetic */ g(int i) {
        this(null, null, false, null, null, false, false, false);
    }

    public g(xi0.b bVar, CryptoSpareChangeInfo cryptoSpareChangeInfo, boolean z, Data data, Data data2, boolean z3, boolean z4, boolean z6) {
        this.f298067a = bVar;
        this.f298068b = cryptoSpareChangeInfo;
        this.f298069c = z;
        this.d = data;
        this.e = data2;
        this.f = z3;
        this.f298070g = z4;
        this.f298071h = z6;
    }
}
