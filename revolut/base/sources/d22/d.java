package d22;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f110703b;

    public d(Data status, String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f110702a = requestId;
        this.f110703b = status;
    }

    public static d a(d dVar, Data status) {
        String requestId = dVar.f110702a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(status, "status");
        return new d(status, requestId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f110702a, dVar.f110702a) && Intrinsics.f(this.f110703b, dVar.f110703b);
    }

    public final int hashCode() {
        return this.f110703b.hashCode() + (this.f110702a.hashCode() * 31);
    }
}
