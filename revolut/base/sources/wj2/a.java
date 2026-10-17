package wj2;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.atm.api.navigation.AtmLimitsExceptionDestination;
import com.revolut.feature.atm.api.navigation.AtmWithdrawalFeeDestination;
import com.revolut.feature.atm.api.navigation.WeekendMarkupFeeDestination;
import com.revolut.feature.atm.impl.navigation.AtmsMapFlowDestination;
import com.revolut.feature.atm.impl.ui.redesign.atm_weekend_markup.AtmWeekendMarkupController;
import com.revolut.feature.atm.impl.ui.redesign.fees.AtmFeesBottomSheetController;
import com.revolut.feature.atm.impl.ui.redesign.fees.AtmFeesBottomSheetScreenContract$InputData;
import com.revolut.feature.atm.impl.ui.redesign.flow.AtmsMapFlow;
import com.revolut.feature.atm.impl.ui.redesign.limits.AtmWithdrawalLimitsBottomSheetController;
import com.revolut.feature.atm.impl.ui.redesign.limits.AtmWithdrawalLimitsBottomSheetScreenContract$InputData;
import com.revolut.feature.atm.impl.ui.redesign.limits_exception.AtmLimitsExceptionFlow;
import gc0.c;
import kotlin.jvm.internal.Intrinsics;
import tj2.b;
import tj2.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f297954a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof tj2.a) {
            return ((tj2.a) descriptor).a(new AtmFeesBottomSheetController(AtmFeesBottomSheetScreenContract$InputData.ExchangeFee.f63172a));
        }
        if (descriptor instanceof b) {
            return ((b) descriptor).a(new AtmFeesBottomSheetController(AtmFeesBottomSheetScreenContract$InputData.WithdrawalFee.f63173a));
        }
        if (descriptor instanceof h) {
            return ((h) descriptor).a(new AtmWeekendMarkupController());
        }
        if (!(descriptor instanceof tj2.g)) {
            return null;
        }
        tj2.g gVar = (tj2.g) descriptor;
        return gVar.a(new AtmWithdrawalLimitsBottomSheetController(new AtmWithdrawalLimitsBottomSheetScreenContract$InputData(gVar.f271604a, gVar.f271605b)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AtmsMapFlowDestination) {
            return new AtmsMapFlow();
        }
        if (destination instanceof AtmWithdrawalFeeDestination) {
            return c.b(new AtmFeesBottomSheetController(AtmFeesBottomSheetScreenContract$InputData.WithdrawalFee.f63173a), new v1c.c(5));
        }
        if (destination instanceof WeekendMarkupFeeDestination) {
            return c.b(new AtmWeekendMarkupController(), new v1c.c(6));
        }
        if (destination instanceof AtmLimitsExceptionDestination) {
            return new AtmLimitsExceptionFlow();
        }
        return null;
    }
}
