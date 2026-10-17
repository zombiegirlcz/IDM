package xy3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f309599a;

    public w(ArrayList ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f309599a = ids;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f309599a.equals(((w) obj2).f309599a);
    }

    public final int hashCode() {
        return this.f309599a.hashCode();
    }
}
