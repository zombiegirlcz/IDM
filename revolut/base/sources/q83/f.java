package q83;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f242967b, new q75.n(20), new q34.a(24), new p40.n(domainState, 29)), new lw0.a(new TextLocalisedClause(R$string.card_nameless_card_dialog_title, null, null, 14), new TextLocalisedClause(R$string.card_nameless_card_dialog_description, null, null, 14), null, null, false, 28));
    }
}
