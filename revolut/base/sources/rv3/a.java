package rv3;

import aii.e;
import com.revolut.feature.credit.application.plugins.api.navigation.prompt.CreditPromptInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPromptInputData f257689a;

    public a(CreditPromptInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f257689a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f257689a, ((a) obj2).f257689a);
    }

    public final int hashCode() {
        return this.f257689a.hashCode();
    }
}
