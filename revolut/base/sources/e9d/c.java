package e9d;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.help_centre.impl.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp0.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements jki.p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9d.c f123949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9d.l f123950b;

    public c(p9d.c doneButtonProvider, wde.c inboundTransferItemsProvider, p9d.l searchHintProvider, lde.o sharedTransactionsItemsProvider) {
        Intrinsics.checkNotNullParameter(doneButtonProvider, "doneButtonProvider");
        Intrinsics.checkNotNullParameter(inboundTransferItemsProvider, "inboundTransferItemsProvider");
        Intrinsics.checkNotNullParameter(searchHintProvider, "searchHintProvider");
        Intrinsics.checkNotNullParameter(sharedTransactionsItemsProvider, "sharedTransactionsItemsProvider");
        this.f123949a = doneButtonProvider;
        this.f123950b = searchHintProvider;
    }

    public static List b(j7d.a aVar) {
        int i = b.f123948a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NO_TRANSACTION_ITEM_ID", new TextLocalisedClause(R$string.help_center_section_transactions_empty_title, null, null, 14), new TextLocalisedClause(R$string.help_center_section_transactions_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D158", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("NO_TRANSFER_ITEM_ID", new TextLocalisedClause(R$string.help_center_section_transfers_empty_title, null, null, 14), new TextLocalisedClause(R$string.help_center_section_transfers_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D158", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model2);
    }

    public static ListSubheaderDelegate.Model c(j7d.a aVar) {
        int i;
        int i2 = b.f123948a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R$string.help_center_section_transactions_select_transaction;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.help_center_section_transfers_select_transfer;
        }
        return new ListSubheaderDelegate.Model("TRANSACTION_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static ArrayList d(j7d.a aVar) {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new pb0("TRANSACTIONS_LOADING_ITEM_ID"));
        }
        return yp0.b.g(arrayList, c(aVar), e0.OUTSIDE_BOX, 0, 0, 124);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        k domainState = (k) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        FaqNodeBase faqNodeBase = domainState.f123953a;
        String f51435b = faqNodeBase != null ? faqNodeBase.getF51435b() : null;
        if (f51435b == null) {
            f51435b = "";
        }
        TextClause textClause = new TextClause(f51435b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(yp0.b.i(new RowDelegate.Model("INBOUND_TRANSFER_ITEM_ID", new RowDelegate.Model.MainImage.Image56((Image) com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D301", null, null, null, 30), (CircleBadgeModel) null, false, 14), new TextLocalisedClause(com.revolut.feature.support.impl.R$string.help_center_transfers_locate_transfer_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.support.impl.R$string.help_center_transfers_locate_transfer_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new ListSubheaderDelegate.Model("TRANSFER_LOCATOR_BANNER_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_transfers_locate_transfer_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124));
        a2.a mapContent = new a2.a(domainState.f123954b, 7, this, domainState.d);
        Intrinsics.checkNotNullParameter(mapContent, "mapContent");
        eVarB.addAll((List) mapContent.invoke());
        eVarB.addAll((List) iii.c.f(domainState.f123955c, new e8e.y(11), new e6e.a(8), new dob.a(this, 14)));
        return new u(textClause, zhm.u.a(eVarB), ((p9d.d) this.f123949a).a(domainState.e), ((p9d.m) this.f123950b).a());
    }
}
