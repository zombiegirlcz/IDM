package k7c;

import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f181952b;

    public /* synthetic */ e(h hVar, int i) {
        this.f181951a = i;
        this.f181952b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181951a) {
            case 0:
                List list = (List) obj2;
                w4l.f fVar = this.f181952b.d;
                Unit unit = Unit.f186387a;
                Intrinsics.h(list);
                fVar.j(unit, list);
                return unit;
            case 1:
                String paymentId = (String) obj2;
                Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                return (Boolean) v7.r("DEFERRED_PAYMENT_DEBIT_CHECK_CACHE_ID-", paymentId, this.f181952b.f181962b);
            case 2:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) this.f181952b.f181962b.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
            case 3:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f181952b.a();
            case 4:
                String paymentId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(paymentId2, "paymentId");
                List list2 = (List) this.f181952b.f181962b.get("DEFERRED_PAYMENT_LIST_CACHE_ID");
                Object obj3 = null;
                if (list2 == null) {
                    return null;
                }
                Iterator it10 = list2.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next = it10.next();
                        if (Intrinsics.f(((r7c.a) next).f252080a, paymentId2)) {
                            obj3 = next;
                        }
                    }
                }
                return (r7c.a) obj3;
            default:
                String paymentId3 = (String) obj2;
                Intrinsics.checkNotNullParameter(paymentId3, "paymentId");
                ArrayList arrayListA = this.f181952b.a();
                Object obj4 = null;
                if (arrayListA == null) {
                    return null;
                }
                Iterator it11 = arrayListA.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next2 = it11.next();
                        if (Intrinsics.f(((r7c.a) next2).f252080a, paymentId3)) {
                            obj4 = next2;
                        }
                    }
                }
                return (r7c.a) obj4;
        }
    }
}
