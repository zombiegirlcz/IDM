package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55300c;

    public b1(TextLocalisedClause description, long j2, long j3) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f55298a = description;
        this.f55299b = j2;
        this.f55300c = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return this.f55298a.equals(b1Var.f55298a) && this.f55299b == b1Var.f55299b && this.f55300c == b1Var.f55300c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f55300c) + a0.d.c(this.f55298a.hashCode() * 31, 31, this.f55299b);
    }
}
