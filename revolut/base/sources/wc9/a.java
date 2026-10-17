package wc9;

import com.revolut.feature.onboarding.api.revolut_card_ready.RevolutCardReadyPromptApi$Toggles$RevolutCardReadyFlowKompot;
import com.revolut.feature.onboarding.api.revolut_card_ready.RevolutCardReadyPromptDestination;
import com.revolut.feature.onboarding.impl.revolut_card_ready.flow.RevolutCardReadyFlow;
import com.revolut.feature.onboarding.impl.revolut_card_ready.flow.RevolutCardReadyFlowContract$InputData;
import dki.g;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f296360a = 0;

    @Override // nte.a
    public final List e() {
        return u.c(RevolutCardReadyPromptApi$Toggles$RevolutCardReadyFlowKompot.f78210c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof RevolutCardReadyPromptDestination)) {
            return null;
        }
        RevolutCardReadyPromptDestination revolutCardReadyPromptDestination = (RevolutCardReadyPromptDestination) destination;
        return c.b(new RevolutCardReadyFlow(new RevolutCardReadyFlowContract$InputData(revolutCardReadyPromptDestination.f78211a, revolutCardReadyPromptDestination.f78213c)), new ak3.a(destination, 3));
    }
}
