package yfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f313318a;

    public w0(y0 icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f313318a = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w0) && Intrinsics.f(this.f313318a, ((w0) obj2).f313318a);
    }

    public final int hashCode() {
        return this.f313318a.hashCode();
    }
}
