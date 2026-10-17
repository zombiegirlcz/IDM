package com.revolut.core.ui_kit.models;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f58150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f58151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58152c;
    public final Clause d;

    public s(int i, Clause title, CompositeClause compositeClause, TextLocalisedClause subtitle) {
        boolean z = (i & 8) == 0;
        compositeClause = (i & 32) != 0 ? null : compositeClause;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f58150a = title;
        this.f58151b = subtitle;
        this.f58152c = z;
        this.d = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f58150a.equals(sVar.f58150a) && this.f58151b.equals(sVar.f58151b) && this.f58152c == sVar.f58152c && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a(this.f58150a.hashCode() * 31, 31, this.f58151b), 961, this.f58152c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
