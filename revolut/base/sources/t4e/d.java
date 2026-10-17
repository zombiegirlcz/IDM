package t4e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f267976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f267977b;

    public d() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f267976a, dVar.f267976a) && Intrinsics.f(this.f267977b, dVar.f267977b);
    }

    public final int hashCode() {
        Data data = this.f267976a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f267977b;
        return iHashCode + (data2 != null ? data2.hashCode() : 0);
    }

    public d(Data data, Data data2) {
        this.f267976a = data;
        this.f267977b = data2;
    }
}
