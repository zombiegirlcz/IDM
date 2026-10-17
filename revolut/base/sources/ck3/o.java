package ck3;

import chc.c0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.ut;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f24772a = yhm.j.b(new c0(this, 10));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f24773b = yhm.j.b(new c0(this, 11));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f24774c = yhm.j.b(new c0(this, 12));
    public final Lazy d = yhm.j.b(new c0(this, 13));
    public final Lazy e = yhm.j.b(new c0(this, 14));
    public final Lazy f = yhm.j.b(new c0(this, 15));

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(Clause clause, String str, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new ut(p.a.o(str, i), new TextLocalisedClause(((Number) obj2).intValue(), null, null, 14), i2, false, null, null, 1016));
            i = i2;
        }
        int size = arrayList.size() + 1;
        return d0.F0(new ut(p.a.o(str, size), clause, size, true, null, null, 1008), arrayList);
    }
}
