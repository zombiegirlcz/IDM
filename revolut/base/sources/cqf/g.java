package cqf;

import android.text.InputFilter;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
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
public final class g implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f108095a;

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (this.f108095a == null) {
            this.f108095a = u.c(new InputFilter.LengthFilter(domainState.f108092c));
        }
        TextClause textClause = new TextClause(domainState.f108091b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(domainState.f108090a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        List list = this.f108095a;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List listC = u.c(new InputTextDelegate.Model("ID_ADDITIONAL_INFO_FIELD", textClause, textClause2, null, null, null, null, false, null, false, false, 0, false, 0, false, true, true, list, false, false, 0, false, false, null, 922746872, 131071));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new f(listC, domainState.d);
    }
}
