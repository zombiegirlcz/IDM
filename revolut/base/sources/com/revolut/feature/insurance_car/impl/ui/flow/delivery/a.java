package com.revolut.feature.insurance_car.impl.ui.flow.delivery;

import bwc.i;
import cm7.b;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.print.PrintDiscScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.DocumentDeliveryTrackingScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.DocumentDeliveryTrackingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DeliveryFlowContract$InputData f75351t;
    public final vn7.a u;
    public final v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f75352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f75353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final DeliveryFlowContract$Step.Tracking f75354y;
    public final DeliveryFlowContract$State z;

    public a(DeliveryFlowContract$InputData inputData, vn7.a hintPopupFactory, v policyRepository, j60.a bottomDialogExtension, String baseUrl) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f75351t = inputData;
        this.u = hintPopupFactory;
        this.v = policyRepository;
        this.f75352w = bottomDialogExtension;
        this.f75353x = baseUrl;
        this.f75354y = DeliveryFlowContract$Step.Tracking.f75350a;
        this.z = DeliveryFlowContract$State.f75348a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        DeliveryFlowContract$Step step = (DeliveryFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof DeliveryFlowContract$Step.Tracking) {
            DeliveryFlowContract$InputData deliveryFlowContract$InputData = this.f75351t;
            DocumentDeliveryTrackingScreen documentDeliveryTrackingScreen = new DocumentDeliveryTrackingScreen(new DocumentDeliveryTrackingScreenContract$InputData(deliveryFlowContract$InputData.f75346a, deliveryFlowContract$InputData.f75347b));
            i iVar = new i(1, this, a.class, "handleTrackingScreenResult", "handleTrackingScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/delivery/tracking/DocumentDeliveryTrackingScreenContract$OutputData;)V", 0, 22);
            Intrinsics.checkNotNullParameter(iVar, "<set-?>");
            documentDeliveryTrackingScreen.H = iVar;
            return documentDeliveryTrackingScreen;
        }
        if (!(step instanceof DeliveryFlowContract$Step.Print)) {
            throw new NoWhenBranchMatchedException();
        }
        PrintDiscScreen printDiscScreen = new PrintDiscScreen(0);
        i iVar2 = new i(1, this, a.class, "handlePrintScreenResult", "handlePrintScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/delivery/print/PrintDiscScreenContract$OutputData;)V", 0, 21);
        Intrinsics.checkNotNullParameter(iVar2, "<set-?>");
        printDiscScreen.H = iVar2;
        return printDiscScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.z;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f75354y;
    }
}
