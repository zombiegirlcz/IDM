package mid;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f205726a;

    public m(ArrayList components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f205726a = components;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f205726a.equals(((m) obj2).f205726a);
    }

    public final int hashCode() {
        return this.f205726a.hashCode();
    }
}
