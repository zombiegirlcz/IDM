package tmi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NoLinks;
    public static final a PrivacyPolicy;
    public static final a ServiceTerms;
    public static final a TermsAndPrivacyPolicy;

    static {
        a aVar = new a("TermsAndPrivacyPolicy", 0);
        TermsAndPrivacyPolicy = aVar;
        a aVar2 = new a("ServiceTerms", 1);
        ServiceTerms = aVar2;
        a aVar3 = new a("PrivacyPolicy", 2);
        PrivacyPolicy = aVar3;
        a aVar4 = new a("NoLinks", 3);
        NoLinks = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
