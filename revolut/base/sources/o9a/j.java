package o9a;

import com.revolut.data.model.Data;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f223155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PixQrCodeDecodeData f223156c;
    public final Data d;
    public final dj0.d e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f223157g;

    public j(String authorisationId, io3.d dVar, PixQrCodeDecodeData pixQrCodeDecodeData, Data recurringPayment, dj0.d dVar2, boolean z, String str) {
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f223154a = authorisationId;
        this.f223155b = dVar;
        this.f223156c = pixQrCodeDecodeData;
        this.d = recurringPayment;
        this.e = dVar2;
        this.f = z;
        this.f223157g = str;
    }

    public static j a(j jVar, io3.d dVar, PixQrCodeDecodeData pixQrCodeDecodeData, Data recurringPayment, dj0.d dVar2, boolean z, String str, int i) {
        io3.d dVar3 = dVar;
        String authorisationId = jVar.f223154a;
        if ((i & 2) != 0) {
            dVar3 = jVar.f223155b;
        }
        if ((i & 4) != 0) {
            pixQrCodeDecodeData = jVar.f223156c;
        }
        if ((i & 8) != 0) {
            recurringPayment = jVar.d;
        }
        if ((i & 16) != 0) {
            dVar2 = jVar.e;
        }
        if ((i & 32) != 0) {
            z = jVar.f;
        }
        if ((i & 64) != 0) {
            str = jVar.f223157g;
        }
        String str2 = str;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        boolean z3 = z;
        dj0.d dVar4 = dVar2;
        Data data = recurringPayment;
        return new j(authorisationId, dVar3, pixQrCodeDecodeData, data, dVar4, z3, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f223154a, jVar.f223154a) && Intrinsics.f(this.f223155b, jVar.f223155b) && Intrinsics.f(this.f223156c, jVar.f223156c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f && Intrinsics.f(this.f223157g, jVar.f223157g);
    }

    public final int hashCode() {
        int iHashCode = this.f223154a.hashCode() * 31;
        io3.d dVar = this.f223155b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        PixQrCodeDecodeData pixQrCodeDecodeData = this.f223156c;
        int iC = kii.e.c(this.d, (iHashCode2 + (pixQrCodeDecodeData == null ? 0 : pixQrCodeDecodeData.hashCode())) * 31, 31);
        dj0.d dVar2 = this.e;
        int iC2 = j6.a.c((iC + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.f);
        String str = this.f223157g;
        return iC2 + (str != null ? str.hashCode() : 0);
    }
}
