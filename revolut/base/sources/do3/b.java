package do3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b FULL;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f116394id = "FULL";

    static {
        b bVar = new b();
        FULL = bVar;
        b[] bVarArr = {bVar};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f116394id;
    }
}
