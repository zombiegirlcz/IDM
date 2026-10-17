package pxl;

import android.view.View;
import com.revolut.core.ui_kit.views.CardsCarouselView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardsCarouselView f240635a;

    public c(CardsCarouselView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f240635a = view;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f240635a, ((c) obj2).f240635a);
    }

    @Override // pxl.e
    public final View getView() {
        return this.f240635a;
    }

    public final int hashCode() {
        return this.f240635a.hashCode();
    }
}
