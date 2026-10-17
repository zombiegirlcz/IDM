package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class os {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f165722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.h4 f165723b;

    public os(ResourceImage icon) {
        ms0.h4 style = ms0.h4.SEMIACCENT;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f165722a = icon;
        this.f165723b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof os)) {
            return false;
        }
        os osVar = (os) obj2;
        return Intrinsics.f(this.f165722a, osVar.f165722a) && this.f165723b == osVar.f165723b;
    }

    public final int hashCode() {
        return this.f165723b.hashCode() + (this.f165722a.hashCode() * 961);
    }
}
