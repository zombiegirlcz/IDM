package dam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f112552a;
    public static final b create;
    public static final b delete;
    public static final b update;

    static {
        b bVar = new b("create", 0);
        create = bVar;
        b bVar2 = new b("update", 1);
        update = bVar2;
        b bVar3 = new b("delete", 2);
        delete = bVar3;
        f112552a = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f112552a.clone();
    }
}
