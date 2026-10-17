package ibi;

import aii.e;
import com.revolut.feature_retail_user_declarations.employer.EmployerInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmployerInputData f160181a;

    public a(EmployerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f160181a = inputData;
    }

    public final EmployerInputData b() {
        return this.f160181a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f160181a, ((a) obj2).f160181a);
    }

    public final int hashCode() {
        return this.f160181a.hashCode();
    }
}
