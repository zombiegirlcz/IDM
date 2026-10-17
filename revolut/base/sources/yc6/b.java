package yc6;

import aii.u;
import b60.e;
import com.revolut.feature.entity.provider.api.navigation.LearnMoreBottomSheetDestination;
import com.revolut.feature.entity.provider.impl.ui.bottomsheet.LearnMoreBottomSheetScreen;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nhi.f;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f, e, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hd6.a f312543a;

    public b(hd6.a legalEntityConfiguration) {
        Intrinsics.checkNotNullParameter(legalEntityConfiguration, "legalEntityConfiguration");
        this.f312543a = legalEntityConfiguration;
    }

    @Override // nhi.h, aii.p
    public final void b() {
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, LearnMoreBottomSheetDestination.f72114a)) {
            return new LearnMoreBottomSheetScreen(this.f312543a);
        }
        return null;
    }
}
