package d56;

import com.revolut.feature.defi.common.models.dto.TokenAmountDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c36.c f111368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f111369c;
    public final TokenAmountDto d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f111370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f111371h;
    public final String i;

    public /* synthetic */ c(int i, String str, c36.c cVar, String str2, TokenAmountDto tokenAmountDto, String str3, String str4, String str5, String str6, String str7) {
        if (511 != (i & 511)) {
            j1.f(a.f111366a.getDescriptor(), i, 511);
            throw null;
        }
        this.f111367a = str;
        this.f111368b = cVar;
        this.f111369c = str2;
        this.d = tokenAmountDto;
        this.e = str3;
        this.f = str4;
        this.f111370g = str5;
        this.f111371h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f111367a, cVar.f111367a) && Intrinsics.f(this.f111368b, cVar.f111368b) && Intrinsics.f(this.f111369c, cVar.f111369c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f111370g, cVar.f111370g) && Intrinsics.f(this.f111371h, cVar.f111371h) && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c((this.d.hashCode() + p.a.c((this.f111368b.hashCode() + (this.f111367a.hashCode() * 31)) * 31, 31, this.f111369c)) * 31, 31, this.e), 31, this.f), 31, this.f111370g);
        String str = this.f111371h;
        return this.i.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public c(String accountId, c36.c assetIn, String assetOutRepresentations, TokenAmountDto amount, String amountDenomination, String side, String chain, String str, String fiatCurrency) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(assetIn, "assetIn");
        Intrinsics.checkNotNullParameter(assetOutRepresentations, "assetOutRepresentations");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountDenomination, "amountDenomination");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        this.f111367a = accountId;
        this.f111368b = assetIn;
        this.f111369c = assetOutRepresentations;
        this.d = amount;
        this.e = amountDenomination;
        this.f = side;
        this.f111370g = chain;
        this.f111371h = str;
        this.i = fiatCurrency;
    }
}
