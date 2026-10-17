package ts1;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
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
    public static final a Help;
    public static final a Request;
    public static final a Send;
    public static final a Settings;

    @NotNull
    private final Image icon;

    @NotNull
    private final a12.a style;

    @NotNull
    private final Clause title;

    static {
        a aVar = new a("Send", 0, new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_send, null, null, 14));
        Send = aVar;
        a aVar2 = new a("Request", 1, new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_request, null, null, 14));
        Request = aVar2;
        a aVar3 = new a("AddContact", 2, new ResourceImage(R$drawable.uikit_icn_24_contacts_add, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_add_contact, null, null, 14));
        AddContact = aVar3;
        a aVar4 = new a("Help", 3, new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_get_help, null, null, 14));
        Help = aVar4;
        a aVar5 = new a("Settings", 4, new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.apm_action_settings, null, null, 14));
        Settings = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
