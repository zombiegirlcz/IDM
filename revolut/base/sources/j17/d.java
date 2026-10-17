package j17;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f170129a;

    public d(Data upsellData) {
        Intrinsics.checkNotNullParameter(upsellData, "upsellData");
        this.f170129a = upsellData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f170129a, ((d) obj2).f170129a);
    }

    public final int hashCode() {
        return this.f170129a.hashCode();
    }
}
