package i16;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157582c;
    public final BigInteger d;
    public final int e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f157583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f157584h;
    public final long i;

    public /* synthetic */ f(int i, String str, String str2, String str3, BigInteger bigInteger, int i2, String str4, String str5, long j2, long j3) {
        if (511 != (i & 511)) {
            j1.f(d.f157579a.getDescriptor(), i, 511);
            throw null;
        }
        this.f157580a = str;
        this.f157581b = str2;
        this.f157582c = str3;
        this.d = bigInteger;
        this.e = i2;
        this.f = str4;
        this.f157583g = str5;
        this.f157584h = j2;
        this.i = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f157580a, fVar.f157580a) && Intrinsics.f(this.f157581b, fVar.f157581b) && Intrinsics.f(this.f157582c, fVar.f157582c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f157583g, fVar.f157583g) && this.f157584h == fVar.f157584h && this.i == fVar.i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f157580a.hashCode() * 31, 31, this.f157581b), 31, this.f157582c)) * 31, 31);
        String str = this.f;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f157583g;
        return Long.hashCode(this.i) + a0.d.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f157584h);
    }

    public f(String assetTicker, String assetExternalId, String accountScopedAssetId, BigInteger balance, int i, String str, String str2, long j2, long j3) {
        Intrinsics.checkNotNullParameter(assetTicker, "assetTicker");
        Intrinsics.checkNotNullParameter(assetExternalId, "assetExternalId");
        Intrinsics.checkNotNullParameter(accountScopedAssetId, "accountScopedAssetId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f157580a = assetTicker;
        this.f157581b = assetExternalId;
        this.f157582c = accountScopedAssetId;
        this.d = balance;
        this.e = i;
        this.f = str;
        this.f157583g = str2;
        this.f157584h = j2;
        this.i = j3;
    }
}
