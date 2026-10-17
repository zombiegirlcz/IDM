package a8b;

import kotlin.jvm.internal.Intrinsics;
import r5b.p;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2150b;

    public f(p action, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f2149a = action;
        this.f2150b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f2149a == fVar.f2149a && Intrinsics.f(this.f2150b, fVar.f2150b);
    }

    public final int hashCode() {
        int iHashCode = this.f2149a.hashCode() * 31;
        String str = this.f2150b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
