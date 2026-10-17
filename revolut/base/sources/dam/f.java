package dam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f[] f112558a;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    public static final f f112559en;

    /* JADX INFO: renamed from: es, reason: collision with root package name */
    public static final f f112560es;

    static {
        f fVar = new f("en", 0);
        f112559en = fVar;
        f fVar2 = new f("es", 1);
        f112560es = fVar2;
        f112558a = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f112558a.clone();
    }
}
