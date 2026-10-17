package dam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f112553a;
    public static final c fixed;
    public static final c percent;
    public static final c total;

    static {
        c cVar = new c("total", 0);
        total = cVar;
        c cVar2 = new c("fixed", 1);
        fixed = cVar2;
        c cVar3 = new c("percent", 2);
        percent = cVar3;
        f112553a = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f112553a.clone();
    }
}
