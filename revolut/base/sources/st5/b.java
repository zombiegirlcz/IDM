package st5;

import androidx.room.RoomDatabase;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b FIVE;
    public static final b NO_LIMIT;
    public static final b ONE;
    public static final b TEN;
    public static final b THREE;
    public static final b TWO;
    private final int itemsCount;

    static {
        b bVar = new b("NO_LIMIT", 0, RoomDatabase.MAX_BIND_PARAMETER_CNT);
        NO_LIMIT = bVar;
        b bVar2 = new b("ONE", 1, 1);
        ONE = bVar2;
        b bVar3 = new b("TWO", 2, 2);
        TWO = bVar3;
        b bVar4 = new b("THREE", 3, 3);
        THREE = bVar4;
        b bVar5 = new b("FIVE", 4, 5);
        FIVE = bVar5;
        b bVar6 = new b("TEN", 5, 10);
        TEN = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, int i2) {
        this.itemsCount = i2;
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
        return this.itemsCount;
    }
}
