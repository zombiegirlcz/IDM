package aa0;

import com.revolut.feature.backend_flow.domain.models.ValidationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationResult f2731a;

    public f1(ValidationResult validationResult) {
        this.f2731a = validationResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f1) && Intrinsics.f(this.f2731a, ((f1) obj2).f2731a);
    }

    public final int hashCode() {
        ValidationResult validationResult = this.f2731a;
        if (validationResult == null) {
            return 0;
        }
        return validationResult.hashCode();
    }
}
