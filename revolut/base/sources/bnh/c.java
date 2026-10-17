package bnh;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qjh.b f17176a;

    public c(qjh.b strategyItemMapper) {
        Intrinsics.checkNotNullParameter(strategyItemMapper, "strategyItemMapper");
        this.f17176a = strategyItemMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.l a(bnh.b r44, boolean r45, java.lang.String r46) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bnh.c.a(bnh.b, boolean, java.lang.String):qv0.l");
    }

    public final ArrayList b(Data data, String str, boolean z) {
        List listL = oc.c.L(data);
        ArrayList arrayList = new ArrayList(zhm.w.t(listL, 10));
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((b) it8.next(), z, str));
        }
        return arrayList;
    }
}
