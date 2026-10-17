package dbl;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f112765a;

    public a(Data transactionData) {
        Intrinsics.checkNotNullParameter(transactionData, "transactionData");
        this.f112765a = transactionData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f112765a, ((a) obj2).f112765a);
    }

    public final int hashCode() {
        return this.f112765a.hashCode();
    }
}
