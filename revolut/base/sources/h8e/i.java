package h8e;

import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import pcd.x;
import pcd.y;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final UserPermissionEditScreenContract$InputData f150024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f150025q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g6e.d f150026r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f150027s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, UserPermissionEditScreenContract$InputData inputData, j60.a bottomExpandableDialogControllerExtension, g6e.d subaccountInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        this.f150024p = inputData;
        this.f150025q = bottomExpandableDialogControllerExtension;
        this.f150026r = subaccountInteractor;
        List list = inputData.f89081a.f88953a.k;
        List list2 = list == null ? f0.f322471a : list;
        list = list == null ? f0.f322471a : list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((x) obj2).f234906g.contains(y.WITHDRAW)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((x) it8.next()).f234903a);
        }
        this.f150027s = new e(list2, d0.i1(arrayList2), this.f150024p.f89082b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f150027s;
    }
}
