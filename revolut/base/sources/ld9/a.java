package ld9;

import aii.u;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptDestination;
import com.revolut.feature.onboarding.impl.verifyaccount.flow.VerifyAccountPromptFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof VerifyAccountPromptDestination) {
            return new VerifyAccountPromptFlow(((VerifyAccountPromptDestination) destination).f78235a);
        }
        return null;
    }
}
