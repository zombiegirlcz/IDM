package e12;

import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionOnlyListInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransactionOnlyListInputData f121856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f121857b;

    public g(ApmTransactionOnlyListInputData inputData, h extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f121856a = inputData;
        this.f121857b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f121856a, gVar.f121856a) && Intrinsics.f(this.f121857b, gVar.f121857b);
    }

    public final int hashCode() {
        return this.f121857b.hashCode() + (this.f121856a.f62311a.hashCode() * 31);
    }
}
