package ev4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import eu4.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements jki.p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static j b() {
        return new j(new TextLocalisedClause(R$string.credit_statement_statements, null, null, 14), new TextLocalisedClause(R$string.credit_statement_statements, null, null, 14), new TextLocalisedClause(R$string.credit_statement_limit_screen_caption, null, null, 14));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f129710b, new eul.d(this, 15), new b0(this, 18), new ec8.q(this, domainState, 16));
    }
}
