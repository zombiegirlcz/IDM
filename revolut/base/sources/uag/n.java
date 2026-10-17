package uag;

import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsPropertyInputData f278647a;

    public n(HotelsPropertyInputData property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f278647a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f278647a, ((n) obj2).f278647a);
    }

    public final int hashCode() {
        return this.f278647a.hashCode();
    }
}
