package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55308b;

    public c(Clause value, TextLocalisedClause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f55307a = label;
        this.f55308b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f55307a.equals(cVar.f55307a) && this.f55308b.equals(cVar.f55308b);
    }

    public final int hashCode() {
        return p.a.b(this.f55307a.hashCode() * 31, 31, this.f55308b);
    }
}
