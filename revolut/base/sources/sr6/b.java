package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FOURTEEN_DAYS;
    public static final b NINETY_DAYS;
    public static final b SEVEN_DAYS;
    public static final b SIXTY_DAYS;
    public static final b THIRTY_DAYS;
    public static final b ZERO_DAYS;
    private final int offset;

    static {
        b bVar = new b("ZERO_DAYS", 0, 0);
        ZERO_DAYS = bVar;
        b bVar2 = new b("SEVEN_DAYS", 1, 7);
        SEVEN_DAYS = bVar2;
        b bVar3 = new b("FOURTEEN_DAYS", 2, 14);
        FOURTEEN_DAYS = bVar3;
        b bVar4 = new b("THIRTY_DAYS", 3, 30);
        THIRTY_DAYS = bVar4;
        b bVar5 = new b("SIXTY_DAYS", 4, 60);
        SIXTY_DAYS = bVar5;
        b bVar6 = new b("NINETY_DAYS", 5, 90);
        NINETY_DAYS = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, int i2) {
        this.offset = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int b() {
        return this.offset;
    }
}
