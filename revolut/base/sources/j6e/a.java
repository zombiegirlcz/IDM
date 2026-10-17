package j6e;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171738a;

    public a(String subbaccountId) {
        Intrinsics.checkNotNullParameter(subbaccountId, "subbaccountId");
        this.f171738a = subbaccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f171738a, ((a) obj2).f171738a);
    }

    public final int hashCode() {
        return this.f171738a.hashCode();
    }
}
