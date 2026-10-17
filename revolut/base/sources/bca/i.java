package bca;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f14410a;
        String str2 = domainState.f14411b;
        boolean z = !Intrinsics.f(str, str2) && str2.length() <= 72;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_ADD_DESCRIPTION_INPUT_ID", new TextClause(domainState.f14411b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pix_qr_request_description_label, null, null, 14), null, null, null, null, true, 72, false, false, 0, false, 0, false, false, true, null, false, false, 0, false, false, null, -1090568200, 131071);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return new g(u.c(model), z);
    }
}
