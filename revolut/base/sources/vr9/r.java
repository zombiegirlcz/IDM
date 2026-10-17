package vr9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import vr9.l;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.c f291538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yof.k f291539b;

    public r(nq9.c membersMapper, yof.k reviewMapper) {
        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
        Intrinsics.checkNotNullParameter(reviewMapper, "reviewMapper");
        this.f291538a = membersMapper;
        this.f291539b = reviewMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static List a(l lVar, List list, List list2) {
        List listL;
        dj0.d dVar;
        LargeActionButtonDelegate.Model model;
        char c2;
        Iterator it8;
        dj0.d dVarC;
        dj0.d dVarO;
        LargeActionButtonDelegate.Model model2 = null;
        if (lVar instanceof l.a) {
            int i = q.f291536a[((l.a) lVar).f291528a.ordinal()];
            if (i == 1) {
                LargeActionButtonDelegate.Model[] elements = {e(list, list2), d(list, lVar)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listL = kotlin.collections.d.L(elements);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listL = zhm.u.c(new LargeActionButtonDelegate.Model("SETTLEMENT_BUTTON_CTA_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.payments_groups_actions_continue, null, null, 14), false, null, new e(list), 0, R$attr.uikit_dp16, 0, 0, 7024));
            }
        } else if (lVar.equals(l.c.f291529a)) {
            LargeActionButtonDelegate.Model[] elements2 = {e(list, list2), d(list, lVar)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        } else {
            if (!lVar.equals(l.d.f291530a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!h(list)) {
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i2 = R$string.contacts_group_smart_settle_up_bottom_sheet_send;
                Intrinsics.checkNotNullParameter(list, "<this>");
                if (list.size() == 1) {
                    dVar = ((GroupMemberSettleInfo) d0.b0(list)).f79504b.d;
                } else {
                    dj0.d.Companion.getClass();
                    dj0.d dVar2 = dj0.d.e;
                    Iterator it9 = list.iterator();
                    int i3 = 0;
                    while (it9.hasNext()) {
                        Object next = it9.next();
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            ?? r102 = model2;
                            zhm.v.s();
                            throw r102;
                        }
                        if (i3 == 0) {
                            GroupMemberSettleInfo groupMemberSettleInfo = (GroupMemberSettleInfo) next;
                            boolean z = groupMemberSettleInfo.f79505c;
                            st9.e eVar = groupMemberSettleInfo.f79504b;
                            if (z) {
                                dVarO = eVar.d;
                                model = null;
                                c2 = 2;
                            } else {
                                dj0.d dVar3 = eVar.d;
                                model = null;
                                c2 = 2;
                                dVarO = dj0.d.c(dVar3, 0L, null, 2);
                            }
                            it8 = it9;
                        } else {
                            model = null;
                            c2 = 2;
                            GroupMemberSettleInfo groupMemberSettleInfo2 = (GroupMemberSettleInfo) next;
                            boolean z3 = groupMemberSettleInfo2.f79505c;
                            st9.e eVar2 = groupMemberSettleInfo2.f79504b;
                            if (z3) {
                                dVarC = eVar2.d;
                                it8 = it9;
                            } else {
                                it8 = it9;
                                dVarC = dj0.d.c(eVar2.d, 0L, null, 2);
                            }
                            dVarO = pyd.c.O(dVar2, dVarC);
                        }
                        dVar2 = dVarO;
                        it9 = it8;
                        model2 = model;
                        i3 = i5;
                    }
                    dVar = dVar2;
                }
                model2 = new LargeActionButtonDelegate.Model("SETTLEMENT_BUTTON_CTA_ID", defaultFilledButton, null, new TextLocalisedClause(i2, zhm.u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), false, null, new h(list), 0, R$attr.uikit_dp16, 0, 0, 7024);
            }
            LargeActionButtonDelegate.Model[] elements3 = {model2, d(list, lVar)};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            listL = kotlin.collections.d.L(elements3);
        }
        List list3 = listL;
        yp0.b.q(list3, 0, 0, 0, 0, 15);
        return list3;
    }

    public static LargeActionButtonDelegate.Model d(List list, l lVar) {
        return new LargeActionButtonDelegate.Model("SETTLEMENT_BUTTON_MARK_PAID_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.contacts_group_smart_settle_up_bottom_sheet_mark_as_paid, null, null, 14), false, null, new f(list, lVar), 0, R$attr.uikit_dp16, 0, 0, 7024);
    }

    public static LargeActionButtonDelegate.Model e(List list, List list2) {
        Object next;
        DateTime dateTime;
        List<GroupMemberSettleInfo> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (GroupMemberSettleInfo groupMemberSettleInfo : list3) {
                Iterator it8 = list2.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((oq9.t) next).f227855c, groupMemberSettleInfo.f79503a)) {
                        break;
                    }
                }
                oq9.t tVar = (oq9.t) next;
                if (tVar == null || (dateTime = tVar.e) == null || !dateTime.isAfterNow()) {
                    return new LargeActionButtonDelegate.Model("SETTLEMENT_BUTTON_CTA_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.payments_groups_settle_up_debts_actions_remind_title, null, null, 14), false, null, new i(list), 0, R$attr.uikit_dp16, 0, 0, 7024);
                }
            }
        }
        return null;
    }

    public static TextLocalisedClause g(l lVar) {
        if (!(lVar instanceof l.a) && !lVar.equals(l.c.f291529a)) {
            if (lVar.equals(l.d.f291530a)) {
                return new TextLocalisedClause(R$string.contacts_group_smart_settle_up_bottom_sheet_title, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(R$string.payments_groups_settle_up_action, null, null, 14);
    }

    public static boolean h(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((GroupMemberSettleInfo) it8.next()).f79504b.d.f115083b);
        }
        if (d0.i1(arrayList).size() <= 1) {
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                if (((GroupMemberSettleInfo) it9.next()).f79504b.f265546h) {
                }
            }
            return false;
        }
        return true;
    }

    public final TextDelegate.Model b(l lVar, do3.n nVar, List list) {
        if (!(lVar instanceof l.a)) {
            if (lVar.equals(l.c.f291529a)) {
                return null;
            }
            if (lVar.equals(l.d.f291530a)) {
                return c(nVar, list);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = q.f291536a[((l.a) lVar).f291528a.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return c(nVar, list);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.TextDelegate.Model c(do3.n r3, java.util.List r4) {
        /*
            r2 = this;
            wi0.b r3 = do3.q.y(r3)
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.f297770q3
            boolean r3 = r3.equals(r0)
            r0 = 0
            if (r3 == 0) goto L60
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L22
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L22
            goto L60
        L22:
            java.util.Iterator r3 = r4.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r3.next()
            com.revolut.feature.payments.groups.models.GroupMemberSettleInfo r4 = (com.revolut.feature.payments.groups.models.GroupMemberSettleInfo) r4
            oq9.o r4 = r4.f79503a
            boolean r1 = r4 instanceof oq9.l
            if (r1 == 0) goto L3d
            oq9.l r4 = (oq9.l) r4
            wi0.b r4 = r4.f227839g
            goto L4b
        L3d:
            boolean r1 = r4 instanceof oq9.m
            if (r1 == 0) goto L46
            oq9.m r4 = (oq9.m) r4
            wi0.b r4 = r4.f227844g
            goto L4b
        L46:
            boolean r4 = r4 instanceof oq9.n
            if (r4 == 0) goto L5a
            r4 = r0
        L4b:
            wi0.a r1 = wi0.b.Companion
            r1.getClass()
            wi0.b r1 = wi0.b.f297770q3
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r1)
            if (r4 != 0) goto L26
            r3 = 1
            goto L61
        L5a:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L60:
            r3 = 0
        L61:
            if (r3 == 0) goto L6c
            yof.k r3 = r2.f291539b
            ppf.d r3 = (ppf.d) r3
            com.revolut.core.ui_kit.delegates.TextDelegate$Model r3 = r3.d()
            return r3
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vr9.r.c(do3.n, java.util.List):com.revolut.core.ui_kit.delegates.TextDelegate$Model");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bc  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rp0.y f(vr9.l r52, java.util.ArrayList r53, java.util.List r54, st9.b r55, do3.n r56) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr9.r.f(vr9.l, java.util.ArrayList, java.util.List, st9.b, do3.n):rp0.y");
    }

    public final RowDelegate.Model i(l lVar, GroupMemberSettleInfo groupMemberSettleInfo, List list, List list2, do3.n nVar) {
        Clause textLocalisedClause;
        CompositeClause compositeClause;
        oq9.o member = groupMemberSettleInfo.f79503a;
        Intrinsics.checkNotNullParameter(list2, "<this>");
        Intrinsics.checkNotNullParameter(member, "member");
        List list3 = list2;
        boolean z = false;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it8 = list3.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                oq9.t tVar = (oq9.t) it8.next();
                if (Intrinsics.f(tVar.f227855c, member) && tVar.e.isAfterNow()) {
                    z = true;
                    break;
                }
            }
        }
        if (lVar instanceof l.a) {
            int i = q.f291536a[((l.a) lVar).f291528a.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_owes_you, null, null, 14);
                if (z) {
                    compositeClause = new CompositeClause(zhm.v.k(textLocalisedClause, new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_groups_balances_debts_reminder_sent, null, null, 14)), null, null, null, 14);
                    textLocalisedClause = compositeClause;
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_you_owe, null, null, 14);
            }
        } else if (lVar.equals(l.c.f291529a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_owes_you, null, null, 14);
            if (z) {
                compositeClause = new CompositeClause(zhm.v.k(textLocalisedClause, new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_groups_balances_debts_reminder_sent, null, null, 14)), null, null, null, 14);
                textLocalisedClause = compositeClause;
            }
        } else {
            if (!lVar.equals(l.d.f291530a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_split_subtitle_you_owe, null, null, 14);
        }
        String str = "SETTLEMENT_MEMBER_INDIVIDUAL_ID_" + member.b();
        Intrinsics.checkNotNullParameter(member, "member");
        return new RowDelegate.Model(str, ((tr9.e) this.f291538a).i(member, nVar, null), tr9.e.d(member, true), null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(groupMemberSettleInfo.f79504b.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, new p(lVar, groupMemberSettleInfo, list), null, 0, 0, 0, 0, 532675544);
    }
}
