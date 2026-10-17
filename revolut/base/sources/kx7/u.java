package kx7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.q implements Function1 {
    public static final u f = new u();

    public u() {
        super(1, hx7.i.class, "toDomain", "toDomain(Lcom/revolut/feature/insurance_pet/impl/network/model/OverduePaymentsDto;)Lcom/revolut/feature/insurance_pet/api/model/OverduePayments;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ix7.n p0 = (ix7.n) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        List pets = p0.getPets();
        Intrinsics.checkNotNullParameter(pets, "<this>");
        List<ix7.m> list = pets;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ix7.m mVar : list) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            arrayList.add(new zw7.u(mo3.a.o(mVar.getAmount()), mVar.getPetId()));
        }
        return new zw7.v(mo3.a.o(p0.getTotalAmount()), arrayList);
    }
}
