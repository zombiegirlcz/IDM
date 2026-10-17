package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54437c;

    public la(int i, Clause title, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f54435a = id10;
        this.f54436b = i;
        this.f54437c = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof la)) {
            return false;
        }
        la laVar = (la) obj2;
        return Intrinsics.f(this.f54435a, laVar.f54435a) && this.f54436b == laVar.f54436b && Intrinsics.f(this.f54437c, laVar.f54437c);
    }

    public final int hashCode() {
        return this.f54437c.hashCode() + j6.a.b(this.f54436b, this.f54435a.hashCode() * 31, 31);
    }
}
