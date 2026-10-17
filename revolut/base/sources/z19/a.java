package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f318760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f318761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f318762c;

    public a(l ref2, h content, m mVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f318760a = ref2;
        this.f318761b = content;
        this.f318762c = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f318760a == aVar.f318760a && Intrinsics.f(this.f318761b, aVar.f318761b) && Intrinsics.f(this.f318762c, aVar.f318762c);
    }

    public final int hashCode() {
        int iHashCode = (this.f318761b.hashCode() + (this.f318760a.hashCode() * 31)) * 31;
        m mVar = this.f318762c;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
