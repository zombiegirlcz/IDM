package i09;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f157323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f157324b;

    public g(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f157323a = z;
        this.f157324b = data;
    }

    public static g a(g gVar, boolean z, Data data, int i) {
        if ((i & 1) != 0) {
            z = gVar.f157323a;
        }
        if ((i & 2) != 0) {
            data = gVar.f157324b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new g(data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f157323a == gVar.f157323a && Intrinsics.f(this.f157324b, gVar.f157324b);
    }

    public final int hashCode() {
        return this.f157324b.hashCode() + (Boolean.hashCode(this.f157323a) * 31);
    }
}
