package ky7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACTION_NEEDED;
    public static final d ACTIVE;
    public static final d CANCELLED;

    @NotNull
    public static final b Companion;
    public static final d INACTIVE;
    public static final d INITIALIZING;
    public static final d IN_PROGRESS;

    static {
        d dVar = new d("IN_PROGRESS", 0);
        IN_PROGRESS = dVar;
        d dVar2 = new d("ACTIVE", 1);
        ACTIVE = dVar2;
        d dVar3 = new d("CANCELLED", 2);
        CANCELLED = dVar3;
        d dVar4 = new d("INACTIVE", 3);
        INACTIVE = dVar4;
        d dVar5 = new d("ACTION_NEEDED", 4);
        ACTION_NEEDED = dVar5;
        d dVar6 = new d("INITIALIZING", 5);
        INITIALIZING = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new b();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
