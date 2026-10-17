package wok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f298949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f298950b;

    public j(i background, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f298949a = background;
        this.f298950b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f298949a, jVar.f298949a) && Intrinsics.f(this.f298950b, jVar.f298950b);
    }

    public final int hashCode() {
        int iHashCode = this.f298949a.hashCode() * 31;
        aw0.i iVar = this.f298950b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
