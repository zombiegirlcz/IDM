package zh9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f322315a;

    public o1(ArrayList options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f322315a = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o1) && this.f322315a.equals(((o1) obj2).f322315a);
    }

    public final int hashCode() {
        return this.f322315a.hashCode();
    }
}
