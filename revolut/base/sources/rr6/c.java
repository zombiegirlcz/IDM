package rr6;

import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final b Companion;
    public static final c FIRST_TIME_USER;
    public static final c LOCKED;
    public static final c MAXED;
    public static final c REGAIN_REQUIRED;
    public static final c UNKNOWN;
    public static final c UNLOCKED;

    @NotNull
    private static final Set<c> lockedBoosterStates;

    @NotNull
    private static final Set<c> unlockedBoosterStates;

    static {
        c cVar = new c("UNKNOWN", 0);
        UNKNOWN = cVar;
        c cVar2 = new c("FIRST_TIME_USER", 1);
        FIRST_TIME_USER = cVar2;
        c cVar3 = new c("LOCKED", 2);
        LOCKED = cVar3;
        c cVar4 = new c("UNLOCKED", 3);
        UNLOCKED = cVar4;
        c cVar5 = new c("REGAIN_REQUIRED", 4);
        REGAIN_REQUIRED = cVar5;
        c cVar6 = new c("MAXED", 5);
        MAXED = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
        c[] elements = {cVar2, cVar3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        lockedBoosterStates = kotlin.collections.d.y0(elements);
        c[] elements2 = {cVar4, cVar5, cVar6};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        unlockedBoosterStates = kotlin.collections.d.y0(elements2);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
