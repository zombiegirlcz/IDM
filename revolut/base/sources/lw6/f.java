package lw6;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ldj.g;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f200414a, new lv9.c(6), new lnk.o(21), new g(this, 5)), new lw0.a(new TextLocalisedClause(R$string.freelancer_widget_pockets_customization_screen_title, null, null, 14), null, null, null, false, 30));
    }
}
