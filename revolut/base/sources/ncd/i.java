package ncd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f214174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f214176c;

    public i(double d, String suffix, k type) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f214174a = d;
        this.f214175b = suffix;
        this.f214176c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Double.compare(this.f214174a, iVar.f214174a) == 0 && Intrinsics.f(this.f214175b, iVar.f214175b) && this.f214176c == iVar.f214176c;
    }

    public final int hashCode() {
        return this.f214176c.hashCode() + p.a.c(Double.hashCode(this.f214174a) * 31, 31, this.f214175b);
    }
}
