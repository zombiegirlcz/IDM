package ax4;

import dx4.o5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5 f10893b;

    public n(String parameterKey, o5 selectedVariant) {
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(selectedVariant, "selectedVariant");
        this.f10892a = parameterKey;
        this.f10893b = selectedVariant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f10892a, nVar.f10892a) && Intrinsics.f(this.f10893b, nVar.f10893b);
    }

    public final int hashCode() {
        return this.f10893b.hashCode() + (this.f10892a.hashCode() * 31);
    }
}
