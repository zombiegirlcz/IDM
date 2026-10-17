package mtc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f208805a;

    public d(Data device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f208805a = device;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f208805a, ((d) obj2).f208805a);
    }

    public final int hashCode() {
        return this.f208805a.hashCode();
    }
}
