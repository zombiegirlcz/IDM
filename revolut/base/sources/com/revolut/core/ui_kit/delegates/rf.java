package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rf extends RowDelegate.Model.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f54678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f54679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54680c;
    public final boolean d;
    public final boolean e;
    public final Clause f;

    public rf(Long l2, TextClause textClause, MoneyClause moneyClause, boolean z, boolean z3, TextClause textClause2, int i) {
        moneyClause = (i & 4) != 0 ? null : moneyClause;
        z = (i & 8) != 0 ? false : z;
        z3 = (i & 16) != 0 ? true : z3;
        textClause2 = (i & 32) != 0 ? null : textClause2;
        this.f54678a = l2;
        this.f54679b = textClause;
        this.f54680c = moneyClause;
        this.d = z;
        this.e = z3;
        this.f = textClause2;
    }

    public final boolean a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    public final Clause c() {
        return this.f;
    }

    public final Clause d() {
        return this.f54680c;
    }

    public final Clause e() {
        return this.f54679b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj2;
        return Intrinsics.f(this.f54678a, rfVar.f54678a) && Intrinsics.f(this.f54679b, rfVar.f54679b) && Intrinsics.f(this.f54680c, rfVar.f54680c) && this.d == rfVar.d && this.e == rfVar.e && Intrinsics.f(this.f, rfVar.f);
    }

    public final Long f() {
        return this.f54678a;
    }

    public final int hashCode() {
        Long l2 = this.f54678a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Clause clause = this.f54679b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f54680c;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.d), 31, this.e);
        Clause clause3 = this.f;
        return iC + (clause3 != null ? clause3.hashCode() : 0);
    }
}
