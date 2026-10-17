package hp2;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f154398a;

    public m(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f154398a = dateProvider;
    }

    public static TextLocalisedClause a(f fVar) {
        int i = l.f154397a[fVar.f154386a.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.account_switch_switch_date_title, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.account_switch_switch_date_cass_title, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.account_switch_switch_date_elcimai_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f154388c, new hg4.a(this, domainState), new hfb.d(14, domainState, this), new hb4.n(this, domainState, 14));
    }
}
