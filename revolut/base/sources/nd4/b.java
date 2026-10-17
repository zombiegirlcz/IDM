package nd4;

import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$State;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import xd4.b;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a f214324b;

    public /* synthetic */ b(com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar, int i) {
        this.f214323a = i;
        this.f214324b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214323a) {
            case 0:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof dii.e;
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar = this.f214324b;
                if (z) {
                    h.u2(aVar, aVar.f67919y, aVar.P2(), null, 6);
                } else {
                    aVar.K2(null);
                }
                return Unit.f186387a;
            case 1:
                xd4.b outputData2 = (xd4.b) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                boolean zF = Intrinsics.f(outputData2, b.C1693b.f304258a);
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar2 = this.f214324b;
                if (!zF && !Intrinsics.f(outputData2, b.a.f304257a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.K2(null);
                return Unit.f186387a;
            default:
                ManualUnderwritingContract$State update = (ManualUnderwritingContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ManualUnderwritingContract$State manualUnderwritingContract$State = (ManualUnderwritingContract$State) ((j2) this.f214324b.u.f22677a).getValue();
                return new ManualUnderwritingContract$State(manualUnderwritingContract$State.f67901a, manualUnderwritingContract$State.f67902b + 1);
        }
    }
}
