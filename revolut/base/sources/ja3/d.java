package ja3;

import a9j.k;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.ConfirmationPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ConfirmationPluginFactory$ConfirmationLaunchInstructions;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import do3.n;
import do3.q;
import dv9.m;
import dv9.t;
import efm.d0;
import grl.r2;
import hs3.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kv9.v;
import m9d.j1;
import ma2.s;
import mz3.t1;
import mz3.u1;
import mz3.w1;
import mz3.y1;
import noi.l;
import om4.y3;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import pfm.r;
import qua.p;
import qua.u;
import skm.p0;
import te0.w;
import tof.d8;
import tof.hc;
import tof.i1;
import tof.i3;
import tof.q6;
import zh9.u0;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f172418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f172419c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f172417a = i;
        this.f172418b = obj2;
        this.f172419c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    private final Object a(Object obj2) {
        Pair pair;
        List list;
        lv9.d dVar = (lv9.d) this.f172418b;
        lv9.a aVar = dVar.f200342c;
        nv9.b bVar = dVar.f200340a;
        m conversation = (m) this.f172419c;
        String reaction = (String) this.d;
        ChatItem chatItem = (ChatItem) this.e;
        Pair pair2 = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
        od0.i iVar = (od0.i) pair2.f186385a;
        n nVar = (n) pair2.f186386b;
        dv9.h hVar = (dv9.h) iVar.f224257a;
        String userCode = q.k(nVar);
        if (userCode == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dv9.g gVar = null;
        Object obj3 = null;
        gVar = null;
        if (hVar != null && (list = hVar.f) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((dv9.g) next).f118065b, userCode)) {
                    obj3 = next;
                    break;
                }
            }
            gVar = (dv9.g) obj3;
        }
        if (hVar != null) {
            String parentMessageId = hVar.f118067a;
            if (gVar != null) {
                if (Intrinsics.f(gVar.f118064a, reaction)) {
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(userCode, "userCode");
                    Intrinsics.checkNotNullParameter(parentMessageId, "parentMessageId");
                    jv9.b bVar2 = bVar.f219568b;
                    Intrinsics.checkNotNullParameter(parentMessageId, "parentMessageId");
                    pfm.a aVarE = bVar2.f178790a.removeReaction(parentMessageId).e(new pfm.h(new k(bVar, 23, parentMessageId, userCode), 1));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    return w.g0(aVarE);
                }
                bVar.getClass();
                Intrinsics.checkNotNullParameter(userCode, "userCode");
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                Intrinsics.checkNotNullParameter(parentMessageId, "parentMessageId");
                jv9.b bVar3 = bVar.f219568b;
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                Intrinsics.checkNotNullParameter(parentMessageId, "parentMessageId");
                d0<kv9.h> d0VarUpdateReaction = bVar3.f178790a.updateReaction(parentMessageId, new v(reaction));
                l lVar = new l(16, new nv9.a(bVar, userCode, 1));
                d0VarUpdateReaction.getClass();
                pfm.a aVar2 = new pfm.a(d0VarUpdateReaction, lVar, 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                r rVarG0 = w.g0(aVar2);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(reaction, "reaction");
                pfm.h hVar2 = new pfm.h(new la8.j(aVar, reaction, 4), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return rVarG0.e(hVar2);
            }
        }
        String relatedEntityId = c8g.a.i(chatItem);
        t relatedEntityType = c8g.a.k(chatItem);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(relatedEntityId, "relatedEntityId");
        Intrinsics.checkNotNullParameter(relatedEntityType, "relatedEntityType");
        jv9.b bVar4 = bVar.f219568b;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(relatedEntityId, "relatedEntityId");
        Intrinsics.checkNotNullParameter(relatedEntityType, "relatedEntityType");
        if (conversation instanceof dv9.k) {
            pair = new Pair(((dv9.k) conversation).f118074c, kv9.l.GROUP);
        } else {
            if (!(conversation instanceof dv9.l)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(((dv9.l) conversation).f118075b, kv9.l.PERSONAL);
        }
        d0<kv9.h> d0VarAddNewReaction = bVar4.f178790a.addNewReaction(new kv9.m(reaction, (String) pair.f186385a, (kv9.l) pair.f186386b, new kv9.n(relatedEntityId, relatedEntityType.name())));
        l lVar2 = new l(15, new nv9.a(bVar, userCode, 0));
        d0VarAddNewReaction.getClass();
        pfm.a aVar3 = new pfm.a(d0VarAddNewReaction, lVar2, 4);
        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
        r rVarG02 = w.g0(aVar3);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        pfm.h hVar3 = new pfm.h(new la8.j(aVar, reaction, 4), 2);
        Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
        return rVarG02.e(hVar3);
    }

    private final Object b(Object obj2) {
        List list;
        dj0.d dVar;
        Object objM;
        Object iVar;
        mce.d dVar2 = (mce.d) this.f172418b;
        nie.c cVar = (nie.c) this.f172419c;
        RecurringPaymentAccount recurringPaymentAccount = (RecurringPaymentAccount) this.d;
        RecurringPaymentFilter recurringPaymentFilter = (RecurringPaymentFilter) this.e;
        vf0.h hVar = (vf0.h) obj2;
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        List list2 = (List) hVar.f288433a;
        xi0.b bVar = (xi0.b) hVar.f288434b;
        List list3 = (List) hVar.f288435c;
        Map map = (Map) hVar.d;
        if (list2.isEmpty()) {
            return w.h(zi0.c.P(f0.f322471a, false, null, 3));
        }
        List list4 = list2;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        Iterator it8 = list4.iterator();
        while (true) {
            long jLongValue = 0;
            if (!it8.hasNext()) {
                break;
            }
            p pVar = (p) it8.next();
            Long l2 = pVar.f249323j;
            if (l2 != null) {
                jLongValue = l2.longValue();
            }
            xi0.a aVar = xi0.b.Companion;
            String str = pVar.i;
            aVar.getClass();
            arrayList.add(new dj0.d(jLongValue, xi0.a.a(str)));
        }
        dj0.d dVarA = dVar2.d.a(bVar, arrayList, list3);
        if (dVarA == null) {
            dVarA = new dj0.d(0L, bVar);
        }
        dj0.d dVar3 = dVarA;
        if (list2.size() == 1 && u.l((p) zhm.d0.b0(list2))) {
            return w.h(zi0.c.P(zhm.u.c(dVar2.f204344c.a(list2, dVar3, map, zhm.d0.b0(list2))), false, null, 3));
        }
        String str2 = cVar.getF89728b().f89729a;
        if (list2.size() == 1) {
            objM = ((rae.c) dVar2.e).c((p) zhm.d0.b0(list2), false);
        } else {
            if (!(recurringPaymentAccount instanceof RecurringPaymentAccount.Joint)) {
                if (recurringPaymentAccount instanceof RecurringPaymentAccount.Junior) {
                    String str3 = ((RecurringPaymentAccount.Junior) recurringPaymentAccount).f89319b;
                    wsg.n nVar = dVar2.f204343b;
                    d0 d0VarFirstOrError = m70.a.g(nim.a.w(kli.a.h(nVar.Y(str3), nVar.Q(str3)), new m9l.d(26)), null, new j1(15), 1).firstOrError();
                    ma1.v vVar = new ma1.v(18, new m98.k(recurringPaymentAccount, 12));
                    d0VarFirstOrError.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarFirstOrError, vVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    list = list2;
                    dVar = dVar3;
                    objM = iVar2;
                } else {
                    boolean z = recurringPaymentAccount instanceof RecurringPaymentAccount.Pro;
                    AccountId.Personal personal = AccountId.Personal.f51414a;
                    i1 i1Var = i1.f272794a;
                    if (z) {
                        list = list2;
                        dVar = dVar3;
                        iVar = d0.m(u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str2, null), ProductId.PRO), (TransactionContext) null), (String) null, (AccountId) personal, (rhf.h) null, rhf.g.PRO, (TransactionDestination) null, (q6) i1Var, (Set) null, recurringPaymentAccount, recurringPaymentFilter, false, 51887))));
                        Intrinsics.checkNotNullExpressionValue(iVar, "just(...)");
                    } else {
                        list = list2;
                        dVar = dVar3;
                        if (!(recurringPaymentAccount instanceof RecurringPaymentAccount.Personal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (cVar.getF89727a() == ProductId.CREDIT) {
                            d0 d0VarFirstOrError2 = m70.a.g(ue0.e.p(rd0.e.c(nim.a.v(((y3) dVar2.f204345g).f(str2, w4l.j.f294644c), new h0() { // from class: mce.b
                                @Override // kotlin.jvm.internal.h0, wim.p
                                public final Object get(Object obj3) {
                                    return ((yw4.p) obj3).f317326b;
                                }
                            }), kotlin.coroutines.g.f186406a), zhm.h0.f322473a), null, new j1(16), 1).firstOrError();
                            ma1.v vVar2 = new ma1.v(16, new s(str2, dVar2, 6));
                            d0VarFirstOrError2.getClass();
                            iVar = new ufm.i(d0VarFirstOrError2, vVar2, 1);
                            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        } else {
                            objM = d0.m(u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str2, null), ProductId.CURRENCY), (TransactionContext) null), (String) null, (AccountId) personal, (rhf.h) null, rhf.g.HOME, (TransactionDestination) null, (q6) i1Var, (Set) null, (RecurringPaymentAccount) RecurringPaymentAccount.Personal.f89320a, (RecurringPaymentFilter) null, false, 60079))));
                            Intrinsics.checkNotNullExpressionValue(objM, "just(...)");
                        }
                    }
                    objM = iVar;
                }
                sfm.b bVar2 = new sfm.b(objM, new ma1.v(17, new d(dVar2, list, dVar, map, 24)), 2);
                Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
                return bVar2;
            }
            RecurringPaymentAccount.Joint joint = (RecurringPaymentAccount.Joint) recurringPaymentAccount;
            objM = d0.m(u0.f(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str2, null), ProductId.JOINT), (TransactionContext) null), (String) null, com.revolut.feature.subscriptions.models.a.a(recurringPaymentAccount), (rhf.h) null, rhf.g.JOINT_HOME, (TransactionDestination) null, (q6) new hc(joint.f89317b, null), (Set) null, (RecurringPaymentAccount) joint, (RecurringPaymentFilter) null, false, 60079))));
            Intrinsics.checkNotNullExpressionValue(objM, "just(...)");
        }
        list = list2;
        dVar = dVar3;
        sfm.b bVar22 = new sfm.b(objM, new ma1.v(17, new d(dVar2, list, dVar, map, 24)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar22, "flatMapObservable(...)");
        return bVar22;
    }

    private final Object c(Object obj2) {
        mce.d dVar = (mce.d) this.f172418b;
        List list = (List) this.f172419c;
        dj0.d dVar2 = (dj0.d) this.d;
        Map map = (Map) this.e;
        NaviCommand naviCommand = (NaviCommand) obj2;
        Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
        return w.h(zi0.c.P(zhm.u.c(dVar.f204344c.a(list, dVar2, map, naviCommand)), false, null, 3));
    }

    private final Object d(Object obj2) {
        String str;
        DateTime dateTime = (DateTime) this.f172418b;
        DateTime dateTime2 = (DateTime) this.f172419c;
        i3 i3Var = (i3) this.d;
        AccountId accountId = (AccountId) this.e;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Set set = (Set) pair.f186385a;
        n nVar = (n) pair.f186386b;
        he3.d dVar = he3.d.SPENDINGS;
        CategorisationFilter.Scope.PocketsIdSet pocketsIdSet = new CategorisationFilter.Scope.PocketsIdSet(set);
        Interval interval = new Interval(dateTime, dateTime2);
        d8 d8Var = i3Var != null ? new d8(i3Var.getId()) : null;
        if (accountId instanceof AccountId.Joint) {
            str = ((AccountId.Joint) accountId).f51412a;
        } else {
            if (!Intrinsics.f(accountId, AccountId.Personal.f51414a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = nVar.f116408a;
        }
        return new CategorisationFilter(dVar, pocketsIdSet, interval, null, d8Var, null, null, null, y0.b(str), null, 744);
    }

    private final Object e(Object obj2) {
        it3.d dVar = (it3.d) this.f172418b;
        r2 r2Var = (r2) this.f172419c;
        wi0.b bVar = (wi0.b) this.d;
        String str = (String) this.e;
        ConfirmationPromptScreenConfig screenConfig = (ConfirmationPromptScreenConfig) obj2;
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        PluginPayload.Companion companion = PluginPayload.INSTANCE;
        ConfirmationPluginFactory$ConfirmationLaunchInstructions confirmationPluginFactory$ConfirmationLaunchInstructions = new ConfirmationPluginFactory$ConfirmationLaunchInstructions(screenConfig);
        companion.getClass();
        return PluginPayload.Companion.a(dVar, r2Var, bVar, str, confirmationPluginFactory$ConfirmationLaunchInstructions);
    }

    private final Object g(Object obj2) {
        Object obj3;
        Object next;
        ws3.a aVar = (ws3.a) this.f172418b;
        y1 y1Var = (y1) this.f172419c;
        CreditApplicationStatusNavigationConfig creditApplicationStatusNavigationConfig = (CreditApplicationStatusNavigationConfig) this.d;
        PluginPayload pluginPayload = (PluginPayload) this.e;
        ManualUnderwritingScreenConfig screenConfig = (ManualUnderwritingScreenConfig) obj2;
        Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
        int i = u1.f210691a[aVar.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            ufm.i iVar = new ufm.i(w.o0(p0.f264003c, new w1(y1Var, pluginPayload, continuation, 1)), new mz3.s(new t1(y1Var, creditApplicationStatusNavigationConfig, screenConfig, pluginPayload, 0), 14), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        if (i == 2) {
            ufm.i iVar2 = new ufm.i(w.o0(p0.f264003c, new w1(y1Var, pluginPayload, continuation, 0)), new mz3.s(new t1(y1Var, creditApplicationStatusNavigationConfig, screenConfig, pluginPayload, 1), 15), 0);
            Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
            return iVar2;
        }
        if (i == 3) {
            return y1Var.i(creditApplicationStatusNavigationConfig, screenConfig, pluginPayload);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        it3.d dVar = pluginPayload.f66247a;
        Object obj4 = dVar.e;
        if (!(obj4 instanceof z1)) {
            List list = dVar.f;
            if (list != null) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof z1) {
                        break;
                    }
                }
                obj3 = (hs3.v) next;
            } else {
                obj3 = null;
            }
        } else {
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.TicketorProgressMetadata");
            }
            obj3 = (z1) obj4;
        }
        if (obj3 == null) {
            throw new IllegalStateException(m72.b.r("Can't find metadata: ", o0.f186429a.b(z1.class)));
        }
        ufm.b bVarM = d0.m(new FeatureCommand(new CreditApplicationKompotFeatureConfig.ManualUnderwritingTicketor((z1) obj3, io3.h.R(pluginPayload, ""), screenConfig, null)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0d3e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.util.AttributeSet, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v214 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r7v39, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 3506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja3.d.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(m1i.i1 i1Var, r1i.h hVar, h0 h0Var, Function1 function1) {
        this.f172417a = 19;
        this.f172418b = i1Var;
        this.f172419c = hVar;
        this.d = h0Var;
        this.e = (kotlin.jvm.internal.q) function1;
    }
}
