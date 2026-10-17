package s39;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LocalDate localDate = domainState.f259478b;
        TextClause textClause = new TextClause(domainState.f259477a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        LocalDate localDate2 = domainState.f259478b;
        return new e(localDate, textClause, localDate2 != null && localDate2.getYear() > 1000);
    }
}
