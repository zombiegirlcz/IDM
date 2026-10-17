package p6f;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f233261a;

    public d(ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f233261a = points;
    }

    @Override // p6f.g
    public final List a() {
        return this.f233261a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f233261a.equals(((d) obj2).f233261a);
    }

    public final int hashCode() {
        return this.f233261a.hashCode();
    }
}
