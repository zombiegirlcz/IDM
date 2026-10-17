package x7e;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.vaults.R$string;
import hx7.q;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import zhm.w;
import zm3.l;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl3.f f303186a;

    public j(dl3.f contactsMapper) {
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        this.f303186a = contactsMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<l> list = domainState.f303180a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (l lVar : list) {
            boolean zContains = domainState.f303181b.contains(lVar.getCode());
            arrayList.add(new RowDelegate.Model(q.E(lVar), new RowDelegate.Model.MainImage.Avatar(dl3.f.b(this.f303186a, lVar, null, 6), (i1) null, 6), new TextClause(q.v(lVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(zContains ? R$string.group_pockets_withdrawal_permissions_withdrawal_enabled : R$string.group_pockets_withdrawal_permissions_withdrawal_disabled, null, null, 14), null, null, 0, new vf(zContains, true), false, null, false, null, null, null, null, null, null, lVar, null, 0, 0, 0, 0, 532673496));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new h(arrayList);
    }
}
