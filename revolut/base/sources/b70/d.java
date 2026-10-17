package b70;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d SELECT_TO_SPEAK;
    public static final d SWITCH_ACCESS;
    public static final d TALKBACK;

    @NotNull
    private final String flattenedComponentName;

    static {
        d dVar = new d("TALKBACK", 0, "com.google.android.marvin.talkback/.TalkBackService");
        TALKBACK = dVar;
        d dVar2 = new d("SWITCH_ACCESS", 1, "com.google.android.marvin.talkback/com.android.switchaccess.SwitchAccessService");
        SWITCH_ACCESS = dVar2;
        d dVar3 = new d("SELECT_TO_SPEAK", 2, "com.google.android.marvin.talkback/com.google.android.accessibility.selecttospeak.SelectToSpeakService");
        SELECT_TO_SPEAK = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.flattenedComponentName = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.flattenedComponentName;
    }
}
