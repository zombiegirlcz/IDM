package n1i;

import abf.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$ExchangeKeyboardSuggestions;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import d01.g;
import g1i.d0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1i.k;
import pfm.m;
import q1i.e;
import r1i.h;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f211363b;

    public /* synthetic */ a(d dVar, int i) {
        this.f211362a = i;
        this.f211363b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Long l2;
        int[] iArr;
        int i;
        String str;
        switch (this.f211362a) {
            case 0:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                e eVar = this.f211363b.f211368j;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(draft, "draft");
                h hVar = draft.f96882g;
                wd6.e eVar2 = draft.f96881c;
                MoneyDetails moneyDetails = draft.f96879a;
                MoneyDetails moneyDetails2 = draft.f96880b;
                int[] iArr2 = q1i.d.f241449a;
                int i2 = iArr2[hVar.ordinal()];
                if (i2 == 1) {
                    l2 = moneyDetails.f96898b;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l2 = moneyDetails2.f96898b;
                }
                boolean z = (l2 != null ? l2.longValue() : 0L) == 0;
                if (((jte.d) eVar.f241451a).c(ExchangeApi$Toggles$ExchangeKeyboardSuggestions.f96818c) && z && (i = (iArr = q1i.d.f241450b)[eVar2.ordinal()]) != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = iArr2[draft.f96882g.ordinal()];
                    if (i3 == 1) {
                        return eVar.f241452b;
                    }
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = R$string.fx_orders_editor_suggestion_sell_all_format;
                    int i6 = iArr[eVar2.ordinal()];
                    if (i6 == 1) {
                        str = moneyDetails2.f96897a.f306286a;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = moneyDetails.f96897a.f306286a;
                    }
                    return u.c(new d01.b("PERCENT_SUGGESTION_100", new TextLocalisedClause(i5, u.c(str), null, 12), 100, false, null, null, 56));
                }
                return f0.f322471a;
            case 1:
                List items = (List) obj2;
                spi.a aVar = this.f211363b.i;
                Intrinsics.h(items);
                KeyboardSuggestionsDelegate keyboardSuggestionsDelegate = (KeyboardSuggestionsDelegate) aVar;
                keyboardSuggestionsDelegate.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                g gVarE0 = jh.d.f(keyboardSuggestionsDelegate.f98560h).e0();
                if (gVarE0 != null) {
                    Intrinsics.checkNotNullParameter(items, "items");
                    ((iz0.e) gVarE0).g("legacy_source_id", items);
                }
                return Unit.f186387a;
            default:
                d01.b item = (d01.b) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f110279c;
                if (!(obj3 instanceof Integer)) {
                    return m.f235744a;
                }
                d dVar = this.f211363b;
                dVar.f211369l.onNext(Unit.f186387a);
                k kVar = dVar.k;
                int iIntValue = ((Number) obj3).intValue();
                d0 d0Var = (d0) kVar;
                d0Var.getClass();
                return d0Var.R3(new n(d0Var, iIntValue, 8));
        }
    }
}
