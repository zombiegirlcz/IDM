package w86;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f295593a;

    public e(Data devices) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        this.f295593a = devices;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f295593a, ((e) obj2).f295593a);
    }

    public final int hashCode() {
        return this.f295593a.hashCode();
    }
}
