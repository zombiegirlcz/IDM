package cgd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesCounterpartAsset f23942a;

    public l(FavouritesCounterpartAsset selectedCounterpart) {
        Intrinsics.checkNotNullParameter(selectedCounterpart, "selectedCounterpart");
        this.f23942a = selectedCounterpart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f23942a, ((l) obj2).f23942a);
    }

    public final int hashCode() {
        return this.f23942a.hashCode();
    }
}
