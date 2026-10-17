package po9;

import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentWidget f237930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResolvedRecipient f237931b;

    public r(PaymentWidget widget, ResolvedRecipient recipient) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f237930a = widget;
        this.f237931b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f237930a, rVar.f237930a) && Intrinsics.f(this.f237931b, rVar.f237931b);
    }

    public final int hashCode() {
        return this.f237931b.hashCode() + (this.f237930a.hashCode() * 31);
    }
}
