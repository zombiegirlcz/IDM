package vl5;

import jki.m;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f290296a;

    public g(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f290296a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f290296a, ((g) obj2).f290296a);
    }

    public final int hashCode() {
        return this.f290296a.hashCode();
    }
}
