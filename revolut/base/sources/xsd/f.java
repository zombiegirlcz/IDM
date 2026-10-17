package xsd;

import amd.k;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f308451a;

    public f(TextLocalisedClause promoDescription) {
        Intrinsics.checkNotNullParameter(promoDescription, "promoDescription");
        this.f308451a = promoDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f308451a.equals(((f) obj2).f308451a);
    }

    public final int hashCode() {
        return this.f308451a.hashCode();
    }
}
