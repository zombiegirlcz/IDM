package kug;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f189794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ltg.a f189795b;

    public g() {
        this(null, null);
    }

    public static g a(g gVar, Data data, ltg.a aVar, int i) {
        if ((i & 1) != 0) {
            data = gVar.f189794a;
        }
        gVar.getClass();
        if ((i & 4) != 0) {
            aVar = gVar.f189795b;
        }
        gVar.getClass();
        return new g(data, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f189794a, gVar.f189794a) && this.f189795b == gVar.f189795b;
    }

    public final int hashCode() {
        Data data = this.f189794a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 961;
        ltg.a aVar = this.f189795b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public g(Data data, ltg.a aVar) {
        this.f189794a = data;
        this.f189795b = aVar;
    }
}
