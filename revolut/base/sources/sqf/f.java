package sqf;

import android.text.InputFilter;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f265088a;

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (this.f265088a == null) {
            this.f265088a = u.c(new InputFilter.LengthFilter(domainState.f265086c));
        }
        TextClause textClause = new TextClause(domainState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause clause = domainState.f265085b;
        List list = this.f265088a;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List listC = u.c(new InputTextDelegate.Model("ID_TRANSFER_NOTE", textClause, clause, null, null, null, null, false, null, false, false, 0, false, 0, false, true, true, list, false, false, 0, false, false, null, 922746872, 131071));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new e(listC);
    }
}
