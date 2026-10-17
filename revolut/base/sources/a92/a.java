package a92;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f2296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2297b;

    public a(Data codes, long j2) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        this.f2296a = codes;
        this.f2297b = j2;
    }

    public static a a(a aVar, Data codes, long j2, int i) {
        if ((i & 1) != 0) {
            codes = aVar.f2296a;
        }
        if ((i & 2) != 0) {
            j2 = aVar.f2297b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(codes, "codes");
        return new a(codes, j2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f2296a, aVar.f2296a) && this.f2297b == aVar.f2297b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2297b) + (this.f2296a.hashCode() * 31);
    }
}
