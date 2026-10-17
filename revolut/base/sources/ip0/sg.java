package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f166348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f166349b;

    public sg(Clause detailsTitle, Clause detailsEndText) {
        Intrinsics.checkNotNullParameter(detailsTitle, "detailsTitle");
        Intrinsics.checkNotNullParameter(detailsEndText, "detailsEndText");
        this.f166348a = detailsTitle;
        this.f166349b = detailsEndText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sg)) {
            return false;
        }
        sg sgVar = (sg) obj2;
        return Intrinsics.f(this.f166348a, sgVar.f166348a) && Intrinsics.f(this.f166349b, sgVar.f166349b);
    }

    public final int hashCode() {
        return this.f166349b.hashCode() + (this.f166348a.hashCode() * 31);
    }
}
