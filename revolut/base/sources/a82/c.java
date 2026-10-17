package a82;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f1997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1998b;

    public c(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f1997a = data;
        this.f1998b = z;
    }

    public static c a(c cVar, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            data = cVar.f1997a;
        }
        if ((i & 2) != 0) {
            z = cVar.f1998b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new c(data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f1997a, cVar.f1997a) && this.f1998b == cVar.f1998b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1998b) + (this.f1997a.hashCode() * 31);
    }
}
