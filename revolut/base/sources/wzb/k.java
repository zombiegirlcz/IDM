package wzb;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wyc.p;
import wyg.s;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f301404a;

    public k(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f301404a = dateProvider;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(domainState.f301399b ? new TextLocalisedClause(R$string.rev_points_points_expiry_description, null, null, 14) : new TextLocalisedClause(R$string.rev_points_points_expiry_description_no_points_buying, null, null, 14), (List) iii.c.f(domainState.f301398a, new p(this, 13), new s(5), new wx6.k(this, domainState, 4)));
    }
}
