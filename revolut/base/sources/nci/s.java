package nci;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextClause a(k kVar) {
        String str = kVar.f214204a;
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f214205b, new n7h.c(this, domainState, 19), new n8i.e(this, domainState), new mgh.i(17, domainState, this));
    }
}
