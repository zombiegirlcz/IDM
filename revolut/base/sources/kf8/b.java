package kf8;

import java.util.Map;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b LEGAL_GUARDIAN;
    public static final b PARENT;

    @NotNull
    private static final Map<String, b> mapping;

    static {
        b bVar = new b("PARENT", 0);
        PARENT = bVar;
        b bVar2 = new b("LEGAL_GUARDIAN", 1);
        LEGAL_GUARDIAN = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
        mapping = r0.k(new Pair("PARENT", bVar), new Pair("GUARDIAN", bVar2));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
