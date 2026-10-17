package yfd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends com.revolut.feature.shared_separate_favourites.common.screen.add_asset.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f313222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f313223b;

    public r(TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f313222a = z;
        this.f313223b = buttonTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f313222a == rVar.f313222a && this.f313223b.equals(rVar.f313223b);
    }

    public final int hashCode() {
        return this.f313223b.hashCode() + (Boolean.hashCode(this.f313222a) * 31);
    }
}
