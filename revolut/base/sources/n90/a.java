package n90;

import aii.e;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowInput f213522a;

    public a(BackendFlowInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f213522a = inputData;
    }

    public final BackendFlowInput b() {
        return this.f213522a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f213522a, ((a) obj2).f213522a);
    }

    public final int hashCode() {
        return this.f213522a.hashCode();
    }
}
