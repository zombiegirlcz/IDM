package rp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f256146c;

    public o0(Object obj2, String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f256144a = id10;
        this.f256145b = text;
        this.f256146c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f256144a, o0Var.f256144a) && Intrinsics.f(this.f256145b, o0Var.f256145b) && Intrinsics.f(this.f256146c, o0Var.f256146c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f256144a.hashCode() * 31, 31, this.f256145b);
        Object obj2 = this.f256146c;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
