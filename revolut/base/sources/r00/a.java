package r00;

import kotlin.jvm.internal.Intrinsics;
import xv.s;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250672a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Intrinsics.f(this.f250672a, ((a) obj2).f250672a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f250672a.hashCode();
    }

    public final String toString() {
        return p.a.p("FaceCorrectnessValidatorInfo(modelVersion=", this.f250672a, ")");
    }
}
