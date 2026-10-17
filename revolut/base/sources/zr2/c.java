package zr2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f324530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f324531b;

    public c(Data transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f324530a = transaction;
        this.f324531b = z;
    }

    public static c a(c cVar, Data transaction, boolean z, int i) {
        if ((i & 1) != 0) {
            transaction = cVar.f324530a;
        }
        if ((i & 2) != 0) {
            z = cVar.f324531b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        return new c(transaction, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f324530a, cVar.f324530a) && this.f324531b == cVar.f324531b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f324531b) + (this.f324530a.hashCode() * 31);
    }
}
