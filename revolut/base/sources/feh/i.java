package feh;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f134623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentImage f134624b;

    public i(TextClause title, InstrumentImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f134623a = title;
        this.f134624b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f134623a.equals(iVar.f134623a) && this.f134624b.equals(iVar.f134624b);
    }

    public final int hashCode() {
        return this.f134624b.hashCode() + (this.f134623a.hashCode() * 31);
    }
}
