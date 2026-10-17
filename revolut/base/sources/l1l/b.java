package l1l;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f191575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191576b;

    public b(Data amountValidationRules, dj0.d targetMoney) {
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(amountValidationRules, "amountValidationRules");
        this.f191575a = targetMoney;
        this.f191576b = amountValidationRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f191575a, bVar.f191575a) && Intrinsics.f(this.f191576b, bVar.f191576b);
    }

    public final int hashCode() {
        return this.f191576b.hashCode() + (this.f191575a.hashCode() * 31);
    }
}
