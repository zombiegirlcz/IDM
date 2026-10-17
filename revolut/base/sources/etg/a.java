package etg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Letg/a;", "", "SHOW_PROMPT", "NOTHING", "feature_weak_passcode_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @b("nothing")
    public static final a NOTHING;

    @b("prompt")
    @he0.b
    public static final a SHOW_PROMPT;

    static {
        a aVar = new a("SHOW_PROMPT", 0);
        SHOW_PROMPT = aVar;
        a aVar2 = new a("NOTHING", 1);
        NOTHING = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
