package hl6;

import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements cli.n {

    @NotNull
    public static final x Companion = new x();

    public static CellDetailsActionDelegate.Model a() {
        return new CellDetailsActionDelegate.Model("HEADER_ID", new TextLocalisedClause(R$string.consent_applications_title, null, null, 14), 0, null, null, null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("JOINT_DATA_SHARING_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static RowDelegate.Model d(boolean z) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_arrow_exchange;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return new RowDelegate.Model("JOINT_DATA_SHARING_ITEM_ID", new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 60), new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_subtitle, zhm.u.c(new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_data_sharing_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_CLICK_ID", false), 10)), null, 12), null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    public static RowDelegate.Model e(boolean z) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_bell;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return new RowDelegate.Model("JOINT_AUTHORISATION_NOTIFICATIONS_ITEM_ID", new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2)), null, null, false, null, false, 60), new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_notifications_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_joint_account_notifications_subtitle, null, null, 14), null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    public static List f(i iVar, h hVar) {
        RowDelegate.Model modelE;
        int i = y.f153011a[iVar.ordinal()];
        if (i == 1) {
            return f0.f322471a;
        }
        if (i != 2) {
            if (i == 3) {
                return yp0.b.g(zhm.u.c(d(false)), b(), null, 0, 0, 126);
            }
            throw new NoWhenBranchMatchedException();
        }
        RowDelegate.Model modelD = d(true);
        int i2 = y.f153012b[hVar.ordinal()];
        if (i2 == 1) {
            modelE = e(true);
        } else if (i2 == 2) {
            modelE = e(false);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            modelE = null;
        }
        RowDelegate.Model[] elements = {modelD, modelE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return yp0.b.g(kotlin.collections.d.L(elements), b(), null, 0, 0, 126);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_home_connected_apps_and_services, null, null, 14), new TextLocalisedClause(R$string.open_banking_connected_apps_and_services_subtitle, null, null, 14), (List) iii.c.f(t1.u(domainState.f152990a, domainState.f152991b, domainState.f152992c), new hhd.n(22), new hkb.e(5), new gna.i(this, domainState, 28)));
    }
}
