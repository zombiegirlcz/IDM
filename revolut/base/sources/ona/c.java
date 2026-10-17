package ona;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f226920a;

    public c(Data config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f226920a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f226920a, ((c) obj2).f226920a);
    }

    public final int hashCode() {
        return this.f226920a.hashCode();
    }
}
