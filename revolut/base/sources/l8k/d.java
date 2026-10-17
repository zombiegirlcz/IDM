package l8k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f193002a;

    public d(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f193002a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f193002a, ((d) obj2).f193002a);
    }

    public final int hashCode() {
        return this.f193002a.hashCode();
    }
}
