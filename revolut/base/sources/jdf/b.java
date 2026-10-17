package jdf;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b FIFTEEN_YEARS;
    public static final b FIVE_YEARS;
    public static final b TEN_YEARS;
    public static final b TWENTY_YEARS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f173060id;
    private final int years;

    static {
        b bVar = new b("FIVE_YEARS", 0, "5Y", 5);
        FIVE_YEARS = bVar;
        b bVar2 = new b("TEN_YEARS", 1, "10Y", 10);
        TEN_YEARS = bVar2;
        b bVar3 = new b("FIFTEEN_YEARS", 2, "15Y", 15);
        FIFTEEN_YEARS = bVar3;
        b bVar4 = new b("TWENTY_YEARS", 3, "20Y", 20);
        TWENTY_YEARS = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2, int i2) {
        this.f173060id = str2;
        this.years = i2;
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
        return this.years;
    }

    public final String getId() {
        return this.f173060id;
    }
}
