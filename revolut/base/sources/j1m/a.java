package j1m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a CONSENT;
    public static final a CONTRACT;
    public static final a LEGAL_OBLIGATION;
    public static final a LEGITIMATE_INTERESTS;
    public static final a PUBLIC_TASK;
    public static final a VITAL_INTERESTS;

    static {
        a aVar = new a("CONSENT", 0);
        CONSENT = aVar;
        a aVar2 = new a("CONTRACT", 1);
        CONTRACT = aVar2;
        a aVar3 = new a("LEGAL_OBLIGATION", 2);
        LEGAL_OBLIGATION = aVar3;
        a aVar4 = new a("VITAL_INTERESTS", 3);
        VITAL_INTERESTS = aVar4;
        a aVar5 = new a("PUBLIC_TASK", 4);
        PUBLIC_TASK = aVar5;
        a aVar6 = new a("LEGITIMATE_INTERESTS", 5);
        LEGITIMATE_INTERESTS = aVar6;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
