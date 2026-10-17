package dx4;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f120581a;

    public e2(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120581a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e2) && this.f120581a.equals(((e2) obj2).f120581a);
    }

    public final int hashCode() {
        return this.f120581a.hashCode();
    }
}
