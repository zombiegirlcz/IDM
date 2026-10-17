package hwe;

import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.impl.flow.topup_methods.TopupMethodsFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.topup_methods.d f156146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TopupMethodsFlowContract$Step f156147c;
    public final /* synthetic */ yki.l d;

    public /* synthetic */ l(com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar, TopupMethodsFlowContract$Step topupMethodsFlowContract$Step, yki.l lVar, int i) {
        this.f156145a = i;
        this.f156146b = dVar;
        this.f156147c = topupMethodsFlowContract$Step;
        this.d = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f156145a) {
            case 0:
                we6.v result = (we6.v) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof we6.u)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f156146b.C2(new d(((we6.u) result).f296682a, ((TopupMethodsFlowContract$Step.SelectInstitution) this.f156147c).f90646a.f115083b.f306286a));
                oki.h.D2(this.d);
                return Unit.f186387a;
            case 1:
                cb3.d result2 = (cb3.d) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof cb3.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                TopupMethodsFlowContract$Step.CashTopupSelection cashTopupSelection = (TopupMethodsFlowContract$Step.CashTopupSelection) this.f156147c;
                this.f156146b.C2(new c(cashTopupSelection.f90639a, ((cb3.c) result2).f22719a, cashTopupSelection.f90640b));
                oki.h.D2(this.d);
                return Unit.f186387a;
            case 2:
                ste.b result3 = (ste.b) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean z = result3 instanceof CardDetailsScreenDescriptor$OutputData$CardData;
                com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar = this.f156146b;
                if (z) {
                    TopupMethodsFlowContract$Step.AddNewCardDetails addNewCardDetails = (TopupMethodsFlowContract$Step.AddNewCardDetails) this.f156147c;
                    dVar.C2(new g(CardDetailsScreenDescriptor$OutputData$CardData.j((CardDetailsScreenDescriptor$OutputData$CardData) result3, addNewCardDetails.f90636b), addNewCardDetails.f90635a));
                    oki.h.D2(this.d);
                } else {
                    if (!(result3 instanceof ste.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.B2();
                }
                return Unit.f186387a;
            case 3:
                ewe.g result4 = (ewe.g) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(this.f156146b, this.d, new TopupMethodsFlowContract$Step.AddNewCardDetails(((TopupMethodsFlowContract$Step.ExternalCardDetails) this.f156147c).f90645b, result4.f130170a), true, null, false, 12);
                return Unit.f186387a;
            default:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar2 = this.f156146b;
                    dVar2.l2(new hsd.c(dVar2, this.f156147c, this.d, (Continuation) null, 3), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ l(com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar, yki.l lVar, TopupMethodsFlowContract$Step topupMethodsFlowContract$Step) {
        this.f156145a = 3;
        this.f156146b = dVar;
        this.d = lVar;
        this.f156147c = topupMethodsFlowContract$Step;
    }
}
