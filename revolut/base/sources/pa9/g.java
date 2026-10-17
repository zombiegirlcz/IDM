package pa9;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import om4.m1;
import pa9.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.country.flow.c f234457b;

    public /* synthetic */ g(com.revolut.feature.onboarding.impl.onboarding.country.flow.c cVar, int i) {
        this.f234456a = i;
        this.f234457b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f234456a) {
            case 0:
                com.revolut.feature.onboarding.impl.onboarding.country.flow.c cVar = this.f234457b;
                break;
            case 1:
                com.revolut.feature.onboarding.impl.onboarding.country.flow.c cVar2 = this.f234457b;
                cVar2.getClass();
                cVar2.l2(new omg.e(cVar2, null, 26), new m1(1, cVar2, com.revolut.feature.onboarding.impl.onboarding.country.flow.c.class, "handleCountryStepInitError", "handleCountryStepInitError(Ljava/lang/Throwable;)Z", 0, 23));
                break;
            default:
                this.f234457b.C2(c.a.f234452a);
                break;
        }
        return Unit.f186387a;
    }
}
