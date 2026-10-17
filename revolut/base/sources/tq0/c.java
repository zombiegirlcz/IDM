package tq0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f273449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f273450b;

    public c(a model, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f273449a = model;
        this.f273450b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f273449a, cVar.f273449a) && this.f273450b == cVar.f273450b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f273450b) + (this.f273449a.hashCode() * 31);
    }
}
