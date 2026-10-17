package gq4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.cancellation.CreditCardCancellationDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardCancellationDetails f145550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f145552c;

    public i(CreditCardCancellationDetails details, String operationId, Data content) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f145550a = details;
        this.f145551b = operationId;
        this.f145552c = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f145550a, iVar.f145550a) && Intrinsics.f(this.f145551b, iVar.f145551b) && Intrinsics.f(this.f145552c, iVar.f145552c);
    }

    public final int hashCode() {
        return this.f145552c.hashCode() + p.a.c(this.f145550a.hashCode() * 31, 31, this.f145551b);
    }
}
