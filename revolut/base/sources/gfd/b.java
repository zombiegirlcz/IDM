package gfd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALERTS;
    public static final b ASSETS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f143390id;

    static {
        b bVar = new b("ASSETS", 0, "ASSETS");
        ASSETS = bVar;
        b bVar2 = new b("ALERTS", 1, "ALERTS");
        ALERTS = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.f143390id = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f143390id;
    }
}
