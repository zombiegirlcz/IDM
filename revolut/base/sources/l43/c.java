package l43;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f192050a;

    public c(Data cardPaymentsLimit) {
        Intrinsics.checkNotNullParameter(cardPaymentsLimit, "cardPaymentsLimit");
        this.f192050a = cardPaymentsLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f192050a, ((c) obj2).f192050a);
    }

    public final int hashCode() {
        return this.f192050a.hashCode();
    }
}
