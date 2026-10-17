package com.revolut.feature.security_hub.impl.repository;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final Clause a(LimitValue limitValue) {
        Intrinsics.checkNotNullParameter(limitValue, "<this>");
        if (limitValue instanceof LimitValue.Amount) {
            return rwc.b.a(((LimitValue.Amount) limitValue).f85473c);
        }
        if (limitValue instanceof LimitValue.Counter) {
            return new TextClause(String.valueOf(limitValue.f85471a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }
}
