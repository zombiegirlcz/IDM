package k50;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d COPY;
    public static final d DISLIKE;
    public static final d LIKE;
    private final int activeIcon;
    private final int color;
    private final int contentDescription;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f181046id;
    private final String lottieAnimationName;
    private final int neutralIcon;

    static {
        int i = R$string.chat_messages_copy_message;
        int i2 = R$drawable.uikit_icn_24_copy;
        int i3 = R$drawable.uikit_icn_16_check;
        int i5 = R$attr.uikit_colorGreyTone50;
        d dVar = new d("COPY", 0, 0, i, i2, i3, i5, null);
        COPY = dVar;
        d dVar2 = new d("LIKE", 1, 1, R$string.actions_menu_mark_as_helpful, R$drawable.uikit_icn_24_social_like_stroke, R$drawable.uikit_icn_24_social_like, i5, "social_like");
        LIKE = dVar2;
        d dVar3 = new d("DISLIKE", 2, 2, R$string.actions_menu_mark_as_unhelpful, R$drawable.uikit_icn_24_social_dislike_stroke, R$drawable.uikit_icn_24_social_dislike, i5, "social_dislike");
        DISLIKE = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public d(String str, int i, int i2, int i3, int i5, int i6, int i21, String str2) {
        this.f181046id = i2;
        this.contentDescription = i3;
        this.neutralIcon = i5;
        this.activeIcon = i6;
        this.color = i21;
        this.lottieAnimationName = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int a() {
        return this.activeIcon;
    }

    public final int b() {
        return this.color;
    }

    public final int c() {
        return this.contentDescription;
    }

    public final int d() {
        return this.f181046id;
    }

    public final SourceUrl e() {
        String str = this.lottieAnimationName;
        if (str != null) {
            return uc0.b.a("mobile/cx/helpcentre/animations", str);
        }
        return null;
    }

    public final int f() {
        return this.neutralIcon;
    }
}
