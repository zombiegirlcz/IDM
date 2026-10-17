package sy9;

import aii.r;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardType f266642a;

    public b(SendFromClipboardType item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f266642a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f266642a, ((b) obj2).f266642a);
    }

    public final int hashCode() {
        return this.f266642a.hashCode();
    }
}
