package k3l;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusViewConfiguration f180818a;

    public h(StatusViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f180818a = configuration;
    }

    @Override // k3l.j
    public final StatusViewConfiguration a() {
        return this.f180818a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f180818a, ((h) obj2).f180818a);
    }

    public final int hashCode() {
        return this.f180818a.hashCode();
    }
}
