package uyh;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f284387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8 f284389c;
    public final List d;

    public p(List items, boolean z, j8 j8Var, List keyboardSuggestions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(keyboardSuggestions, "keyboardSuggestions");
        this.f284387a = items;
        this.f284388b = z;
        this.f284389c = j8Var;
        this.d = keyboardSuggestions;
    }

    @Override // cli.p
    public final List c() {
        return this.f284387a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f284387a, pVar.f284387a) && this.f284388b == pVar.f284388b && Intrinsics.f(this.f284389c, pVar.f284389c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f284387a.hashCode() * 31, 31, this.f284388b);
        j8 j8Var = this.f284389c;
        return this.d.hashCode() + ((iC + (j8Var == null ? 0 : j8Var.hashCode())) * 31);
    }
}
