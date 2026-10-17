package vmh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f290585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f290586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f290587c;

    public g() {
        this(null, 7);
    }

    public static g a(g gVar, Data data, f fVar, boolean z, int i) {
        if ((i & 1) != 0) {
            data = gVar.f290585a;
        }
        if ((i & 2) != 0) {
            fVar = gVar.f290586b;
        }
        if ((i & 4) != 0) {
            z = gVar.f290587c;
        }
        gVar.getClass();
        return new g(data, fVar, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f290585a, gVar.f290585a) && this.f290586b == gVar.f290586b && this.f290587c == gVar.f290587c;
    }

    public final int hashCode() {
        Data data = this.f290585a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        f fVar = this.f290586b;
        return Boolean.hashCode(this.f290587c) + ((iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }

    public g(Data data, f fVar, boolean z) {
        this.f290585a = data;
        this.f290586b = fVar;
        this.f290587c = z;
    }

    public /* synthetic */ g(f fVar, int i) {
        this(null, (i & 2) != 0 ? null : fVar, false);
    }
}
