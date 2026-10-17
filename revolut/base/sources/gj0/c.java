package gj0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BRANCH;
    public static final c CONTENT_REF;

    @NotNull
    public static final a Companion;
    public static final c DEEPLINK;

    static {
        c cVar = new c("BRANCH", 0);
        BRANCH = cVar;
        c cVar2 = new c("CONTENT_REF", 1);
        CONTENT_REF = cVar2;
        c cVar3 = new c("DEEPLINK", 2);
        DEEPLINK = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new a();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        int i = b.f144231a[ordinal()];
        if (i == 1) {
            return "BRANCH";
        }
        if (i == 2) {
            return "CONTENT_REF";
        }
        if (i == 3) {
            return "DEEPLINK";
        }
        throw new NoWhenBranchMatchedException();
    }
}
