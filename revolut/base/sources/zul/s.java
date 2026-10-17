package zul;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;

    @NotNull
    public static final r Companion;
    public static final s PERFORMANCE;
    public static final s PROJECTION;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f325551id;

    static {
        s sVar = new s("PROJECTION", 0, "PROJECTION_TAB_ID");
        PROJECTION = sVar;
        s sVar2 = new s("PERFORMANCE", 1, "PERFORMANCE_TAB_ID");
        PERFORMANCE = sVar2;
        s[] sVarArr = {sVar, sVar2};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
        Companion = new r();
    }

    public s(String str, int i, String str2) {
        this.f325551id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f325551id;
    }
}
