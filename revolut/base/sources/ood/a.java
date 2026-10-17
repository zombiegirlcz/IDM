package ood;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f227028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f227029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final amd.i f227030c;
    public final boolean d;
    public final boolean e;
    public final wi0.b f;

    public a(Data data, Data globeHtml, amd.i filter, boolean z, boolean z3, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(globeHtml, "globeHtml");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f227028a = data;
        this.f227029b = globeHtml;
        this.f227030c = filter;
        this.d = z;
        this.e = z3;
        this.f = bVar;
    }

    public static a a(a aVar, Data data, Data data2, amd.i iVar, boolean z, boolean z3, wi0.b bVar, int i) {
        if ((i & 1) != 0) {
            data = aVar.f227028a;
        }
        Data data3 = data;
        if ((i & 2) != 0) {
            data2 = aVar.f227029b;
        }
        Data globeHtml = data2;
        if ((i & 4) != 0) {
            iVar = aVar.f227030c;
        }
        amd.i filter = iVar;
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z3 = aVar.e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            bVar = aVar.f;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data3, "data");
        Intrinsics.checkNotNullParameter(globeHtml, "globeHtml");
        Intrinsics.checkNotNullParameter(filter, "filter");
        return new a(data3, globeHtml, filter, z4, z6, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f227028a, aVar.f227028a) && Intrinsics.f(this.f227029b, aVar.f227029b) && this.f227030c == aVar.f227030c && this.d == aVar.d && this.e == aVar.e && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f227030c.hashCode() + kii.e.c(this.f227029b, this.f227028a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e);
        wi0.b bVar = this.f;
        return iC + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
