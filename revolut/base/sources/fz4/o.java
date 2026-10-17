package fz4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139105c;
    public final boolean d;
    public final String e;

    public o(String key, String value, String placeholder, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.f139103a = key;
        this.f139104b = z;
        this.f139105c = value;
        this.d = z3;
        this.e = placeholder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f139103a, oVar.f139103a) && this.f139104b == oVar.f139104b && Intrinsics.f(this.f139105c, oVar.f139105c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.c(j6.a.c(this.f139103a.hashCode() * 31, 31, this.f139104b), 31, this.f139105c), 31, this.d);
    }
}
