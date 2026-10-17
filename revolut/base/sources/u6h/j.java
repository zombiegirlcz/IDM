package u6h;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f277600a = w.y0(new h(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f277601b = w.y0(new h(1));

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = i.f277599a[domainState.f277594a.ordinal()];
        if (i == 1) {
            return new f((List) this.f277600a.getValue(), new e(new TextLocalisedClause(R$string.wealth_trading_margin_details_header_title, null, null, 14)));
        }
        if (i == 2) {
            return new f((List) this.f277601b.getValue(), new e(new TextLocalisedClause(R$string.wealth_trading_margin_required_minimum_header_title, null, null, 14)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
