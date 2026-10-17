package p5k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f233166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2k.c f233167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f233168c;
    public final g1i.c d;
    public final l e;

    public f(y transferBreakdownTitlesMapper, v2k.c taxesItemProvider, gte.a featureToggleInteractor, g1i.c paymentBreakdownFeesAmountProvider, l paymentsBreakdownFeesTaxesActionTextMapper) {
        Intrinsics.checkNotNullParameter(transferBreakdownTitlesMapper, "transferBreakdownTitlesMapper");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentBreakdownFeesAmountProvider, "paymentBreakdownFeesAmountProvider");
        Intrinsics.checkNotNullParameter(paymentsBreakdownFeesTaxesActionTextMapper, "paymentsBreakdownFeesTaxesActionTextMapper");
        this.f233166a = transferBreakdownTitlesMapper;
        this.f233167b = taxesItemProvider;
        this.f233168c = featureToggleInteractor;
        this.d = paymentBreakdownFeesAmountProvider;
        this.e = paymentsBreakdownFeesTaxesActionTextMapper;
    }

    public final ArrayList a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        List list = items;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            nrf.d dVar = (nrf.d) obj2;
            String strValueOf = dVar.f;
            if (strValueOf == null) {
                strValueOf = String.valueOf(i);
            }
            TextClause textClause = new TextClause(dVar.f218630a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            dj0.d totalAmount = dVar.d;
            dj0.d dVar2 = dVar.e;
            Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
            arrayList.add(new CellDetailsDelegate.Model(strValueOf, textClause, this.e.a(totalAmount, dVar2, o9.SENSITIVE, null), null, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, 0, null, new k5k.s(dVar), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    public final CellDetailsDelegate.Model b(int i, dj0.d totalAmount, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CHARGES_TOTAL_ITEM_ID", textLocalisedClause, false, this.e.a(totalAmount, dVar, o9.SENSITIVE, null), null, null, null, false, null, null, 0, 134217684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
