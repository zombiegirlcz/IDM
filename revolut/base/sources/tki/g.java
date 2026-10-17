package tki;

import com.revolut.kompot.R$id;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {
    public static b a(c cVar, d model, List delegates, int i, Function1 function1, koi.h hVar, Function0 function0, int i2) {
        if ((i2 & 4) != 0) {
            i = R$id.recyclerView;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            function1 = new tjf.e(cVar, 6);
        }
        Function1 layoutManagerProvider = function1;
        if ((i2 & 16) != 0) {
            hVar = new koi.h(null, false, false, 1);
        }
        koi.h listAdapter = hVar;
        Function0 function02 = (i2 & 32) != 0 ? null : function0;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(layoutManagerProvider, "layoutManagerProvider");
        Intrinsics.checkNotNullParameter(listAdapter, "listAdapter");
        return new b(cVar, model, delegates, i3, layoutManagerProvider, listAdapter, function02);
    }

    public static f b(h hVar, i model) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        return new f(hVar, model);
    }
}
