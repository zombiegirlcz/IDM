package d0j;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m ACTIVE;
    public static final m ARCHIVED;
    public static final m PAST;

    @NotNull
    private final String queryValue;

    static {
        m mVar = new m("ACTIVE", 0, "active");
        ACTIVE = mVar;
        m mVar2 = new m("PAST", 1, "past");
        PAST = mVar2;
        m mVar3 = new m("ARCHIVED", 2, "archived");
        ARCHIVED = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public m(String str, int i, String str2) {
        this.queryValue = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final String b() {
        return this.queryValue;
    }
}
