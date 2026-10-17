package dce;

import ip0.f6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6 f112903a;

    public v(f6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f112903a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f112903a, ((v) obj2).f112903a);
    }

    public final int hashCode() {
        return this.f112903a.hashCode();
    }
}
