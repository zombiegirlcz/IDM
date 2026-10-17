package s86;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f260905a;

    public f(Data device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.f260905a = device;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f260905a, ((f) obj2).f260905a);
    }

    public final int hashCode() {
        return this.f260905a.hashCode();
    }
}
