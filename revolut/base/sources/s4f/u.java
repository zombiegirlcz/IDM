package s4f;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nel.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    public static ArrayList a(xzg.k content, String query) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(query, "query");
        if (!(content instanceof xzg.n)) {
            if ((content instanceof xzg.l) || (content instanceof xzg.m)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = ((xzg.n) content).d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            a0 a0Var = (a0) obj2;
            if (d0.W(query) || jli.g.h(a0Var.f214560a.d, query) || jli.g.h(a0Var.f214560a.e, query)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
