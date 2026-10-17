package k3l;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusViewConfiguration f180819a;

    public i(StatusViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f180819a = configuration;
    }

    @Override // k3l.j
    public final StatusViewConfiguration a() {
        return this.f180819a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f180819a, ((i) obj2).f180819a);
    }

    public final int hashCode() {
        return this.f180819a.hashCode();
    }
}
