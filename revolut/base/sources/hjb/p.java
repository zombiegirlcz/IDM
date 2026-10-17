package hjb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class p implements t {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f152692a;

    public /* synthetic */ p(int i, w wVar) {
        if (1 == (i & 1)) {
            this.f152692a = wVar;
        } else {
            j1.f(n.f152691a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f152692a, ((p) obj2).f152692a);
    }

    public final int hashCode() {
        return this.f152692a.hashCode();
    }

    public p(w primaryRateInfo) {
        Intrinsics.checkNotNullParameter(primaryRateInfo, "primaryRateInfo");
        this.f152692a = primaryRateInfo;
    }
}
