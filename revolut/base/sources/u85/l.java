package u85;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u4i.u;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_welcome_mortgage_ready_title, null, null, 14);
        h60.a aVar = null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_welcome_mortgage_ready_description, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.loan_management_welcome_mortgage_button_text, null, null, 14);
        if (domainState.f278112a.getContent() != null) {
            aVar = h60.a.f149577a;
        }
        return new i(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, aVar, (List) iii.c.f(domainState.f278112a, new u4e.i(26), new u(6), new u3b.h(this, 2)));
    }
}
