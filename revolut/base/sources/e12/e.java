package e12;

import com.revolut.feature.apm.core.ui.api.navigation.list.ApmTransactionAreaListInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransactionAreaListInputData f121854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f121855b;

    public e(ApmTransactionAreaListInputData inputData, f extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f121854a = inputData;
        this.f121855b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f121854a, eVar.f121854a) && Intrinsics.f(this.f121855b, eVar.f121855b);
    }

    public final int hashCode() {
        return this.f121855b.hashCode() + (this.f121854a.f62310a.hashCode() * 31);
    }
}
