package n36;

import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f211892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c36.c f211893c;
    public final String d;
    public final TokenAmountDto e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f211894g;

    public /* synthetic */ l(int i, String str, b0 b0Var, c36.c cVar, String str2, TokenAmountDto tokenAmountDto, String str3, String str4) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(j.f211890a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f211891a = str;
        this.f211892b = b0Var;
        this.f211893c = cVar;
        this.d = str2;
        this.e = tokenAmountDto;
        this.f = str3;
        this.f211894g = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f211891a, lVar.f211891a) && Intrinsics.f(this.f211892b, lVar.f211892b) && Intrinsics.f(this.f211893c, lVar.f211893c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f211894g, lVar.f211894g);
    }

    public final int hashCode() {
        return this.f211894g.hashCode() + p.a.c((this.e.hashCode() + p.a.c((this.f211893c.hashCode() + ((this.f211892b.hashCode() + (this.f211891a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31, this.f);
    }

    public l(String accountId, b0 assetIn, c36.c assetOut, String assetOutRepresentations, TokenAmountDto amount, String side, String fiatCurrency) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(assetIn, "assetIn");
        Intrinsics.checkNotNullParameter(assetOut, "assetOut");
        Intrinsics.checkNotNullParameter(assetOutRepresentations, "assetOutRepresentations");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        this.f211891a = accountId;
        this.f211892b = assetIn;
        this.f211893c = assetOut;
        this.d = assetOutRepresentations;
        this.e = amount;
        this.f = side;
        this.f211894g = fiatCurrency;
    }
}
