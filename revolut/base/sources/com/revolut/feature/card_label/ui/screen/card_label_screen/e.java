package com.revolut.feature.card_label.ui.screen.card_label_screen;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_label.api.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import soc.f;
import vh2.o;
import vv7.l;
import vw4.j;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardLabelScreenContract$InputData f64772a;

    public e(CardLabelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f64772a = inputData;
    }

    @Override // jki.p
    public final m a(i iVar) {
        vy2.c domainState = (vy2.c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = domainState.f293121b.length() > this.f64772a.f64761b ? new TextLocalisedClause(R$string.label_card_input_helper_max_limit, null, null, 14) : null;
        Data data = domainState.f293120a;
        return new vy2.e((List) iii.c.f(data, new j(14), new l(11), new f(domainState, 11, this, textLocalisedClause)), ((Boolean) iii.c.f(data, new j(15), new l(12), new o(domainState.f293121b, this, 9))).booleanValue());
    }
}
