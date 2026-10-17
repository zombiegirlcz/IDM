package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155278b;

    public h0(String name, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f155277a = name;
        this.f155278b = path;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f155277a, h0Var.f155277a) && Intrinsics.f(this.f155278b, h0Var.f155278b);
    }

    public final int hashCode() {
        return this.f155278b.hashCode() + (this.f155277a.hashCode() * 31);
    }
}
