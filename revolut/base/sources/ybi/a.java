package ybi;

import aii.e;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurposeOfAccountFlowInputData f312371a;

    public a(PurposeOfAccountFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f312371a = inputData;
    }

    public final PurposeOfAccountFlowInputData b() {
        return this.f312371a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f312371a, ((a) obj2).f312371a);
    }

    public final int hashCode() {
        return this.f312371a.hashCode();
    }
}
