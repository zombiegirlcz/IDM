package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lh extends StreakStepVerticalDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.h4 f54444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54445c;
    public final String d;
    public final cuj.h e;

    public lh(TextClause textClause, String str, cuj.h hVar) {
        ms0.h4 style = ms0.h4.SEMIACCENT;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54443a = textClause;
        this.f54444b = style;
        this.f54445c = true;
        this.d = str;
        this.e = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lh)) {
            return false;
        }
        lh lhVar = (lh) obj2;
        return Intrinsics.f(this.f54443a, lhVar.f54443a) && this.f54444b == lhVar.f54444b && this.f54445c == lhVar.f54445c && Intrinsics.f(this.d, lhVar.d) && Intrinsics.f(this.e, lhVar.e);
    }

    public final int hashCode() {
        TextClause textClause = this.f54443a;
        int iC = j6.a.c((this.f54444b.hashCode() + ((textClause == null ? 0 : textClause.hashCode()) * 961)) * 31, 31, this.f54445c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        cuj.h hVar = this.e;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
