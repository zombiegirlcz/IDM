package qmh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f247849a;

    public i(List collections) {
        Intrinsics.checkNotNullParameter(collections, "collections");
        this.f247849a = collections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f247849a, ((i) obj2).f247849a);
    }

    public final int hashCode() {
        return this.f247849a.hashCode();
    }
}
