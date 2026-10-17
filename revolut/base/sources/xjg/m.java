package xjg;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m DAY;
    public static final m NIGHT;
    public static final m SYSTEM;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f306522id;

    static {
        m mVar = new m("SYSTEM", 0, "system");
        SYSTEM = mVar;
        m mVar2 = new m("NIGHT", 1, "dark");
        NIGHT = mVar2;
        m mVar3 = new m("DAY", 2, "light");
        DAY = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        $VALUES = mVarArr;
        $ENTRIES = s.n(mVarArr);
    }

    public m(String str, int i, String str2) {
        this.f306522id = str2;
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

    public final String getId() {
        return this.f306522id;
    }
}
