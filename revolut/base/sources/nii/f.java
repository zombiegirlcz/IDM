package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f216146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f216147b;

    public f(Throwable cause, n1 statusDialogResult) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(statusDialogResult, "statusDialogResult");
        this.f216146a = cause;
        this.f216147b = statusDialogResult;
    }

    @Override // nii.h
    public final n1 a() {
        return this.f216147b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f216146a, fVar.f216146a) && Intrinsics.f(this.f216147b, fVar.f216147b);
    }

    public final int hashCode() {
        return this.f216147b.hashCode() + (this.f216146a.hashCode() * 31);
    }
}
