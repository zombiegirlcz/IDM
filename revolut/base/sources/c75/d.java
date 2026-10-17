package c75;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f21878a;

    public d(Data loans) {
        Intrinsics.checkNotNullParameter(loans, "loans");
        this.f21878a = loans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f21878a, ((d) obj2).f21878a);
    }

    public final int hashCode() {
        return this.f21878a.hashCode();
    }
}
