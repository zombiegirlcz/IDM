package fw;

import java.util.ArrayList;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import vim.f;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(c cVar, c cVar2, int i) {
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        f it8 = intRange.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            int i2 = cVar.f138507a;
            int i3 = cVar2.f138507a;
            int i5 = i2 <= i3 ? iNextInt : (i + 1) - iNextInt;
            int iMin = Math.min(i2, i3);
            int iAbs = Math.abs(i3 - i2) * i5;
            int i6 = i + 1;
            int i21 = (iAbs / i6) + iMin;
            int i22 = cVar.f138508b;
            int i32 = cVar2.f138508b;
            if (i22 > i32) {
                iNextInt = i6 - iNextInt;
            }
            arrayList.add(new c(i21, ((Math.abs(i32 - i22) * iNextInt) / i6) + Math.min(i22, i32)));
        }
        return arrayList;
    }
}
