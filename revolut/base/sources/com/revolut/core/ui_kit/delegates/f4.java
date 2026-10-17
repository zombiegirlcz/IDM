package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ComparisonCellHeadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f4 extends ComparisonCellHeadingDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f54142b;

    public f4(TextLocalisedClause firstText, TextLocalisedClause secondText) {
        Intrinsics.checkNotNullParameter(firstText, "firstText");
        Intrinsics.checkNotNullParameter(secondText, "secondText");
        this.f54141a = firstText;
        this.f54142b = secondText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return this.f54141a.equals(f4Var.f54141a) && this.f54142b.equals(f4Var.f54142b);
    }

    public final int hashCode() {
        return this.f54142b.hashCode() + (this.f54141a.hashCode() * 31);
    }
}
