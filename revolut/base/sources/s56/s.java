package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiBalance f259986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiAssetDetails f259987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk5.a f259988c;
    public final BigInteger d;
    public final int e;
    public final b36.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b36.a f259989g;

    public s(DeFiBalance assetInBalance, DeFiAssetDetails assetOut, wk5.a chain, BigInteger amount, int i, b36.d side, b36.a denomination) {
        Intrinsics.checkNotNullParameter(assetInBalance, "assetInBalance");
        Intrinsics.checkNotNullParameter(assetOut, "assetOut");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(denomination, "denomination");
        this.f259986a = assetInBalance;
        this.f259987b = assetOut;
        this.f259988c = chain;
        this.d = amount;
        this.e = i;
        this.f = side;
        this.f259989g = denomination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f259986a, sVar.f259986a) && Intrinsics.f(this.f259987b, sVar.f259987b) && this.f259988c == sVar.f259988c && Intrinsics.f(this.d, sVar.d) && this.e == sVar.e && this.f == sVar.f && this.f259989g == sVar.f259989g;
    }

    public final int hashCode() {
        return this.f259989g.hashCode() + ((this.f.hashCode() + j6.a.b(this.e, (this.d.hashCode() + ((this.f259988c.hashCode() + ((this.f259987b.hashCode() + (this.f259986a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }
}
