package whh;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f297660a;

    public c(ArrayList closureData) {
        Intrinsics.checkNotNullParameter(closureData, "closureData");
        this.f297660a = closureData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f297660a.equals(((c) obj2).f297660a);
    }

    public final int hashCode() {
        return this.f297660a.hashCode();
    }
}
