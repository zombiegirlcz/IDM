package xb5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import le.u1;
import mb5.h;
import mb5.i;
import mb5.j;
import mb5.k;
import mb5.l;
import ub5.f;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, tb5.d.class, "toDomain", "toDomain(Lcom/revolut/feature/credit_card/autopay/impl/network/models/DirectDebitDto;)Lcom/revolut/feature/credit_card/autopay/api/models/DirectDebit;", 1);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ub5.f p0 = (ub5.f) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = tb5.d.f269465a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        int changesAppliedDay = p0.getChangesAppliedDay();
        List<f.b> paymentSources = p0.getPaymentSources();
        ArrayList arrayList = new ArrayList(w.t(paymentSources, 10));
        for (f.b bVar : paymentSources) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            String id10 = bVar.getId();
            boolean selected = bVar.getSelected();
            j jVar = (j) u1.u(bVar.getState(), tb5.d.f269465a);
            String sortCode = bVar.getSortCode();
            if (sortCode == null) {
                sortCode = bVar.getUsRoutingNumber();
            }
            arrayList.add(new k(id10, selected, jVar, sortCode, bVar.getAccountNumber(), bVar.getDebtorName()));
        }
        List<f.a> paymentRequests = p0.getPaymentRequests();
        ArrayList arrayList2 = new ArrayList(w.t(paymentRequests, 10));
        for (f.a aVar : paymentRequests) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList2.add(new i((h) u1.u(aVar.getState(), tb5.d.f269466b), aVar.getCollectionDate(), aVar.getAmount(), aVar.getSourceId()));
        }
        return new l(arrayList, changesAppliedDay, arrayList2);
    }
}
