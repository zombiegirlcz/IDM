package ny3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f220652b;

    public n(String text, l0 info) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f220651a = text;
        this.f220652b = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f220651a, nVar.f220651a) && Intrinsics.f(this.f220652b, nVar.f220652b);
    }

    public final int hashCode() {
        return this.f220652b.hashCode() + (this.f220651a.hashCode() * 31);
    }
}
