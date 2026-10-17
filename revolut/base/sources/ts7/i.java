package ts7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f274051a;

    public i(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f274051a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f274051a.equals(((i) obj2).f274051a);
    }

    public final int hashCode() {
        return this.f274051a.hashCode();
    }
}
