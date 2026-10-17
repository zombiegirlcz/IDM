package ctk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f108691b;

    public l(Data data, String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f108690a = ref2;
        this.f108691b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f108690a, lVar.f108690a) && Intrinsics.f(this.f108691b, lVar.f108691b);
    }

    public final int hashCode() {
        int iHashCode = this.f108690a.hashCode() * 31;
        Data data = this.f108691b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
