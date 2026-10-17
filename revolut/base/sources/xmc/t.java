package xmc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Clause a(zmc.n nVar, boolean z) {
        if (!z) {
            return new TextLocalisedClause(nVar.f323457b, null, new Click(28, (Integer) null, (Object) nVar.f323458c, j6.a.q("acknowledgement-document-", nVar.f323456a), false), 10);
        }
        m70.a.a(t0.f186434a);
        return new CompositeClause(zhm.v.k(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(nVar.f323457b, null, null, 14)), null, new Click(28, (Integer) null, (Object) nVar.f323458c, j6.a.q("acknowledgement-document-", nVar.f323456a), false), null, 10);
    }
}
