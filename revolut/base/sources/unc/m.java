package unc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f281401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f281402b;

    public m(l primaryButton, l secondaryButton) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        this.f281401a = primaryButton;
        this.f281402b = secondaryButton;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f281401a, mVar.f281401a) && Intrinsics.f(this.f281402b, mVar.f281402b);
    }

    public final int hashCode() {
        return this.f281402b.hashCode() + (this.f281401a.hashCode() * 31);
    }
}
