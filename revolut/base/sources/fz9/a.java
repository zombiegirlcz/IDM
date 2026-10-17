package fz9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardType f139135a;

    public a(SendFromClipboardType item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f139135a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f139135a, ((a) obj2).f139135a);
    }

    public final int hashCode() {
        return this.f139135a.hashCode();
    }
}
