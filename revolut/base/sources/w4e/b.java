package w4e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f294553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f294554b;

    public b() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f294553a, bVar.f294553a) && Intrinsics.f(this.f294554b, bVar.f294554b);
    }

    public final int hashCode() {
        Data data = this.f294553a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f294554b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }

    public b(Data data, Data data2) {
        this.f294553a = data;
        this.f294554b = data2;
    }
}
