package az6;

import a0.d;
import aim.e;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import ehe.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final had.b f11394a;

    public c(had.b languageClauseFactory, had.c languageImageFactory) {
        Intrinsics.checkNotNullParameter(languageClauseFactory, "languageClauseFactory");
        Intrinsics.checkNotNullParameter(languageImageFactory, "languageImageFactory");
        this.f11394a = languageClauseFactory;
    }

    public static e a(List customFields, boolean z) {
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model("LIST_ID_CUSTOM_FIELDS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_sale_invoice_template_setup_custom_fields_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : customFields) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            InvoiceTemplate.CustomField customField = (InvoiceTemplate.CustomField) obj2;
            e eVarB2 = u.b();
            eVarB2.add(new CellDetailsNoteDelegate.Model("LIST_ID_CUSTOM_FIELDS_FIELD_HEADER", new TextLocalisedClause(R$string.freelancer_sale_invoice_template_setup_custom_fields_field_title, u.c(Integer.valueOf(i2)), null, 12), null, null, null, false, null, new TextLocalisedClause(R$string.freelancer_sale_invoice_template_setup_custom_fields_field_action_remove, null, null, 14), null, new b(i), null, 0, 128756));
            String str = "LIST_ID_CUSTOM_FIELDS_FIELD_NAME_LIST_ID_CUSTOM_FIELDS_FIELD_VALUE_" + i;
            InputDualTextView.b.a aVar = new InputDualTextView.b.a(0);
            InputTextDelegate.Model model = new InputTextDelegate.Model(d.n("LIST_ID_CUSTOM_FIELDS_FIELD_NAME_", i), new TextClause(customField.f86403a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.freelancer_sale_invoice_template_setup_custom_fields_field_name, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, z && d0.W(customField.f86403a), false, false, false, null, 0, null, null, false, false, null, null, true, n.w(45), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610743816, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            InputTextDelegate.Model model2 = new InputTextDelegate.Model(d.n("LIST_ID_CUSTOM_FIELDS_FIELD_VALUE_", i), new TextClause(customField.f86404b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.freelancer_sale_invoice_template_setup_custom_fields_field_value, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, z && d0.W(customField.f86404b), false, false, false, null, 0, null, null, false, false, null, null, true, n.w(100), false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -1610743816, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(new InputDualTextDelegate.Model(str, model, model2, aVar, 40));
            a0.x(u.a(eVarB2), arrayList);
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        a0.x(arrayList, eVarB);
        if (customFields.size() < 4) {
            SmallActionButtonDelegate.Model model3 = new SmallActionButtonDelegate.Model("LIST_ID_CUSTOM_FIELDS_ADD_FIELD", h4.SEMIACCENT, new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.freelancer_sale_invoice_template_setup_add_field_action, null, null, 14));
            yp0.b.r(model3, 0, 0, 0, 0, 15);
            eVarB.add(model3);
        }
        return u.a(eVarB);
    }
}
