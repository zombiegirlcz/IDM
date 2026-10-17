package g9j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextClause f141906a = new TextClause("~", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    public static final Clause a(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        dj0.d dVarM = pyd.c.M(xVar.f141951b);
        return (dVarM.f115082a != 0 || xVar.f141950a.f115082a == 0) ? u5l.a.c(dVarM, null, null, null, 7) : yoj.b.w(f141906a, u5l.a.c(dVarM, null, null, null, 7));
    }
}
