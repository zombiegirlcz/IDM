package clm;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIRST;
    public static final a FIRST_OR_DEFAULT;
    public static final a LAST;
    public static final a SINGLE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final String f25066s;

    static {
        a aVar = new a("FIRST", 0, "awaitFirst");
        FIRST = aVar;
        a aVar2 = new a("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        FIRST_OR_DEFAULT = aVar2;
        a aVar3 = new a("LAST", 2, "awaitLast");
        LAST = aVar3;
        a aVar4 = new a("SINGLE", 3, "awaitSingle");
        SINGLE = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.f25066s = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f25066s;
    }
}
