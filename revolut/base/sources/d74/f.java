package d74;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f111811a;

    public f(Data preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f111811a = preferences;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f111811a, ((f) obj2).f111811a);
    }

    public final int hashCode() {
        return this.f111811a.hashCode();
    }
}
