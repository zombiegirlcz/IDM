package mq9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b LOCAL;
    public static final b REMOTE_POLLING;
    public static final b REMOTE_SINGLE_FETCH;

    static {
        b bVar = new b("LOCAL", 0);
        LOCAL = bVar;
        b bVar2 = new b("REMOTE_SINGLE_FETCH", 1);
        REMOTE_SINGLE_FETCH = bVar2;
        b bVar3 = new b("REMOTE_POLLING", 2);
        REMOTE_POLLING = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
