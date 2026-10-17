package tdb;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.restaurants.api.navigation.ConfirmReservationDestination;
import com.revolut.feature.retail.restaurants.api.navigation.ReservationCreationFlowDestination;
import com.revolut.feature.retail.restaurants.api.navigation.ReservationDetailsDestination;
import com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.ReservationCreationFlow;
import com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.ReservationCreationFlowContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation.ReservationCreationFlowSampleDestination;
import dki.g;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ohi.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f269947a;

    public b(ImmutableSet registeredDeeplinkGateways) {
        Intrinsics.checkNotNullParameter(registeredDeeplinkGateways, "registeredDeeplinkGateways");
        this.f269947a = registeredDeeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ReservationCreationFlowDestination) {
            return new ReservationCreationFlow(new ReservationCreationFlowContract$InputData.Creation(((ReservationCreationFlowDestination) destination).f82799a));
        }
        if (destination instanceof ReservationCreationFlowSampleDestination) {
            return new ReservationCreationFlow(new ReservationCreationFlowContract$InputData.Creation(((ReservationCreationFlowSampleDestination) destination).f82854a));
        }
        if (destination instanceof ConfirmReservationDestination) {
            return new ReservationCreationFlow(new ReservationCreationFlowContract$InputData.Confirmation(((ConfirmReservationDestination) destination).f82798a));
        }
        if (destination instanceof ReservationDetailsDestination) {
            return new ReservationCreationFlow(new ReservationCreationFlowContract$InputData.Details(((ReservationDetailsDestination) destination).f82800a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        od0.a aVar = od0.a.f224253a;
        return od0.a.f() ? this.f269947a : h0.f322473a;
    }
}
