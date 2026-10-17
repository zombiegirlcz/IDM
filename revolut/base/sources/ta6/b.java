package ta6;

import ba6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.db;
import tof.e8;
import tof.i7;
import tof.pb;
import tof.q7;
import tof.u9;
import tof.v6;
import tof.va;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final q7 a(Iterable iterable, Long l2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            arrayList.add(((l) it8.next()).f13938a);
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(iterable, 10));
        Iterator it9 = iterable.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((l) it9.next()).f13940c);
        }
        Set setI12 = d0.i1(arrayList2);
        e8 e8Var = new e8(setI1);
        va vaVar = new va(setI12);
        db dbVar = new db(setI12);
        i7.Companion.getClass();
        return i7.c.a(i7.c.b(e8Var, vaVar, dbVar), l2 != null ? new pb(new DateTime(l2.longValue()), false) : null, new u9(false), i7.c.c(v6.PENDING, v6.REVERTED, v6.COMPLETED, v6.DECLINED));
    }
}
