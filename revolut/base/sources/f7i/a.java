package f7i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C0777a Companion = new C0777a();

    /* JADX INFO: renamed from: f7i.a$a, reason: collision with other inner class name */
    public static final class C0777a {
        private C0777a() {
        }
    }

    public static TextDelegate.Model a(Clause clause) {
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorStatusDanger), (Float) null, (Float) null, 28);
        m70.a.t(t0.f186434a);
        CompositeClause compositeClause = new CompositeClause(v.k(imageClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause), null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), null, 10);
        ck0 ck0Var = new ck0(0);
        int i = R$attr.uikit_dp8;
        return new TextDelegate.Model("LIST_ID_ERROR_DISCLAIMER", compositeClause, false, ck0Var, null, null, i, i, 0, 0, 1652);
    }
}
