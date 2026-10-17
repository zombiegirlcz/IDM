package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10428c;

    public m8(List bidList, List askList, float f) {
        Intrinsics.checkNotNullParameter(bidList, "bidList");
        Intrinsics.checkNotNullParameter(askList, "askList");
        this.f10426a = bidList;
        this.f10427b = askList;
        this.f10428c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj2;
        return Intrinsics.f(this.f10426a, m8Var.f10426a) && Intrinsics.f(this.f10427b, m8Var.f10427b) && Float.compare(this.f10428c, m8Var.f10428c) == 0;
    }

    public final int hashCode() {
        return m72.b.b(this.f10428c, p.a.d(this.f10426a.hashCode() * 31, 31, this.f10427b), 31);
    }
}
