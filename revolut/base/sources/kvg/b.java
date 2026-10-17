package kvg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f190113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190114b;

    public b(Data data, String str) {
        this.f190113a = data;
        this.f190114b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f190113a, bVar.f190113a) && Intrinsics.f(this.f190114b, bVar.f190114b);
    }

    public final int hashCode() {
        Data data = this.f190113a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        String str = this.f190114b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
