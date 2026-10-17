package ob0;

import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PhoneInputItem f223841a;

    public t(PhoneInputItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f223841a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f223841a, ((t) obj2).f223841a);
    }

    public final int hashCode() {
        return this.f223841a.hashCode();
    }
}
