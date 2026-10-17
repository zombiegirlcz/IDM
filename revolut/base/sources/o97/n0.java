package o97;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusViewConfiguration.Success f223121a;

    public n0(StatusViewConfiguration.Success configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f223121a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && this.f223121a.equals(((n0) obj2).f223121a);
    }

    public final int hashCode() {
        return this.f223121a.hashCode();
    }
}
