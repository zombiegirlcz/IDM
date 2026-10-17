package zj9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f322770a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f322770a, ((f) obj2).f322770a);
    }

    public final int hashCode() {
        return this.f322770a.hashCode();
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null));
    }

    public f(Data paymentOptions) {
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        this.f322770a = paymentOptions;
    }
}
