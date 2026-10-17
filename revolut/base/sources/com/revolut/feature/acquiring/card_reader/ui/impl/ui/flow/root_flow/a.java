package com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow;

import akl.o;
import cc1.b;
import cc1.e;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlowContract$Step;
import com.youTransactor.uCube.api.UCubeAPI;
import com.youTransactor.uCube.connexion.ConnectionService;
import com.youTransactor.uCube.connexion.ConnectionState;
import com.youTransactor.uCube.connexion.ConnectionStateChangeListener;
import com.youTransactor.uCube.log.LogManager;
import cp5.d;
import efc.c;
import kf1.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ma1.k;
import oki.h;
import rp0.g1;
import sa1.q;
import sfc.f;
import w4l.i;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final CardReaderRootFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f60640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oa1.a f60641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ed1.a f60642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f60643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t53.a f60644t;
    public final c u;
    public final efc.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f60645w;

    public a(CardReaderRootFlowContract$InputData inputData, k sdkInteractor, oa1.a cardReaderLogsRecorder, ed1.a litePosFlowProvider, f litePosFeatureToggleInteractor, t53.a tipsInteractor, c salesSettingsScreenProvider, efc.a cardReaderOrderScreenProvider, g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        Intrinsics.checkNotNullParameter(cardReaderLogsRecorder, "cardReaderLogsRecorder");
        Intrinsics.checkNotNullParameter(litePosFlowProvider, "litePosFlowProvider");
        Intrinsics.checkNotNullParameter(litePosFeatureToggleInteractor, "litePosFeatureToggleInteractor");
        Intrinsics.checkNotNullParameter(tipsInteractor, "tipsInteractor");
        Intrinsics.checkNotNullParameter(salesSettingsScreenProvider, "salesSettingsScreenProvider");
        Intrinsics.checkNotNullParameter(cardReaderOrderScreenProvider, "cardReaderOrderScreenProvider");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.o = inputData;
        this.f60640p = sdkInteractor;
        this.f60641q = cardReaderLogsRecorder;
        this.f60642r = litePosFlowProvider;
        this.f60643s = litePosFeatureToggleInteractor;
        this.f60644t = tipsInteractor;
        this.u = salesSettingsScreenProvider;
        this.v = cardReaderOrderScreenProvider;
        int i = e.f22920a[inputData.f60628a.ordinal()];
        CardReaderRootFlowContract$Step cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.Promo.f60636a;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.CardReaderSettings.f60630a;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.PaymentLinkSettings.f60635a;
                }
            }
        } else if (((q) sdkInteractor.f203887a).b().isConnected()) {
            cardReaderRootFlowContract$StepI2 = I2();
        }
        this.f60645w = d.a(this, cardReaderRootFlowContract$StepI2, f0.f322471a, new c9f.c(this, 7));
    }

    @Override // yji.l
    public final void I1() {
        oa1.a aVar = this.f60641q;
        synchronized (aVar) {
            aVar.a();
            aVar.b();
        }
        final q qVar = (q) this.f60640p.f203887a;
        qVar.getClass();
        ea1.b.a("Initialising YouTransactor SDK", fa1.k.INFO);
        UCubeAPI.init(qVar.f261236a);
        UCubeAPI.setupLogger(qVar.f);
        UCubeAPI.setLogLevel(LogManager.LogLevel.SYSTEM);
        UCubeAPI.setConnexionManagerType(ConnectionService.ConnectionManagerType.BLE);
        qVar.b().registerBatteryLevelChangeListener(new sa1.k(qVar));
        qVar.b().registerConnectionStateListener(new ConnectionStateChangeListener() { // from class: sa1.l
            @Override // com.youTransactor.uCube.connexion.ConnectionStateChangeListener
            public final void onConnectionStateChange(ConnectionState connectionState) {
                fa1.h hVar;
                ihm.f fVar = qVar.i;
                Intrinsics.h(connectionState);
                Intrinsics.checkNotNullParameter(connectionState, "<this>");
                int i = y.f261265b[connectionState.ordinal()];
                if (i == 1) {
                    hVar = fa1.h.CONNECTED;
                } else if (i == 2) {
                    hVar = fa1.h.DISCONNECTED;
                } else if (i == 3) {
                    hVar = fa1.h.CONNECTING;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hVar = fa1.h.DISCONNECTING;
                }
                fVar.onNext(hVar);
            }
        });
        ea1.b.a("Sale flow started", fa1.k.INFO);
        l.a1(this, this.f60644t.a(i.f294643c), new o(2, 18, null), null, null, 6);
    }

    public final CardReaderRootFlowContract$Step I2() {
        kf1.b bVar;
        j jVar = (j) ((zfc.d) this.f60643s.f262396a).f321923b.f288567b.get("PRO_MERCHANT_KEY");
        return (jVar == null || (bVar = jVar.f183276a) == null) ? false : bVar.f183269b ? CardReaderRootFlowContract$Step.Amount.f60629a : CardReaderRootFlowContract$Step.NewRequest.f60632a;
    }

    @Override // yji.l
    public final void K1() {
        ea1.b.a("Sale flow finished", fa1.k.INFO);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f60645w;
    }
}
