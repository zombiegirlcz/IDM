package ru9;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 {
    public f0(b commonBubbleElementsMapper, h0 transactionBubbleTextStyleMapper) {
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(transactionBubbleTextStyleMapper, "transactionBubbleTextStyleMapper");
    }

    public final TextLocalisedClause a(a3 a3Var, int i, int i2, int i3, int i5, int i6) {
        return a3Var.k.f(dj0.d.e) ? new TextLocalisedClause(i, null, null, 14) : (k71.k.F(a3Var) && k71.k.J(a3Var)) ? b(a3Var, i5) : k71.k.F(a3Var) ? b(a3Var, i3) : k71.k.J(a3Var) ? b(a3Var, i6) : new TextLocalisedClause(i2, null, null, 14);
    }

    public final TextLocalisedClause b(a3 a3Var, int i) {
        return new TextLocalisedClause(i, zhm.u.c(b.a(a3Var.N1, h0.a(a3Var))), null, 12);
    }

    public final TextLocalisedClause c(a3 a3Var, int i, int i2) {
        dj0.d dVar = a3Var.N1;
        if (!a3Var.k.f(dj0.d.e)) {
            i = i2;
        }
        return new TextLocalisedClause(i, zhm.v.k(b.a(dVar, h0.a(a3Var)), new CurrencyClause(dVar.f115083b, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
    }
}
