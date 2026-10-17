package h8e;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.vaults.R$string;
import do3.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import pcd.a0;
import pcd.x;
import pcd.z;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {
    public static RowDelegate.Model b(n nVar, boolean z, x xVar) {
        return new RowDelegate.Model(j6.a.q("MEMBER_ID_", q8e.b.b(xVar)), new RowDelegate.Model.MainImage.Image40(q8e.b.a(xVar), null, null, false, null, false, 62), q8e.b.d(xVar, nVar), null, 0, q8e.b.c(xVar, z), null, null, 0, !(xVar.f234905c == z.ADMIN) ? new vf(z, true) : null, false, null, false, null, null, null, null, null, null, xVar, null, 0, 0, 0, 0, 532673496);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        n nVar = domainState.f150022c;
        Set set = domainState.f150021b;
        List list = domainState.f150020a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((x) obj2).f234904b == a0.ACTIVE) {
                arrayList.add(obj2);
            }
        }
        List listP0 = d0.P0(arrayList, new mqk.g(nVar, 2));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((x) obj3).f234904b == a0.INVITED) {
                arrayList2.add(obj3);
            }
        }
        List listP02 = d0.P0(arrayList2, new mqk.g(nVar, 2));
        aim.e eVarB = u.b();
        if (!listP0.isEmpty()) {
            List<x> list2 = listP0;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            for (x xVar : list2) {
                arrayList3.add(b(nVar, set.contains(xVar.f234903a), xVar));
            }
            zhm.a0.x(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("ACTIVE_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.group_pockets_members_section_active_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), eVarB);
        }
        if (!listP02.isEmpty()) {
            List<x> list3 = listP02;
            ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
            for (x xVar2 : list3) {
                arrayList4.add(b(nVar, set.contains(xVar2.f234903a), xVar2));
            }
            zhm.a0.x(yp0.b.g(arrayList4, new ListSubheaderDelegate.Model("PENDING_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.group_pockets_members_section_pending_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), eVarB);
        }
        return new g(u.a(eVarB));
    }
}
