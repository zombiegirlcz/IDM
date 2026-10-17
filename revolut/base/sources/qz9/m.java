package qz9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f250433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f250434b;

    public m(List transactionScope, i7 filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        this.f250433a = filter;
        this.f250434b = transactionScope;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f250433a, mVar.f250433a) && Intrinsics.f(this.f250434b, mVar.f250434b);
    }

    public final int hashCode() {
        return this.f250434b.hashCode() + (this.f250433a.hashCode() * 31);
    }
}
