package fse;

import cli.j;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDSTransaction f137666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137667b;

    public c(ThreeDSTransaction transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f137666a = transaction;
        this.f137667b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f137666a, cVar.f137666a) && this.f137667b == cVar.f137667b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137667b) + (this.f137666a.hashCode() * 31);
    }
}
