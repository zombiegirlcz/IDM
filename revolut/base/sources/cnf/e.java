package cnf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f25414a;

    public e(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f25414a = uiKitResources;
    }

    public final CharSequence a(String str, String str2) {
        return c(new TextLocalisedClause(j6.a.q("transaction.reason.card_id.", str2), u.c(str), (Clause) null, false, 28));
    }

    public final CharSequence b(String str) {
        return c(new TextLocalisedClause(j6.a.q("transaction.reason.", str), (List) null, (Clause) null, false, 30));
    }

    public final CharSequence c(TextLocalisedClause textLocalisedClause) {
        CharSequence charSequenceB = this.f25414a.b(textLocalisedClause);
        if (charSequenceB.length() > 0) {
            return charSequenceB;
        }
        return null;
    }
}
