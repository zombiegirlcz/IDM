package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f123896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f123898c;
    public final String d;

    public x(a position, String color, d0 side, String str) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f123896a = position;
        this.f123897b = color;
        this.f123898c = side;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f123896a, xVar.f123896a) && Intrinsics.f(this.f123897b, xVar.f123897b) && this.f123898c == xVar.f123898c && Intrinsics.f(this.d, xVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f123898c.hashCode() + p.a.c(this.f123896a.hashCode() * 31, 31, this.f123897b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
