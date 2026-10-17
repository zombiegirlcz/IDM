package jq9;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmRecipient f177506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177507c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ApmRecipient recipient, b paymentItem, int i) {
        super(0);
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177506b = recipient;
        this.f177507c = paymentItem;
        this.d = i;
    }

    @Override // jq9.k
    public final String a() {
        return this.f177506b.getDisplayName();
    }

    @Override // jq9.k
    public final b c() {
        return this.f177507c;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f177506b.equals(lVar.f177506b) && this.f177507c.equals(lVar.f177507c) && this.d == lVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(this.d, (this.f177507c.hashCode() + (this.f177506b.hashCode() * 31)) * 31, 31);
    }
}
