package aa0;

import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationResult f2725a;

    public b1(ValidationResult validationResult) {
        this.f2725a = validationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && Intrinsics.f(this.f2725a, ((b1) obj2).f2725a);
    }

    public final int hashCode() {
        ValidationResult validationResult = this.f2725a;
        if (validationResult == null) {
            return 0;
        }
        return validationResult.hashCode();
    }
}
