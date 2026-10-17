package u09;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements Comparable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y COMPLETED;
    public static final y CONTENT_FINISHED;
    public static final y CONTENT_STARTED;
    public static final y LOCKED;
    public static final y NOT_STARTED;
    public static final y QUIZ_STARTED;
    private final int order;

    static {
        y yVar = new y("LOCKED", 0, 0);
        LOCKED = yVar;
        y yVar2 = new y("NOT_STARTED", 1, 1);
        NOT_STARTED = yVar2;
        y yVar3 = new y("CONTENT_STARTED", 2, 2);
        CONTENT_STARTED = yVar3;
        y yVar4 = new y("CONTENT_FINISHED", 3, 3);
        CONTENT_FINISHED = yVar4;
        y yVar5 = new y("QUIZ_STARTED", 4, 4);
        QUIZ_STARTED = yVar5;
        y yVar6 = new y("COMPLETED", 5, 5);
        COMPLETED = yVar6;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public y(String str, int i, int i2) {
        this.order = i2;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }

    public final boolean a(y other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.order >= other.order;
    }
}
