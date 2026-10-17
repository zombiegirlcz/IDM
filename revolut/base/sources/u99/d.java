package u99;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c f278420b;

    public /* synthetic */ d(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, int i) {
        this.f278419a = i;
        this.f278420b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f278419a) {
            case 0:
                com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar = this.f278420b;
                cVar.l2(new g(cVar, null), new u69.g(cVar, new d(cVar, 0), 15));
                break;
            default:
                com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar2 = this.f278420b;
                cVar2.getClass();
                cVar2.l2(new i(cVar2, null, 1), new u69.g(cVar2, new d(cVar2, 1), 15));
                break;
        }
        return Unit.f186387a;
    }
}
