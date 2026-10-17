package a82;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a implements a12.b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AddContact;
    public static final a Bills;
    public static final a Pay;
    public static final a Request;
    public static final a Send;
    public static final a ViaVerde;
    public static final a Withdrawal;

    @NotNull
    private final Image icon;

    @NotNull
    private final a12.a style;
    private final Clause subtitle;

    @NotNull
    private final Clause title;

    static {
        a aVar = new a("Send", 0, new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_send, null, null, 14), null, 12);
        Send = aVar;
        a aVar2 = new a("Request", 1, new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_request, null, null, 14), null, 12);
        Request = aVar2;
        a aVar3 = new a("AddContact", 2, new ResourceImage(R$drawable.uikit_icn_24_contacts_add, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_add_contact, null, null, 14), null, 12);
        AddContact = aVar3;
        a aVar4 = new a("Pay", 3, new ResourceImage(R$drawable.uikit_icn_24_qr_scanner, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_pay, null, null, 14), null, 12);
        Pay = aVar4;
        a aVar5 = new a("Withdrawal", 4, new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_action_withdraw, null, null, 14), null, 12);
        Withdrawal = aVar5;
        a aVar6 = new a("Bills", 5, new ResourceImage(R$drawable.uikit_icn_24_documents_pair, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_area_section_more_actions_pay_bills_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_area_section_more_actions_pay_bills_subtitle, null, null, 14), 4);
        Bills = aVar6;
        a aVar7 = new a("ViaVerde", 6, new ResourceImage(ApmMultibanco.b.f61818c, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.via_verde_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_area_section_more_actions_via_verde_subtitle, null, null, 14), 4);
        ViaVerde = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i2) {
        a12.a aVar = a12.a.ACCENT;
        textLocalisedClause2 = (i2 & 8) != 0 ? null : textLocalisedClause2;
        this.icon = resourceImage;
        this.title = textLocalisedClause;
        this.style = aVar;
        this.subtitle = textLocalisedClause2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final Clause a() {
        return this.subtitle;
    }

    @Override // a12.b
    public final Image getIcon() {
        return this.icon;
    }

    @Override // a12.b
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // a12.b
    public final Clause getTitle() {
        return this.title;
    }

    @Override // a12.b
    public final a12.a h() {
        return this.style;
    }
}
