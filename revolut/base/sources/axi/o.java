package axi;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f10960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10962c;

    public o(TextLocalisedClause text, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f10960a = text;
        this.f10961b = z;
        this.f10962c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f10960a.equals(oVar.f10960a) && this.f10961b == oVar.f10961b && this.f10962c == oVar.f10962c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10962c) + j6.a.c(this.f10960a.hashCode() * 31, 31, this.f10961b);
    }
}
