package eyc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends com.revolut.feature.selfserve.entity.config.shared.ui.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130665a;

    public o(String faqKey) {
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        this.f130665a = faqKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f130665a, ((o) obj2).f130665a);
    }

    public final int hashCode() {
        return this.f130665a.hashCode();
    }
}
