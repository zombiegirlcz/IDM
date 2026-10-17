package p14;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xy3.s;
import xy3.t;
import xy3.u;
import xy3.v;
import xy3.w;
import xy3.x;
import zhm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static LinkedHashMap a(s answers) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(answers, "answers");
        Map map = answers.f309595a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            x xVar = (x) entry.getValue();
            if (xVar instanceof t) {
                objValueOf = oo3.a.d(((t) xVar).f309596a);
            } else if (xVar instanceof u) {
                objValueOf = Long.valueOf(((u) xVar).f309597a.f115082a);
            } else if (xVar instanceof v) {
                objValueOf = ((v) xVar).f309598a;
            } else {
                if (!(xVar instanceof w)) {
                    throw new NoWhenBranchMatchedException();
                }
                objValueOf = ((w) xVar).f309599a;
            }
            linkedHashMap.put(key, objValueOf);
        }
        return linkedHashMap;
    }
}
