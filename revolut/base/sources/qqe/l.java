package qqe;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.b2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f248534a;

    public l(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f248534a = phoneToolsProvider;
    }

    public static CellDetailsActionListDelegate.Model a(int i, String str, List list) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new b2((Clause) it8.next(), null));
        }
        return new CellDetailsActionListDelegate.Model(str, textLocalisedClause, null, null, arrayList, false, null, 196);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f248523a, new qpb.i(this, 20), new qjj.g(28), new qbg.j(this, 14));
    }
}
