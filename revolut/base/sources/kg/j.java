package kg;

/* JADX INFO: loaded from: classes17.dex */
public final class j {
    public static final j d = new j("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f183858c;

    static {
        new j("\n", "  ", true);
    }

    public j(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f183856a = str;
        this.f183857b = str2;
        this.f183858c = z;
    }

    public final String a() {
        return this.f183857b;
    }

    public final String b() {
        return this.f183856a;
    }

    public final boolean c() {
        return this.f183858c;
    }
}
