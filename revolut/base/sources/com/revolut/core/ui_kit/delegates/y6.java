package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y6 implements z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f55624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55625c;

    public y6(TextLocalisedClause text, String str, List icons) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55623a = icons;
        this.f55624b = text;
        this.f55625c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj2;
        return Intrinsics.f(this.f55623a, y6Var.f55623a) && this.f55624b.equals(y6Var.f55624b) && Intrinsics.f(this.f55625c, y6Var.f55625c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f55623a.hashCode() * 31, 31, this.f55624b);
        String str = this.f55625c;
        return iA + (str == null ? 0 : str.hashCode());
    }
}
