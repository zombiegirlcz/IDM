package cq8;

import aw0.n6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6 f108028a;

    public f(n6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f108028a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f108028a, ((f) obj2).f108028a);
    }

    public final int hashCode() {
        return this.f108028a.hashCode();
    }
}
