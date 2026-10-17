package p89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a INVALID;
    public static final a REQUEST_SHOWING_ERROR;
    public static final a VALID;
    private final boolean allowedToGoNext;
    private final boolean shouldShowErrorMessage;

    static {
        a aVar = new a("VALID", 0, false, true);
        VALID = aVar;
        a aVar2 = new a("INVALID", 1, false, false);
        INVALID = aVar2;
        a aVar3 = new a("REQUEST_SHOWING_ERROR", 2, true, false);
        REQUEST_SHOWING_ERROR = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, boolean z, boolean z3) {
        this.shouldShowErrorMessage = z;
        this.allowedToGoNext = z3;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.allowedToGoNext;
    }

    public final boolean b() {
        return this.shouldShowErrorMessage;
    }
}
