package k3k;

import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DualChooserContract$InputData f180746a;

    public b(DualChooserContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f180746a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f180746a, ((b) obj2).f180746a);
    }

    public final int hashCode() {
        return this.f180746a.hashCode();
    }
}
