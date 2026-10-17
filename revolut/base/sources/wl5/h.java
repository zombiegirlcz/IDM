package wl5;

import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f298418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298419b;

    public h(y model, boolean z) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f298418a = model;
        this.f298419b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f298418a, hVar.f298418a) && this.f298419b == hVar.f298419b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298419b) + (this.f298418a.hashCode() * 31);
    }
}
