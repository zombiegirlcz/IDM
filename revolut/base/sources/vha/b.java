package vha;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pro.accounts.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f289353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa7.p f289354b;

    public b(uw1.c apmFeatureChecker, wa7.p hiddenAccountsActionsProvider) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        this.f289353a = apmFeatureChecker;
        this.f289354b = hiddenAccountsActionsProvider;
    }

    public static ProductAccountListAction a() {
        return new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.pro_accounts_actions_activate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_switch_on, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_ID_ACTIVATE", null, null, false, false);
    }

    public static ProductAccountListAction b() {
        return new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.pro_accounts_actions_statement, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_ID_STATEMENT", null, null, false, false);
    }

    public final List c(bia.b proAccountInfo, bia.e selectedPocket, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(proAccountInfo, "proAccountInfo");
        Intrinsics.checkNotNullParameter(selectedPocket, "selectedPocket");
        io3.d dVar = selectedPocket.f15463a;
        io3.k kVar = dVar.f;
        boolean z4 = kVar == io3.k.ACTIVE;
        boolean z6 = kVar == io3.k.DELISTED;
        boolean zF = Intrinsics.f(dVar.f163147c, proAccountInfo.f15456a.f115083b.f306286a);
        ProductAccountListAction productAccountListAction = sfe.d.f262407b;
        ra7.b bVar = ra7.c.Companion;
        ProductAccountListAction productAccountListActionB = this.f289354b.b(null, z, z3);
        ProductAccountListAction productAccountListActionA = a();
        if (z4 || z6) {
            productAccountListActionA = null;
        }
        ProductAccountListAction productAccountListAction2 = sfe.d.d;
        if ((!z4 && !z6) || zF) {
            productAccountListAction2 = null;
        }
        ProductAccountListAction[] elements = {productAccountListAction, productAccountListActionB, productAccountListActionA, productAccountListAction2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList(zhm.w.t(listL, 10));
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            arrayList.add(ProductAccountListAction.a((ProductAccountListAction) it8.next(), null, false, selectedPocket, 383));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020e A[LOOP:0: B:77:0x0208->B:79:0x020e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(bia.b r39, bia.d r40) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.b.d(bia.b, bia.d):java.util.ArrayList");
    }
}
