package ofg;

import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$Instalment;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$RevolverTransaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import k71.q;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om4.g4;
import om4.i4;
import tof.a3;
import whf.p;
import yhm.m;
import yhm.o;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f224831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f224832c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f224830a = i;
        this.f224831b = obj2;
        this.f224832c = obj3;
    }

    private final Object a(Object obj2) throws Throwable {
        ql4.i iVar;
        Object next;
        Object objA;
        String str;
        Object obj3;
        List list = (List) this.f224831b;
        Integer num = (Integer) this.f224832c;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        p pVar = (p) pair.f186385a;
        List list2 = (List) pair.f186386b;
        aim.e eVarB = u.b();
        List list3 = pVar.f297646a;
        q qVar = pVar.f297647b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list3) {
            a3 a3Var = (a3) obj4;
            List list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((CreditCardInAppStatement$RevolverTransaction) it8.next()).d, a3Var.f272581b)) {
                        break;
                    }
                }
            }
            arrayList.add(obj4);
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(new sv4.g((a3) it9.next(), qVar));
        }
        List<CreditCardInAppStatement$RevolverTransaction> list5 = list;
        ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
        for (CreditCardInAppStatement$RevolverTransaction creditCardInAppStatement$RevolverTransaction : list5) {
            Iterator it10 = pVar.f297646a.iterator();
            while (true) {
                iVar = null;
                obj3 = null;
                iVar = null;
                if (!it10.hasNext()) {
                    next = null;
                    break;
                }
                next = it10.next();
                if (Intrinsics.f(creditCardInAppStatement$RevolverTransaction.d, ((a3) next).f272581b)) {
                    break;
                }
            }
            a3 a3Var2 = (a3) next;
            try {
                m.Companion companion = m.INSTANCE;
                if (creditCardInAppStatement$RevolverTransaction.d != null && a3Var2 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                objA = Unit.f186387a;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            sv4.g gVar = a3Var2 != null ? new sv4.g(a3Var2, qVar) : null;
            CreditCardInAppStatement$Instalment creditCardInAppStatement$Instalment = creditCardInAppStatement$RevolverTransaction.f68885g;
            if (creditCardInAppStatement$Instalment != null && (str = creditCardInAppStatement$Instalment.f68877c) != null) {
                Iterator it11 = list2.iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        break;
                    }
                    Object next2 = it11.next();
                    if (Intrinsics.f(((ql4.i) next2).f247128b, str)) {
                        obj3 = next2;
                        break;
                    }
                }
                iVar = (ql4.i) obj3;
            }
            arrayList3.add(new sv4.h(creditCardInAppStatement$RevolverTransaction, gVar, iVar));
        }
        eVarB.addAll(arrayList2);
        eVarB.addAll(arrayList3);
        List listP0 = d0.P0(d0.P0(u.a(eVarB), new g4()), new i4());
        if (num == null) {
            return listP0;
        }
        List listV0 = d0.V0(listP0, num.intValue());
        return listV0 == null ? listP0 : listV0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0251  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [com.revolut.feature.credit.autopay.models.repayment.RepresentationPaymentDayType$DueDate] */
    /* JADX WARN: Type inference failed for: r12v17, types: [com.revolut.feature.credit.autopay.models.repayment.RepresentationPaymentDayType$Fixed] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v2, types: [com.revolut.feature.credit.autopay.models.repayment.RepresentationPaymentDayType] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v39 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 3002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ofg.a.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(String str, ojk.q qVar) {
        this.f224830a = 12;
        this.f224832c = str;
        this.f224831b = qVar;
    }

    public /* synthetic */ a(lal.a aVar, List list, Integer num) {
        this.f224830a = 27;
        this.f224831b = list;
        this.f224832c = num;
    }
}
