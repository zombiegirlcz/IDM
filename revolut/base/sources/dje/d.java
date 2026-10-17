package dje;

import com.revolut.feature.tab.crypto.models.TabCryptoModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TabCryptoModalStep f115326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModalDestination.Style f115327c;

    public d(TabCryptoModalStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f115326b = step;
        this.f115327c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f115326b, dVar.f115326b) && Intrinsics.f(this.f115327c, dVar.f115327c);
    }

    public final int hashCode() {
        return this.f115327c.hashCode() + (this.f115326b.hashCode() * 31);
    }
}
