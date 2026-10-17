package s6c;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f260227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f260228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f260229c;

    public k(dj0.d total, dj0.d subtotal, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        this.f260227a = total;
        this.f260228b = subtotal;
        this.f260229c = dVar;
    }

    @Override // s6c.l
    public final dj0.d a() {
        return this.f260227a;
    }

    @Override // s6c.l
    public final dj0.d b() {
        return this.f260229c;
    }

    @Override // s6c.l
    public final dj0.d c() {
        return this.f260228b;
    }

    @Override // s6c.l
    public final dj0.d d() {
        return this.f260227a;
    }

    @Override // s6c.l
    public final p e() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f260227a, kVar.f260227a) && Intrinsics.f(this.f260228b, kVar.f260228b) && Intrinsics.f(this.f260229c, kVar.f260229c);
    }

    @Override // s6c.l
    public final dj0.d f() {
        return this.f260227a;
    }

    public final int hashCode() {
        int iC = v7.c(this.f260227a.hashCode() * 31, 31, this.f260228b);
        dj0.d dVar = this.f260229c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
