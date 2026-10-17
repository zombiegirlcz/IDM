package vaa;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements a12.b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a About;
    public static final a Copy;
    public static final a CopyPaste;
    public static final a Help;
    public static final a More;
    public static final a NewKey;
    public static final a NewRandomKey;
    public static final a Request;
    public static final a ScanQr;
    public static final a Send;
    public static final a Share;

    @NotNull
    private final Image icon;

    @NotNull
    private final a12.a style;
    private final Clause title;

    static {
        a aVar = new a("Send", 0, new ResourceImage(R$drawable.uikit_icn_24_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_send, null, null, 14));
        Send = aVar;
        a aVar2 = new a("Request", 1, new ResourceImage(R$drawable.uikit_icn_24_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_request, null, null, 14));
        Request = aVar2;
        a aVar3 = new a("ScanQr", 2, new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_scan_qr, null, null, 14));
        ScanQr = aVar3;
        a aVar4 = new a("CopyPaste", 3, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_area_copy_paste, null, null, 14));
        CopyPaste = aVar4;
        a aVar5 = new a("Copy", 4, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_area_copy_key, null, null, 14));
        Copy = aVar5;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_area_share, null, null, 14);
        a12.a aVar6 = a12.a.SEMI_ACCENT;
        a aVar7 = new a("Share", 5, resourceImage, textLocalisedClause, aVar6);
        Share = aVar7;
        a aVar8 = new a("NewKey", 6, new ResourceImage(R$drawable.uikit_icn_24_key, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_area_new_key, null, null, 14));
        NewKey = aVar8;
        a aVar9 = new a("NewRandomKey", 7, new ResourceImage(R$drawable.uikit_icn_24_avatar_grid, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_area_new_random_key, null, null, 14), aVar6);
        NewRandomKey = aVar9;
        a aVar10 = new a("About", 8, new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_area_about_pix, null, null, 14));
        About = aVar10;
        a aVar11 = new a("Help", 9, new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.pix_area_get_help, null, null, 14));
        Help = aVar11;
        a aVar12 = new a("More", 10, new ResourceImage(R$drawable.uikit_icn_24_more_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, aVar6);
        More = aVar12;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause, a12.a aVar) {
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

    public /* synthetic */ a(String str, int i, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause) {
        this(str, i, resourceImage, textLocalisedClause, a12.a.ACCENT);
    }
}
