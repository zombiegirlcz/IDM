package ny3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f220647b;

    public l(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220646a = str;
        this.f220647b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f220646a, lVar.f220646a) && this.f220647b.equals(lVar.f220647b);
    }

    public final int hashCode() {
        String str = this.f220646a;
        return this.f220647b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
