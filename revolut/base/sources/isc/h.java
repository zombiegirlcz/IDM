package isc;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DECLINED;
    public static final h PROCEEDED_WITH_WARNING;
    public static final h TRUSTED_BENEFICIARY_SAVED;

    @NotNull
    private final String buttonTag;
    private final boolean isSuccess;

    static {
        h hVar = new h(0, "TRUSTED_BENEFICIARY_SAVED", true, "SCA_PROMPT_PRIMARY_BUTTON_TAG");
        TRUSTED_BENEFICIARY_SAVED = hVar;
        h hVar2 = new h(1, "DECLINED", false, "SCA_PROMPT_SECONDARY_BUTTON_TAG");
        DECLINED = hVar2;
        h hVar3 = new h(2, "PROCEEDED_WITH_WARNING", false, "SCA_PROMPT_PROCEED_WITH_WARNING_BUTTON_TAG");
        PROCEEDED_WITH_WARNING = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public h(int i, String str, boolean z, String str2) {
        this.isSuccess = z;
        this.buttonTag = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a() {
        return this.buttonTag;
    }

    public final boolean b() {
        return this.isSuccess;
    }
}
