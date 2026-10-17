package phk;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.r;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a f236335b;

    public /* synthetic */ o(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar, int i) {
        this.f236334a = i;
        this.f236335b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objPutIfAbsent;
        switch (this.f236334a) {
            case 0:
                oki.h.D2(this.f236335b.f103123w);
                break;
            default:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar = this.f236335b;
                String token = aVar.o.f103109g;
                if (token != null) {
                    rld.a aVar2 = (rld.a) aVar.f103122t;
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(token, "token");
                    ConcurrentHashMap concurrentHashMap = aVar2.f255014a;
                    Object objB = concurrentHashMap.get(token);
                    if (objB == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(token, (objB = e0.b()))) != null) {
                        objB = objPutIfAbsent;
                    }
                    ((r) ((skm.q) objB)).U(Unit.f186387a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
