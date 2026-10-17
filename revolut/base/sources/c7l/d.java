package c7l;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22062c;

    public d(String hint, ArrayList reasons, boolean z) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f22060a = reasons;
        this.f22061b = z;
        this.f22062c = hint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f22060a.equals(dVar.f22060a) && this.f22061b == dVar.f22061b && this.f22062c.equals(dVar.f22062c);
    }

    public final int hashCode() {
        return this.f22062c.hashCode() + j6.a.c(this.f22060a.hashCode() * 31, 31, this.f22061b);
    }
}
