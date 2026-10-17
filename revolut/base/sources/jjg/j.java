package jjg;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pjg.g f174951a;

    public j(pjg.g itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f174951a = itemsMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TrustedMerchant.Approved approved = domainState.f174942a;
        pjg.g gVar = this.f174951a;
        return new c(new TextClause(approved.f94406c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.trusted_merchants_trusted_retailer, null, null, 14), gVar.c(approved), gVar.a(approved), gVar.b());
    }
}
