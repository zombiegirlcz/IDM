package c84;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final it3.d f22108b;

    public u(it3.d status, boolean z) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f22107a = z;
        this.f22108b = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f22107a == uVar.f22107a && Intrinsics.f(this.f22108b, uVar.f22108b);
    }

    public final int hashCode() {
        return this.f22108b.hashCode() + (Boolean.hashCode(this.f22107a) * 31);
    }
}
