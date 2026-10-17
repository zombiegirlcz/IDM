package oul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrl.a0 f229919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f229920b;

    public r(vrl.a0 value, u dialogContext) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(dialogContext, "dialogContext");
        this.f229919a = value;
        this.f229920b = dialogContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f229919a, rVar.f229919a) && Intrinsics.f(this.f229920b, rVar.f229920b);
    }

    public final int hashCode() {
        return this.f229920b.hashCode() + (this.f229919a.hashCode() * 31);
    }
}
