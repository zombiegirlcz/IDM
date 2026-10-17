package uv1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.api.R$string;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a implements a12.b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a About;
    public static final a AddKey;
    public static final a Copy;
    public static final a Help;
    public static final a InProgress;
    public static final a More;
    public static final a NewContact;
    public static final a Reactivate;
    public static final a ScanQr;
    public static final a Send;
    public static final a Share;

    @NotNull
    private final Image icon;

    @NotNull
    private final a12.a style;
    private final Clause title;

    static {
        a aVar = new a("Send", 0, new ResourceImage(R$drawable.uikit_icn_24_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_actions_send, null, null, 14));
        Send = aVar;
        a aVar2 = new a("ScanQr", 1, new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_actions_scan_qr, null, null, 14));
        ScanQr = aVar2;
        a aVar3 = new a("NewContact", 2, new ResourceImage(R$drawable.uikit_icn_24_contacts_add, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_actions_new_contact, null, null, 14));
        NewContact = aVar3;
        a aVar4 = new a("Copy", 3, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_key_actions_copy, null, null, 14));
        Copy = aVar4;
        a aVar5 = new a("Share", 4, new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_key_actions_share, null, null, 14));
        Share = aVar5;
        a aVar6 = new a("About", 5, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_actions_about_bre_b, null, null, 14));
        About = aVar6;
        a aVar7 = new a("Help", 6, new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_action_get_help, null, null, 14));
        Help = aVar7;
        a aVar8 = new a("More", 7, new ResourceImage(R$drawable.uikit_icn_24_more_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null);
        More = aVar8;
        a aVar9 = new a("InProgress", 8, new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_unfreeze_dialog_pending_title, null, null, 14));
        InProgress = aVar9;
        a aVar10 = new a("Reactivate", 9, new ResourceImage(R$drawable.uikit_icn_24_lock_opened, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_more_reactivate_key_cta_button_title, null, null, 14));
        Reactivate = aVar10;
        a aVar11 = new a("AddKey", 10, new ResourceImage(R$drawable.uikit_icn_24_key, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.bre_b_area_key_empty_action_title, null, null, 14));
        AddKey = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause) {
        a12.a aVar = a12.a.ACCENT;
        this.icon = resourceImage;
        this.title = textLocalisedClause;
        this.style = aVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
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
