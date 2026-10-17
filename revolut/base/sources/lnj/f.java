package lnj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f197270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197272c;

    public f(Data refundQuote, String str, boolean z) {
        Intrinsics.checkNotNullParameter(refundQuote, "refundQuote");
        this.f197270a = refundQuote;
        this.f197271b = str;
        this.f197272c = z;
    }

    public static f a(f fVar, Data refundQuote, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            refundQuote = fVar.f197270a;
        }
        if ((i & 2) != 0) {
            str = fVar.f197271b;
        }
        if ((i & 4) != 0) {
            z = fVar.f197272c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(refundQuote, "refundQuote");
        return new f(refundQuote, str, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f197270a, fVar.f197270a) && Intrinsics.f(this.f197271b, fVar.f197271b) && this.f197272c == fVar.f197272c;
    }

    public final int hashCode() {
        int iHashCode = this.f197270a.hashCode() * 31;
        String str = this.f197271b;
        return Boolean.hashCode(this.f197272c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
