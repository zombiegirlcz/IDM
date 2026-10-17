package my8;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f210402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f210403b;

    public y(l doc2, ArrayList next) {
        Intrinsics.checkNotNullParameter(doc2, "doc");
        Intrinsics.checkNotNullParameter(next, "next");
        this.f210402a = doc2;
        this.f210403b = next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f210402a, yVar.f210402a) && this.f210403b.equals(yVar.f210403b);
    }

    public final int hashCode() {
        return this.f210403b.hashCode() + (this.f210402a.hashCode() * 31);
    }
}
