package ubi;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ji;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.a6;
import mx0.b6;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    public static List a(List occupations, od0.i chosenOccupation, boolean z) {
        Intrinsics.checkNotNullParameter(occupations, "occupations");
        Intrinsics.checkNotNullParameter(chosenOccupation, "chosenOccupation");
        List<tbi.a> list = occupations;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (tbi.a aVar : list) {
            arrayList.add(z ? new a6(aVar.a(), aVar.getCode()) : new b6(aVar.getCode(), null, aVar.a(), null, chosenOccupation.d() && aVar == chosenOccupation.c(), aVar, 42));
        }
        return u.c(new ji(R$attr.uikit_dp8, 56, "choosable_occupation_item_list_id", arrayList));
    }
}
