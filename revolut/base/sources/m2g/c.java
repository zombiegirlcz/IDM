package m2g;

import aim.e;
import android.animation.Animator;
import androidx.core.animation.AnimatorKt;
import aw0.y4;
import com.revolut.chat.data.repository.chat.ChatRating;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import ip0.bo0;
import ip0.gu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2j.a0;
import m2j.c0;
import m2j.d0;
import m2j.j;
import m2j.l0;
import m2j.q;
import m30.f;
import od0.i;
import pcd.s;
import v30.s0;
import vf0.h;
import vf0.z;
import w30.m;
import yhm.r;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202004a;

    public /* synthetic */ c(int i) {
        this.f202004a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        Throwable error;
        Throwable error2;
        int i = this.f202004a;
        int i2 = 4;
        m2j.a aVar = m2j.a.f202010a;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("RECOMMENDED_CATEGORIES_SUBHEADER_ITEM_ID", 0, 0, 30);
                ArrayList arrayList = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    bo0 bo0Var = new bo0(a0.d.n("RECOMMENDED_CATEGORIES_ITEM_ID_", i3));
                    yp0.b.l(bo0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(bo0Var);
                }
                return v.k(guVar, new hg("RECOMMENDED_CATEGORIES_SCROLLER_ITEM_ID", arrayList, 2, new y4(d.f202005a), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656));
            case 1:
                BalanceWrapper it8 = (BalanceWrapper) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.getF99406c().f306286a;
            case 2:
                z zVar = (z) obj2;
                Intrinsics.checkNotNullParameter(zVar, "<destruct>");
                Pair pair = (Pair) zVar.f288494a;
                List list = (List) zVar.f288495b;
                m2j.c cVar = (m2j.c) zVar.f288496c;
                m2j.c cVar2 = (m2j.c) zVar.d;
                m2j.c cVar3 = (m2j.c) zVar.e;
                m2j.c cVar4 = (m2j.c) zVar.f;
                m2j.c cVar5 = (m2j.c) zVar.f288497g;
                m2j.c cVar6 = (m2j.c) zVar.f288498h;
                List list2 = (List) zVar.i;
                List list3 = (List) zVar.f288499j;
                m2j.c cVar7 = (m2j.c) zVar.k;
                List list4 = (List) zVar.f288500l;
                m2j.c cVar8 = (m2j.c) zVar.f288501m;
                e eVarB = u.b();
                m2j.c cVar9 = (m2j.c) pair.f186385a;
                m2j.c cVar10 = (m2j.c) pair.f186386b;
                j.c(eVarB, cVar9);
                j.c(eVarB, cVar10);
                j.c(eVarB, cVar5);
                eVarB.addAll(list);
                j.c(eVarB, cVar3);
                j.c(eVarB, cVar4);
                j.c(eVarB, cVar6);
                j.c(eVarB, cVar);
                j.c(eVarB, cVar2);
                eVarB.addAll(list2);
                eVarB.addAll(list3);
                j.c(eVarB, cVar7);
                eVarB.addAll(list4);
                j.c(eVarB, cVar8);
                return u.a(eVarB);
            case 3:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                z = data.getContent() != null;
                if (!z && (error = data.getError()) != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                }
                return Boolean.valueOf(z);
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                m2j.c cVar11 = (m2j.c) pair2.f186385a;
                m2j.c cVar12 = (m2j.c) pair2.f186386b;
                e eVarB2 = u.b();
                j.c(eVarB2, cVar11);
                j.c(eVarB2, cVar12);
                return u.a(eVarB2);
            case 5:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                m2j.c cVar13 = (m2j.c) rVar.f314201a;
                m2j.c cVar14 = (m2j.c) rVar.f314202b;
                m2j.c cVar15 = (m2j.c) rVar.f314203c;
                e eVarB3 = u.b();
                j.c(eVarB3, cVar13);
                j.c(eVarB3, cVar14);
                j.c(eVarB3, cVar15);
                return u.a(eVarB3);
            case 6:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                m2j.c cVar16 = (m2j.c) pair3.f186385a;
                m2j.c cVar17 = (m2j.c) pair3.f186386b;
                e eVarB4 = u.b();
                j.c(eVarB4, cVar16);
                j.c(eVarB4, cVar17);
                return u.a(eVarB4);
            case 7:
                Data data2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                z = data2.getContent() != null;
                if (!z && (error2 = data2.getError()) != null) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var2);
                }
                return Boolean.valueOf(z);
            case 8:
                h hVar = (h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                m2j.c cVar18 = (m2j.c) hVar.f288433a;
                m2j.c cVar19 = (m2j.c) hVar.f288434b;
                m2j.c cVar20 = (m2j.c) hVar.f288435c;
                m2j.c cVar21 = (m2j.c) hVar.d;
                e eVarB5 = u.b();
                j.c(eVarB5, cVar18);
                j.c(eVarB5, cVar19);
                j.c(eVarB5, cVar20);
                j.c(eVarB5, cVar21);
                return u.a(eVarB5);
            case 9:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : pockets) {
                    if (((io3.d) obj3).f163155q) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 10:
                i optional = (i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                n38.a aVar2 = (n38.a) optional.f224257a;
                AccountId.Joint jointC = aVar2 != null ? l38.a.c(aVar2) : null;
                i.Companion.getClass();
                return od0.h.a(jointC);
            case 11:
                BalanceWrapper it9 = (BalanceWrapper) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.getF99406c().f306286a;
            case 12:
                String userCountry = (String) obj2;
                Intrinsics.checkNotNullParameter(userCountry, "userCountry");
                wi0.b.Companion.getClass();
                return Boolean.valueOf(!Intrinsics.f(userCountry, "JP"));
            case 13:
                io3.d it10 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f163147c;
            case 14:
                List balanceWrappers = (List) obj2;
                Intrinsics.checkNotNullParameter(balanceWrappers, "balanceWrappers");
                return !balanceWrappers.isEmpty() ? new m2j.b(new k1j.b(k1j.c.PRO_VAULTS, q.a(R$string.payments_balance_picker_section_vaults_title), balanceWrappers, i2)) : aVar;
            case 15:
                List vaults = (List) obj2;
                Intrinsics.checkNotNullParameter(vaults, "vaults");
                return vaults.isEmpty() ? aVar : new m2j.b(new k1j.b(k1j.c.JOINT_SUBACCOUNTS, q.a(R$string.payments_balance_picker_section_vaults_title), vaults, i2));
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 17:
                List profilesWithSavingsInfo = (List) obj2;
                Intrinsics.checkNotNullParameter(profilesWithSavingsInfo, "profilesWithSavingsInfo");
                List<Pair> list5 = profilesWithSavingsInfo;
                ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
                for (Pair pair4 : list5) {
                    a0 a0Var = (a0) pair4.f186385a;
                    List list6 = ((ejb.b) pair4.f186386b).f126837b;
                    ArrayList arrayList4 = new ArrayList(w.t(list6, 10));
                    Iterator it11 = list6.iterator();
                    while (it11.hasNext()) {
                        arrayList4.add(new c0(a0Var, (SavingsAccountDetails) it11.next()));
                    }
                    arrayList3.add(arrayList4);
                }
                return w.u(arrayList3);
            case 18:
                List<Pair> availabilityMap = (List) obj2;
                Intrinsics.checkNotNullParameter(availabilityMap, "availabilityMap");
                ArrayList arrayList5 = new ArrayList();
                for (Pair pair5 : availabilityMap) {
                    a0 a0Var2 = (a0) pair5.f186385a;
                    if (!((Boolean) pair5.f186386b).booleanValue()) {
                        a0Var2 = null;
                    }
                    if (a0Var2 != null) {
                        arrayList5.add(a0Var2);
                    }
                }
                return arrayList5;
            case 19:
                List<Pair> availabilityMap2 = (List) obj2;
                Intrinsics.checkNotNullParameter(availabilityMap2, "availabilityMap");
                ArrayList arrayList6 = new ArrayList();
                for (Pair pair6 : availabilityMap2) {
                    a0 a0Var3 = (a0) pair6.f186385a;
                    if (!((Boolean) pair6.f186386b).booleanValue()) {
                        a0Var3 = null;
                    }
                    if (a0Var3 != null) {
                        arrayList6.add(a0Var3);
                    }
                }
                return arrayList6;
            case 20:
                List profilesWithVaults = (List) obj2;
                Intrinsics.checkNotNullParameter(profilesWithVaults, "profilesWithVaults");
                List<Pair> list7 = profilesWithVaults;
                ArrayList arrayList7 = new ArrayList(w.t(list7, 10));
                for (Pair pair7 : list7) {
                    a0 a0Var4 = (a0) pair7.f186385a;
                    List list8 = (List) pair7.f186386b;
                    ArrayList arrayList8 = new ArrayList(w.t(list8, 10));
                    Iterator it12 = list8.iterator();
                    while (it12.hasNext()) {
                        arrayList8.add(new d0(a0Var4, (s) it12.next()));
                    }
                    arrayList7.add(arrayList8);
                }
                return w.u(arrayList7);
            case 21:
                psg.a juniorWalletProfile = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(juniorWalletProfile, "juniorWalletProfile");
                return Boolean.valueOf(ta6.a.A(juniorWalletProfile));
            case 22:
                bla.c it13 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13 == bla.c.ENABLED);
            case 23:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                List list9 = walletsWithPockets;
                int iB = q0.b(w.t(list9, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj4 : list9) {
                    linkedHashMap.put(((fo3.c) ((Pair) obj4).f186385a).f136801a, obj4);
                }
                return linkedHashMap;
            case 24:
                List profilesWithExtra = (List) obj2;
                Intrinsics.checkNotNullParameter(profilesWithExtra, "profilesWithExtra");
                List list10 = profilesWithExtra;
                int iB2 = q0.b(w.t(list10, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj5 : list10) {
                    linkedHashMap2.put(((a0) obj5).f202011a.f77103j, obj5);
                }
                return linkedHashMap2;
            case 25:
                List profilesWithVaults2 = (List) obj2;
                Intrinsics.checkNotNullParameter(profilesWithVaults2, "profilesWithVaults");
                List<Pair> list11 = profilesWithVaults2;
                ArrayList arrayList9 = new ArrayList(w.t(list11, 10));
                for (Pair pair8 : list11) {
                    TeenProfile teenProfile = (TeenProfile) pair8.f186385a;
                    List list12 = (List) pair8.f186386b;
                    ArrayList arrayList10 = new ArrayList(w.t(list12, 10));
                    Iterator it14 = list12.iterator();
                    while (it14.hasNext()) {
                        arrayList10.add(new l0(teenProfile, (s) it14.next()));
                    }
                    arrayList9.add(arrayList10);
                }
                return w.u(arrayList9);
            case 26:
                List profileAndPocketsList = (List) obj2;
                Intrinsics.checkNotNullParameter(profileAndPocketsList, "profileAndPocketsList");
                return w.u(profileAndPocketsList);
            case 27:
                return AnimatorKt.addPauseListener$lambda$0((Animator) obj2);
            case 28:
                return AnimatorKt.addPauseListener$lambda$1((Animator) obj2);
            default:
                List callRequests = (List) obj2;
                Intrinsics.checkNotNullParameter(callRequests, "callRequests");
                ArrayList arrayList11 = new ArrayList();
                for (Object obj6 : callRequests) {
                    m mVar = (m) obj6;
                    s0 s0Var = mVar.f294093b;
                    if (s0Var == s0.OPEN || s0Var == s0.ASSIGNED || s0Var == s0.AWAITING_RESPONSE || s0Var == s0.RESOLVED || (s0Var == s0.CLOSED && (mVar.f294096h instanceof ChatRating.NotRated))) {
                        arrayList11.add(obj6);
                    }
                }
                return zhm.d0.P0(arrayList11, new f());
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f202004a = i;
    }
}
