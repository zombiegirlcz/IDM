package n8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f213444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f213445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f213446c;
    public final l d;

    public m(boolean z, boolean z3, p iconType, l destinationModel) {
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(destinationModel, "destinationModel");
        this.f213444a = z;
        this.f213445b = z3;
        this.f213446c = iconType;
        this.d = destinationModel;
    }

    @Override // n8i.o
    public final boolean a() {
        return this.f213444a;
    }

    @Override // n8i.o
    public final p b() {
        return this.f213446c;
    }

    @Override // n8i.o
    public final boolean c() {
        return this.f213445b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f213444a == mVar.f213444a && this.f213445b == mVar.f213445b && this.f213446c == mVar.f213446c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f213446c.hashCode() + j6.a.c(Boolean.hashCode(this.f213444a) * 31, 31, this.f213445b)) * 31);
    }
}
