package cnm;

import a0.d;

/* JADX INFO: loaded from: classes14.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f25471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25472c;

    public a(String str, int i, String str2) {
        if (str.length() != 2 || !Character.isUpperCase(str.charAt(0)) || !Character.isUpperCase(str.charAt(1))) {
            throw new IllegalArgumentException("Invalid country Code; must be exactly 2 upper-case characters");
        }
        if (i > 34 || i < 8) {
            throw new IllegalArgumentException(d.n("Invalid length parameter, must be in range 8 to 34 inclusive: ", i));
        }
        if (!str2.startsWith(str)) {
            throw new IllegalArgumentException(d.s("countryCode '", str, "' does not agree with format: ", str2));
        }
        this.f25470a = str;
        this.f25472c = i;
        this.f25471b = new c(str2);
    }
}
