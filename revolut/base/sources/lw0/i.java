package lw0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i AVATAR;

    @yhm.d
    public static final i CENTER_WITH_IMAGE;
    public static final i CENTER_WITH_PROGRESS;
    public static final i ICON;
    public static final i TITLE_SUBTITLE;

    static {
        i iVar = new i("ICON", 0);
        ICON = iVar;
        i iVar2 = new i("AVATAR", 1);
        AVATAR = iVar2;
        i iVar3 = new i("TITLE_SUBTITLE", 2);
        TITLE_SUBTITLE = iVar3;
        i iVar4 = new i("CENTER_WITH_IMAGE", 3);
        CENTER_WITH_IMAGE = iVar4;
        i iVar5 = new i("CENTER_WITH_PROGRESS", 4);
        CENTER_WITH_PROGRESS = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
