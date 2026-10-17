package iti;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.airport.security_fast_track.api.AsftApi$Toggles$AsftAny2Any;
import com.revolut.retail.feature.airport.security_fast_track.api.AsftApi$Toggles$AsftQrCodeBrightness;
import com.revolut.retail.feature.airport.security_fast_track.api.AsftApi$Toggles$AsftTicketStylePass;
import com.revolut.retail.feature.airport.security_fast_track.api.navigation.AsftFeatureConfig;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.AsftMainFlow;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlow;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlow;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlowContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f168394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cti.a f168395b;

    public b(ImmutableSet deeplinkGateways, cti.a asftHomeCommandProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(asftHomeCommandProvider, "asftHomeCommandProvider");
        this.f168394a = deeplinkGateways;
        this.f168395b = asftHomeCommandProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof iti.a
            if (r0 == 0) goto L13
            r0 = r6
            iti.a r0 = (iti.a) r0
            int r1 = r0.f168393w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168393w = r1
            goto L1a
        L13:
            iti.a r0 = new iti.a
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168393w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r5 = r5 instanceof fti.c
            if (r5 == 0) goto L4c
            r0.f168393w = r3
            cti.a r5 = r4.f168395b
            nti.a r5 = (nti.a) r5
            com.revolut.retail.core.navigation.FeatureCommand r6 = r5.a()
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            return r5
        L4c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: iti.b.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return v.k(AsftApi$Toggles$AsftAny2Any.f98705c, AsftApi$Toggles$AsftTicketStylePass.f98707c, AsftApi$Toggles$AsftQrCodeBrightness.f98706c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AsftFeatureConfig.HomeDestination) {
            return new AsftMainFlow();
        }
        if (destination instanceof AsftFeatureConfig.PassDetailsDestination) {
            AsftFeatureConfig.PassDetailsDestination passDetailsDestination = (AsftFeatureConfig.PassDetailsDestination) destination;
            return new AsftPassDetailsLegacyScreen(new AsftPassDetailsLegacyScreenContract$InputData(passDetailsDestination.f98754a, passDetailsDestination.f98755b));
        }
        if (destination instanceof AsftFeatureConfig.PassBookingDestination) {
            return new AsftPassBookingFlow();
        }
        if (!(destination instanceof AsftFeatureConfig.WidgetDestination.PassAvailableSoon)) {
            return null;
        }
        AsftFeatureConfig.WidgetDestination.PassAvailableSoon passAvailableSoon = (AsftFeatureConfig.WidgetDestination.PassAvailableSoon) destination;
        return new AsftWidgetFlow(new AsftWidgetFlowContract$InputData.PassAvailableSoon(passAvailableSoon.f98756a, new AsftManageBookingPayload(passAvailableSoon.f98757b, passAvailableSoon.f98758c, passAvailableSoon.d, passAvailableSoon.e, passAvailableSoon.f)));
    }

    @Override // aii.p
    public final Set h() {
        return this.f168394a;
    }
}
