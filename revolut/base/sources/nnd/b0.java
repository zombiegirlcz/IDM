package nnd;

import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f217526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f217527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f217528y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(List list, c0 c0Var, Map map, Map map2, Continuation continuation) {
        super(2, continuation);
        this.v = list;
        this.f217526w = c0Var;
        this.f217527x = map;
        this.f217528y = map2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(this.v, this.f217526w, this.f217527x, this.f217528y, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objV;
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List<AnalyticsAccount> list2 = this.v;
        ArrayList arrayList = new ArrayList();
        for (AnalyticsAccount analyticsAccount : list2) {
            boolean z = analyticsAccount instanceof AnalyticsAccount.Personal.All;
            go.g gVarI = null;
            ArrayList arrayList2 = null;
            gVarI = null;
            gVarI = null;
            gVarI = null;
            c0 c0Var = this.f217526w;
            Map map = this.f217527x;
            Map map2 = this.f217528y;
            if (z) {
                AnalyticsAccount.Personal.All all2 = (AnalyticsAccount.Personal.All) analyticsAccount;
                xi0.b bVar = (xi0.b) zhm.r0.h(analyticsAccount, map);
                c0Var.getClass();
                List list3 = (List) map2.get(all2);
                if (list3 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj3 : list3) {
                        AnalyticsAccountPocketSource analyticsAccountPocketSource = (AnalyticsAccountPocketSource) obj3;
                        if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.PocketSource) {
                            if (((AnalyticsAccountPocketSource.PocketSource) analyticsAccountPocketSource).f65740a.e != io3.l.CREDIT) {
                            }
                        } else if (!(analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.SubaccountSource)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.add(obj3);
                    }
                }
                objV = zi0.c.i(new x0(all2, c0Var.b(arrayList2, list, bVar)));
            } else {
                if (analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) {
                    AnalyticsAccount.Personal.CurrencyPocket currencyPocket = (AnalyticsAccount.Personal.CurrencyPocket) analyticsAccount;
                    String str = currencyPocket.f99194a;
                    xi0.b bVar2 = (xi0.b) zhm.r0.h(analyticsAccount, map);
                    c0Var.getClass();
                    io3.d dVarC = c0.c(currencyPocket, str, map2);
                    if (dVarC == null) {
                        gVarI = new go.g(new Data(null, new IllegalStateException(j6.a.q("Missing pocket for id ", str)), false, 5, null), 2);
                    } else if (ta6.a.G(dVarC)) {
                        gVarI = zi0.c.i(new y0(currencyPocket, dVarC, io3.h.e(dVarC), c0Var.b((List) map2.get(currencyPocket), list, bVar2)));
                    }
                } else if (analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount) {
                    AnalyticsAccount.Personal.Subaccount subaccount = (AnalyticsAccount.Personal.Subaccount) analyticsAccount;
                    String str2 = subaccount.f99195a;
                    xi0.b bVar3 = (xi0.b) zhm.r0.h(analyticsAccount, map);
                    c0Var.getClass();
                    Subaccount subaccountD = c0.d(subaccount, str2, map2);
                    objV = subaccountD == null ? new go.g(new Data(null, new IllegalStateException(j6.a.q("Missing subaccount for id ", str2)), false, 5, null), 2) : zi0.c.i(new z0(subaccount, subaccountD, subaccountD.getBalance(), c0Var.b((List) map2.get(subaccount), list, bVar3)));
                } else if (analyticsAccount instanceof AnalyticsAccount.Joint.All) {
                    objV = zi0.c.i(new q0((AnalyticsAccount.Joint.All) analyticsAccount, c0Var.b((List) map2.get(analyticsAccount), list, (xi0.b) zhm.r0.h(analyticsAccount, map))));
                } else if (analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                    AnalyticsAccount.Joint.CurrencyPocket currencyPocket2 = (AnalyticsAccount.Joint.CurrencyPocket) analyticsAccount;
                    String str3 = currencyPocket2.f99181b;
                    xi0.b bVar4 = (xi0.b) zhm.r0.h(analyticsAccount, map);
                    c0Var.getClass();
                    io3.d dVarC2 = c0.c(currencyPocket2, str3, map2);
                    if (dVarC2 == null) {
                        gVarI = new go.g(new Data(null, new IllegalStateException(j6.a.q("Missing pocket for id ", str3)), false, 5, null), 2);
                    } else if (ta6.a.G(dVarC2)) {
                        gVarI = zi0.c.i(new r0(currencyPocket2, dVarC2, io3.h.e(dVarC2), c0Var.b((List) map2.get(currencyPocket2), list, bVar4)));
                    }
                } else if (analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) {
                    AnalyticsAccount.Joint.Subaccount subaccount2 = (AnalyticsAccount.Joint.Subaccount) analyticsAccount;
                    String str4 = subaccount2.f99183b;
                    xi0.b bVar5 = (xi0.b) zhm.r0.h(analyticsAccount, map);
                    c0Var.getClass();
                    Subaccount subaccountD2 = c0.d(subaccount2, str4, map2);
                    objV = subaccountD2 == null ? new go.g(new Data(null, new IllegalStateException(j6.a.q("Missing subaccount for id ", str4)), false, 5, null), 2) : zi0.c.i(new t0(subaccount2, subaccountD2, subaccountD2.getBalance(), c0Var.b((List) map2.get(subaccount2), list, bVar5)));
                } else if (analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) {
                    objV = zi0.c.i(new o0((AnalyticsAccount.Personal.CreditCard) analyticsAccount, c0Var.b((List) map2.get(analyticsAccount), list, (xi0.b) zhm.r0.h(analyticsAccount, map))));
                } else if (analyticsAccount instanceof AnalyticsAccount.Linked) {
                    AnalyticsAccount.Linked linked = (AnalyticsAccount.Linked) analyticsAccount;
                    String str5 = linked.f99189a;
                    xi0.b bVar6 = (xi0.b) zhm.r0.h(analyticsAccount, map);
                    c0Var.getClass();
                    io3.d dVarC3 = c0.c(linked, str5, map2);
                    objV = dVarC3 == null ? new go.g(new Data(null, new IllegalStateException(j6.a.q("Missing pocket for id ", str5)), false, 5, null), 2) : zi0.c.i(new w0(linked, io3.h.e(dVarC3), c0Var.b((List) map2.get(linked), list, bVar6)));
                } else if (analyticsAccount instanceof AnalyticsAccount.Pro.All) {
                    objV = zi0.c.i(new a1((AnalyticsAccount.Pro.All) analyticsAccount, c0Var.b((List) map2.get(analyticsAccount), list, (xi0.b) zhm.r0.h(analyticsAccount, map))));
                } else if (analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                    AnalyticsAccount.Pro.CurrencyPocket currencyPocket3 = (AnalyticsAccount.Pro.CurrencyPocket) analyticsAccount;
                    String str6 = currencyPocket3.f99197a;
                    xi0.b bVar7 = (xi0.b) zhm.r0.h(analyticsAccount, map);
                    c0Var.getClass();
                    io3.d dVarC4 = c0.c(currencyPocket3, str6, map2);
                    if (dVarC4 == null) {
                        gVarI = new go.g(new Data(null, new IllegalStateException(j6.a.q("Missing pocket for id ", str6)), false, 5, null), 2);
                    } else if (ta6.a.G(dVarC4)) {
                        gVarI = zi0.c.i(new b1(currencyPocket3, dVarC4, io3.h.e(dVarC4), c0Var.b((List) map2.get(currencyPocket3), list, bVar7)));
                    }
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalAll) {
                    objV = nim.a.v(c0Var.e.c(), new nn3.z((AnalyticsAccount.Savings.PersonalAll) analyticsAccount, 2));
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                    AnalyticsAccount.Savings.PersonalIndividual personalIndividual = (AnalyticsAccount.Savings.PersonalIndividual) analyticsAccount;
                    objV = nim.a.v(c0Var.e.d(personalIndividual.f99204a), new nn3.z(personalIndividual, 4));
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) {
                    objV = nim.a.v(c0Var.e.e(), new nn3.z((AnalyticsAccount.Savings.JointAll) analyticsAccount, 6));
                } else if (analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) {
                    AnalyticsAccount.Savings.JointIndividual jointIndividual = (AnalyticsAccount.Savings.JointIndividual) analyticsAccount;
                    objV = nim.a.v(c0Var.e.d(jointIndividual.f99200b), new nn3.z(jointIndividual, 1));
                } else if (analyticsAccount instanceof AnalyticsAccount.Junior.All) {
                    AnalyticsAccount.Junior.All all3 = (AnalyticsAccount.Junior.All) analyticsAccount;
                    objV = n14.k.s(rd0.e.b(nim.a.w(zf8.k.a(c0Var.d, w4l.h.f294642c), new nn3.z(all3, 5))), new m0(all3, null));
                } else if (analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                    AnalyticsAccount.Junior.CurrencyPocket currencyPocket4 = (AnalyticsAccount.Junior.CurrencyPocket) analyticsAccount;
                    String str7 = currencyPocket4.f99188c;
                    xi0.b bVar8 = (xi0.b) zhm.r0.h(analyticsAccount, map);
                    c0Var.getClass();
                    io3.d dVarC5 = c0.c(currencyPocket4, str7, map2);
                    if (dVarC5 == null) {
                        gVarI = new go.g(new Data(null, new IllegalStateException(j6.a.q("Missing pocket for id ", str7)), false, 5, null), 2);
                    } else if (ta6.a.G(dVarC5)) {
                        gVarI = zi0.c.i(new u0(currencyPocket4, dVarC5, io3.h.e(dVarC5), c0Var.b((List) map2.get(currencyPocket4), list, bVar8)));
                    }
                } else {
                    if (!(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AnalyticsAccount.Savings.JuniorSaving juniorSaving = (AnalyticsAccount.Savings.JuniorSaving) analyticsAccount;
                    objV = nim.a.v(c0Var.e.f(juniorSaving.f99201a), new nn3.z(juniorSaving, 3));
                }
                objV = gVarI;
            }
            if (objV != null) {
                arrayList.add(objV);
            }
        }
        return zh9.u0.k(arrayList);
    }
}
