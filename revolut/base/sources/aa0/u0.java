package aa0;

import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationResult f2743a;

    public u0(ValidationResult validationResult) {
        this.f2743a = validationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u0) && Intrinsics.f(this.f2743a, ((u0) obj2).f2743a);
    }

    public final int hashCode() {
        ValidationResult validationResult = this.f2743a;
        if (validationResult == null) {
            return 0;
        }
        return validationResult.hashCode();
    }
}
