package krf;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f188864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188866c;

    public f(String hint, ArrayList reasons, boolean z) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f188864a = reasons;
        this.f188865b = z;
        this.f188866c = hint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f188864a.equals(fVar.f188864a) && this.f188865b == fVar.f188865b && Intrinsics.f(this.f188866c, fVar.f188866c);
    }

    public final int hashCode() {
        return this.f188866c.hashCode() + j6.a.c(this.f188864a.hashCode() * 31, 31, this.f188865b);
    }
}
