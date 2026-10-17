package com.revolut.feature.crypto.exchange.fees.impl.ui;

import cli.j;
import cli.n;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.exchange.fees.api.R$string;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFees;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yik.h;
import ymk.y;
import zc0.z;
import zf5.g;
import zf5.i;
import zf5.o;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f70848a;

    public d(h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f70848a = pricingPlanStringMapper;
    }

    @Override // cli.n
    public final cli.o c(j jVar) {
        List list;
        Object next;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        sh5.c cVar;
        CryptoExchangeFees cryptoExchangeFees;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.crypto_exchange_fees_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.crypto_exchange_fees_description, u.c(new TextLocalisedClause(R$string.crypto_exchange_fees_description_learn_more, null, new Click(28, (Integer) null, (Object) CryptoExchangeFeesControllerContract$Parcel$LearnMore.f70840a, "DESCRIPTION_CLICK_ID", false), 10)), null, 12);
        Data data = domainState.f321865a;
        CryptoExchangeFeesMode cryptoExchangeFeesMode = domainState.e;
        if (data == null || (list = (List) iii.c.f(data, new z(16), new z8d.h(12), new y(this, 11))) == null) {
            list = f0.f322471a;
        }
        boolean z = cryptoExchangeFeesMode instanceof CryptoExchangeFeesMode.TradeMore;
        Iterator it8 = domainState.f321866b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((CryptoExchangeFeesControllerContract$PagerItem) next).getF94249a(), domainState.f321867c)) {
                break;
            }
        }
        CryptoExchangeFeesControllerContract$PagerItem cryptoExchangeFeesControllerContract$PagerItem = (CryptoExchangeFeesControllerContract$PagerItem) next;
        CryptoExchangeFeesControllerContract$PagerItem.Details details = cryptoExchangeFeesControllerContract$PagerItem instanceof CryptoExchangeFeesControllerContract$PagerItem.Details ? (CryptoExchangeFeesControllerContract$PagerItem.Details) cryptoExchangeFeesControllerContract$PagerItem : null;
        Boolean boolValueOf = (details == null || (cryptoExchangeFees = details.f70837a) == null) ? null : Boolean.valueOf(cryptoExchangeFees.f70810b);
        if (z) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_exchange_fees_trade_more_button, null, null, 14);
        } else {
            if (boolValueOf == null || !boolValueOf.equals(Boolean.FALSE)) {
                textLocalisedClause = null;
                String str = domainState.f321867c;
                if (!z && (cVar = domainState.d) != null) {
                    clause = cVar.f263435a;
                }
                return new i(textLocalisedClause3, textLocalisedClause4, list, z, str, textLocalisedClause, clause);
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_exchange_fees_next_button, null, null, 14);
        }
        textLocalisedClause = textLocalisedClause2;
        String str2 = domainState.f321867c;
        if (!z) {
            clause = cVar.f263435a;
        }
        return new i(textLocalisedClause3, textLocalisedClause4, list, z, str2, textLocalisedClause, clause);
    }
}
