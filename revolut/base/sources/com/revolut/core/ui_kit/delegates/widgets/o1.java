package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f55447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f55448c;

    public o1(TextLocalisedClause text, n1 n1Var, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55446a = text;
        this.f55447b = n1Var;
        this.f55448c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return this.f55446a.equals(o1Var.f55446a) && this.f55447b == o1Var.f55447b && this.f55448c.equals(o1Var.f55448c);
    }

    public final int hashCode() {
        int iHashCode = this.f55446a.hashCode() * 31;
        n1 n1Var = this.f55447b;
        return this.f55448c.hashCode() + ((iHashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31);
    }
}
