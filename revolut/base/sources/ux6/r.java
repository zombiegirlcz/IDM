package ux6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import uwi.v;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.n f283890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl3.f f283891b;

    public r(m3j.n beneficiaryItemViewMapper, dl3.f contactsMapper, jw6.d customerMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(contactsMapper, "contactsMapper");
        Intrinsics.checkNotNullParameter(customerMapper, "customerMapper");
        this.f283890a = beneficiaryItemViewMapper;
        this.f283891b = contactsMapper;
    }

    public static RowDelegate.Model b() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_invoice_who_to_bill_contact_permissions_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        int i = R$drawable.uikit_icn_24_profile;
        RowDelegate.Model model = new RowDelegate.Model("ID_PERMISSIONS_ITEM", LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(16.0f), null, 32), null, null, textLocalisedClause, null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final RowDelegate.Model a(gw6.d dVar) {
        String str;
        if (dVar instanceof gw6.a) {
            return this.f283890a.c(((gw6.a) dVar).f147278a, true);
        }
        if (dVar instanceof gw6.b) {
            return ((xl3.d) this.f283891b).m(((gw6.b) dVar).f147279a);
        }
        if (!(dVar instanceof gw6.c)) {
            throw new NoWhenBranchMatchedException();
        }
        FreelancerCustomer customer = ((gw6.c) dVar).f147280a;
        Intrinsics.checkNotNullParameter(customer, "customer");
        String strQ = j6.a.q("ITEM_ID_CUSTOMER_PREFIX_", customer.f73281a);
        String str2 = customer.f73282b;
        if (str2 == null) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = str2;
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str3 = customer.f73283c;
        RowDelegate.Model model = new RowDelegate.Model(strQ, str2 != null ? new UserAvatarImage(new UserNamePlaceholder.Default(str2, 0), null, null, 6) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorGrey50), R$attr.uikit_colorBackground, 12.0f, Float.valueOf(16.0f), null, 32), null, null, textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, true, false, null, null, null, null, null, customer, null, 0, 0, 0, 0, 1056960364);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new l((List) iii.c.f(domainState.f283880a, new v(11), new utk.b(17), new tvh.e(domainState, this, 16)), domainState.f283882c);
    }
}
