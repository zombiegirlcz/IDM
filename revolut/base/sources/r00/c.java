package r00;

import e10.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f250673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f250674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f250675c;
    public final float d;
    public final float e;
    public final l f;

    public c(Set quality, boolean z, float f, float f4, float f5, l lVar) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        this.f250673a = quality;
        this.f250674b = z;
        this.f250675c = f;
        this.d = f4;
        this.e = f5;
        this.f = lVar;
    }

    @Override // r00.e
    public final l a() {
        return this.f;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f250673a, cVar.f250673a) && this.f250674b == cVar.f250674b && Float.compare(this.f250675c, cVar.f250675c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f250675c, j6.a.c(this.f250673a.hashCode() * 31, 31, this.f250674b), 31), 31), 31);
        l lVar = this.f;
        return iB + (lVar == null ? 0 : lVar.hashCode());
    }
}
