package u6b;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u4i.u;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w6b.b f277540a;

    public m(w6b.e itemsMapper, w6b.f headerStateMapper, w6b.b buttonStateMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(headerStateMapper, "headerStateMapper");
        Intrinsics.checkNotNullParameter(buttonStateMapper, "buttonStateMapper");
        this.f277540a = buttonStateMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClauseA = w6b.f.a(domainState.f277529c, R$string.cobrand_account_form_link_header_title);
        Data linkAccountInfoData = domainState.f277529c;
        Intrinsics.checkNotNullParameter(linkAccountInfoData, "linkAccountInfoData");
        return new j(textLocalisedClauseA, (x6b.h) iii.c.f(linkAccountInfoData, new w29.a(29), new w6b.a(1), new w2a.o(7)), this.f277540a.a(linkAccountInfoData, domainState.f277527a), (List) iii.c.f(linkAccountInfoData, new u4e.i(this, 15), new u(4), new tch.c(this, domainState, 23)));
    }
}
