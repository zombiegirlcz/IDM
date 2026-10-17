package xxi;

import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import xo8.j0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.n {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hxi.l f309546a;

    public o(hxi.l eventItemsMapper, a filterItemsMapper) {
        Intrinsics.checkNotNullParameter(eventItemsMapper, "eventItemsMapper");
        Intrinsics.checkNotNullParameter(filterItemsMapper, "filterItemsMapper");
        this.f309546a = eventItemsMapper;
    }

    public static ArrayList a() {
        List listC = u.c(new gu("ID_PASS_ACTIVITY_LIST_LOADING_HEADER", 0, 0, 30));
        IntRange intRangeO = kotlin.ranges.f.o(0, 6);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("ID_PASS_ACTIVITY_LIST_LOADING_", it8.nextInt()), false, 0, false, 30));
        }
        return d0.E0(arrayList, listC);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f309537b, new xx9.f(this, 9), new xx9.e(15), new j0(this, domainState, 8));
        return new l(d0.E0((List) iii.c.f(domainState.f309536a, new xx9.f(this, 10), new xx9.e(16), new wx6.k(this, domainState, 22)), list));
    }
}
