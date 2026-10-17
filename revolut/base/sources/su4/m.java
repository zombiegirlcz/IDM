package su4;

import cli.y;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import dx4.g2;
import dx4.z2;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a f265655b;

    public /* synthetic */ m(com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar, int i) {
        this.f265654a = i;
        this.f265655b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterable iterable;
        int i = this.f265654a;
        Object dVar = null;
        com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar = this.f265655b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                xm4.e eVar = (xm4.e) pair.f186386b;
                BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) d0.d0(list);
                dj0.d dVar2 = aVar.o.f69615b;
                xm4.f fVar = eVar.f307083b;
                j1j.d dVar3 = pocketBalanceWrapper != null ? new j1j.d(pocketBalanceWrapper.f99404a, pocketBalanceWrapper.f99406c, pocketBalanceWrapper.f99432j, pocketBalanceWrapper.f99433l) : null;
                if (pocketBalanceWrapper != null) {
                    Long l2 = pocketBalanceWrapper.f99405b;
                    dVar = new dj0.d(l2 != null ? l2.longValue() : 0L, pocketBalanceWrapper.f99406c);
                }
                g2 g2Var = eVar.d;
                z2 z2Var = eVar.e;
                dj0.d dVar4 = eVar.f307082a;
                List list2 = eVar.f307084c;
                return com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a.L2(new h(dVar2, fVar, dVar3, dVar, list, false, false, g2Var, dVar4, z2Var, null, list2, (xm4.a) d0.d0(list2)));
            case 1:
                fy4.w result = (fy4.w) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof fy4.u) {
                    aVar.K2();
                } else {
                    if (!(result instanceof fy4.v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                y yVar = aVar.z;
                g1j.b result2 = (g1j.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                h hVar = (h) ((i) ((j2) yVar.f22677a).getValue()).f265649a.getContent();
                if (hVar == null || (iterable = hVar.e) == null) {
                    iterable = f0.f322471a;
                }
                Iterator it8 = iterable.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((BalanceWrapper.PocketBalanceWrapper) next).f99404a, result2.f139686a.f170617a)) {
                            dVar = next;
                        }
                    }
                }
                aVar.v.a("credit_card_repay_payment_idempotency_key_tag");
                aVar.H2(yVar, new sdi.k(aVar, result2, (BalanceWrapper.PocketBalanceWrapper) dVar));
                return Unit.f186387a;
        }
    }
}
