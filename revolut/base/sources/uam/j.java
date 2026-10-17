package uam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j CenterCrop;
    public static final j CenterInside;
    public static final j TopCrop;

    static {
        j jVar = new j("CenterCrop", 0);
        CenterCrop = jVar;
        j jVar2 = new j("CenterInside", 1);
        CenterInside = jVar2;
        j jVar3 = new j("TopCrop", 2);
        TopCrop = jVar3;
        $VALUES = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
