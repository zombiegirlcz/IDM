package ipe;

import com.revolut.feature.tax_residency.impl.v2.models.Popup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Popup f167741a;

    public c(Popup popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f167741a = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f167741a, ((c) obj2).f167741a);
    }

    public final int hashCode() {
        return this.f167741a.hashCode();
    }
}
