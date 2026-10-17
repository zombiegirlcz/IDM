package bc1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.connecting.CardReaderConnectingScreenContract$InputData;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreenContract$InputData;
import jc1.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uc1.a;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b f14368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardReaderDevice f14369c;

    public /* synthetic */ g(com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar, CardReaderDevice cardReaderDevice, int i) {
        this.f14367a = i;
        this.f14368b = bVar;
        this.f14369c = cardReaderDevice;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14367a) {
            case 0:
                uc1.a updatingResult = (uc1.a) obj2;
                Intrinsics.checkNotNullParameter(updatingResult, "updatingResult");
                boolean z = updatingResult instanceof a.d;
                com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar = this.f14368b;
                if (z) {
                    bVar.Q2();
                } else if (updatingResult instanceof a.c) {
                    CardReaderDevice cardReaderDevice = this.f14369c;
                    l.g2(bVar, new CardReaderConnectingScreen(new CardReaderConnectingScreenContract$InputData(cardReaderDevice)), null, new g(bVar, cardReaderDevice, 1), 1);
                } else if (updatingResult instanceof a.b) {
                    bVar.S2();
                } else {
                    if (!(updatingResult instanceof a.C1542a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.P2();
                }
                return Unit.f186387a;
            default:
                jc1.a connectionResult = (jc1.a) obj2;
                Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
                boolean z3 = connectionResult instanceof jc1.b;
                com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.b bVar2 = this.f14368b;
                if (z3) {
                    PairingInfo pairingInfo = ((jc1.b) connectionResult).f172690a;
                    if (pairingInfo.a()) {
                        l.g2(bVar2, new CardReaderUpdatingScreen(new CardReaderUpdatingScreenContract$InputData(pairingInfo)), null, new g(bVar2, this.f14369c, 0), 1);
                    } else {
                        bVar2.Q2();
                    }
                } else if (connectionResult instanceof a.b) {
                    bVar2.S2();
                } else if (connectionResult instanceof a.C0982a) {
                    bVar2.P2();
                } else {
                    if (!Intrinsics.f(connectionResult, a.c.f172689a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.T2();
                }
                return Unit.f186387a;
        }
    }
}
