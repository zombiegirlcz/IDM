package l42;

import knd.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b f192044b;

    public /* synthetic */ i(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar, int i) {
        this.f192043a = i;
        this.f192044b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f192043a) {
            case 0:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar = this.f192044b;
                    bVar.l2(new h0(bVar, "decline", new l(bVar, null, 1), (Continuation) null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                jx1.g outputData2 = (jx1.g) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (!(outputData2 instanceof jx1.f)) {
                    if (!(outputData2 instanceof jx1.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar2 = this.f192044b;
                    bVar2.l2(new l34.a(bVar2, outputData2, null, 4), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                dii.g outputData3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof dii.e) {
                    com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar3 = this.f192044b;
                    bVar3.l2(new h0(bVar3, "approve", new l(bVar3, null, 0), (Continuation) null), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
