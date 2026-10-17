package ar4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.description.CreditCardDescriptionScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.e1;
import java.util.ArrayList;
import java.util.Iterator;
import jki.i;
import jki.m;
import kotlin.jvm.internal.Intrinsics;
import mx4.x;
import xq4.j;
import xq4.k;
import zhm.a0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDescriptionScreenContract$InputData.Remote f8516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f8517b;

    public a(CreditCardDescriptionScreenContract$InputData.Remote inputData, x contentListItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        this.f8516a = inputData;
        this.f8517b = contentListItemMapper;
    }

    @Override // jki.p
    public final m a(i iVar) {
        xq4.f domainState = (xq4.f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xq4.e eVar = (xq4.e) domainState;
        xq4.i iVarC = k.c(new TextLocalisedClause(R$string.credit_management_info_explainer_title, u.c(eVar.f308107a.f290529a), null, 12));
        ArrayList arrayList = eVar.f308107a.f290530b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            a0.x(this.f8517b.b((e1) it8.next(), new ax4.b(0)), arrayList2);
        }
        return new j(iVarC, arrayList2, new xq4.h(), new AnalyticsContext(zw4.a.a(this.f8516a.f69210a.getId())));
    }
}
