package o92;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.multibanco.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
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
        String str = domainState.f223062b;
        int length = str.length();
        List listC = u.c(new InputTextDelegate.Model("INPUT_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.via_verde_identifier_label_input_placeholder, null, null, 14), null, false, null, null, null, null, null, null, false, 20, null, length < 3 || length > 20, false, 1, 0, null, false, true, null, true, null, false, false, false, null, null, R$attr.uikit_dp8, -606240776, 57343));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new g(listC, domainState.f223063c);
    }
}
