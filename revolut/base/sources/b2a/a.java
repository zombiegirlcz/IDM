package b2a;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTIVE;
    public static final a DISABLED;
    public static final a EXPIRED;
    public static final a UNKNOWN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f11928id;

    static {
        a aVar = new a("ACTIVE", 0, "ACTIVE");
        ACTIVE = aVar;
        a aVar2 = new a("DISABLED", 1, "DISABLED");
        DISABLED = aVar2;
        a aVar3 = new a("EXPIRED", 2, "EXPIRED");
        EXPIRED = aVar3;
        a aVar4 = new a("UNKNOWN", 3, "UNKNOWN");
        UNKNOWN = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.f11928id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f11928id;
    }
}
