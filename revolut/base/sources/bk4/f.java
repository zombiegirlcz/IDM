package bk4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FORM;
    public static final f LINKED_ACCOUNT;
    public static final f REVOLUT;

    @NotNull
    private final String value;

    static {
        f fVar = new f("FORM", 0, "FORM");
        FORM = fVar;
        f fVar2 = new f("LINKED_ACCOUNT", 1, "LINKED_ACCOUNT");
        LINKED_ACCOUNT = fVar2;
        f fVar3 = new f("REVOLUT", 2, "REVOLUT");
        REVOLUT = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.value = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
