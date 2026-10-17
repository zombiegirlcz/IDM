package aw0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10328b;

    public gb(CutoutImageView view) {
        zhm.f0 associatedViews = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(associatedViews, "associatedViews");
        this.f10327a = view;
        this.f10328b = associatedViews;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj2;
        return Intrinsics.f(this.f10327a, gbVar.f10327a) && Intrinsics.f(this.f10328b, gbVar.f10328b);
    }

    public final int hashCode() {
        return this.f10328b.hashCode() + (this.f10327a.hashCode() * 31);
    }
}
