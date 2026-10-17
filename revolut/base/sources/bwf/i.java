package bwf;

import com.revolut.feature.transport.impl.common.TransportHubLocation;
import com.revolut.feature.transport.impl.ui.location.TransportLocationChooserScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transport.impl.ui.hub.a f19333b;

    public /* synthetic */ i(com.revolut.feature.transport.impl.ui.hub.a aVar, int i) {
        this.f19332a = i;
        this.f19333b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object value;
        f updateState;
        switch (this.f19332a) {
            case 0:
                jwf.f outputData = (jwf.f) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                System.out.println((Object) ("[TRANSPORT][HUB][TRANSIT] " + outputData));
                if (Intrinsics.f(outputData, jwf.f.f178980a)) {
                    TransportLocationChooserScreen transportLocationChooserScreen = new TransportLocationChooserScreen();
                    com.revolut.feature.transport.impl.ui.hub.a aVar = this.f19333b;
                    aVar.Y1(transportLocationChooserScreen, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new i(aVar, 1));
                }
                break;
            default:
                nwf.g output = (nwf.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                TransportHubLocation.Selected selected = new TransportHubLocation.Selected(output.f219864a);
                j2 j2Var = this.f19333b.f92527r;
                do {
                    value = j2Var.getValue();
                    updateState = (f) value;
                    Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                } while (!j2Var.h(value, f.a(updateState, null, selected, 3)));
                break;
        }
        return Unit.f186387a;
    }
}
