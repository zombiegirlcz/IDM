package w67;

import com.revolut.feature.giro.api.GiroToggles$GiroPocketSelector;
import com.revolut.feature.giro.api.navigation.GiroCreationFlowDestination;
import com.revolut.feature.giro.api.navigation.GiroCreationFlowInputData;
import com.revolut.feature.giro.api.navigation.GiroDestination;
import com.revolut.feature.giro.api.navigation.GiroFormDestination$Edit;
import com.revolut.feature.giro.impl.ui.GiroFlow;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreen;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$InputData;
import de6.b;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f295406a = 0;

    @Override // nte.a
    public final List e() {
        return u.c(GiroToggles$GiroPocketSelector.f74527c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof GiroCreationFlowDestination) {
            GiroFlow giroFlow = new GiroFlow(((GiroCreationFlowDestination) destination).f74528a);
            b block = new b(flowModel, 6);
            Intrinsics.checkNotNullParameter(block, "block");
            giroFlow.H = block;
            return giroFlow;
        }
        if (!(destination instanceof GiroDestination)) {
            if (destination instanceof GiroFormDestination$Edit) {
                return new DirectDebitFormScreen(new DirectDebitFormScreenContract$InputData.Edit(((GiroFormDestination$Edit) destination).f74532a));
            }
            return null;
        }
        GiroFlow giroFlow2 = new GiroFlow(GiroCreationFlowInputData.CreditorSearch.f74529a);
        b block2 = new b(flowModel, 7);
        Intrinsics.checkNotNullParameter(block2, "block");
        giroFlow2.H = block2;
        return giroFlow2;
    }
}
