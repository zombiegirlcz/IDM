package t2a;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e GIF;
    public static final e STYLE;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267520id;

    static {
        e eVar = new e("GIF", 0, "gif");
        GIF = eVar;
        e eVar2 = new e("STYLE", 1, "style");
        STYLE = eVar2;
        e[] eVarArr = {eVar, eVar2};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.f267520id = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f267520id;
    }
}
