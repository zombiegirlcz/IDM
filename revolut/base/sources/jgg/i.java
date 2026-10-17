package jgg;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.miles.api.R$string;
import java.util.List;
import jfb.v0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(new TextLocalisedClause(R$string.miles_home_title, null, null, 14), (List) iii.c.f(domainState.f174040a, new je5.n(19), new v0(1), new jb8.b(8)));
    }
}
