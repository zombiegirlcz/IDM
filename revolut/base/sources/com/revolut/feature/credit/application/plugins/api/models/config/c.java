package com.revolut.feature.credit.application.plugins.api.models.config;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import hs3.s1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c {
    public static final SpinnerConfiguration.Content.SpinnerContent a(s1 s1Var) {
        Intrinsics.checkNotNullParameter(s1Var, "<this>");
        TextClause textClause = new TextClause(s1Var.f154943a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = s1Var.f154944b;
        return new SpinnerConfiguration.Content.SpinnerContent(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
    }
}
