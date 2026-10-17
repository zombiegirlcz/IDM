package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class eb implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PercentageClause f54106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f54107b;

    public eb(PercentageClause titleClause, CompositeClause captionClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(captionClause, "captionClause");
        this.f54106a = titleClause;
        this.f54107b = captionClause;
    }

    @Override // com.revolut.core.ui_kit.delegates.fb
    public final Clause a() {
        return this.f54106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof eb)) {
            return false;
        }
        eb ebVar = (eb) obj2;
        return this.f54106a.equals(ebVar.f54106a) && this.f54107b.equals(ebVar.f54107b);
    }

    public final int hashCode() {
        return this.f54107b.hashCode() + (this.f54106a.hashCode() * 31);
    }
}
