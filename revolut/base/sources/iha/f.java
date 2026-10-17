package iha;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161320a;

    public f(f0 features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f161320a = features;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f161320a, ((f) obj2).f161320a);
    }

    public final int hashCode() {
        return this.f161320a.hashCode() * 31;
    }
}
