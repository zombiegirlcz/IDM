package h3l;

import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatusViewConfiguration f149235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.a f149236b;

    public a(StatusViewConfiguration configuration, ty0.a data) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f149235a = configuration;
        this.f149236b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f149235a, aVar.f149235a) && Intrinsics.f(this.f149236b, aVar.f149236b);
    }

    public final int hashCode() {
        return this.f149236b.hashCode() + (this.f149235a.hashCode() * 31);
    }
}
