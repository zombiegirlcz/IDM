package i6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f159038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmRecipient f159039b;

    public a(MoneyRequest moneyRequest, ApmRecipient apmRecipient) {
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        Intrinsics.checkNotNullParameter(apmRecipient, "apmRecipient");
        this.f159038a = moneyRequest;
        this.f159039b = apmRecipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f159038a, aVar.f159038a) && Intrinsics.f(this.f159039b, aVar.f159039b);
    }

    public final int hashCode() {
        return this.f159039b.hashCode() + (this.f159038a.hashCode() * 31);
    }
}
