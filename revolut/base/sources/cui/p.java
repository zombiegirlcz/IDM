package cui;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f109016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109018c;

    public p(TextLocalisedClause text, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f109016a = text;
        this.f109017b = z;
        this.f109018c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f109016a.equals(pVar.f109016a) && this.f109017b == pVar.f109017b && this.f109018c == pVar.f109018c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109018c) + j6.a.c(this.f109016a.hashCode() * 31, 31, this.f109017b);
    }
}
