package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f168460b;

    public b(String title, a action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f168459a = title;
        this.f168460b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f168459a, bVar.f168459a) && this.f168460b == bVar.f168460b;
    }

    public final int hashCode() {
        return this.f168460b.hashCode() + (this.f168459a.hashCode() * 31);
    }
}
