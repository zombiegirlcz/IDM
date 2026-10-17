package bai;

import com.revolut.feature.terms.api.model.Terms;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();
    public static final h d = new h(false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Terms f14099c;

    public h(boolean z, boolean z3, Terms terms) {
        this.f14097a = z;
        this.f14098b = z3;
        this.f14099c = terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f14097a == hVar.f14097a && this.f14098b == hVar.f14098b && Intrinsics.f(this.f14099c, hVar.f14099c);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f14097a) * 31, 31, this.f14098b);
        Terms terms = this.f14099c;
        return iC + (terms == null ? 0 : terms.hashCode());
    }
}
