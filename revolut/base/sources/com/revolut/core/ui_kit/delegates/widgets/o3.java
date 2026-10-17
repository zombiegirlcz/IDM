package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o3 implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55452b;

    public o3(TextLocalisedClause text, FreelancerWidgetClickData.VatReminder.TaxHub taxHub) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55451a = text;
        this.f55452b = taxHub;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return this.f55451a.equals(o3Var.f55451a) && Intrinsics.f(this.f55452b, o3Var.f55452b);
    }

    public final int hashCode() {
        int iHashCode = this.f55451a.hashCode() * 31;
        Object obj2 = this.f55452b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
