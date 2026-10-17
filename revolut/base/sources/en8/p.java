package en8;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_savings.impl.R$string;
import ec8.q;
import eh3.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f127785a;

    public p(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f127785a = savingsInterestRateFormatter;
    }

    public static Clause a(JuniorBankingProfile juniorBankingProfile) {
        if (juniorBankingProfile != null) {
            return new TextLocalisedClause(R$string.junior_savings_savings_list_navbar_title, u.c(juniorBankingProfile.f77099b), null, 12);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(t1.u(domainState.f127764b, domainState.f127763a, domainState.f127765c), new ei8.d(this, domainState, 22), new s(this, domainState, 14), new q(this, 8));
    }
}
