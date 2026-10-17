package a7g;

import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements cli.n {

    @NotNull
    private static final g0 Companion = new g0();

    public h0(c7g.b cardMapper, c7g.e searchInputMapper, c7g.g searchSortInfoMapper, c7g.a quickFiltersMapper) {
        Intrinsics.checkNotNullParameter(cardMapper, "cardMapper");
        Intrinsics.checkNotNullParameter(searchInputMapper, "searchInputMapper");
        Intrinsics.checkNotNullParameter(searchSortInfoMapper, "searchSortInfoMapper");
        Intrinsics.checkNotNullParameter(quickFiltersMapper, "quickFiltersMapper");
    }

    public static ArrayList a() {
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList();
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            IntRange intRangeO2 = kotlin.ranges.f.o(0, 2);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeO2, 10));
            vim.f it9 = intRangeO2.iterator();
            while (it9.f289625c) {
                arrayList2.add(nb0.b(pb0.Companion, a0.d.g(iNextInt, it9.nextInt(), "search_result_loading_", "_"), false, 0, false, 30));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            zhm.a0.x(arrayList2, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0122  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r38) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7g.h0.c(cli.j):cli.o");
    }
}
