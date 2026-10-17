package i9d;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f159632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159633b;

    public e(Data transactions, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f159632a = transactions;
        this.f159633b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f159632a, eVar.f159632a) && this.f159633b == eVar.f159633b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159633b) + (this.f159632a.hashCode() * 31);
    }
}
