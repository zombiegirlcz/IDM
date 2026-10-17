package dli;

import com.revolut.kompot.R$id;
import dce.l0;
import java.util.List;
import koi.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {
    public static e a(a aVar, b model, List delegates, int i, Function1 function1, h hVar, gi1.a aVar2, int i2) {
        if ((i2 & 4) != 0) {
            i = R$id.recyclerView;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            function1 = new l0(aVar, 24);
        }
        Function1 layoutManagerProvider = function1;
        if ((i2 & 16) != 0) {
            hVar = new h(null, false, false, 1);
        }
        h listAdapter = hVar;
        gi1.a aVar3 = (i2 & 32) != 0 ? null : aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(layoutManagerProvider, "layoutManagerProvider");
        Intrinsics.checkNotNullParameter(listAdapter, "listAdapter");
        return new e(aVar, model, aVar3, i3, layoutManagerProvider, delegates, listAdapter);
    }
}
