package k3l;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusViewConfiguration f180815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.a f180816b;

    public f(StatusViewConfiguration configuration, ty0.a data) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f180815a = configuration;
        this.f180816b = data;
    }

    @Override // k3l.j
    public final StatusViewConfiguration a() {
        return this.f180815a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f180815a, fVar.f180815a) && Intrinsics.f(this.f180816b, fVar.f180816b);
    }

    public final int hashCode() {
        return this.f180816b.hashCode() + (this.f180815a.hashCode() * 31);
    }
}
