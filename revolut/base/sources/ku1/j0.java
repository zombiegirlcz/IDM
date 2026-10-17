package ku1;

import ip0.s7;
import java.util.ArrayList;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a() {
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new s7(a0.d.n("BLIK_QUOTE_LOADING_ITEM_", it8.nextInt()), 0, 0, 0, 0, false, null, 126));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
