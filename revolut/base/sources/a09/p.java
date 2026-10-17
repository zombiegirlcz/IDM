package a09;

import ahe.v;
import androidx.room.util.DBUtil;
import au6.c3;
import au6.k3;
import au6.l0;
import au6.m3;
import au6.r1;
import au6.r3;
import au6.x1;
import au6.y3;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackInfo;
import com.revolut.feature.freelancer.common.models.FreelancerCashbackRates;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder;
import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatSummary;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplitSource;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.sso.api.models.OAuthUserInfo;
import ip0.wk;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jz8.v0;
import jz8.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import le.u1;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f276w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                p pVar = new p((q) this.f276w, (Continuation) obj4, 0);
                pVar.v = (List) obj3;
                return pVar.invokeSuspend(Unit.f186387a);
            case 1:
                p pVar2 = new p((a1a.d) this.f276w, (Continuation) obj4, 1);
                pVar2.v = (List) obj3;
                return pVar2.invokeSuspend(Unit.f186387a);
            case 2:
                p pVar3 = new p((a72.m) this.f276w, (Continuation) obj4, 2);
                pVar3.v = (MultibancoWithdrawalCode) obj3;
                return pVar3.invokeSuspend(Unit.f186387a);
            case 3:
                p pVar4 = new p((a72.m) this.f276w, (Continuation) obj4, 3);
                pVar4.v = (List) obj3;
                return pVar4.invokeSuspend(Unit.f186387a);
            case 4:
                p pVar5 = new p((a92.i) this.f276w, (Continuation) obj4, 4);
                pVar5.v = (Throwable) obj3;
                return pVar5.invokeSuspend(Unit.f186387a);
            case 5:
                p pVar6 = new p(3, 5, (Continuation) obj4);
                pVar6.v = (yfe.h) obj2;
                pVar6.f276w = (ahe.v) obj3;
                return pVar6.invokeSuspend(Unit.f186387a);
            case 6:
                p pVar7 = new p((akl.f0) this.f276w, (Continuation) obj4, 6);
                pVar7.v = (OAuthUserInfo) obj3;
                return pVar7.invokeSuspend(Unit.f186387a);
            case 7:
                p pVar8 = new p((alb.j) this.f276w, (Continuation) obj4, 7);
                pVar8.v = (Throwable) obj3;
                return pVar8.invokeSuspend(Unit.f186387a);
            case 8:
                p pVar9 = new p((are.b) this.f276w, (Continuation) obj4, 8);
                pVar9.v = (List) obj3;
                return pVar9.invokeSuspend(Unit.f186387a);
            case 9:
                p pVar10 = new p(3, 9, (Continuation) obj4);
                pVar10.v = (kqa.a) obj2;
                pVar10.f276w = (asa.g) obj3;
                return pVar10.invokeSuspend(Unit.f186387a);
            case 10:
                String str = ((AcquiringOrder$Id) obj2).f73342a;
                p pVar11 = new p((au6.v) this.f276w, (Continuation) obj4, 10);
                pVar11.v = (od0.i) obj3;
                return pVar11.invokeSuspend(Unit.f186387a);
            case 11:
                String str2 = ((AcquiringPayment$Id) obj2).f73363a;
                p pVar12 = new p((au6.d0) this.f276w, (Continuation) obj4, 11);
                pVar12.v = (od0.i) obj3;
                return pVar12.invokeSuspend(Unit.f186387a);
            case 12:
                p pVar13 = new p((au6.d0) this.f276w, (Continuation) obj4, 12);
                pVar13.v = (pr6.q) obj3;
                return pVar13.invokeSuspend(Unit.f186387a);
            case 13:
                p pVar14 = new p((l0) this.f276w, (Continuation) obj4, 13);
                pVar14.v = (rr6.a) obj3;
                return pVar14.invokeSuspend(Unit.f186387a);
            case 14:
                p pVar15 = new p((l0) this.f276w, (Continuation) obj4, 14);
                pVar15.v = (rr6.h) obj3;
                return pVar15.invokeSuspend(Unit.f186387a);
            case 15:
                BigDecimal value = ((rr6.o) obj3).getValue();
                p pVar16 = new p((l0) this.f276w, (Continuation) obj4, 15);
                pVar16.v = value;
                return pVar16.invokeSuspend(Unit.f186387a);
            case 16:
                p pVar17 = new p((l0) this.f276w, (Continuation) obj4, 16);
                pVar17.v = (rr6.j) obj3;
                return pVar17.invokeSuspend(Unit.f186387a);
            case 17:
                p pVar18 = new p((l0) this.f276w, (Continuation) obj4, 17);
                pVar18.v = (FreelancerCashbackInfo) obj3;
                return pVar18.invokeSuspend(Unit.f186387a);
            case 18:
                p pVar19 = new p((l0) this.f276w, (Continuation) obj4, 18);
                pVar19.v = (FreelancerCashbackRates) obj3;
                return pVar19.invokeSuspend(Unit.f186387a);
            case 19:
                p pVar20 = new p((r1) this.f276w, (Continuation) obj4, 19);
                pVar20.v = (List) obj3;
                return pVar20.invokeSuspend(Unit.f186387a);
            case 20:
                p pVar21 = new p((x1) this.f276w, (Continuation) obj4, 20);
                pVar21.v = (zr6.a) obj3;
                return pVar21.invokeSuspend(Unit.f186387a);
            case 21:
                p pVar22 = new p((c3) this.f276w, (Continuation) obj4, 21);
                pVar22.v = (od0.i) obj3;
                return pVar22.invokeSuspend(Unit.f186387a);
            case 22:
                p pVar23 = new p((c3) this.f276w, (Continuation) obj4, 22);
                pVar23.v = (List) obj3;
                return pVar23.invokeSuspend(Unit.f186387a);
            case 23:
                p pVar24 = new p((k3) this.f276w, (Continuation) obj4, 23);
                pVar24.v = (Set) obj3;
                return pVar24.invokeSuspend(Unit.f186387a);
            case 24:
                p pVar25 = new p((m3) this.f276w, (Continuation) obj4, 24);
                pVar25.v = (List) obj3;
                return pVar25.invokeSuspend(Unit.f186387a);
            case 25:
                p pVar26 = new p((r3) this.f276w, (Continuation) obj4, 25);
                pVar26.v = (od0.i) obj3;
                return pVar26.invokeSuspend(Unit.f186387a);
            case 26:
                p pVar27 = new p((r3) this.f276w, (Continuation) obj4, 26);
                pVar27.v = (List) obj3;
                return pVar27.invokeSuspend(Unit.f186387a);
            case 27:
                p pVar28 = new p((y3) this.f276w, (Continuation) obj4, 27);
                pVar28.v = (fs6.e) obj3;
                return pVar28.invokeSuspend(Unit.f186387a);
            case 28:
                p pVar29 = new p((y3) this.f276w, (Continuation) obj4, 28);
                pVar29.v = (List) obj3;
                return pVar29.invokeSuspend(Unit.f186387a);
            default:
                p pVar30 = new p((y3) this.f276w, (Continuation) obj4, 29);
                pVar30.v = (FreelancerVatSummary) obj3;
                return pVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 24;
        int i2 = 25;
        int i3 = 1;
        int i5 = 0;
        switch (this.u) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((q) this.f276w).f279c;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new v0(((u09.w) it8.next()).f276156a.name()));
                }
                cVar.G(new w0(arrayList), "KEY_DOMAIN_TABS", wim.z.d(o0.b(w0.class)));
                return Unit.f186387a;
            case 1:
                List list3 = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b1a.a aVar3 = ((a1a.d) this.f276w).f578c;
                List<RecurringSplit> list4 = list3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                for (RecurringSplit recurringSplit : list4) {
                    Intrinsics.checkNotNullParameter(recurringSplit, "<this>");
                    String str = recurringSplit.f79920a;
                    RecurringSplitSource recurringSplitSource = recurringSplit.f79921b;
                    arrayList2.add(new c1a.a(str, new c1a.b(recurringSplitSource.f79929a.name(), recurringSplitSource.f79930b), recurringSplit.f79922c.name(), recurringSplit.d, recurringSplit.e, recurringSplit.f, recurringSplit.f79923g));
                }
                aVar3.d(arrayList2);
                return Unit.f186387a;
            case 2:
                MultibancoWithdrawalCode multibancoWithdrawalCode = (MultibancoWithdrawalCode) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((a72.m) this.f276w).f1763b.c(zhm.u.c(gc0.c.w(multibancoWithdrawalCode)));
                return Unit.f186387a;
            case 3:
                List list5 = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c72.d dVar = ((a72.m) this.f276w).f1763b;
                List list6 = list5;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it9 = list6.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(gc0.c.w((MultibancoWithdrawalCode) it9.next()));
                }
                dVar.c(arrayList3);
                return Unit.f186387a;
            case 4:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (th10 == null) {
                    a92.i iVar = (a92.i) this.f276w;
                    iVar.H2(iVar.f2306q, new a82.l(17));
                    iVar.f2307r.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 5:
                yfe.h hVar = (yfe.h) this.v;
                ahe.v vVar = (ahe.v) this.f276w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (vVar instanceof v.a) {
                    return hVar;
                }
                if (vVar instanceof ahe.w) {
                    return ((ahe.w) vVar).f5037a;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                OAuthUserInfo oAuthUserInfo = (OAuthUserInfo) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((akl.f0) this.f276w).f6014b;
                Intrinsics.checkNotNullParameter(oAuthUserInfo, "<this>");
                ArrayList<OAuthUserInfo.ConnectedClient> arrayList4 = oAuthUserInfo.f105947a;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                for (OAuthUserInfo.ConnectedClient connectedClient : arrayList4) {
                    OAuthUserInfo.Client client = connectedClient.f105951a;
                    ckl.d dVar2 = new ckl.d(client.f105948a, client.f105949b, client.f105950c, client.d, client.e);
                    ArrayList<OAuthUserInfo.Connection> arrayList6 = connectedClient.f105952b;
                    ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayList6, 10));
                    for (OAuthUserInfo.Connection connection : arrayList6) {
                        String str2 = connection.f105953a;
                        ArrayList<OAuthUserInfo.Scope> arrayList8 = connection.f105954b;
                        ArrayList arrayList9 = new ArrayList(zhm.w.t(arrayList8, 10));
                        for (OAuthUserInfo.Scope scope : arrayList8) {
                            arrayList9.add(new ckl.n(scope.f105956a, scope.f105957b));
                        }
                        arrayList7.add(new ckl.k(connection.f105955c, str2, arrayList9));
                    }
                    arrayList5.add(new ckl.h(dVar2, arrayList7));
                }
                cVar2.G(new ckl.o(arrayList5), "OAUTH_USER_INFO", wim.z.d(o0.b(ckl.o.class)));
                return Unit.f186387a;
            case 7:
                Throwable th11 = (Throwable) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                alb.j jVar = (alb.j) this.f276w;
                jVar.H2(jVar.f6183r, new ab4.q(th11, i3));
                return Unit.f186387a;
            case 8:
                List list7 = (List) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = ((are.b) this.f276w).f8692c;
                DateTimeFormatter dateTimeFormatter = yqe.a.f316028a;
                Intrinsics.checkNotNullParameter(list7, "<this>");
                List<TeenProfile> list8 = list7;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(list8, 10));
                for (TeenProfile teenProfile : list8) {
                    Intrinsics.checkNotNullParameter(teenProfile, "<this>");
                    String str3 = teenProfile.f90334a;
                    String str4 = teenProfile.f90335b;
                    String str5 = teenProfile.f90336c;
                    String str6 = teenProfile.d.format(yqe.a.f316028a);
                    Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                    arrayList10.add(new zqe.f(str3, str4, str5, str6, oo3.a.d(teenProfile.e), teenProfile.f, teenProfile.f90337g, teenProfile.f90338h, teenProfile.i.name()));
                }
                eVar.G(arrayList10, "TEEN_PROFILE_CACHE_KEY", kii.e.o(zqe.f.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 9:
                kqa.a aVar11 = (kqa.a) this.v;
                asa.g gVar = (asa.g) this.f276w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(aVar11, gVar);
            case 10:
                od0.i iVar2 = (od0.i) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nr6.b bVar = (nr6.b) iVar2.f224257a;
                if (bVar != null) {
                    is6.a aVar14 = ((au6.v) this.f276w).e;
                    ks6.k kVarH = bu6.a.h(bVar);
                    aVar14.getClass();
                    DBUtil.performBlocking(aVar14.f168111a, false, true, new wk(aVar14, kVarH, 23));
                }
                return Unit.f186387a;
            case 11:
                od0.i iVar3 = (od0.i) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pr6.e eVar2 = (pr6.e) iVar3.f224257a;
                if (eVar2 != null) {
                    is6.c cVar3 = ((au6.d0) this.f276w).f9511c;
                    ks6.q qVarD = bu6.b.d(eVar2);
                    cVar3.getClass();
                    DBUtil.performBlocking(cVar3.f168123a, false, true, new wk(cVar3, qVarD, i));
                }
                return Unit.f186387a;
            case 12:
                pr6.q qVar = (pr6.q) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                is6.c cVar4 = ((au6.d0) this.f276w).f9511c;
                List list9 = qVar.f238959a;
                ArrayList arrayList11 = new ArrayList(zhm.w.t(list9, 10));
                Iterator it10 = list9.iterator();
                while (it10.hasNext()) {
                    arrayList11.add(bu6.b.d((pr6.e) it10.next()));
                }
                cVar4.getClass();
                DBUtil.performBlocking(cVar4.f168123a, false, true, new wk(cVar4, arrayList11, i2));
                return Unit.f186387a;
            case 13:
                rr6.a aVar17 = (rr6.a) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar5 = ((l0) this.f276w).f9564c;
                Map map = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(aVar17, "<this>");
                ArrayList<rr6.i> arrayList12 = aVar17.f256696a;
                ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                for (rr6.i iVar4 : arrayList12) {
                    Intrinsics.checkNotNullParameter(iVar4, "<this>");
                    arrayList13.add(new ot6.b(iVar4.f256712b, iVar4.d, mo3.a.p(iVar4.f256713c)));
                }
                cVar5.G(new ot6.a(arrayList13, mo3.a.p(aVar17.f256697b), mo3.a.p(aVar17.f256698c), oi0.d.R(aVar17.d)), "STORAGE_CACHE_KEY_CASHBACK_BOOSTER_CONFIG", wim.z.d(o0.b(ot6.a.class)));
                return Unit.f186387a;
            case 14:
                rr6.h hVar2 = (rr6.h) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar6 = ((l0) this.f276w).f9564c;
                Map map2 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(hVar2, "<this>");
                rr6.l lVar = hVar2.f256709a;
                ot6.d dVar3 = lVar != null ? new ot6.d(lVar.f256719a, oi0.d.R(lVar.f256720b)) : null;
                rr6.p pVar = hVar2.f256710b;
                cVar6.G(new ot6.c(dVar3, new ot6.e(pVar.f256727a, pVar.f256728b)), "STORAGE_CACHE_KEY_CASHBACK_BOOSTER_TIER", wim.z.d(o0.b(ot6.c.class)));
                return Unit.f186387a;
            case 15:
                BigDecimal bigDecimal = (BigDecimal) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((l0) this.f276w).f9564c.G(new rr6.o(bigDecimal), "STORAGE_CACHE_KEY_CASHBACK_RATES_CURRENT", wim.z.d(o0.b(rr6.o.class)));
                return Unit.f186387a;
            case 16:
                rr6.j jVar2 = (rr6.j) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar7 = ((l0) this.f276w).f9564c;
                Map map3 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(jVar2, "<this>");
                rr6.k kVar = jVar2.f256714a;
                dj0.d dVar4 = kVar.f256716a;
                long j2 = dVar4.f115082a;
                String str7 = dVar4.f115083b.f306286a;
                dj0.d dVar5 = kVar.f256717b;
                du6.d dVar6 = new du6.d(str7, dVar5.f115083b.f306286a, j2, dVar5.f115082a);
                rr6.q qVar2 = jVar2.f256715b;
                dj0.d dVar7 = qVar2.f256729a;
                long j3 = dVar7.f115082a;
                String str8 = dVar7.f115083b.f306286a;
                dj0.d dVar8 = qVar2.f256730b;
                long j5 = dVar8.f115082a;
                String str9 = dVar8.f115083b.f306286a;
                String string = qVar2.f256731c.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                cVar7.G(new du6.a(dVar6, new du6.k(j3, str8, str9, j5, string)), "STORAGE_CACHE_KEY_CASHBACK_INFO", wim.z.d(o0.b(du6.a.class)));
                return Unit.f186387a;
            case 17:
                FreelancerCashbackInfo freelancerCashbackInfo = (FreelancerCashbackInfo) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar8 = ((l0) this.f276w).f9564c;
                Map map4 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(freelancerCashbackInfo, "<this>");
                dj0.d dVar9 = freelancerCashbackInfo.f73276a;
                long j16 = dVar9.f115082a;
                String str10 = dVar9.f115083b.f306286a;
                dj0.d dVar10 = freelancerCashbackInfo.f73277b;
                long j22 = dVar10.f115082a;
                String str11 = dVar10.f115083b.f306286a;
                String string2 = freelancerCashbackInfo.f73278c.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                cVar8.G(new du6.b(j16, str10, str11, j22, string2), "STORAGE_CACHE_KEY_CASHBACK_INFO_LEGACY", wim.z.d(o0.b(du6.b.class)));
                return Unit.f186387a;
            case 18:
                FreelancerCashbackRates freelancerCashbackRates = (FreelancerCashbackRates) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar9 = ((l0) this.f276w).f9564c;
                Map map5 = ft6.k.f137948a;
                Intrinsics.checkNotNullParameter(freelancerCashbackRates, "<this>");
                LinkedHashMap linkedHashMap = freelancerCashbackRates.f73279a;
                ArrayList arrayList14 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str12 = (String) entry.getKey();
                    String plainString = ((BigDecimal) entry.getValue()).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    arrayList14.add(new du6.c(str12, plainString));
                }
                BigDecimal bigDecimal2 = freelancerCashbackRates.f73280b;
                if (bigDecimal2 != null) {
                    String plainString2 = bigDecimal2.toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                    arrayList14 = zhm.d0.F0(new du6.c("CUSTOM_RATE_KEY", plainString2), arrayList14);
                }
                cVar9.G(arrayList14, "STORAGE_CACHE_KEY_CASHBACK_RATES", kii.e.o(du6.c.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 19:
                List list10 = (List) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                is6.d dVar11 = ((r1) this.f276w).f9608b;
                List<BusinessCategory> list11 = list10;
                ArrayList arrayList15 = new ArrayList(zhm.w.t(list11, 10));
                for (BusinessCategory businessCategory : list11) {
                    Map map6 = ft6.k.f137948a;
                    Intrinsics.checkNotNullParameter(businessCategory, "<this>");
                    arrayList15.add(new ks6.t(businessCategory.f73442a, businessCategory.f73443b, businessCategory.d, businessCategory.e, businessCategory.f, businessCategory.f73444c));
                }
                dVar11.getClass();
                DBUtil.performBlocking(dVar11.f168128a, false, true, new wk(dVar11, arrayList15, 27));
                return Unit.f186387a;
            case 20:
                zr6.a aVar25 = (zr6.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x1) this.f276w).f9658c.G(aVar25, "CACHE_KEY_FREELANCER_PRICING_PLAN", wim.z.d(o0.b(zr6.a.class)));
                return Unit.f186387a;
            case 21:
                od0.i iVar5 = (od0.i) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                TaxHubCalendarEvent taxHubCalendarEvent = (TaxHubCalendarEvent) iVar5.f224257a;
                if (taxHubCalendarEvent != null) {
                    os6.b bVar2 = ((c3) this.f276w).d;
                    ps6.b bVarJ = bu6.f.j(taxHubCalendarEvent);
                    bVar2.getClass();
                    ((Long) DBUtil.performBlocking(bVar2.f229240a, false, true, new ood.k(bVar2, bVarJ, 22))).getClass();
                }
                return Unit.f186387a;
            case 22:
                List list12 = (List) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.b bVar3 = ((c3) this.f276w).d;
                List list13 = list12;
                ArrayList arrayList16 = new ArrayList(zhm.w.t(list13, 10));
                Iterator it11 = list13.iterator();
                while (it11.hasNext()) {
                    arrayList16.add(bu6.f.j((TaxHubCalendarEvent) it11.next()));
                }
                DBUtil.performBlocking(bVar3.f229240a, false, true, new os6.a(bVar3, arrayList16, i5));
                return Unit.f186387a;
            case 23:
                Set set = (Set) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((k3) this.f276w).f9561c.G(set, "STORAGE_KEY_TAX_TYPE", kii.e.o(ds6.j.class, KTypeProjection.INSTANCE, Set.class));
                return Unit.f186387a;
            case 24:
                List list14 = (List) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar3 = ((m3) this.f276w).f9575c;
                List<es6.d> list15 = list14;
                ArrayList arrayList17 = new ArrayList(zhm.w.t(list15, 10));
                for (es6.d dVar12 : list15) {
                    Object obj3 = bu6.g.f18689a;
                    Intrinsics.checkNotNullParameter(dVar12, "<this>");
                    String str13 = dVar12.f128866a;
                    String str14 = dVar12.f128867b;
                    String strH = u1.h(dVar12.f128868c, bu6.g.f18689a);
                    String str15 = strH == null ? "UNKNOWN" : strH;
                    String strH2 = u1.h(dVar12.d, bu6.g.f18690b);
                    arrayList17.add(new du6.g(str13, str14, str15, strH2 == null ? "UNKNOWN" : strH2, dVar12.e));
                }
                eVar3.G(arrayList17, "STORAGE_CACHE_KEY_TAX_POCKETS", kii.e.o(du6.g.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 25:
                od0.i iVar6 = (od0.i) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                FreelancerTaxProfile freelancerTaxProfile = (FreelancerTaxProfile) iVar6.f224257a;
                if (freelancerTaxProfile != null) {
                    os6.d dVar13 = ((r3) this.f276w).f9614c;
                    ps6.i iVarK = bu6.f.k(freelancerTaxProfile);
                    dVar13.getClass();
                    ((Long) DBUtil.performBlocking(dVar13.f229246a, false, true, new ood.k(dVar13, iVarK, i))).getClass();
                }
                return Unit.f186387a;
            case 26:
                List list16 = (List) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.d dVar14 = ((r3) this.f276w).f9614c;
                List list17 = list16;
                ArrayList arrayList18 = new ArrayList(zhm.w.t(list17, 10));
                Iterator it12 = list17.iterator();
                while (it12.hasNext()) {
                    arrayList18.add(bu6.f.k((FreelancerTaxProfile) it12.next()));
                }
                DBUtil.performBlocking(dVar14.f229246a, false, true, new os6.c(dVar14, arrayList18, i5));
                return Unit.f186387a;
            case 27:
                fs6.e eVar4 = (fs6.e) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar5 = ((y3) this.f276w).f9669c;
                Intrinsics.checkNotNullParameter(eVar4, "<this>");
                Set set2 = eVar4.f137603a;
                ArrayList arrayList19 = new ArrayList(zhm.w.t(set2, 10));
                Iterator it13 = set2.iterator();
                while (it13.hasNext()) {
                    arrayList19.add(((fs6.b) it13.next()).name());
                }
                String strName = eVar4.f137604b.name();
                Set set3 = eVar4.f137605c;
                ArrayList arrayList20 = new ArrayList(zhm.w.t(set3, 10));
                Iterator it14 = set3.iterator();
                while (it14.hasNext()) {
                    arrayList20.add(((fs6.a) it14.next()).name());
                }
                eVar5.G(new du6.m(arrayList19, arrayList20, strName), "STORAGE_CACHE_KEY_VAT_REMINDER_OPTIONS", wim.z.d(o0.b(du6.m.class)));
                return Unit.f186387a;
            case 28:
                List list18 = (List) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.e eVar6 = ((y3) this.f276w).d;
                List list19 = list18;
                ArrayList arrayList21 = new ArrayList(zhm.w.t(list19, 10));
                Iterator it15 = list19.iterator();
                while (it15.hasNext()) {
                    arrayList21.add(bu6.h.d((FreelancerVatReminder) it15.next()));
                }
                eVar6.getClass();
                return Unit.f186387a;
            default:
                FreelancerVatSummary freelancerVatSummary = (FreelancerVatSummary) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.f fVar = ((y3) this.f276w).e;
                Intrinsics.checkNotNullParameter(freelancerVatSummary, "<this>");
                String str16 = freelancerVatSummary.f73500a;
                String strName2 = freelancerVatSummary.f73501b.name();
                FreelancerVatSummary.Summary summary = freelancerVatSummary.f73502c;
                dj0.d dVar15 = summary.f73503a.f73508a;
                ps6.m mVar = new ps6.m(dVar15.f115082a, dVar15.f115083b.f306286a);
                FreelancerVatSummary.TaxRateSummary taxRateSummary = summary.f73504b;
                ps6.l lVar2 = taxRateSummary != null ? new ps6.l(taxRateSummary.f73506a.name(), taxRateSummary.f73507b) : null;
                dj0.d dVar16 = summary.f73505c.f73509a;
                ps6.o oVar = new ps6.o(str16, strName2, new ps6.k(mVar, lVar2, new ps6.n(dVar16.f115082a, dVar16.f115083b.f306286a)), freelancerVatSummary.d);
                fVar.getClass();
                ((Long) DBUtil.performBlocking(fVar.f229251a, false, true, new ood.k(fVar, oVar, 28))).getClass();
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f276w = obj2;
    }
}
