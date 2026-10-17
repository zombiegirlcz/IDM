package meb;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerContract$InputData;
import ip0.c10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends oki.h implements dli.b {
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f204648p;

    public g(PartySizePickerContract$InputData inputData, h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        int i = inputData.f82869b;
        int i2 = inputData.f82868a;
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            arrayList.add(new c10(new TextClause(String.valueOf(iNextInt), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Integer.valueOf(iNextInt)));
        }
        this.o = arrayList;
        Iterator it9 = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i3 = -1;
                break;
            } else if (Intrinsics.f(((c10) it9.next()).f163673b, Integer.valueOf(i2))) {
                break;
            } else {
                i3++;
            }
        }
        this.f204648p = mra.d.b(this, new a(i2, arrayList, i3 >= 0 ? i3 : 0), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204648p;
    }
}
