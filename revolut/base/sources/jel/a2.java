package jel;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173407c;
    public final ArrayList d;

    public a2(String tab2, String title, String body, ArrayList ranges) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(ranges, "ranges");
        this.f173405a = tab2;
        this.f173406b = title;
        this.f173407c = body;
        this.d = ranges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.f173405a, a2Var.f173405a) && Intrinsics.f(this.f173406b, a2Var.f173406b) && Intrinsics.f(this.f173407c, a2Var.f173407c) && this.d.equals(a2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f173405a.hashCode() * 31, 31, this.f173406b), 31, this.f173407c);
    }
}
