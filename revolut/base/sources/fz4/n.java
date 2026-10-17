package fz4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f139100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139102c;

    public n(boolean z, String rawValue, String formattedValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f139100a = z;
        this.f139101b = rawValue;
        this.f139102c = formattedValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f139100a == nVar.f139100a && Intrinsics.f(this.f139101b, nVar.f139101b) && Intrinsics.f(this.f139102c, nVar.f139102c);
    }

    public final int hashCode() {
        return this.f139102c.hashCode() + p.a.c(Boolean.hashCode(this.f139100a) * 31, 31, this.f139101b);
    }
}
