package h15;

import aii.e;
import com.revolut.feature.credit.help.api.navigation.self_service.ForbearanceSelfServiceInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ForbearanceSelfServiceInputData f148462a;

    public a(ForbearanceSelfServiceInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f148462a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f148462a, ((a) obj2).f148462a);
    }

    public final int hashCode() {
        return this.f148462a.hashCode();
    }
}
