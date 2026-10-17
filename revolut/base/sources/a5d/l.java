package a5d;

import a2g.m;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = domainState.f1350a.f1359a;
        Data data = domainState.f1351b;
        return new f(textLocalisedClause, (List) iii.c.f(data, new a35.b(24), new a08.n(27), new m(4)), (List) iii.c.f(data, new a35.b(25), new a08.n(28), new m(5)));
    }
}
