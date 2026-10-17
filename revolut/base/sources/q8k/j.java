package q8k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f243147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f243148b;

    public j(MoneyRequest result, boolean z) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f243147a = result;
        this.f243148b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f243147a, jVar.f243147a) && this.f243148b == jVar.f243148b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243148b) + (this.f243147a.hashCode() * 31);
    }
}
