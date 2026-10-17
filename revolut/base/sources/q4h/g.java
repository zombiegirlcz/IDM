package q4h;

import com.revolut.data.model.Data;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p40.n;
import q3d.i;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f242168c = new BigDecimal(BigInteger.ONE, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f242169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ufl.b f242170b;

    public g(kpj.f wealthAccountHeaderUiMapper, ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f242169a = wealthAccountHeaderUiMapper;
        this.f242170b = wealthHoldingsClauseFactory;
    }

    public final List a(h3h.d domainState) {
        List list;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f149126a;
        return (data == null || (list = (List) iii.c.f(data, new i(this, 13), new q34.a(7), new n(this, 25))) == null) ? f0.f322471a : list;
    }
}
