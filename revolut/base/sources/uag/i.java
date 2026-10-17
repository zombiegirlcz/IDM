package uag;

import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyInputData.BookablePreview f278642a;

    public i(HotelsPropertyInputData.BookablePreview bookablePreview) {
        Intrinsics.checkNotNullParameter(bookablePreview, "bookablePreview");
        this.f278642a = bookablePreview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f278642a, ((i) obj2).f278642a);
    }

    public final int hashCode() {
        return this.f278642a.hashCode();
    }
}
