package akl;

import androidx.room.util.DBUtil;
import com.revolut.sso.api.models.ConsentedClient;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f5997w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(e1 e1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f5997w = e1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c1 c1Var = new c1(this.f5997w, continuation, 0);
                c1Var.v = list;
                return c1Var.invokeSuspend(Unit.f186387a);
            default:
                c1 c1Var2 = new c1(this.f5997w, continuation, 1);
                c1Var2.v = list;
                return c1Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vjl.p pVar;
        vjl.e eVar;
        int i = this.u;
        int i2 = 10;
        e1 e1Var = this.f5997w;
        switch (i) {
            case 0:
                List list = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tjl.d dVar = e1Var.f6005c;
                List<UserInfoAccount> list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (UserInfoAccount userInfoAccount : list2) {
                    Intrinsics.checkNotNullParameter(userInfoAccount, "<this>");
                    String str = userInfoAccount.f106203a;
                    String str2 = userInfoAccount.f106204b;
                    String str3 = userInfoAccount.f106205c;
                    int i3 = yjl.x.f314558b[userInfoAccount.e.ordinal()];
                    if (i3 == 1) {
                        pVar = vjl.p.PERSONAL;
                    } else if (i3 == 2) {
                        pVar = vjl.p.BUSINESS;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pVar = vjl.p.UNKNOWN;
                    }
                    UserInfoAccount.Claim claim = userInfoAccount.f;
                    vjl.m mVar = claim != null ? new vjl.m(claim.f106211a, claim.f106213c, claim.f106212b) : null;
                    UserInfoAccount.Claim claim2 = userInfoAccount.f106206g;
                    vjl.m mVar2 = claim2 != null ? new vjl.m(claim2.f106211a, claim2.f106213c, claim2.f106212b) : null;
                    UserInfoAccount.Address address = userInfoAccount.f106207h;
                    arrayList.add(new vjl.q(str, str2, str3, pVar, mVar, mVar2, address != null ? new vjl.k(address.f106208a, address.f106209b, address.f106210c, address.d, address.e) : null));
                }
                DBUtil.performBlocking(dVar.f271812a, false, true, new tjl.c(dVar, arrayList, 0));
                return Unit.f186387a;
            default:
                List list3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tjl.b bVar = e1Var.f6004b;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    ConsentedClient consentedClient = (ConsentedClient) it8.next();
                    Intrinsics.checkNotNullParameter(consentedClient, "<this>");
                    String str4 = consentedClient.f105928a;
                    String str5 = consentedClient.f105929b;
                    ArrayList<ConsentedClient.Consent> arrayList3 = consentedClient.f105930c;
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i2));
                    for (ConsentedClient.Consent consent : arrayList3) {
                        boolean z = consent.f105931a;
                        String str6 = consent.f105932b;
                        String str7 = consent.f105933c;
                        ArrayList arrayList5 = consent.d;
                        Iterator it9 = it8;
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, i2));
                        Iterator it10 = arrayList5.iterator();
                        while (it10.hasNext()) {
                            ConsentedClient.Consent.Claim claim3 = (ConsentedClient.Consent.Claim) it10.next();
                            Iterator it11 = it10;
                            switch (yjl.k.f314548b[claim3.f105934a.ordinal()]) {
                                case 1:
                                    eVar = vjl.e.ADDRESS;
                                    break;
                                case 2:
                                    eVar = vjl.e.BIRTH_DATE;
                                    break;
                                case 3:
                                    eVar = vjl.e.CITIZENSHIP;
                                    break;
                                case 4:
                                    eVar = vjl.e.EMAIL;
                                    break;
                                case 5:
                                    eVar = vjl.e.NAME;
                                    break;
                                case 6:
                                    eVar = vjl.e.PHONE;
                                    break;
                                case 7:
                                    eVar = vjl.e.UNKNOWN;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            arrayList6.add(new vjl.f(eVar, claim3.f105935b));
                            it10 = it11;
                        }
                        arrayList4.add(new vjl.h(str6, str7, consent.e, arrayList6, z));
                        it8 = it9;
                        i2 = 10;
                    }
                    arrayList2.add(new vjl.i(str4, str5, arrayList4, consentedClient.d, consentedClient.e, consentedClient.f));
                    i2 = 10;
                }
                DBUtil.performBlocking(bVar.f271806a, false, true, new tjl.a(bVar, arrayList2, 0));
                return Unit.f186387a;
        }
    }
}
