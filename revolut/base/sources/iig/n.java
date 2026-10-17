package iig;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.s7;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final List a(int i) {
        List listC = u.c(new CellDetailsChevronDelegate.Model("LEARN_MORE_ID", new TextLocalisedClause(i, null, null, 14), f2.INTERNAL, 0, null, null, 2040));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    public final List b() {
        List listC = u.c(new s7("LEARN_MORE_ID", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
