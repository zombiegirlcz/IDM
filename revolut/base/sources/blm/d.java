package blm;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FIRST;
    public static final d FIRST_OR_DEFAULT;
    public static final d LAST;
    public static final d SINGLE;
    public static final d SINGLE_OR_DEFAULT;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final String f16749s;

    static {
        d dVar = new d("FIRST", 0, "awaitFirst");
        FIRST = dVar;
        d dVar2 = new d("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        FIRST_OR_DEFAULT = dVar2;
        d dVar3 = new d("LAST", 2, "awaitLast");
        LAST = dVar3;
        d dVar4 = new d("SINGLE", 3, "awaitSingle");
        SINGLE = dVar4;
        d dVar5 = new d("SINGLE_OR_DEFAULT", 4, "awaitSingleOrDefault");
        SINGLE_OR_DEFAULT = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.f16749s = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f16749s;
    }
}
