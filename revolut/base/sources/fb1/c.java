package fb1;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.CardReaderOrderFlowContract$State;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.CardReaderOrderFlowContract$Step;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import jb1.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ob1.g;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.a f133430b;

    public /* synthetic */ c(com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.a aVar, int i) {
        this.f133429a = i;
        this.f133430b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f133429a) {
            case 0:
                ob1.g it8 = (ob1.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, g.a.f223850a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f133430b.E2(CardReaderOrderFlowContract$Step.DeliveryAddress.f60593a, true, null, false);
                return Unit.f186387a;
            case 1:
                lb1.e outputData = (lb1.e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof lb1.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.a aVar = this.f133430b;
                CardReaderOrderFlowContract$State cardReaderOrderFlowContract$State = (CardReaderOrderFlowContract$State) aVar.A2().f98429a;
                Address address = ((lb1.d) outputData).f193574a;
                VatSelection vatSelection = cardReaderOrderFlowContract$State.f60590a;
                cardReaderOrderFlowContract$State.getClass();
                aVar.L2(new CardReaderOrderFlowContract$State(vatSelection, address));
                aVar.E2(CardReaderOrderFlowContract$Step.Vat.f60595a, true, null, false);
                return Unit.f186387a;
            case 2:
                i outputData2 = (i) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (!Intrinsics.f(outputData2, i.a.f172553a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f133430b.C1(new BridgeDestination(new FinishCommand(null, null, null, 7)));
                return Unit.f186387a;
            default:
                VatSelection vatSelection2 = (VatSelection) obj2;
                Intrinsics.checkNotNullParameter(vatSelection2, "vatSelection");
                com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.a aVar2 = this.f133430b;
                CardReaderOrderFlowContract$State cardReaderOrderFlowContract$State2 = (CardReaderOrderFlowContract$State) aVar2.A2().f98429a;
                Address address2 = cardReaderOrderFlowContract$State2.f60591b;
                cardReaderOrderFlowContract$State2.getClass();
                aVar2.L2(new CardReaderOrderFlowContract$State(vatSelection2, address2));
                aVar2.E2(CardReaderOrderFlowContract$Step.Checkout.f60592a, true, null, false);
                return Unit.f186387a;
        }
    }
}
