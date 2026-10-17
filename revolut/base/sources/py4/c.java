package py4;

import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f240660a;

    public c(a accountInfo) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.f240660a = accountInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f240660a, ((c) obj2).f240660a);
    }

    public final int hashCode() {
        return this.f240660a.hashCode();
    }
}
