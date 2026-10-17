package rnd;

import android.content.Context;
import android.view.View;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.m;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255617a;

    public /* synthetic */ k(int i) {
        this.f255617a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        List listE0;
        List list;
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f255617a) {
            case 0:
                CreditCard creditCard = (CreditCard) obj2;
                Intrinsics.checkNotNullParameter(creditCard, "creditCard");
                return new AnalyticsAccount.Personal.CreditCard(creditCard.f69793b);
            case 1:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list2 = pockets;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new AnalyticsAccount.Personal.CurrencyPocket(((io3.d) it8.next()).f163145a));
                }
                return arrayList;
            case 2:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list3 = (List) rVar.f314201a;
                List list4 = (List) rVar.f314202b;
                List list5 = (List) rVar.f314203c;
                aim.e eVarB = zhm.u.b();
                eVarB.add(AnalyticsAccount.Personal.All.f99192a);
                eVarB.addAll(list4);
                eVarB.addAll(list3);
                eVarB.addAll(list5);
                return zhm.u.a(eVarB);
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return AnalyticsAccount.Personal.All.f99192a;
            case 4:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                aim.e eVarB2 = zhm.u.b();
                eVarB2.add(AnalyticsAccount.Pro.All.f99196a);
                List list6 = pockets2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it9 = list6.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(new AnalyticsAccount.Pro.CurrencyPocket(((io3.d) it9.next()).f163145a));
                }
                eVarB2.addAll(arrayList2);
                return zhm.u.a(eVarB2);
            case 5:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                List list7 = pockets3;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it10 = list7.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(new AnalyticsAccount.Personal.CreditCard(((io3.d) it10.next()).f163145a));
                }
                return arrayList3;
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Map map = (Map) pair.f186385a;
                List list8 = (List) pair.f186386b;
                Collection<JuniorBankingProfile> collectionValues = map.values();
                ArrayList arrayList4 = new ArrayList();
                for (JuniorBankingProfile juniorBankingProfile : collectionValues) {
                    String str = juniorBankingProfile.f77103j;
                    String str2 = juniorBankingProfile.f77099b;
                    AnalyticsAccount.Junior.All all2 = new AnalyticsAccount.Junior.All(str, str2);
                    String str3 = juniorBankingProfile.f77103j;
                    List listC = zhm.u.c(all2);
                    Iterator it11 = list8.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            next = it11.next();
                            if (Intrinsics.f(str3, ((fo3.c) ((Pair) next).f186385a).f136805h)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Pair pair2 = (Pair) next;
                    if (pair2 == null || (list = (List) pair2.f186386b) == null) {
                        listE0 = listC;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : list) {
                            if (((io3.d) obj3).e == io3.l.CURRENT) {
                                arrayList5.add(obj3);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it12 = arrayList5.iterator();
                        while (it12.hasNext()) {
                            arrayList6.add(new AnalyticsAccount.Junior.CurrencyPocket(str3, str2, ((io3.d) it12.next()).f163145a));
                        }
                        listE0 = zhm.d0.E0(arrayList6, listC);
                    }
                    zhm.a0.x(listE0, arrayList4);
                }
                return arrayList4;
            case 7:
                Map juniorProfile = (Map) obj2;
                Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
                Collection<JuniorBankingProfile> collectionValues2 = juniorProfile.values();
                ArrayList arrayList7 = new ArrayList(zhm.w.t(collectionValues2, 10));
                for (JuniorBankingProfile juniorBankingProfile2 : collectionValues2) {
                    arrayList7.add(new AnalyticsAccount.Junior.All(juniorBankingProfile2.f77103j, juniorBankingProfile2.f77099b));
                }
                return arrayList7;
            case 8:
                return zhm.w.u((List) obj2);
            case 9:
                List list9 = (List) obj2;
                if (list9.isEmpty()) {
                    return zhm.f0.f322471a;
                }
                List list10 = list9;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list10, 10));
                Iterator it13 = list10.iterator();
                while (it13.hasNext()) {
                    arrayList8.add(new AnalyticsAccount.Savings.PersonalIndividual(((SavingsAccountDetails) ((npg.a) it13.next()).f218206b).f86460a.f234881a));
                }
                kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(2);
                s0Var.b(arrayList8.toArray(new AnalyticsAccount.Savings.PersonalIndividual[0]));
                s0Var.a(AnalyticsAccount.Savings.PersonalAll.f99203a);
                ArrayList arrayList9 = s0Var.f186433a;
                return zhm.v.k(arrayList9.toArray(new AnalyticsAccount.Savings[arrayList9.size()]));
            case 10:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                AnalyticsAccountsSelection.TotalWealth.Companion companion = AnalyticsAccountsSelection.TotalWealth.INSTANCE;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj4 : accounts) {
                    AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj4;
                    if ((analyticsAccount instanceof AnalyticsAccount.Personal.All) || (analyticsAccount instanceof AnalyticsAccount.Joint.All) || (analyticsAccount instanceof AnalyticsAccount.Pro.All) || (analyticsAccount instanceof AnalyticsAccount.Junior.All) || (analyticsAccount instanceof AnalyticsAccount.Linked)) {
                        arrayList10.add(obj4);
                    } else if (!(analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving) && !Intrinsics.f(analyticsAccount, AnalyticsAccount.Savings.PersonalAll.f99203a) && !(analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) && !(analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) && !(analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) && !(analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                Set setI1 = zhm.d0.i1(arrayList10);
                companion.getClass();
                return AnalyticsAccountsSelection.TotalWealth.Companion.a(setI1);
            case 11:
                List files = (List) obj2;
                Intrinsics.checkNotNullParameter(files, "files");
                return zhm.d0.P0(files, new rnf.j());
            case 12:
                iel.t it14 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14.f160814a == iel.u.ADD);
            case 13:
                iel.t it15 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(it15.f160814a == iel.u.REMOVE);
            case 14:
                iel.t it16 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16.f160814a == iel.u.ADD);
            case 15:
                iel.t it17 = (iel.t) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.f160814a == iel.u.REMOVE);
            case 16:
                Context context = (Context) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                return wr0.a.a(context);
            case 17:
                View child = (View) obj2;
                Intrinsics.checkNotNullParameter(child, "child");
                return new ro0.x(child.getTranslationX() + child.getLeft(), child.getTranslationY() + child.getTop(), child.getTranslationX() + child.getRight(), child.getTranslationY() + child.getBottom());
            case 18:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM crypto_wallets");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 19:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM crypto_addresses");
                try {
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 20:
                Map profiles = (Map) obj2;
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                Set setKeySet = profiles.keySet();
                ArrayList arrayList11 = new ArrayList(zhm.w.t(setKeySet, 10));
                Iterator it18 = setKeySet.iterator();
                while (it18.hasNext()) {
                    arrayList11.add(new djb.l(((RegisteredIdentityId) it18.next()).f74764a));
                }
                return arrayList11;
            case 21:
                Map profiles2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(profiles2, "profiles");
                Set<Map.Entry> setEntrySet = profiles2.entrySet();
                int iB = zhm.q0.b(zhm.w.t(setEntrySet, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(((RegisteredIdentityId) entry.getKey()).f74764a, ((TeenProfile) entry.getValue()).f90335b);
                }
                return linkedHashMap;
            case 22:
                List accountLists = (List) obj2;
                Intrinsics.checkNotNullParameter(accountLists, "accountLists");
                return zhm.w.u(accountLists);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                return zhm.v.k(nb0.a(nb0Var, "LOADING_STATE_ID_1", false, 6), nb0.a(nb0Var, "LOADING_STATE_ID_2", false, 6), nb0.a(nb0Var, "LOADING_STATE_ID_3", false, 6));
            case 24:
                InputTextDelegate.TextData it19 = (InputTextDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f52598b.toString();
            case 25:
                rp0.a0 state = (rp0.a0) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(!state.f256040a);
            case 26:
                rp0.a0 state2 = (rp0.a0) obj2;
                Intrinsics.checkNotNullParameter(state2, "state");
                return Boolean.valueOf(!state2.f256040a);
            case 27:
                rp0.a0 it20 = (rp0.a0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new m.a(it20.f256041b);
            case 28:
                ty0.a data = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return new rp0.z(data.f275445a, data.d);
            default:
                rp0.a0 it21 = (rp0.a0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(!it21.f256040a);
        }
    }

    public /* synthetic */ k(Object obj2, int i) {
        this.f255617a = i;
    }
}
