package v62;

import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoFlowInputData f286315a;

    public c(MultibancoFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f286315a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f286315a, ((c) obj2).f286315a);
    }

    public final int hashCode() {
        return this.f286315a.f62546a.hashCode();
    }
}
