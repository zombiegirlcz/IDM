package ekc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f126984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f126985b;

    public e(Data data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f126984a = data;
        this.f126985b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f126984a, eVar.f126984a) && this.f126985b == eVar.f126985b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f126985b) + (this.f126984a.hashCode() * 31);
    }
}
