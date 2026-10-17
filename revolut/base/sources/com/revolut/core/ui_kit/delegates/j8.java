package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.yt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j8 extends ListCellDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yt f54324b;

    public j8(Image img2, yt alignment) {
        Intrinsics.checkNotNullParameter(img2, "img");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f54323a = img2;
        this.f54324b = alignment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj2;
        return Intrinsics.f(this.f54323a, j8Var.f54323a) && this.f54324b == j8Var.f54324b;
    }

    public final int hashCode() {
        return this.f54324b.hashCode() + (this.f54323a.hashCode() * 31);
    }

    public /* synthetic */ j8(Image image) {
        this(image, yt.CENTER);
    }
}
