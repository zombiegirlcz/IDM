package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/text/q;", "Lkotlin/text/d;", "", "", "value", "I", "a", "()I", "mask", "getMask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q CANON_EQ;
    public static final q COMMENTS;
    public static final q DOT_MATCHES_ALL;
    public static final q IGNORE_CASE;
    public static final q LITERAL;
    public static final q MULTILINE;
    public static final q UNIX_LINES;
    private final int mask;
    private final int value;

    static {
        q qVar = new q("IGNORE_CASE", 0, 2, 0, 2, null);
        IGNORE_CASE = qVar;
        q qVar2 = new q("MULTILINE", 1, 8, 0, 2, null);
        MULTILINE = qVar2;
        q qVar3 = new q("LITERAL", 2, 16, 0, 2, null);
        LITERAL = qVar3;
        q qVar4 = new q("UNIX_LINES", 3, 1, 0, 2, null);
        UNIX_LINES = qVar4;
        q qVar5 = new q("COMMENTS", 4, 4, 0, 2, null);
        COMMENTS = qVar5;
        q qVar6 = new q("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
        DOT_MATCHES_ALL = qVar6;
        q qVar7 = new q("CANON_EQ", 6, 128, 0, 2, null);
        CANON_EQ = qVar7;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public q(String str, int i, int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        i3 = (i5 & 2) != 0 ? i2 : i3;
        this.value = i2;
        this.mask = i3;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
