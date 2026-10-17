package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f55506b;

    public s3(TextLocalisedClause text, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55505a = text;
        this.f55506b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj2;
        return this.f55505a.equals(s3Var.f55505a) && this.f55506b.equals(s3Var.f55506b);
    }

    public final int hashCode() {
        return this.f55506b.hashCode() + (this.f55505a.hashCode() * 31);
    }
}
