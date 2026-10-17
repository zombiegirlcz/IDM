package hf4;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import ff4.s;
import he4.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff4.b f151751a;

    public i(ff4.b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f151751a = mapper;
    }

    public static TextLocalisedClause a(String str) {
        return new TextLocalisedClause(R$string.credit_application_offer_title, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    @Override // cli.n
    public final o c(j jVar) {
        ff4.i domainState = (ff4.i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f, new r(this, 11), new hb6.g(this, 19), new hb4.n(this, domainState, 7));
    }
}
