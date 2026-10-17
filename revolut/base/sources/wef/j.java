package wef;

import ip0.s7;
import ip0.sw;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList b() {
        IntRange intRange = new IntRange(1, 3, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new s7(a0.d.n("RECOGNISER_DETAILS_LOADING", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        return d0.E0(u.c(new sw("RECOGNISER_DETAILS_LOADING4")), arrayList);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(domainState.f296768a.getContent() != null, (List) iii.c.f(domainState.f296768a, new wd3.a(this, 10), new w6b.a(this), new vjh.c(this, domainState, 20)));
    }
}
