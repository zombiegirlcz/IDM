package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class x implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRecipientListInputData f20356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f20357b;

    public x(ApmRecipientListInputData inputData, z extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f20356a = inputData;
        this.f20357b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f20356a, xVar.f20356a) && Intrinsics.f(this.f20357b, xVar.f20357b);
    }

    public final int hashCode() {
        return this.f20357b.hashCode() + (this.f20356a.hashCode() * 31);
    }
}
