package pe;

import pd.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final me.b f235268b = new me.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f235269c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final h e = new h(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f235270a;

    public a(c cVar) {
        this.f235270a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb6 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb6.append(str.charAt(i));
            if (str2.length() > i) {
                sb6.append(str2.charAt(i));
            }
        }
        return sb6.toString();
    }
}
