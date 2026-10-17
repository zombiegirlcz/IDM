package i42;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f158268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f158269b;

    public d(Data content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f158268a = content;
        this.f158269b = z;
    }

    public static d a(d dVar, Data content, boolean z, int i) {
        if ((i & 1) != 0) {
            content = dVar.f158268a;
        }
        if ((i & 2) != 0) {
            z = dVar.f158269b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return new d(content, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f158268a, dVar.f158268a) && this.f158269b == dVar.f158269b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158269b) + (this.f158268a.hashCode() * 31);
    }
}
