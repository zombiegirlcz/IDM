package h3l;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusViewConfiguration f149237a;

    public b(StatusViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f149237a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f149237a, ((b) obj2).f149237a);
    }

    public final int hashCode() {
        return this.f149237a.hashCode();
    }
}
