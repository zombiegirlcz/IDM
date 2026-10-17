package ht3;

import dx4.z2;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f155267a;

    public f0(z2 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f155267a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f155267a, ((f0) obj2).f155267a);
    }

    public final int hashCode() {
        return this.f155267a.hashCode();
    }
}
