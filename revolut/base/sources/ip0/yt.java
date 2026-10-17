package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class yt {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ yt[] $VALUES;
    public static final yt CENTER;
    public static final yt TOP;

    static {
        yt ytVar = new yt("CENTER", 0);
        CENTER = ytVar;
        yt ytVar2 = new yt("TOP", 1);
        TOP = ytVar2;
        yt[] ytVarArr = {ytVar, ytVar2};
        $VALUES = ytVarArr;
        $ENTRIES = vc.s.n(ytVarArr);
    }

    public static yt valueOf(String str) {
        return (yt) Enum.valueOf(yt.class, str);
    }

    public static yt[] values() {
        return (yt[]) $VALUES.clone();
    }
}
