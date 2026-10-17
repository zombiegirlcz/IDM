package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.internal.e3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class i3 {
    @NotNull
    public static final e3.d merged(@NotNull List<e3.d> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            List<e3.a> lines = ((e3.d) it8.next()).getLines();
            if (lines == null) {
                lines = zhm.f0.f322471a;
            }
            zhm.a0.x(lines, arrayList);
        }
        return toText(arrayList);
    }

    @NotNull
    public static final e3.b mrz(@NotNull e3.d dVar, @NotNull MrzInfo mrz) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(mrz, "mrz");
        return new e3.b(mrz, dVar);
    }

    @NotNull
    public static final e3.d toText(@NotNull List<e3.a> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        String strK0 = zhm.d0.k0(list, "\n", null, null, 0, new aem.d(17), 30);
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator<T> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((e3.a) it8.next()).getBox());
        }
        return new e3.d(strK0, ga.toBox(arrayList), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toText$lambda$0(e3.a it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getText();
    }
}
