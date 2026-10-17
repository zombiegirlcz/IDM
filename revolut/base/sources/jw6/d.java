package jw6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import jr6.i;
import jr6.j;
import jr6.k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f178942a = new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);

    public static final class a {
        private a() {
        }
    }

    public final CellDetailsDelegate.Model a(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new CellDetailsDelegate.Model("ITEM_ID_CUSTOMER_EMAIL", new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_email, null, null, 14), new TextClause(email, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, null, false, 0, null, new i(email), null, null, 1, this.f178942a, false, null, 0, 0, 0, 0, 1035752);
    }

    public final CellDetailsDelegate.Model b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CellDetailsDelegate.Model("ITEM_ID_CUSTOMER_NAME", new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_name, null, null, 14), new TextClause(name, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, null, false, 0, null, new j(name), null, null, 1, this.f178942a, false, null, 0, 0, 0, 0, 1035752);
    }

    public final CellDetailsDelegate.Model c(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new CellDetailsDelegate.Model("ITEM_ID_CUSTOMER_PHONE", new TextLocalisedClause(R$string.freelancer_sale_acquiring_payment_details_phone, null, null, 14), new TextClause(phone, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, null, false, 0, null, new k(phone), null, null, 1, this.f178942a, false, null, 0, 0, 0, 0, 1035752);
    }
}
