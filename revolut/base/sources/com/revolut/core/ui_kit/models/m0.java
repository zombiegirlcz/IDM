package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit.models.RateClause;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 extends k0 {
    public final RateClause.Format.Default d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(RateClause.Format.Default format) {
        super(0);
        Intrinsics.checkNotNullParameter(format, "format");
        this.d = format;
    }

    @Override // com.revolut.core.ui_kit.models.k0
    public final Function1 a() {
        return new auj.o(this, 9);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.d, ((m0) obj2).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
