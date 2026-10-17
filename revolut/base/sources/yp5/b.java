package yp5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatCryptoMoney f315785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatCryptoMoney f315786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f315787c;
    public final int d;
    public final Clause e;

    public b(FiatCryptoMoney usage, FiatCryptoMoney limit, int i, int i2, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(usage, "usage");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f315785a = usage;
        this.f315786b = limit;
        this.f315787c = i;
        this.d = i2;
        this.e = textLocalisedClause;
    }
}
