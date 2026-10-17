package es6;

import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
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
    public static final b DISABLED;

    @NotNull
    private static final Set<b> ENABLED_ALLOCATIONS;
    public static final b FIXED_PERCENTAGE;
    public static final b PER_PRODUCT_PERCENTAGE;
    public static final b UNKNOWN;

    static {
        b bVar = new b("FIXED_PERCENTAGE", 0);
        FIXED_PERCENTAGE = bVar;
        b bVar2 = new b("PER_PRODUCT_PERCENTAGE", 1);
        PER_PRODUCT_PERCENTAGE = bVar2;
        b bVar3 = new b("DISABLED", 2);
        DISABLED = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        b[] elements = {bVar, bVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ENABLED_ALLOCATIONS = kotlin.collections.d.y0(elements);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
