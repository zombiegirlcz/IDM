package ru9;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.payments.messaging.data.api.model.Bill;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f257465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f257466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ugc.a f257467c;

    public e(c90.c uiResources, wu9.a chatMessageReactionsMapper, m paymentBubbleFactory, ugc.a groupChatMessageTagV2Mapper, b commonBubbleElementsMapper) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(chatMessageReactionsMapper, "chatMessageReactionsMapper");
        Intrinsics.checkNotNullParameter(paymentBubbleFactory, "paymentBubbleFactory");
        Intrinsics.checkNotNullParameter(groupChatMessageTagV2Mapper, "groupChatMessageTagV2Mapper");
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        this.f257465a = uiResources;
        this.f257466b = paymentBubbleFactory;
        this.f257467c = groupChatMessageTagV2Mapper;
    }

    public static CompositeClause a(e eVar, Bill bill) {
        dj0.d dVarA = bill.f79516h.a();
        k7 k7Var = k7.NEVER;
        MoneyClause moneyClause = new MoneyClause(dVarA, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12);
        oq9.i iVar = bill.f79516h;
        dj0.d dVarD = iVar.d();
        MoneyClause moneyClause2 = dVarD != null ? new MoneyClause(dVarD, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12) : null;
        boolean z = bill.e;
        return new CompositeClause(zhm.v.k((!z || moneyClause2 == null) ? z ? new TextLocalisedClause(R$string.payments_split_bill_summary_paid, zhm.u.c(moneyClause), null, 12) : moneyClause2 != null ? new TextLocalisedClause(R$string.payments_split_bill_summary_party_paid_converted, zhm.v.k(new TextClause(oi0.d.r(iVar.h()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyClause2, moneyClause), null, 12) : new TextLocalisedClause(R$string.payments_split_bill_summary_party_paid, zhm.v.k(new TextClause(oi0.d.r(iVar.h()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyClause), null, 12) : new TextLocalisedClause(R$string.payments_split_bill_summary_paid_converted, zhm.v.k(moneyClause2, moneyClause), null, 12), new TextClause(iVar.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 8);
    }

    public final ArrayList b(oq9.i iVar, cam.f fVar) {
        List listK = iVar.k();
        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(a.a.j(((oq9.j) it8.next()).d));
        }
        if (arrayList.size() <= 4) {
            return arrayList;
        }
        String strN = a0.d.n("+", arrayList.size() - 3);
        Pair pair = kotlin.jvm.internal.s.s(fVar) ? new Pair(Integer.valueOf(R$attr.uikit_colorGrey50), Integer.valueOf(R$attr.uikit_colorGrey2)) : new Pair(Integer.valueOf(R$attr.uikit_colorWhite), Integer.valueOf(R$attr.uikit_colorGroupedBackground_20));
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        c90.c cVar = this.f257465a;
        return ue0.e.J(new TextImage(strN, kli.a.s(iIntValue, cVar.f22265a), kli.a.s(iIntValue2, cVar.f22265a), 0, 10, 24, 200), zhm.d0.V0(arrayList, 3));
    }
}
