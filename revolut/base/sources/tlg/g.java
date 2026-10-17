package tlg;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
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
        TextClause textClause = new TextClause(o51.a.a(domainState.f272093a, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        co3.a aVar = domainState.f272094b;
        w8 w8Var = new w8("map_list_id", textClause, aVar != null ? Double.valueOf(aVar.f25486a) : null, aVar != null ? Double.valueOf(aVar.f25487b) : null, null, null, null, 64484);
        yp0.b.l(w8Var, 0, 0, 0, 0, null, false, 63);
        return new f(u.c(w8Var));
    }
}
