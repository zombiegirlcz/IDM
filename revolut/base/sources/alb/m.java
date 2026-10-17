package alb;

import a2f.q;
import ah1.p;
import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.common.ui.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox0.b0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f6185a;

    public m(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f6185a = savingsInterestRateFormatter;
    }

    public static aw0.e a(TextLocalisedClause textLocalisedClause) {
        return new aw0.e(false, textLocalisedClause, b0.BELOW_BUTTONS, new n6(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 49);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f6175a, new aik.d(this), new p(this, 23), new q(this, 15));
    }
}
