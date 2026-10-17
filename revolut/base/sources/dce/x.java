package dce;

import ip0.t5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t5 f112908a;

    public x(t5 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112908a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f112908a, ((x) obj2).f112908a);
    }

    public final int hashCode() {
        return this.f112908a.hashCode();
    }
}
