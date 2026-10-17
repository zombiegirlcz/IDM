package o39;

import aii.e;
import com.revolut.feature.localisation.ui.api.navigation.DateInputInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateInputInputData f221708a;

    public a(DateInputInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f221708a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f221708a, ((a) obj2).f221708a);
    }

    public final int hashCode() {
        return this.f221708a.hashCode();
    }
}
