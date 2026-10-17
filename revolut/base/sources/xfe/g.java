package xfe;

import kotlin.jvm.internal.Intrinsics;
import nii.w;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f305251a;

    public g(w statusDialog) {
        Intrinsics.checkNotNullParameter(statusDialog, "statusDialog");
        this.f305251a = statusDialog;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f305251a.equals(((g) obj2).f305251a);
    }

    public final int hashCode() {
        return this.f305251a.hashCode();
    }
}
