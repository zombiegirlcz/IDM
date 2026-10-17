package m30;

import com.revolut.data.model.Data;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.Instant;
import v30.s;
import w30.n;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f202264b;

    public /* synthetic */ d(n nVar, int i) {
        this.f202263a = i;
        this.f202264b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202263a) {
            case 0:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return n.a(this.f202264b, null, null, Instant.now(), 458751);
            case 1:
                Long it9 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return n.a(this.f202264b, null, null, Instant.now(), 458751);
            case 2:
                Data pricingPlanData = (Data) obj2;
                Intrinsics.checkNotNullParameter(pricingPlanData, "pricingPlanData");
                s sVar = (s) pricingPlanData.getContent();
                if (sVar == null) {
                    sVar = s.NONE;
                }
                return new Data(n.a(this.f202264b, null, sVar, null, 491519), null, pricingPlanData.getLoading(), 2, null);
            default:
                Optional inAppCallDataOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(inAppCallDataOptional, "inAppCallDataOptional");
                return n.a(this.f202264b, (InAppCallStateWithData) u1.l(inAppCallDataOptional), null, null, 523263);
        }
    }
}
