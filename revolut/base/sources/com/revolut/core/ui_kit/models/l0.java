package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends k0 {
    public final MoneyClause.Format.Defaults d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(MoneyClause.Format.Defaults format) {
        super(0);
        Intrinsics.checkNotNullParameter(format, "format");
        this.d = format;
    }

    @Override // com.revolut.core.ui_kit.models.k0
    public final Function1 a() {
        return new auj.o(this, 8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.d, ((l0) obj2).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
