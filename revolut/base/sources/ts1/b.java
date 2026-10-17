package ts1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f273920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273921b;

    public b(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f273920a = data;
        this.f273921b = z;
    }

    public static b a(b bVar, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            data = bVar.f273920a;
        }
        if ((i & 2) != 0) {
            z = bVar.f273921b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new b(data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f273920a, bVar.f273920a) && this.f273921b == bVar.f273921b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273921b) + (this.f273920a.hashCode() * 31);
    }
}
