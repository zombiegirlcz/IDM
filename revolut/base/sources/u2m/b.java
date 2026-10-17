package u2m;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b Error;
    public static final b Grey;
    public static final b Ok;
    public static final b OkGrey;

    static {
        b bVar = new b("Ok", 0);
        Ok = bVar;
        b bVar2 = new b("OkGrey", 1);
        OkGrey = bVar2;
        b bVar3 = new b("Error", 2);
        Error = bVar3;
        b bVar4 = new b("Grey", 3);
        Grey = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
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
