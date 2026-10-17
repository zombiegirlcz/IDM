package zy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardType f326391a;

    public c(SendFromClipboardType item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f326391a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f326391a, ((c) obj2).f326391a);
    }

    public final int hashCode() {
        return this.f326391a.hashCode();
    }
}
