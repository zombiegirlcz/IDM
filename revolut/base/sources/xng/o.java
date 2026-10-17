package xng;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.n {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextClause f307506b = new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f307507a;

    public o(qd0.b languageProvider, u80.o moneyPrefixFormatter) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f307507a = languageProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f, new l(domainState, 1), new xif.k(domainState, 13), new wx6.k(this, domainState, 16));
    }
}
