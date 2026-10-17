package dyl;

import android.graphics.Bitmap;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f121138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f121139b;

    public b(Bitmap bitmap, View anchorView) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f121138a = bitmap;
        this.f121139b = anchorView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f121138a, bVar.f121138a) && Intrinsics.f(this.f121139b, bVar.f121139b);
    }

    public final int hashCode() {
        return this.f121139b.hashCode() + (this.f121138a.hashCode() * 31);
    }
}
