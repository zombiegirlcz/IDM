package ny4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f220656a;

    public d(Data internalData) {
        Intrinsics.checkNotNullParameter(internalData, "internalData");
        this.f220656a = internalData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f220656a, ((d) obj2).f220656a);
    }

    public final int hashCode() {
        return this.f220656a.hashCode();
    }
}
