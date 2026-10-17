package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f216152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f216153b;

    public g(Object obj2, n1 statusDialogResult) {
        Intrinsics.checkNotNullParameter(statusDialogResult, "statusDialogResult");
        this.f216152a = obj2;
        this.f216153b = statusDialogResult;
    }

    @Override // nii.h
    public final n1 a() {
        return this.f216153b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f216152a, gVar.f216152a) && Intrinsics.f(this.f216153b, gVar.f216153b);
    }

    public final int hashCode() {
        Object obj2 = this.f216152a;
        return this.f216153b.hashCode() + ((obj2 == null ? 0 : obj2.hashCode()) * 31);
    }
}
