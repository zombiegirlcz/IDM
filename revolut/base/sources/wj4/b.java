package wj4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.m;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y a(Clause description, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        m.b bVar = m.Companion;
        t tVar = new t(title, description, null, 28);
        List listC = u.c(new LargeActionButtonDelegate.Model("id_got_it_button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), false, null, null, null, null, 1000));
        yp0.b.q(listC, 0, R$attr.uikit_dp24, 0, 0, 13);
        return dy4.b.b(bVar, listC, tVar, l.WINDOW, null, null, null, 1016);
    }
}
