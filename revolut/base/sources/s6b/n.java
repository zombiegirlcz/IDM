package s6b;

import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s65.r;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6b.b f260211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r6b.a f260212b;

    public n(w6b.e itemsMapper, w6b.f headerStateMapper, w6b.b buttonStateMapper, r6b.a termsItemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(headerStateMapper, "headerStateMapper");
        Intrinsics.checkNotNullParameter(buttonStateMapper, "buttonStateMapper");
        Intrinsics.checkNotNullParameter(termsItemsMapper, "termsItemsMapper");
        this.f260211a = buttonStateMapper;
        this.f260212b = termsItemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        ParameterisedHyperText parameterisedHyperText;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClauseA = w6b.f.a(domainState.f260199c, R$string.cobrand_account_form_create_header_title);
        Data linkAccountInfoData = domainState.f260199c;
        Intrinsics.checkNotNullParameter(linkAccountInfoData, "linkAccountInfoData");
        x6b.h hVar = (x6b.h) iii.c.f(linkAccountInfoData, new w29.a(29), new w6b.a(1), new w2a.o(7));
        x6b.d dVarA = this.f260211a.a(linkAccountInfoData, domainState.f260197a);
        r5b.e eVar = (r5b.e) linkAccountInfoData.getContent();
        return new j(textLocalisedClauseA, hVar, dVarA, (eVar == null || (parameterisedHyperText = eVar.f251567g) == null) ? null : this.f260212b.a(parameterisedHyperText), (List) iii.c.f(linkAccountInfoData, new r(this, 2), new s20.c(28), new ri4.o(this, domainState, 26)));
    }
}
