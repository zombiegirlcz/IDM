package hda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f151397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f151398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f151399c;

    public b(io3.d pocket, wi0.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f151397a = pocket;
        this.f151398b = bVar;
        this.f151399c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f151397a.equals(bVar.f151397a) && Intrinsics.f(this.f151398b, bVar.f151398b) && this.f151399c == bVar.f151399c;
    }

    public final int hashCode() {
        int iHashCode = this.f151397a.hashCode() * 31;
        wi0.b bVar = this.f151398b;
        return Boolean.hashCode(this.f151399c) + ((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31);
    }
}
