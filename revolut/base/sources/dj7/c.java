package dj7;

import aii.p;
import aii.u;
import com.revolut.feature.insurance.api.navigation.InsuranceDestination$SuitabilityStatement;
import com.revolut.feature.insurance.impl.ui.documents.local.InsuranceDocumentHardCopyScreen;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InsuranceDestination$SuitabilityStatement) {
            return new InsuranceDocumentHardCopyScreen(new bl7.b(((InsuranceDestination$SuitabilityStatement) destination).f75032a));
        }
        return null;
    }
}
