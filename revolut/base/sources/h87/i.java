package h87;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f149955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f149956b;

    public i(f key, Data data) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f149955a = key;
        this.f149956b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f149955a == iVar.f149955a && Intrinsics.f(this.f149956b, iVar.f149956b);
    }

    public final int hashCode() {
        int iHashCode = this.f149955a.hashCode() * 31;
        Data data = this.f149956b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
