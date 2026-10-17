package xb5;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import le.u1;
import mb5.p;
import mb5.r;
import mb5.s;
import mb5.t;
import mb5.u;
import mb5.v;
import ub5.h;
import ub5.j;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e extends q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, tb5.b.class, "toDomain", "toDomain(Lcom/revolut/feature/credit_card/autopay/impl/network/models/AutoPayConfigurationDto;)Lcom/revolut/feature/credit_card/autopay/api/models/AutoPayConfiguration;", 1);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r qVar;
        ub5.b p0 = (ub5.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = tb5.b.f269460a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        xi0.a aVar = xi0.b.Companion;
        String currency = p0.getCurrency();
        aVar.getClass();
        xi0.b currency2 = xi0.a.a(currency);
        long currentDate = p0.getCurrentDate();
        long dueDate = p0.getDueDate();
        List<h> autoPayments = p0.getAutoPayments();
        ArrayList arrayList = new ArrayList(w.t(autoPayments, 10));
        for (h hVar : autoPayments) {
            ?? r3 = tb5.b.f269461b;
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            Intrinsics.checkNotNullParameter(currency2, "currency");
            j payment = hVar.getPayment();
            if (payment != null) {
                ?? r122 = tb5.b.f269460a;
                Intrinsics.checkNotNullParameter(payment, "<this>");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                if (payment instanceof j.a) {
                    j.a aVar2 = (j.a) payment;
                    qVar = new p(aVar2.getId(), (u) u1.u(aVar2.getPaymentType(), r3), (v) u1.u(aVar2.getState(), r122), aVar2.getPaymentDay(), tb5.b.a(aVar2.getPaymentSource()));
                } else {
                    if (!(payment instanceof j.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j.b bVar = (j.b) payment;
                    String id10 = bVar.getId();
                    v vVar = (v) u1.u(bVar.getState(), r122);
                    int paymentDay = bVar.getPaymentDay();
                    t tVarA = tb5.b.a(bVar.getPaymentSource());
                    u uVar = (u) u1.u(bVar.getPaymentType(), r3);
                    ub5.g paymentAmount = bVar.getPaymentAmount();
                    Intrinsics.checkNotNullParameter(paymentAmount, "<this>");
                    Intrinsics.checkNotNullParameter(currency2, "currency");
                    qVar = new mb5.q(id10, uVar, vVar, paymentDay, tVarA, tb5.f.a((tb5.a) u1.u(paymentAmount.getAmountType(), tb5.f.f269468a), paymentAmount.getAmount(), currency2), bVar.getNextPaymentDate());
                }
            } else {
                qVar = null;
            }
            arrayList.add(new s((u) u1.u(hVar.getPaymentType(), r3), qVar));
        }
        return new mb5.b(currentDate, dueDate, currency2, arrayList);
    }
}
