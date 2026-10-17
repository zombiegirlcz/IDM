package yed;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f312870a;

    public m(Data domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        this.f312870a = domainState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f312870a, ((m) obj2).f312870a);
    }

    public final int hashCode() {
        return this.f312870a.hashCode();
    }
}
