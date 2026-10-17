package sk4;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f263766a;

    public a(Data currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f263766a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f263766a, ((a) obj2).f263766a);
    }

    public final int hashCode() {
        return this.f263766a.hashCode();
    }
}
