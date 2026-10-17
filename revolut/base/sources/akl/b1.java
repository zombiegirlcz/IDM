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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ e1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(e1 e1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = e1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b1(this.v, continuation, 0);
            default:
                return new b1(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b1) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        gkl.r1 r1Var;
        com.revolut.sso.api.models.c cVar;
        int i = this.u;
        String str = "value";
        int i2 = 10;
        int i3 = 3;
        e1 e1Var = this.v;
        switch (i) {
            case 0:
                String str2 = "value";
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tjl.d dVar = e1Var.f6005c;
                List<vjl.q> list = (List) DBUtil.performBlocking(dVar.f271812a, true, false, new tjf.e(dVar, 4));
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (vjl.q qVar : list) {
                    Intrinsics.checkNotNullParameter(qVar, "<this>");
                    String str3 = qVar.f289820a;
                    String str4 = str2;
                    Intrinsics.checkNotNullParameter(str3, str4);
                    String str5 = qVar.f289821b;
                    String str6 = qVar.f289822c;
                    int i5 = yjl.x.f314559c[qVar.d.ordinal()];
                    if (i5 == 1) {
                        r1Var = gkl.r1.PERSONAL;
                    } else if (i5 == 2) {
                        r1Var = gkl.r1.BUSINESS;
                    } else {
                        if (i5 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r1Var = gkl.r1.UNKNOWN;
                    }
                    gkl.r1 r1Var2 = r1Var;
                    vjl.m mVar = qVar.e;
                    UserInfoAccount.Claim claim = mVar != null ? new UserInfoAccount.Claim(mVar.f289817a, mVar.f289819c, mVar.f289818b) : null;
                    vjl.m mVar2 = qVar.f;
                    UserInfoAccount.Claim claim2 = mVar2 != null ? new UserInfoAccount.Claim(mVar2.f289817a, mVar2.f289819c, mVar2.f289818b) : null;
                    vjl.k kVar = qVar.f289823g;
                    arrayList.add(new UserInfoAccount(str3, str5, str6, null, r1Var2, claim, claim2, kVar != null ? new UserInfoAccount.Address(kVar.f289814a, kVar.f289815b, kVar.f289816c, kVar.d, kVar.e) : null));
                    str2 = str4;
                    i3 = 3;
                }
                return arrayList;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tjl.b bVar = e1Var.f6004b;
                List list2 = (List) DBUtil.performBlocking(bVar.f271806a, true, false, new tjf.e(bVar, i3));
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    vjl.i iVar = (vjl.i) it8.next();
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    String str7 = iVar.f289811a;
                    Intrinsics.checkNotNullParameter(str7, str);
                    String str8 = iVar.f289812b;
                    List<vjl.h> list3 = iVar.f289813c;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, i2));
                    for (vjl.h hVar : list3) {
                        boolean z = hVar.f289808a;
                        String str9 = hVar.f289809b;
                        String str10 = hVar.f289810c;
                        List list4 = hVar.d;
                        Iterator it9 = it8;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, i2));
                        Iterator it10 = list4.iterator();
                        while (it10.hasNext()) {
                            vjl.f fVar = (vjl.f) it10.next();
                            Iterator it11 = it10;
                            switch (yjl.k.f314549c[fVar.f289806a.ordinal()]) {
                                case 1:
                                    cVar = com.revolut.sso.api.models.c.ADDRESS;
                                    break;
                                case 2:
                                    cVar = com.revolut.sso.api.models.c.BIRTH_DATE;
                                    break;
                                case 3:
                                    cVar = com.revolut.sso.api.models.c.CITIZENSHIP;
                                    break;
                                case 4:
                                    cVar = com.revolut.sso.api.models.c.EMAIL;
                                    break;
                                case 5:
                                    cVar = com.revolut.sso.api.models.c.NAME;
                                    break;
                                case 6:
                                    cVar = com.revolut.sso.api.models.c.PHONE;
                                    break;
                                case 7:
                                    cVar = com.revolut.sso.api.models.c.UNKNOWN;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            arrayList4.add(new ConsentedClient.Consent.Claim(cVar, fVar.f289807b, null));
                            it10 = it11;
                            str = str;
                        }
                        arrayList3.add(new ConsentedClient.Consent(str9, str10, hVar.e, arrayList4, z));
                        it8 = it9;
                        str = str;
                        i2 = 10;
                    }
                    arrayList2.add(new ConsentedClient(str7, str8, arrayList3, iVar.d, iVar.e, iVar.f));
                    str = str;
                    i2 = 10;
                }
                return arrayList2;
        }
    }
}
