package mr4;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f208058a = new lw0.a(new TextLocalisedClause(R$string.credit_card_account_balance_display_title, null, null, 14), null, null, null, false, 30);

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(int i, dj0.d dVar) {
        return new TextLocalisedClause(i, u.c(sx4.f.b(3, null, null, dVar)), null, 12);
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f208050a, new mqg.b(4), new mnl.g(this, 11), new mgh.i(this, 5));
    }
}
