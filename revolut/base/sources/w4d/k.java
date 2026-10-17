package w4d;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements n {
    public static boolean a(String str, ArrayList arrayList) {
        if (arrayList.size() != 2) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((h) it8.next()).f294548a);
        }
        return arrayList2.contains(str);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = domainState.f294538a.f294547a;
        Data data = domainState.f294539b;
        return new d(textLocalisedClause, (List) iii.c.f(data, new w29.a(21), new w2.d(22), new w2a.o(this, 4)), (List) iii.c.f(data, new w29.a(22), new w2.d(23), new w2a.o(this, 5)));
    }
}
