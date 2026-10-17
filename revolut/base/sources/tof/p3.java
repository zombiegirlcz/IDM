package tof;

import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3 f272983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f272984c;
    public final wk5.a d;
    public final yk5.e e;
    public final CryptoAddressCounterparty f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f272985g;

    public p3(String str, q3 q3Var, Boolean bool, wk5.a aVar, yk5.e eVar, CryptoAddressCounterparty cryptoAddressCounterparty, String str2) {
        this.f272982a = str;
        this.f272983b = q3Var;
        this.f272984c = bool;
        this.d = aVar;
        this.e = eVar;
        this.f = cryptoAddressCounterparty;
        this.f272985g = str2;
    }

    public final String a() {
        return this.f272985g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f272982a, p3Var.f272982a) && Intrinsics.f(this.f272983b, p3Var.f272983b) && Intrinsics.f(this.f272984c, p3Var.f272984c) && this.d == p3Var.d && this.e == p3Var.e && Intrinsics.f(this.f, p3Var.f) && Intrinsics.f(this.f272985g, p3Var.f272985g);
    }

    public final int hashCode() {
        String str = this.f272982a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        q3 q3Var = this.f272983b;
        int iHashCode2 = (iHashCode + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        Boolean bool = this.f272984c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        wk5.a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        yk5.e eVar = this.e;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        CryptoAddressCounterparty cryptoAddressCounterparty = this.f;
        int iHashCode6 = (iHashCode5 + (cryptoAddressCounterparty == null ? 0 : cryptoAddressCounterparty.hashCode())) * 31;
        String str2 = this.f272985g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }
}
