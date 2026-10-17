package ox5;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f230582b;

    public k(LinkedHashMap performances, List collections) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        Intrinsics.checkNotNullParameter(performances, "performances");
        this.f230581a = collections;
        this.f230582b = performances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f230581a, kVar.f230581a) && this.f230582b.equals(kVar.f230582b);
    }

    public final int hashCode() {
        return this.f230582b.hashCode() + (this.f230581a.hashCode() * 31);
    }
}
