package com.revolut.core.ui_kit.models;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f58146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f58147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f58148c;
    public final Clause d;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(Clause title, Clause clause, Clause clause2, int i) {
        clause2 = (i & 8) != 0 ? null : clause2;
        Intrinsics.checkNotNullParameter(title, "title");
        this(null, new u(title), clause, clause2, 16);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f58146a, qVar.f58146a) && Intrinsics.f(this.f58147b, qVar.f58147b) && Intrinsics.f(this.f58148c, qVar.f58148c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f58146a;
        int iHashCode = (this.f58147b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31)) * 31;
        Clause clause2 = this.f58148c;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return (iHashCode2 + (clause3 != null ? clause3.hashCode() : 0)) * 31;
    }

    public q(Clause clause, w title, Clause clause2, Clause clause3, int i) {
        clause = (i & 1) != 0 ? null : clause;
        clause3 = (i & 8) != 0 ? null : clause3;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f58146a = clause;
        this.f58147b = title;
        this.f58148c = clause2;
        this.d = clause3;
    }
}
