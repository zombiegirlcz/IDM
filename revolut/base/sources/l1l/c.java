package l1l;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f191577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f191578b;

    public c(Data amountValidationRules, dj0.d targetMoney) {
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(amountValidationRules, "amountValidationRules");
        this.f191577a = targetMoney;
        this.f191578b = amountValidationRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f191577a, cVar.f191577a) && Intrinsics.f(this.f191578b, cVar.f191578b);
    }

    public final int hashCode() {
        return this.f191578b.hashCode() + (this.f191577a.hashCode() * 31);
    }
}
