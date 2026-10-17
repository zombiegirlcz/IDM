package h3l;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusViewConfiguration f149238a;

    public c(StatusViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f149238a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f149238a, ((c) obj2).f149238a);
    }

    public final int hashCode() {
        return this.f149238a.hashCode();
    }
}
