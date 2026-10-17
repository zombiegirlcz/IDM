package cd4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f23174a;

    public g(Data linkedAccounts) {
        Intrinsics.checkNotNullParameter(linkedAccounts, "linkedAccounts");
        this.f23174a = linkedAccounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f23174a, ((g) obj2).f23174a);
    }

    public final int hashCode() {
        return this.f23174a.hashCode();
    }

    public g() {
        this(new Data(null, null, false, 7, null));
    }
}
