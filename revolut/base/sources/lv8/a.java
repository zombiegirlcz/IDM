package lv8;

import com.revolut.feature.kyc.api.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a IDURA;
    public static final a MY_INFO;
    private final int nameResId;

    static {
        a aVar = new a("MY_INFO", 0, R$string.kyc_my_info_name);
        MY_INFO = aVar;
        a aVar2 = new a("IDURA", 1, R$string.kyc_idura_fi_name);
        IDURA = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.nameResId = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.nameResId;
    }
}
