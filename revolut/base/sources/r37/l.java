package r37;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qz9.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(new h(new TextLocalisedClause(R$string.freelancer_tax_profile_payment_type_selector_header_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_tax_profile_payment_type_selector_header_caption, null, null, 14)), (List) iii.c.f(domainState.f251194a, new r2d.d(this, 9), new u(15), new qk2.h(this, 11)));
    }
}
