package bs4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr4.c f18054a;

    public m(yr4.c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f18054a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f18054a, ((m) obj2).f18054a);
    }

    public final int hashCode() {
        return this.f18054a.hashCode();
    }
}
