package x36;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f302663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j8 f302664c;
    public final List d;

    public d(List items, boolean z, j8 j8Var, List keyboardSuggestions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(keyboardSuggestions, "keyboardSuggestions");
        this.f302662a = items;
        this.f302663b = z;
        this.f302664c = j8Var;
        this.d = keyboardSuggestions;
    }

    @Override // cli.p
    public final List c() {
        return this.f302662a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f302662a, dVar.f302662a) && this.f302663b == dVar.f302663b && Intrinsics.f(this.f302664c, dVar.f302664c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f302662a.hashCode() * 31, 31, this.f302663b);
        j8 j8Var = this.f302664c;
        return this.d.hashCode() + ((iC + (j8Var == null ? 0 : j8Var.hashCode())) * 31);
    }
}
