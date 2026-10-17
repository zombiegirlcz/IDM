package e5k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f122828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f122829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq2.f f122830c;
    public final long d;

    public c(Data availableTypes, Data corridorProperties, kq2.f fVar, long j2) {
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        Intrinsics.checkNotNullParameter(corridorProperties, "corridorProperties");
        this.f122828a = availableTypes;
        this.f122829b = corridorProperties;
        this.f122830c = fVar;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f122828a, cVar.f122828a) && Intrinsics.f(this.f122829b, cVar.f122829b) && Intrinsics.f(this.f122830c, cVar.f122830c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f122829b, this.f122828a.hashCode() * 31, 31);
        kq2.f fVar = this.f122830c;
        return Long.hashCode(this.d) + ((iC + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }
}
