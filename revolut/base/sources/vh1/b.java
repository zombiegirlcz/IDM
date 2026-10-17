package vh1;

import kotlin.jvm.internal.Intrinsics;
import sh1.h;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f289267a;

    public b(h addressFields) {
        Intrinsics.checkNotNullParameter(addressFields, "addressFields");
        this.f289267a = addressFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f289267a, ((b) obj2).f289267a);
    }

    public final int hashCode() {
        return this.f289267a.hashCode();
    }
}
