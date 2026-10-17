package fm9;

import aii.e;
import com.revolut.feature.payees.api.models.PayeesInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesInputData f136034a;

    public a(PayeesInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f136034a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f136034a, ((a) obj2).f136034a);
    }

    public final int hashCode() {
        return this.f136034a.f78987a.hashCode();
    }
}
