package btb;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ plc.i f18521c;
    public final /* synthetic */ SharedStep d;

    public /* synthetic */ e(l lVar, SharedStep sharedStep, plc.i iVar) {
        this.f18519a = 2;
        this.f18520b = lVar;
        this.d = sharedStep;
        this.f18521c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18519a) {
            case 0:
                AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                l lVar = this.f18520b;
                lVar.T2(new i(lVar, this.f18521c, this.d, output, null, 0), new yi5.b(27));
                break;
            case 1:
                AddressFlowContract$OutputData output2 = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                l lVar2 = this.f18520b;
                lVar2.T2(new i(lVar2, this.f18521c, this.d, output2, null, 1), new yi5.b(27));
                break;
            default:
                v0d.b result = (v0d.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                l lVar3 = this.f18520b;
                lVar3.T2(new a1a.c(23, lVar3, result, this.d, this.f18521c, (Continuation) null), new yi5.b(27));
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ e(l lVar, plc.i iVar, SharedStep sharedStep, int i) {
        this.f18519a = i;
        this.f18520b = lVar;
        this.f18521c = iVar;
        this.d = sharedStep;
    }
}
