package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o1 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f10450b;

    public o1(List items, n1 style) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f10449a = items;
        this.f10450b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f10449a, o1Var.f10449a) && this.f10450b == o1Var.f10450b;
    }

    public final int hashCode() {
        return this.f10450b.hashCode() + (this.f10449a.hashCode() * 31);
    }

    public /* synthetic */ o1(List list) {
        this(list, n1.DEFAULT);
    }
}
