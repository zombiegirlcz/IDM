package yw4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f317315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317316b;

    public b(a selected, List options) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f317315a = selected;
        this.f317316b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f317315a == bVar.f317315a && Intrinsics.f(this.f317316b, bVar.f317316b);
    }

    public final int hashCode() {
        return this.f317316b.hashCode() + (this.f317315a.hashCode() * 31);
    }
}
