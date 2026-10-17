package o3l;

import com.revolut.retail.operation_status.step.OperationStatusFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OperationStatusFragment f221849b;

    public /* synthetic */ a(OperationStatusFragment operationStatusFragment, int i) {
        this.f221848a = i;
        this.f221849b = operationStatusFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f221848a) {
            case 0:
                break;
            case 1:
                gsi.a aVarL0 = this.f221849b.D().L0();
                Intrinsics.i(aVarL0, "null cannot be cast to non-null type com.revolut.retail.operation_status.step.di.OperationStatusStepDisplayersInjector");
                break;
            case 2:
                f3l.a aVar = this.f221849b.f104423e0;
                Intrinsics.h(aVar);
                aVar.d.playAnimation();
                break;
            default:
                f3l.a aVar2 = this.f221849b.f104423e0;
                Intrinsics.h(aVar2);
                aVar2.f131981c.playAnimation();
                break;
        }
        return Unit.f186387a;
    }
}
