package sua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265696a;

    public b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f265696a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f265696a, ((b) obj2).f265696a);
    }

    public final int hashCode() {
        return this.f265696a.hashCode();
    }
}
