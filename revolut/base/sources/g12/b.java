package g12;

import com.revolut.feature.apm.core.ui.api.navigation.qr.QrDetailsInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrDetailsInputData f139517a;

    public b(QrDetailsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f139517a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f139517a, ((b) obj2).f139517a);
    }

    public final int hashCode() {
        return this.f139517a.hashCode();
    }
}
