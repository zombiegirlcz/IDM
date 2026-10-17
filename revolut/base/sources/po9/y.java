package po9;

import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentWidget f237943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResolvedRecipient f237944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f237945c;

    public y(PaymentWidget widget, ResolvedRecipient recipient, boolean z) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f237943a = widget;
        this.f237944b = recipient;
        this.f237945c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f237943a, yVar.f237943a) && Intrinsics.f(this.f237944b, yVar.f237944b) && this.f237945c == yVar.f237945c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237945c) + ((this.f237944b.hashCode() + (this.f237943a.hashCode() * 31)) * 31);
    }
}
