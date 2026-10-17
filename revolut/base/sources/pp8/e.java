package pp8;

import ip0.vd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd f238296a;

    public e(vd model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f238296a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f238296a, ((e) obj2).f238296a);
    }

    public final int hashCode() {
        return this.f238296a.hashCode();
    }
}
