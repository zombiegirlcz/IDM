package e3a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEVICE_CONTACT_EMAIL;
    public static final c DEVICE_CONTACT_PHONE;
    public static final c GROUP;
    public static final c REVOLUT_CONTACT_LOCAL;
    public static final c REVOLUT_CONTACT_REMOTE;

    static {
        c cVar = new c("REVOLUT_CONTACT_LOCAL", 0);
        REVOLUT_CONTACT_LOCAL = cVar;
        c cVar2 = new c("REVOLUT_CONTACT_REMOTE", 1);
        REVOLUT_CONTACT_REMOTE = cVar2;
        c cVar3 = new c("DEVICE_CONTACT_PHONE", 2);
        DEVICE_CONTACT_PHONE = cVar3;
        c cVar4 = new c("DEVICE_CONTACT_EMAIL", 3);
        DEVICE_CONTACT_EMAIL = cVar4;
        c cVar5 = new c("GROUP", 4);
        GROUP = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
