package j18;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final s ATTRIBUTED;

    @NotNull
    public static final r Companion;
    public static final s PENDING;

    static {
        s sVar = new s("PENDING", 0);
        PENDING = sVar;
        s sVar2 = new s("ATTRIBUTED", 1);
        ATTRIBUTED = sVar2;
        s[] sVarArr = {sVar, sVar2};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
        Companion = new r();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new j(3));
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
