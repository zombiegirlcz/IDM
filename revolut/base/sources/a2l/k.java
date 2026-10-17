package a2l;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f911a;

    public k(ArrayList steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f911a = steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f911a.equals(((k) obj2).f911a);
    }

    public final int hashCode() {
        return this.f911a.hashCode();
    }
}
