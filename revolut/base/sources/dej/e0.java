package dej;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f113526a;

    public e0(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f113526a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && this.f113526a.equals(((e0) obj2).f113526a);
    }

    public final int hashCode() {
        return this.f113526a.hashCode();
    }
}
