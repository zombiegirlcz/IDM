package dx4;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f120560a;

    public b5(ArrayList steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f120560a = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b5) && this.f120560a.equals(((b5) obj2).f120560a);
    }

    public final int hashCode() {
        return this.f120560a.hashCode();
    }
}
