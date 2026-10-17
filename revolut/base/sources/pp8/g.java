package pp8;

import aw0.n6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6 f238298a;

    public g(n6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f238298a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f238298a, ((g) obj2).f238298a);
    }

    public final int hashCode() {
        return this.f238298a.hashCode();
    }
}
