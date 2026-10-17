package x82;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f303259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.p f303260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f303261c;

    public b(Data code, whf.p pVar, long j2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f303259a = code;
        this.f303260b = pVar;
        this.f303261c = j2;
    }

    public static b a(b bVar, Data code, whf.p pVar, long j2, int i) {
        if ((i & 1) != 0) {
            code = bVar.f303259a;
        }
        if ((i & 2) != 0) {
            pVar = bVar.f303260b;
        }
        if ((i & 4) != 0) {
            j2 = bVar.f303261c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        return new b(code, pVar, j2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f303259a, bVar.f303259a) && Intrinsics.f(this.f303260b, bVar.f303260b) && this.f303261c == bVar.f303261c;
    }

    public final int hashCode() {
        int iHashCode = this.f303259a.hashCode() * 31;
        whf.p pVar = this.f303260b;
        return Long.hashCode(this.f303261c) + ((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31);
    }
}
