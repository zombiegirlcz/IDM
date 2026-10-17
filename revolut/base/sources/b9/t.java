package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t Document;
    public static final t RenderOptions;

    static {
        t tVar = new t("Document", 0);
        Document = tVar;
        t tVar2 = new t("RenderOptions", 1);
        RenderOptions = tVar2;
        $VALUES = new t[]{tVar, tVar2};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
