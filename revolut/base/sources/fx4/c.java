package fx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f138721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f138722b;

    public c(b bVar, a primaryButton) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f138721a = bVar;
        this.f138722b = primaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f138721a, cVar.f138721a) && Intrinsics.f(this.f138722b, cVar.f138722b);
    }

    public final int hashCode() {
        b bVar = this.f138721a;
        return this.f138722b.f138719a.hashCode() + ((bVar == null ? 0 : bVar.f138720a.hashCode()) * 31);
    }
}
