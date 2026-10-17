package pt5;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b ORDERS;
    public static final b TRANSACTIONS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f239613id;

    static {
        b bVar = new b("TRANSACTIONS", 0, "TRANSACTIONS");
        TRANSACTIONS = bVar;
        b bVar2 = new b("ORDERS", 1, "ORDERS");
        ORDERS = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.f239613id = str2;
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

    public final String getId() {
        return this.f239613id;
    }
}
