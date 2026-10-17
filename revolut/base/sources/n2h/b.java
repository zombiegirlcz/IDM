package n2h;

import aw0.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f211541a;

    public b(i model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f211541a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f211541a, ((b) obj2).f211541a);
    }

    public final int hashCode() {
        return this.f211541a.hashCode();
    }
}
