package f2k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0.m f131851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f131852b;

    public m(bw0.m model, h hVar) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f131851a = model;
        this.f131852b = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f131851a, mVar.f131851a) && Intrinsics.f(this.f131852b, mVar.f131852b);
    }

    public final int hashCode() {
        int iHashCode = this.f131851a.hashCode() * 31;
        h hVar = this.f131852b;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
