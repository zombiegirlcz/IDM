package iu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f168470b;

    public f(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168469a = title;
        this.f168470b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f168469a, fVar.f168469a) && this.f168470b.equals(fVar.f168470b);
    }

    public final int hashCode() {
        return this.f168470b.hashCode() + (this.f168469a.hashCode() * 31);
    }
}
