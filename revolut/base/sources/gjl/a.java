package gjl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f144306a;

    public a(Data connectedApps) {
        Intrinsics.checkNotNullParameter(connectedApps, "connectedApps");
        this.f144306a = connectedApps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f144306a, ((a) obj2).f144306a);
    }

    public final int hashCode() {
        return this.f144306a.hashCode();
    }
}
