package buf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class d1 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.c f18796a;

    public d1(nq9.c membersMapper) {
        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
        this.f18796a = membersMapper;
    }

    public final ArrayList a(List list, boolean z) {
        if (!z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((GroupMemberSettleInfo) it8.next()));
            }
            return arrayList;
        }
        List<GroupMemberSettleInfo> list3 = list;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
        for (GroupMemberSettleInfo groupMemberSettleInfo : list3) {
            RowDelegate.Model modelB = b(groupMemberSettleInfo);
            arrayList2.add(new SelectableDelegate.Model(j6.a.q("SETTLEMENT_MEMBER_GROUP_ID_", modelB.f53228a), modelB, groupMemberSettleInfo.f79505c ? qd0.SELECTED : qd0.UNSELECTED, SelectableDelegate.b.C0424b.f53319a, null, false, null, null, null, false, 32752));
        }
        return arrayList2;
    }

    public final RowDelegate.Model b(GroupMemberSettleInfo groupMemberSettleInfo) {
        oq9.o member = groupMemberSettleInfo.f79503a;
        String strQ = j6.a.q("SETTLEMENT_MEMBER_INDIVIDUAL_ID_", member.b());
        tr9.e eVar = (tr9.e) this.f18796a;
        Intrinsics.checkNotNullParameter(member, "member");
        return new RowDelegate.Model(strQ, eVar.h(member, eVar.g(member)), tr9.e.d(member, true), null, 0, new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_you_owe, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(groupMemberSettleInfo.f79504b.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, new c1(groupMemberSettleInfo), null, 0, 0, 0, 0, 532675544);
    }
}
