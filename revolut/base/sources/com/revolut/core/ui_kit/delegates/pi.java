package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f54613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.h4 f54614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54615c;

    public pi(CompositeClause compositeClause) {
        ms0.h4 style = ms0.h4.SEMIACCENT;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54613a = compositeClause;
        this.f54614b = style;
        this.f54615c = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pi)) {
            return false;
        }
        pi piVar = (pi) obj2;
        return Intrinsics.f(this.f54613a, piVar.f54613a) && this.f54614b == piVar.f54614b && this.f54615c == piVar.f54615c;
    }

    public final int hashCode() {
        CompositeClause compositeClause = this.f54613a;
        return Boolean.hashCode(this.f54615c) + ((this.f54614b.hashCode() + ((compositeClause == null ? 0 : compositeClause.hashCode()) * 31)) * 31);
    }
}
