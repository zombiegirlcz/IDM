package g0a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a(com.revolut.feature.payments.messaging.data.api.model.b bVar) {
        String lowerCase = bVar.name().toLowerCase(Locale.ROOT);
        return new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "chat_bubble.title.gift.pricing_plan_", lowerCase), (List) null, (Clause) null, false, 30);
    }
}
