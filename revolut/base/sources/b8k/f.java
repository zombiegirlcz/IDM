package b8k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bla.c f13280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13281b;

    public f(e version, bla.c predefinedFeatureState) {
        Intrinsics.checkNotNullParameter(predefinedFeatureState, "predefinedFeatureState");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f13280a = predefinedFeatureState;
        this.f13281b = version;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f13280a == fVar.f13280a && this.f13281b == fVar.f13281b;
    }

    public final int hashCode() {
        return this.f13281b.hashCode() + (this.f13280a.hashCode() * 31);
    }
}
