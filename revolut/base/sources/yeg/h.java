package yeg;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.hotels.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import xo8.j0;
import ye1.m;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements n {
    public static lw0.a a() {
        return new lw0.a(new TextLocalisedClause(R$string.hotels_stays_search_sorting_title, null, null, 14), null, null, null, false, 30);
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f312925a, new m(this, 10), new yd8.a(this, 8), new j0(this, domainState, 21));
    }
}
