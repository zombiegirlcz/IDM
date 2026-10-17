package kq2;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @NotNull
    public static final h Companion;
    public static final i GIRO_INSTANT;
    public static final i PIX;

    @NotNull
    private final String value;

    static {
        i iVar = new i("PIX", 0, "PIX");
        PIX = iVar;
        i iVar2 = new i("GIRO_INSTANT", 1, "GiroInstant");
        GIRO_INSTANT = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
        Companion = new h();
    }

    public i(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
