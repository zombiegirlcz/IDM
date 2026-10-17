package hyl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f156926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f156927c;
    public final a d;
    public final ArrayList e;

    public o(String id10, double d, double d5, a dotColor, ArrayList labels) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(dotColor, "dotColor");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.f156925a = id10;
        this.f156926b = d;
        this.f156927c = d5;
        this.d = dotColor;
        this.e = labels;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f156925a, oVar.f156925a) && Double.compare(this.f156926b, oVar.f156926b) == 0 && Double.compare(this.f156927c, oVar.f156927c) == 0 && this.d == oVar.d && this.e.equals(oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + m72.b.c(m72.b.c(this.f156925a.hashCode() * 31, this.f156926b, 31), this.f156927c, 31)) * 31);
    }
}
