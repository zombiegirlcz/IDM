package mrc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f208099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f208100b;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data status, Data currency, int i) {
        if ((i & 1) != 0) {
            status = aVar.f208099a;
        }
        if ((i & 2) != 0) {
            currency = aVar.f208100b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new a(status, currency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f208099a, aVar.f208099a) && Intrinsics.f(this.f208100b, aVar.f208100b);
    }

    public final int hashCode() {
        return this.f208100b.hashCode() + (this.f208099a.hashCode() * 31);
    }

    public a(Data status, Data currency) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f208099a = status;
        this.f208100b = currency;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
