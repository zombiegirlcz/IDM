package iad;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.invoices.impl.R$string;
import i6j.q;
import i83.m;
import i9g.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f(new e(new TextLocalisedClause(R$string.invoices_shared_template_preview_title, null, null, 14)), (List) iii.c.f(domainState.f159990a, new e0(this, 11), new m(7), new q(3)));
    }
}
