package bc1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlowContract$Step;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import d67.q;
import d67.u;
import hc1.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc1.c;
import nii.n1;
import sc1.e;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b f14362b;

    public /* synthetic */ d(com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar, int i) {
        this.f14361a = i;
        this.f14362b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f14361a;
        FlowStep connecting = CardReaderConnectionFlowContract$Step.Scanning.f60621a;
        a.C0448a c0448a = a.C0448a.f60624a;
        final int i2 = 1;
        final int i3 = 0;
        final com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b controllerModel = this.f14362b;
        switch (i) {
            case 0:
                hc1.c outputData = (hc1.c) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, c.a.f150768a)) {
                    if (controllerModel.f60626x.f60616a) {
                        CardReaderDevice cardReaderDeviceB = ((ha1.f) controllerModel.f60627y).b();
                        connecting = cardReaderDeviceB != null ? new CardReaderConnectionFlowContract$Step.Connecting(cardReaderDeviceB) : CardReaderConnectionFlowContract$Step.Introduction.f60619a;
                    }
                    controllerModel.E2(connecting, false, null, false);
                } else {
                    if (!Intrinsics.f(outputData, c.b.f150769a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dfc.a aVar = controllerModel.B;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
                    controllerModel.C1(new BridgeDestination(aVar.f113883a.c()));
                }
                return Unit.f186387a;
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                controllerModel.U2();
                return Boolean.TRUE;
            case 2:
                ((Boolean) obj2).booleanValue();
                if (!(controllerModel.A2().f98430b instanceof CardReaderConnectionFlowContract$Step.Scanning)) {
                    controllerModel.G2(c0448a);
                }
                return Unit.f186387a;
            case 3:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                controllerModel.U2();
                return Unit.f186387a;
            case 4:
                Boolean it10 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new pfm.h(new kfm.a() { // from class: bc1.f
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ((ha1.f) controllerModel.f60627y).e();
                                break;
                            default:
                                ((ha1.f) controllerModel.f60627y).e();
                                break;
                        }
                    }
                }, 2);
            case 5:
                n1 it11 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                controllerModel.G2(a.b.f60625a);
                return Unit.f186387a;
            case 6:
                n1 it12 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                controllerModel.P2();
                return Unit.f186387a;
            case 7:
                lc1.c introductionResult = (lc1.c) obj2;
                Intrinsics.checkNotNullParameter(introductionResult, "introductionResult");
                if (Intrinsics.f(introductionResult, c.a.f193781a)) {
                    controllerModel.E2(connecting, false, null, false);
                } else {
                    if (!Intrinsics.f(introductionResult, c.b.f193782a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    controllerModel.E2(CardReaderConnectionFlowContract$Step.RevolutShop.f60620a, false, null, false);
                }
                return Unit.f186387a;
            case 8:
                sc1.e scanningResult = (sc1.e) obj2;
                Intrinsics.checkNotNullParameter(scanningResult, "scanningResult");
                if (scanningResult instanceof e.a) {
                    controllerModel.G2(c0448a);
                } else {
                    if (!(scanningResult instanceof sc1.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CardReaderDevice cardReaderDevice = ((sc1.f) scanningResult).f261608a;
                    l.g2(controllerModel, new CardReaderConnectingScreen(new CardReaderConnectingScreenContract$InputData(cardReaderDevice)), null, new g(controllerModel, cardReaderDevice, i2), 1);
                }
                return Unit.f186387a;
            case 9:
                Boolean it13 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new pfm.h(new kfm.a() { // from class: bc1.f
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                ((ha1.f) controllerModel.f60627y).e();
                                break;
                            default:
                                ((ha1.f) controllerModel.f60627y).e();
                                break;
                        }
                    }
                }, 2);
            default:
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, q.f111462a)) {
                    controllerModel.P2();
                } else {
                    int i5 = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }
}
