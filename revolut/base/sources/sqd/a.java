package sqd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f265041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f265042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sh5.c f265043c;

    public a(Data reviewData, boolean z, sh5.c cVar) {
        Intrinsics.checkNotNullParameter(reviewData, "reviewData");
        this.f265041a = reviewData;
        this.f265042b = z;
        this.f265043c = cVar;
    }

    public static a a(a aVar, Data reviewData, boolean z, sh5.c cVar, int i) {
        if ((i & 1) != 0) {
            reviewData = aVar.f265041a;
        }
        if ((i & 2) != 0) {
            z = aVar.f265042b;
        }
        if ((i & 4) != 0) {
            cVar = aVar.f265043c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(reviewData, "reviewData");
        return new a(reviewData, z, cVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265041a, aVar.f265041a) && this.f265042b == aVar.f265042b && Intrinsics.f(this.f265043c, aVar.f265043c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f265041a.hashCode() * 31, 31, this.f265042b);
        sh5.c cVar = this.f265043c;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
