package lm5;

import aii.e;
import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TfrValidationFlowContract$InputData f196903a;

    public a(TfrValidationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f196903a = inputData;
    }

    public final TfrValidationFlowContract$InputData b() {
        return this.f196903a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f196903a, ((a) obj2).f196903a);
    }

    public final int hashCode() {
        return this.f196903a.hashCode();
    }
}
