package k7d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f182031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f182032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ig0.a f182033c;

    public b(RowDelegate.Model listItem, p paymentPayload, ig0.a troubleshooterParams) {
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        Intrinsics.checkNotNullParameter(paymentPayload, "paymentPayload");
        Intrinsics.checkNotNullParameter(troubleshooterParams, "troubleshooterParams");
        this.f182031a = listItem;
        this.f182032b = paymentPayload;
        this.f182033c = troubleshooterParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f182031a.equals(bVar.f182031a) && this.f182032b.equals(bVar.f182032b) && this.f182033c.equals(bVar.f182033c);
    }

    public final int hashCode() {
        return this.f182033c.hashCode() + ((this.f182032b.hashCode() + (this.f182031a.hashCode() * 31)) * 31);
    }
}
