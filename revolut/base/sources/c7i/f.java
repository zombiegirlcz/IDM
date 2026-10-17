package c7i;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DropsBelow;
    public static final f Exceeds;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    @NotNull
    private final String f22002tag;

    static {
        f fVar = new f("Exceeds", 0, "exceeds");
        Exceeds = fVar;
        f fVar2 = new f("DropsBelow", 1, "drops_below");
        DropsBelow = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.f22002tag = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
