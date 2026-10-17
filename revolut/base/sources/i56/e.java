package i56;

import com.revolut.feature.defi.common.models.domain.DeFiAssetAmount;
import com.revolut.feature.defi.common.models.domain.DeFiFee;
import com.revolut.feature.defi.common.models.domain.DeFiFiatAmount;
import com.revolut.feature.defi.common.models.domain.DeFiRate;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiAssetAmount f158768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiFiatAmount f158769c;
    public final DeFiAssetAmount d;
    public final DeFiFiatAmount e;
    public final DeFiRate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b36.d f158770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DeFiFee f158771h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Instant f158772j;
    public final String k;

    public e(String accountId, DeFiAssetAmount amountIn, DeFiFiatAmount amountInFiat, DeFiAssetAmount amountOut, DeFiFiatAmount amountOutFiat, DeFiRate rate, b36.d side, DeFiFee fee2, d dVar, Instant expiresAt, String signature) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(amountIn, "amountIn");
        Intrinsics.checkNotNullParameter(amountInFiat, "amountInFiat");
        Intrinsics.checkNotNullParameter(amountOut, "amountOut");
        Intrinsics.checkNotNullParameter(amountOutFiat, "amountOutFiat");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f158767a = accountId;
        this.f158768b = amountIn;
        this.f158769c = amountInFiat;
        this.d = amountOut;
        this.e = amountOutFiat;
        this.f = rate;
        this.f158770g = side;
        this.f158771h = fee2;
        this.i = dVar;
        this.f158772j = expiresAt;
        this.k = signature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f158767a, eVar.f158767a) && Intrinsics.f(this.f158768b, eVar.f158768b) && Intrinsics.f(this.f158769c, eVar.f158769c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && this.f158770g == eVar.f158770g && Intrinsics.f(this.f158771h, eVar.f158771h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f158772j, eVar.f158772j) && Intrinsics.f(this.k, eVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f158771h.hashCode() + ((this.f158770g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f158769c.hashCode() + ((this.f158768b.hashCode() + (this.f158767a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        d dVar = this.i;
        return this.k.hashCode() + r6.b.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f158772j);
    }
}
