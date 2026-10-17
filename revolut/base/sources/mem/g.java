package mem;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xem.c f204797a;

    static {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        f204797a = property != null ? Boolean.parseBoolean(property) : false ? new f() : new lem.e(4096, 2);
    }
}
