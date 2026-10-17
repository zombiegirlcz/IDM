package jdj;

import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.MoneyClause;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final MoneyClause a(d money, boolean z) {
        Intrinsics.checkNotNullParameter(money, "money");
        int iC = money.f115083b.c();
        if (z && money.f115082a >= 100000 * ((float) Math.pow(10.0f, iC))) {
            iC = 0;
        }
        return new MoneyClause(money, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(iC, 2), false, false, 13), null, o9.NON_SENSITIVE, 4);
    }
}
