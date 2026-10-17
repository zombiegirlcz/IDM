package dv9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACTIVE;

    @NotNull
    public static final e Companion;
    public static final f DELETED;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f118063id;

    static {
        f fVar = new f("ACTIVE", 0, "SENT");
        ACTIVE = fVar;
        f fVar2 = new f("DELETED", 1, "DELETED");
        DELETED = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
        Companion = new e();
    }

    public f(String str, int i, String str2) {
        this.f118063id = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f118063id;
    }
}
