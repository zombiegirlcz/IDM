package wqd;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(new CompositeClause(v.k(new TextClause("Revolut", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124), new TextClause("IQ", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, null, null, 14));
    }
}
