package n6a;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments_migration.impl.R$string;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionContract$InputData;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentSelectionContract$InputData f212753a;

    public i(PaymentSelectionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f212753a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Pair pair = this.f212753a.f80283a ? new Pair(Integer.valueOf(R$string.payments_migration_payment_selection_select_how_title), Integer.valueOf(R$string.payments_migration_payment_selection_select_how_description)) : new Pair(Integer.valueOf(R$string.payments_migration_payment_selection_how_you_pay_title), Integer.valueOf(R$string.payments_migration_payment_selection_how_you_pay_description));
        lw0.a aVar = new lw0.a(new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, null, 14), null, null, false, 28);
        boolean z = false;
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_migration_payment_selection_pay_by_card_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_migration_payment_selection_pay_by_card_description, null, null, 14);
        yy0.i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        boolean z3 = false;
        List listK = v.k(new RowDelegate.Model("LIST_ITEM_PAY_BY_CARD", image24, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), new RowDelegate.Model("LIST_ITEM_PAY_BY_DIRECT_DEBIT", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_switch_to_revolut, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), z3, z3, 6), new TextLocalisedClause(R$string.payments_migration_payment_selection_pay_by_direct_debit_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.payments_migration_payment_selection_pay_by_direct_debit_description, null, null, 14), null, null, 0, new tf(yy0.i.a(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.payments_migration_payment_selection_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listK, aVar);
    }
}
