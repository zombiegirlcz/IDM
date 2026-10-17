package cxe;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109941b;

    public e(Data checkoutContentData, boolean z) {
        Intrinsics.checkNotNullParameter(checkoutContentData, "checkoutContentData");
        this.f109940a = checkoutContentData;
        this.f109941b = z;
    }

    public static e a(e eVar, Data checkoutContentData, boolean z, int i) {
        if ((i & 1) != 0) {
            checkoutContentData = eVar.f109940a;
        }
        if ((i & 2) != 0) {
            z = eVar.f109941b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(checkoutContentData, "checkoutContentData");
        return new e(checkoutContentData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f109940a, eVar.f109940a) && this.f109941b == eVar.f109941b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109941b) + (this.f109940a.hashCode() * 31);
    }
}
