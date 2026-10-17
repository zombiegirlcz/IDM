package dr6;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AFFILIATE;
    public static final a GENERAL;
    public static final a ORGANIC;
    public static final a PARTNERSHIP;
    public static final a REFERRAL;

    @NotNull
    private final String key;

    static {
        a aVar = new a("GENERAL", 0, "onboarding.intro");
        GENERAL = aVar;
        a aVar2 = new a("ORGANIC", 1, "onboarding.intro.e2e.organic");
        ORGANIC = aVar2;
        a aVar3 = new a("PARTNERSHIP", 2, "onboarding.intro.e2e.partnership");
        PARTNERSHIP = aVar3;
        a aVar4 = new a("AFFILIATE", 3, "onboarding.intro.e2e.affiliate");
        AFFILIATE = aVar4;
        a aVar5 = new a("REFERRAL", 4, "onboarding.intro.e2e.referral");
        REFERRAL = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.key = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
