package sbb;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t Default;
    public static final t ThemeRevertScheduled;
    public static final t ThemeUpdateNotificationScheduled;
    public static final t ThemeUpdateScheduled;

    static {
        t tVar = new t("Default", 0);
        Default = tVar;
        t tVar2 = new t("ThemeUpdateScheduled", 1);
        ThemeUpdateScheduled = tVar2;
        t tVar3 = new t("ThemeUpdateNotificationScheduled", 2);
        ThemeUpdateNotificationScheduled = tVar3;
        t tVar4 = new t("ThemeRevertScheduled", 3);
        ThemeRevertScheduled = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
