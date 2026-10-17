package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class za implements cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f55687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f55688c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final Clause f;

    public za(TextLocalisedClause title, TextLocalisedClause subtitle, TextLocalisedClause subtitleAdditional, TextLocalisedClause description, boolean z, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(subtitleAdditional, "subtitleAdditional");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f55686a = title;
        this.f55687b = subtitle;
        this.f55688c = subtitleAdditional;
        this.d = description;
        this.e = z;
        this.f = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof za)) {
            return false;
        }
        za zaVar = (za) obj2;
        return this.f55686a.equals(zaVar.f55686a) && this.f55687b.equals(zaVar.f55687b) && this.f55688c.equals(zaVar.f55688c) && this.d.equals(zaVar.d) && this.e == zaVar.e && Intrinsics.f(this.f, zaVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a(t61.a.a(t61.a.a(this.f55686a.hashCode() * 31, 31, this.f55687b), 31, this.f55688c), 31, this.d), 31, this.e);
        Clause clause = this.f;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
