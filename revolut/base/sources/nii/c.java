package nii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f216123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f216124b;

    public c(Throwable cause, n1 statusDialogResult) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(statusDialogResult, "statusDialogResult");
        this.f216123a = cause;
        this.f216124b = statusDialogResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f216123a, cVar.f216123a) && Intrinsics.f(this.f216124b, cVar.f216124b);
    }

    public final int hashCode() {
        return this.f216124b.hashCode() + (this.f216123a.hashCode() * 31);
    }
}
