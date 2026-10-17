package y4d;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j jVar2 = domainState.f310876a;
        TextLocalisedClause textLocalisedClause = jVar2.f310885a;
        TextLocalisedClause textLocalisedClause2 = jVar2.f310886b.f310882a;
        Data data = domainState.f310877b;
        return new g(textLocalisedClause, textLocalisedClause2, (List) iii.c.f(data, new y4b.b(3), new y13.a(17), new x0b.h(26)), (List) iii.c.f(data, new y4b.b(2), new y13.a(16), new x0b.h(25)));
    }
}
