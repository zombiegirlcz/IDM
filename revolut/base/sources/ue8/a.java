package ue8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import lf8.g;
import lf8.i;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f279313a = r0.k(new Pair("SKIP", g.SKIP), new Pair("FREE_TRIAL", g.FREE_TRIAL), new Pair("PAID_PLAN", g.PAID_PLAN));

    public static final ArrayList a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new i((String) it8.next()));
        }
        return arrayList;
    }
}
