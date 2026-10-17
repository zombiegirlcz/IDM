package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f54406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f54407c;
    public final int d;
    public final int e;
    public final int f;

    public l(TextLocalisedClause title, float f, float f4, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f54405a = title;
        this.f54406b = f;
        this.f54407c = f4;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f54405a.equals(lVar.f54405a) && Float.compare(this.f54406b, lVar.f54406b) == 0 && Float.compare(this.f54407c, lVar.f54407c) == 0 && this.d == lVar.d && this.e == lVar.e && this.f == lVar.f;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, m72.b.b(this.f54407c, m72.b.b(this.f54406b, this.f54405a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}
