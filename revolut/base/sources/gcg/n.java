package gcg;

import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyInputData.BookablePreview f142462a;

    public n(HotelsPropertyInputData.BookablePreview bookablePreview) {
        Intrinsics.checkNotNullParameter(bookablePreview, "bookablePreview");
        this.f142462a = bookablePreview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f142462a, ((n) obj2).f142462a);
    }

    public final int hashCode() {
        return this.f142462a.hashCode();
    }
}
