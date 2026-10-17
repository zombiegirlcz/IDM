package rtl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kel.b f257329a;

    public l(kel.b holding) {
        Intrinsics.checkNotNullParameter(holding, "holding");
        this.f257329a = holding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f257329a, ((l) obj2).f257329a);
    }

    public final int hashCode() {
        return this.f257329a.hashCode();
    }
}
