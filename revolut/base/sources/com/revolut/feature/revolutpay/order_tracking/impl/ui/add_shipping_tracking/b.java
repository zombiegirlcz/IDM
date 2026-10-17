package com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking;

import cli.g;
import cli.y;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.DeliveryCarrier;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import zac.f;
import zac.k;
import zac.m;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements k {
    public final tul.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AddShippingTrackingScreenContract$InputData f84608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f84609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84610r;

    public b(tul.b interactor, AddShippingTrackingScreenContract$InputData inputData, m stateMapper) {
        String str;
        DeliveryCarrier deliveryCarrier;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f84608p = inputData;
        AddShippingTrackingScreenContract$TrackingRequest addShippingTrackingScreenContract$TrackingRequest = inputData.f84602a;
        boolean z = addShippingTrackingScreenContract$TrackingRequest instanceof AddShippingTrackingScreenContract$TrackingRequest.Edit;
        if (z) {
            str = ((AddShippingTrackingScreenContract$TrackingRequest.Edit) addShippingTrackingScreenContract$TrackingRequest).f84606b.f84641b;
        } else {
            if (!(addShippingTrackingScreenContract$TrackingRequest instanceof AddShippingTrackingScreenContract$TrackingRequest.Add)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        if (z) {
            deliveryCarrier = ((AddShippingTrackingScreenContract$TrackingRequest.Edit) addShippingTrackingScreenContract$TrackingRequest).f84606b.e;
        } else {
            if (!(addShippingTrackingScreenContract$TrackingRequest instanceof AddShippingTrackingScreenContract$TrackingRequest.Add)) {
                throw new NoWhenBranchMatchedException();
            }
            deliveryCarrier = null;
        }
        this.f84609q = d.b(this, new f(str, deliveryCarrier, false, addShippingTrackingScreenContract$TrackingRequest), stateMapper, null, false, 12);
        this.f84610r = e.a(this, new yz4.b(this, 24));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84610r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f84609q;
    }
}
