package oa2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f223510b;

    public k(aim.e items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223509a = items;
        this.f223510b = i;
    }

    @Override // cli.p
    public final List c() {
        return this.f223509a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f223509a, kVar.f223509a) && this.f223510b == kVar.f223510b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223510b) + (this.f223509a.hashCode() * 31);
    }
}
