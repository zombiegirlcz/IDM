package ms0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m1[] $VALUES;

    @NotNull
    public static final l1 Companion;
    public static final m1 LastLineBottom;
    public static final m1 TextBounds;
    private final int attributeValue;

    static {
        m1 m1Var = new m1("TextBounds", 0, 0);
        TextBounds = m1Var;
        m1 m1Var2 = new m1("LastLineBottom", 1, 1);
        LastLineBottom = m1Var2;
        m1[] m1VarArr = {m1Var, m1Var2};
        $VALUES = m1VarArr;
        $ENTRIES = vc.s.n(m1VarArr);
        Companion = new l1();
    }

    public m1(String str, int i, int i2) {
        this.attributeValue = i2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) $VALUES.clone();
    }

    public final int a() {
        return this.attributeValue;
    }
}
