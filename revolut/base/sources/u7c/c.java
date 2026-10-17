package u7c;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCESS_DENIED;
    public static final c INVALID_REQUEST;

    @NotNull
    private final String oauthCode;

    static {
        c cVar = new c("INVALID_REQUEST", 0, "invalid_request");
        INVALID_REQUEST = cVar;
        c cVar2 = new c("ACCESS_DENIED", 1, "access_denied");
        ACCESS_DENIED = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.oauthCode = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String a() {
        return this.oauthCode;
    }
}
