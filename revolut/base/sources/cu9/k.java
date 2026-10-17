package cu9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f108926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f108927b;

    public k(a3 transaction, j action) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f108926a = transaction;
        this.f108927b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f108926a, kVar.f108926a) && this.f108927b == kVar.f108927b;
    }

    public final int hashCode() {
        return this.f108927b.hashCode() + (this.f108926a.hashCode() * 31);
    }
}
