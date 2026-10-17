package f9a;

import com.revolut.feature.pix.api.model.AliasRegistrationResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasRegistrationResult f132879a;

    public d(AliasRegistrationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f132879a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f132879a, ((d) obj2).f132879a);
    }

    public final int hashCode() {
        return this.f132879a.hashCode();
    }
}
