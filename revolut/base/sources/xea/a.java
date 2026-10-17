package xea;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f304558a;

    public a(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f304558a = uiKitResources;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        wh left = (wh) obj2;
        wh right = (wh) obj3;
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        i iVar = right.f54925b;
        i iVar2 = right.f54925b;
        com.revolut.core.ui_kit.delegates.c cVar = ((AccountCellItemDelegate.Model) iVar).e;
        i iVar3 = left.f54925b;
        i iVar4 = left.f54925b;
        int iB = cim.b.b(cVar, ((AccountCellItemDelegate.Model) iVar3).e);
        if (iB == 0) {
            Object obj4 = ((AccountCellItemDelegate.Model) iVar4).f51565t;
            Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.pockets.api.ui.PocketPickerParcel.RealPocket");
            dj0.d dVar = ((ida.d) obj4).f160458a.f163164b;
            Object obj5 = ((AccountCellItemDelegate.Model) iVar2).f51565t;
            Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.pockets.api.ui.PocketPickerParcel.RealPocket");
            iB = cim.b.b(((ida.d) obj5).f160458a.f163164b, dVar);
        }
        if (iB != 0) {
            return iB;
        }
        Clause clause = ((AccountCellItemDelegate.Model) iVar4).d;
        f01.c cVar2 = this.f304558a;
        return cim.b.b(cVar2.b(clause).toString(), cVar2.b(((AccountCellItemDelegate.Model) iVar2).d).toString());
    }
}
