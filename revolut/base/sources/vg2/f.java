package vg2;

import aw0.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.upi.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uw2.n;
import vf0.p;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements g {

    @NotNull
    public static final e Companion = new e();

    @Override // vg2.g
    public final TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.upi_subscription_confirmation_new_title, null, null, 14);
    }

    @Override // vg2.g
    public final List b(tg2.d domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(domainState.f271042a, new p(28), new vea.b(13), new n(this, 18));
    }

    @Override // vg2.g
    public final h c(tg2.d domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return c.a(new TextLocalisedClause(R$string.upi_subscription_confirmation_authorize, null, null, 14), new TextLocalisedClause(R$string.upi_subscription_confirmation_decline, null, null, 14), null);
    }

    @Override // vg2.g
    public final boolean d(tg2.d domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return pyd.c.G(domainState.f271042a);
    }
}
