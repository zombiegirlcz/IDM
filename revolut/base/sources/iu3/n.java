package iu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f168491b;

    public n(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168490a = title;
        this.f168491b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f168490a, nVar.f168490a) && this.f168491b.equals(nVar.f168491b);
    }

    public final int hashCode() {
        return this.f168491b.hashCode() + (this.f168490a.hashCode() * 31);
    }
}
