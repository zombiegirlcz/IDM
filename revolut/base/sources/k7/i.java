package k7;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f181772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f181773c;

    public i(String str, float f, float f4) {
        this.f181771a = str;
        this.f181773c = f4;
        this.f181772b = f;
    }

    public final boolean a(String str) {
        String str2 = this.f181771a;
        if (str2.equalsIgnoreCase(str)) {
            return true;
        }
        return str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str);
    }
}
