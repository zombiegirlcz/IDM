package qx8;

import com.revolut.kompot.common.flow.permissions.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.web_id.web_id_portal.a f250045b;

    public /* synthetic */ p(com.revolut.feature.kyc.impl.web_id.web_id_portal.a aVar, int i) {
        this.f250044a = i;
        this.f250045b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f250044a) {
            case 0:
                com.revolut.kompot.common.flow.permissions.a outputData = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if ((outputData instanceof sii.c) || (outputData instanceof sii.d)) {
                    this.f250045b.J2(h.f250037a);
                } else if (!Intrinsics.f(outputData, a.C0596a.f98352a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 1:
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                this.f250045b.I2(result);
                return Unit.f186387a;
            default:
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                this.f250045b.I2(result2);
                return Unit.f186387a;
        }
    }
}
