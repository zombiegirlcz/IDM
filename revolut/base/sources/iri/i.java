package iri;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i DISPOSED;
    public static final i INITIALIZED;
    public static final i TERMINATING;

    static {
        i iVar = new i("TERMINATING", 0);
        TERMINATING = iVar;
        i iVar2 = new i("INITIALIZED", 1);
        INITIALIZED = iVar2;
        i iVar3 = new i("DISPOSED", 2);
        DISPOSED = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
