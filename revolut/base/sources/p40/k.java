package p40;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k FILES;
    public static final k PHOTOS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f232784id;

    static {
        k kVar = new k("PHOTOS", 0, "tab_photos");
        PHOTOS = kVar;
        k kVar2 = new k("FILES", 1, "tab_files");
        FILES = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public k(String str, int i, String str2) {
        this.f232784id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f232784id;
    }
}
