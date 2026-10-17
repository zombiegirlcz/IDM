package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f58118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f58119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f58120c;
    public final ResourceImage d;
    public final TextClause e;

    public p(CompositeClause compositeClause, TextClause textClause, TextLocalisedClause subtitle, ResourceImage resourceImage, TextClause textClause2, int i) {
        compositeClause = (i & 1) != 0 ? null : compositeClause;
        textClause = (i & 2) != 0 ? null : textClause;
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f58118a = compositeClause;
        this.f58119b = textClause;
        this.f58120c = subtitle;
        this.d = resourceImage;
        this.e = textClause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f58118a, pVar.f58118a) && Intrinsics.f(this.f58119b, pVar.f58119b) && this.f58120c.equals(pVar.f58120c) && this.d.equals(pVar.d) && this.e.equals(pVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f58118a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f58119b;
        return this.e.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.d, t61.a.a((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f58120c), 31);
    }
}
