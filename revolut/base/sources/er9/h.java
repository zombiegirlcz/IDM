package er9;

import androidx.room.util.DBUtil;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import ip0.v7;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f128570b;

    public /* synthetic */ h(x xVar, int i) {
        this.f128569a = i;
        this.f128570b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f128569a) {
            case 0:
                x xVar = this.f128570b;
                String groupId = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                ufm.i iVar = new ufm.i(new ufm.i(new ufm.c(new j(xVar, groupId, 0), 2), new eli.k(new h(xVar, 17), 16), 0), new eli.k(new eqd.h(10), 17), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 1:
                x xVar2 = this.f128570b;
                String groupId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId2, "groupId");
                return (List) v7.r("CACHE_KEY_BILLS", groupId2, xVar2.f128600h);
            case 2:
                x xVar3 = this.f128570b;
                String groupId3 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId3, "groupId");
                DBUtil.performBlocking(((yq9.c) xVar3.f128598c).f315994a, false, true, new y9d.c(groupId3, 17));
                DBUtil.performBlocking(xVar3.d.f315999a, false, true, new y9d.c(groupId3, 19));
                return Unit.f186387a;
            case 3:
                x xVar4 = this.f128570b;
                String groupId4 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId4, "groupId");
                ufm.i iVar2 = new ufm.i(new ufm.i(xVar4.c(groupId4), new eli.k(new i(xVar4, groupId4, 3), 22), 1), new a31.o(15, q.f128588a), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 4:
                x xVar5 = this.f128570b;
                String key = (String) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                return (Long) xVar5.f128600h.get(key);
            case 5:
                x xVar6 = this.f128570b;
                String groupId5 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId5, "groupId");
                return (List) v7.r("CACHE_KEY_SETTLEMENTS", groupId5, xVar6.f128600h);
            case 6:
                x xVar7 = this.f128570b;
                String groupId6 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId6, "groupId");
                DBUtil.performBlocking(xVar7.e.f316023a, false, true, new y9d.c(groupId6, 25));
                return Unit.f186387a;
            case 7:
                x xVar8 = this.f128570b;
                String groupId7 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId7, "groupId");
                ufm.i iVar3 = new ufm.i(new ufm.i(xVar8.c(groupId7), new eli.k(new i(xVar8, groupId7, 5), 23), 1), new a31.o(16, u.f128593a), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 8:
                x xVar9 = this.f128570b;
                String params = (String) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (List) v7.r("CACHE_KEY_DEBTS", params, xVar9.f128600h);
            case 9:
                x xVar10 = this.f128570b;
                String groupId8 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId8, "groupId");
                DBUtil.performBlocking(xVar10.f.f316008a, false, true, new y9d.c(groupId8, 21));
                return Unit.f186387a;
            case 10:
                x xVar11 = this.f128570b;
                String groupId9 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId9, "groupId");
                ufm.i iVar4 = new ufm.i(new ufm.i(xVar11.c(groupId9), new eli.k(new i(xVar11, groupId9, 2), 21), 1), new a31.o(14, r.f128589a), 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                return iVar4;
            case 11:
                x xVar12 = this.f128570b;
                String groupId10 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId10, "groupId");
                return (st9.f) xVar12.f128600h.get(x.b(groupId10));
            case 12:
                x xVar13 = this.f128570b;
                String groupId11 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId11, "groupId");
                return (cr9.b) v7.r("CACHE_KEY_MESSAGES_ELIGIBILITY_", groupId11, xVar13.f128600h);
            case 13:
                x xVar14 = this.f128570b;
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) xVar14.f128600h.get("CACHE_KEY_GROUPS");
            case 14:
                x xVar15 = this.f128570b;
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                DBUtil.performBlocking(xVar15.f128596a.f316005a, false, true, new ypd.i(6));
                DBUtil.performBlocking(xVar15.f128597b.f316016a, false, true, new ypd.i(8));
                xVar15.f128600h.remove("CACHE_KEY_GROUPS");
                return Unit.f186387a;
            case 15:
                x xVar16 = this.f128570b;
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ufm.i iVar5 = new ufm.i(new ufm.c(new a31.l(xVar16, 17), 2), new eli.k(new h(xVar16, 22), 28), 0);
                Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                ufm.i iVar6 = new ufm.i(iVar5, new a31.o(13, v.f128594a), 1);
                Intrinsics.checkNotNullExpressionValue(iVar6, "map(...)");
                return iVar6;
            case 16:
                x xVar17 = this.f128570b;
                String groupId12 = (String) obj2;
                Intrinsics.checkNotNullParameter(groupId12, "groupId");
                List list = (List) xVar17.f128600h.get("CACHE_KEY_GROUPS");
                Object obj3 = null;
                if (list == null) {
                    return null;
                }
                Iterator it11 = list.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next = it11.next();
                        if (Intrinsics.f(((PaymentGroup) next).getF79285a(), groupId12)) {
                            obj3 = next;
                        }
                    }
                }
                return (PaymentGroup) obj3;
            case 17:
                x xVar18 = this.f128570b;
                List paymentGroups = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentGroups, "paymentGroups");
                return xVar18.f128602l.k0(paymentGroups);
            case 18:
                x xVar19 = this.f128570b;
                cr9.v group = (cr9.v) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                return xVar19.e(group);
            case 19:
                x xVar20 = this.f128570b;
                List groups = (List) obj2;
                Intrinsics.checkNotNullParameter(groups, "groups");
                int i = 2;
                ufm.i iVar7 = new ufm.i(new ufm.c(new d73.a(groups, i), i), new eli.k(new h(xVar20, 21), 26), 0);
                Intrinsics.checkNotNullExpressionValue(iVar7, "flatMap(...)");
                return iVar7;
            case 20:
                x xVar21 = this.f128570b;
                xVar21.o.b("RELOAD_STRATEGY_KEY_GROUPS");
                qe0.s sVar = xVar21.f128605p;
                Unit unit = Unit.f186387a;
                sVar.f(unit);
                return unit;
            case 21:
                x xVar22 = this.f128570b;
                List paymentGroups2 = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentGroups2, "paymentGroups");
                return xVar22.f128602l.k0(paymentGroups2);
            case 22:
                x xVar23 = this.f128570b;
                List paymentGroup = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentGroup, "paymentGroup");
                return xVar23.f128602l.k0(paymentGroup);
            case 23:
                x xVar24 = this.f128570b;
                PaymentGroup paymentGroup2 = (PaymentGroup) obj2;
                Intrinsics.checkNotNullParameter(paymentGroup2, "paymentGroup");
                return xVar24.f128602l.r0(paymentGroup2);
            case 24:
                x xVar25 = this.f128570b;
                List groupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
                return xVar25.f128602l.j0(groupMembers);
            case 25:
                x xVar26 = this.f128570b;
                PaymentGroup paymentGroup3 = (PaymentGroup) obj2;
                w4l.f fVar = xVar26.f128606q;
                Intrinsics.h(paymentGroup3);
                xVar26.i(fVar, paymentGroup3);
                xVar26.f128605p.d = true;
                return Unit.f186387a;
            case 26:
                x xVar27 = this.f128570b;
                cr9.v paymentGroup4 = (cr9.v) obj2;
                Intrinsics.checkNotNullParameter(paymentGroup4, "paymentGroup");
                return xVar27.e(paymentGroup4);
            case 27:
                x xVar28 = this.f128570b;
                PaymentGroup paymentGroup5 = (PaymentGroup) obj2;
                w4l.f fVar2 = xVar28.f128606q;
                Intrinsics.h(paymentGroup5);
                xVar28.i(fVar2, paymentGroup5);
                xVar28.f128605p.d = true;
                return Unit.f186387a;
            case 28:
                x xVar29 = this.f128570b;
                List groups2 = (List) obj2;
                Intrinsics.checkNotNullParameter(groups2, "groups");
                yq9.l lVar = xVar29.f128597b;
                return z92.f.B(groups2, (List) DBUtil.performBlocking(lVar.f316016a, true, false, new ypd.i(lVar, 9)));
            default:
                x xVar30 = this.f128570b;
                List paymentGroup6 = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentGroup6, "paymentGroup");
                return xVar30.f128602l.k0(paymentGroup6);
        }
    }
}
