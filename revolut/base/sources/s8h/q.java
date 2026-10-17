package s8h;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ONE_DAY;
    public static final q ONE_MONTH;
    public static final q ONE_WEEK;
    public static final q ONE_YEAR;

    @NotNull
    private final wnh.b destinationTimeSpan;

    @NotNull
    private final mzg.c legacyTimeSpan;

    static {
        q qVar = new q("ONE_DAY", 0, mzg.c.ONE_DAY, wnh.b.ONE_DAY);
        ONE_DAY = qVar;
        q qVar2 = new q("ONE_WEEK", 1, mzg.c.ONE_WEEK, wnh.b.ONE_WEEK);
        ONE_WEEK = qVar2;
        q qVar3 = new q("ONE_MONTH", 2, mzg.c.ONE_MONTH, wnh.b.ONE_MONTH);
        ONE_MONTH = qVar3;
        q qVar4 = new q("ONE_YEAR", 3, mzg.c.ONE_YEAR, wnh.b.ONE_YEAR);
        ONE_YEAR = qVar4;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public q(String str, int i, mzg.c cVar, wnh.b bVar) {
        this.legacyTimeSpan = cVar;
        this.destinationTimeSpan = bVar;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final wnh.b a() {
        return this.destinationTimeSpan;
    }

    public final mzg.c b() {
        return this.legacyTimeSpan;
    }
}
